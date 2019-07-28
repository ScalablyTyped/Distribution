package typings.typescriptDashServices.TypeScriptNs.ServicesNs

import typings.typescriptDashServices.TypeScriptNs.IScriptSnapshot
import typings.typescriptDashServices.TypeScriptNs.SourceUnitSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Indenter")
@js.native
class Indenter () extends js.Object

/* static members */
@JSGlobal("TypeScript.Services.Indenter")
@js.native
object Indenter extends js.Object {
  /* private */ def belongsToBracket(sourceText: js.Any, token: js.Any, position: js.Any): js.Any = js.native
  /* private */ def getCustomListIndentation(list: js.Any, element: js.Any): js.Any = js.native
  def getIndentation(
    node: SourceUnitSyntax,
    soruceText: IScriptSnapshot,
    position: Double,
    editorOptions: EditorOptions
  ): Double = js.native
  /* private */ def getListItemIndentation(list: js.Any, elementIndex: js.Any): js.Any = js.native
  /* private */ def isInContainerNode(parent: js.Any, element: js.Any): js.Any = js.native
}

