package typings.terser.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AST_Class extends AST_Scope {
  var `extends`: AST_Node | Null = js.native
  var inlined: Boolean = js.native
  var name: AST_SymbolClass | AST_SymbolDefClass | Null = js.native
  var properties: js.Array[AST_ObjectProperty] = js.native
}

