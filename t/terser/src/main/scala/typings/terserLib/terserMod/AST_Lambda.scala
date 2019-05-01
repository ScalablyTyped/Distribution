package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AST_Lambda extends AST_Scope {
  var argnames: js.Array[ArgType] = js.native
  var async: scala.Boolean = js.native
  var is_generator: scala.Boolean = js.native
  var name: AST_SymbolDeclaration | scala.Null = js.native
  var uses_arguments: scala.Boolean = js.native
}

