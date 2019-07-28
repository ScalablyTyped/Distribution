package typings.terser.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AST_Lambda extends AST_Scope {
  var argnames: js.Array[ArgType] = js.native
  var async: Boolean = js.native
  var is_generator: Boolean = js.native
  var name: AST_SymbolDeclaration | Null = js.native
  var uses_arguments: Boolean = js.native
}

