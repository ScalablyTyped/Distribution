package typings.typescriptDashServices.typescriptDashServicesMod.Services

import typings.typescriptDashServices.TypeScript.IScriptSnapshot
import typings.typescriptDashServices.TypeScript.SourceUnitSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Indenter")
@js.native
class Indenter ()
  extends typings.typescriptDashServices.TypeScript.Services.Indenter

/* static members */
@JSImport("typescript-services", "Services.Indenter")
@js.native
object Indenter extends js.Object {
  /* private */ def belongsToBracket(sourceText: js.Any, token: js.Any, position: js.Any): js.Any = js.native
  /* private */ def getCustomListIndentation(list: js.Any, element: js.Any): js.Any = js.native
  def getIndentation(
    node: SourceUnitSyntax,
    soruceText: IScriptSnapshot,
    position: Double,
    editorOptions: typings.typescriptDashServices.TypeScript.Services.EditorOptions
  ): Double = js.native
  /* private */ def getListItemIndentation(list: js.Any, elementIndex: js.Any): js.Any = js.native
  /* private */ def isInContainerNode(parent: js.Any, element: js.Any): js.Any = js.native
}

