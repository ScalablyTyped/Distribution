package typings.typescriptDashServices.TypeScript.Services

import typings.typescriptDashServices.TypeScript.PositionTrackingWalker
import typings.typescriptDashServices.TypeScript.SourceUnitSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.GetScriptLexicalStructureWalker")
@js.native
class GetScriptLexicalStructureWalker protected () extends PositionTrackingWalker {
  def this(fileName: String) = this()
  var currentInterfaceDeclaration: js.Any = js.native
  var currentMemberVariableDeclaration: js.Any = js.native
  var currentScope: js.Any = js.native
  var currentVariableStatement: js.Any = js.native
  var fileName: js.Any = js.native
  var kindStack: js.Any = js.native
  var nameStack: js.Any = js.native
  var parentScopes: js.Any = js.native
  /* private */ def addAdditionalSpan(node: js.Any, key: js.Any): js.Any = js.native
  /* private */ def collectItems(items: js.Any): js.Any = js.native
  /* private */ def collectItems(items: js.Any, scope: js.Any): js.Any = js.native
  /* private */ def createItem(node: js.Any, modifiers: js.Any, kind: js.Any, name: js.Any): js.Any = js.native
  /* private */ def createScope(): js.Any = js.native
  /* private */ def getKindModifiers(modifiers: js.Any): js.Any = js.native
  /* private */ def getModuleNames(node: js.Any): js.Any = js.native
  /* private */ def getModuleNamesHelper(name: js.Any, result: js.Any): js.Any = js.native
  /* private */ def popScope(): js.Any = js.native
  /* private */ def pushNewContainerScope(containerName: js.Any, kind: js.Any): js.Any = js.native
  /* private */ def visitModuleDeclarationWorker(node: js.Any, names: js.Any, nameIndex: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("TypeScript.Services.GetScriptLexicalStructureWalker")
@js.native
object GetScriptLexicalStructureWalker extends js.Object {
  def getListsOfAllScriptLexicalStructure(items: js.Array[NavigateToItem], fileName: String, unit: SourceUnitSyntax): Unit = js.native
}

