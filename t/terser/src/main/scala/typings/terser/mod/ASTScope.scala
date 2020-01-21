package typings.terser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASTScope extends ASTBlock {
  var cname: js.Any = js.native
  var enclosed: js.Any = js.native
  var functions: js.Any = js.native
  var parent_scope: ASTScope | Null = js.native
  var uses_eval: Boolean = js.native
  var uses_with: Boolean = js.native
  var variables: js.Any = js.native
}

