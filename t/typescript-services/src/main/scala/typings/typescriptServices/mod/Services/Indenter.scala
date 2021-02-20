package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.IScriptSnapshot
import typings.typescriptServices.TypeScript.SourceUnitSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.Indenter")
@js.native
class Indenter ()
  extends typings.typescriptServices.TypeScript.Services.Indenter
object Indenter {
  
  /* static member */
  @JSImport("typescript-services", "Services.Indenter.belongsToBracket")
  @js.native
  def belongsToBracket(sourceText: js.Any, token: js.Any, position: js.Any): js.Any = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.Indenter.getCustomListIndentation")
  @js.native
  def getCustomListIndentation(list: js.Any, element: js.Any): js.Any = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.Indenter.getIndentation")
  @js.native
  def getIndentation(
    node: SourceUnitSyntax,
    soruceText: IScriptSnapshot,
    position: Double,
    editorOptions: typings.typescriptServices.TypeScript.Services.EditorOptions
  ): Double = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.Indenter.getListItemIndentation")
  @js.native
  def getListItemIndentation(list: js.Any, elementIndex: js.Any): js.Any = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.Indenter.isInContainerNode")
  @js.native
  def isInContainerNode(parent: js.Any, element: js.Any): js.Any = js.native
}
