package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AST_Scope extends AST_Block {
  var cname: js.Any = js.native
  var enclosed: js.Any = js.native
  var functions: js.Any = js.native
  var parent_scope: AST_Scope | scala.Null = js.native
  var uses_eval: scala.Boolean = js.native
  var uses_with: scala.Boolean = js.native
  var variables: js.Any = js.native
}

