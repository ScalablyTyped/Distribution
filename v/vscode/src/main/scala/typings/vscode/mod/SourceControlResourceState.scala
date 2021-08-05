package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceControlResourceState extends StObject {
  
  /**
    * The [command](#Command) which should be run when the resource
    * state is open in the Source Control viewlet.
    */
  val command: js.UndefOr[Command] = js.undefined
  
  /**
    * Context value of the resource state. This can be used to contribute resource specific actions.
    * For example, if a resource is given a context value as `diffable`. When contributing actions to `scm/resourceState/context`
    * using `menus` extension point, you can specify context value for key `scmResourceState` in `when` expressions, like `scmResourceState == diffable`.
    * ```
    *    "contributes": {
    *        "menus": {
    *            "scm/resourceState/context": [
    *                {
    *                    "command": "extension.diff",
    *                    "when": "scmResourceState == diffable"
    *                }
    *            ]
    *        }
    *    }
    * ```
    * This will show action `extension.diff` only for resources with `contextValue` is `diffable`.
    */
  val contextValue: js.UndefOr[String] = js.undefined
  
  /**
    * The [decorations](#SourceControlResourceDecorations) for this source control
    * resource state.
    */
  val decorations: js.UndefOr[SourceControlResourceDecorations] = js.undefined
  
  /**
    * The [uri](#Uri) of the underlying resource inside the workspace.
    */
  val resourceUri: Uri
}
object SourceControlResourceState {
  
  inline def apply(resourceUri: Uri): SourceControlResourceState = {
    val __obj = js.Dynamic.literal(resourceUri = resourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceControlResourceState]
  }
  
  extension [Self <: SourceControlResourceState](x: Self) {
    
    inline def setCommand(value: Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setContextValue(value: String): Self = StObject.set(x, "contextValue", value.asInstanceOf[js.Any])
    
    inline def setContextValueUndefined: Self = StObject.set(x, "contextValue", js.undefined)
    
    inline def setDecorations(value: SourceControlResourceDecorations): Self = StObject.set(x, "decorations", value.asInstanceOf[js.Any])
    
    inline def setDecorationsUndefined: Self = StObject.set(x, "decorations", js.undefined)
    
    inline def setResourceUri(value: Uri): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
  }
}
