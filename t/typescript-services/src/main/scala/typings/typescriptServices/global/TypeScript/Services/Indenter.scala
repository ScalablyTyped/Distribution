package typings.typescriptServices.global.TypeScript.Services

import typings.typescriptServices.TypeScript.IScriptSnapshot
import typings.typescriptServices.TypeScript.SourceUnitSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Services.Indenter")
@js.native
class Indenter ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.Indenter
object Indenter {
  
  @JSGlobal("TypeScript.Services.Indenter")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def belongsToBracket(sourceText: js.Any, token: js.Any, position: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("belongsToBracket")(sourceText.asInstanceOf[js.Any], token.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def getCustomListIndentation(list: js.Any, element: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getCustomListIndentation")(list.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def getIndentation(
    node: SourceUnitSyntax,
    soruceText: IScriptSnapshot,
    position: Double,
    editorOptions: typings.typescriptServices.TypeScript.Services.EditorOptions
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getIndentation")(node.asInstanceOf[js.Any], soruceText.asInstanceOf[js.Any], position.asInstanceOf[js.Any], editorOptions.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def getListItemIndentation(list: js.Any, elementIndex: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getListItemIndentation")(list.asInstanceOf[js.Any], elementIndex.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def isInContainerNode(parent: js.Any, element: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isInContainerNode")(parent.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
