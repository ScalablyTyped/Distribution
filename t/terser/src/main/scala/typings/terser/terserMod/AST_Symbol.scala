package typings.terser.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AST_Symbol extends AST_Node {
  var name: String = js.native
  var scope: AST_Scope = js.native
  var thedef: SymbolDef = js.native
}

