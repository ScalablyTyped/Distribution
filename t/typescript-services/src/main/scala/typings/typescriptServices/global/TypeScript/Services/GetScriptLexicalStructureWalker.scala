package typings.typescriptServices.global.TypeScript.Services

import typings.typescriptServices.TypeScript.SourceUnitSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.GetScriptLexicalStructureWalker")
@js.native
class GetScriptLexicalStructureWalker protected ()
  extends typings.typescriptServices.TypeScript.Services.GetScriptLexicalStructureWalker {
  def this(fileName: String) = this()
}

/* static members */
@JSGlobal("TypeScript.Services.GetScriptLexicalStructureWalker")
@js.native
object GetScriptLexicalStructureWalker extends js.Object {
  def getListsOfAllScriptLexicalStructure(
    items: js.Array[typings.typescriptServices.TypeScript.Services.NavigateToItem],
    fileName: String,
    unit: SourceUnitSyntax
  ): Unit = js.native
}

