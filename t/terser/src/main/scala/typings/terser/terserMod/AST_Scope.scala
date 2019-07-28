package typings.terser.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AST_Scope extends AST_Block {
  var cname: js.Any = js.native
  var enclosed: js.Any = js.native
  var functions: js.Any = js.native
  var parent_scope: AST_Scope | Null = js.native
  var uses_eval: Boolean = js.native
  var uses_with: Boolean = js.native
  var variables: js.Any = js.native
}

