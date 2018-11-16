package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terser", "AST_SymbolDeclaration")
@js.native
class AST_SymbolDeclaration () extends AST_Symbol {
  var constant: scala.Boolean = js.native
  var global: scala.Boolean = js.native
  var mangledName: js.UndefOr[java.lang.String] = js.native
  var mangled_name: js.UndefOr[java.lang.String] = js.native
  var orig: js.Array[AST_SymbolDeclaration] = js.native
  var references: js.Array[AST_SymbolRef] = js.native
  var undeclared: scala.Boolean = js.native
}

