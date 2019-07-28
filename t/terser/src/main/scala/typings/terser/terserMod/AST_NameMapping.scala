package typings.terser.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AST_NameMapping extends AST_Node {
  var foreign_name: AST_Symbol = js.native
  var name: AST_SymbolExport | AST_SymbolImport = js.native
}

