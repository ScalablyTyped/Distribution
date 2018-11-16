package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Indenter")
@js.native
class Indenter () extends js.Object

@JSGlobal("TypeScript.Services.Indenter")
@js.native
object Indenter extends js.Object {
  /* private */ def belongsToBracket(sourceText: js.Any, token: js.Any, position: js.Any): js.Any = js.native
  /* private */ def getCustomListIndentation(list: js.Any, element: js.Any): js.Any = js.native
  def getIndentation(
    node: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax,
    soruceText: typescriptDashServicesLib.TypeScriptNs.IScriptSnapshot,
    position: scala.Double,
    editorOptions: typescriptDashServicesLib.TypeScriptNs.ServicesNs.EditorOptions
  ): scala.Double = js.native
  /* private */ def getListItemIndentation(list: js.Any, elementIndex: js.Any): js.Any = js.native
  /* private */ def isInContainerNode(parent: js.Any, element: js.Any): js.Any = js.native
}

