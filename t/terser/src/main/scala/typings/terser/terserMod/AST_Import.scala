package typings.terser.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AST_Import extends AST_Node {
  var imported_name: Null | AST_SymbolImport = js.native
  var imported_names: js.Array[AST_NameMapping] = js.native
  var module_name: AST_String = js.native
}

