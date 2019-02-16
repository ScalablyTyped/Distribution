package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AST_VarDef extends AST_Node {
  var name: AST_Destructuring | AST_SymbolConst | AST_SymbolLet | AST_SymbolVar = js.native
  var value: AST_Node | scala.Null = js.native
}

