package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceControlResourceState extends js.Object {
  
  /**
    * The [command](#Command) which should be run when the resource
    * state is open in the Source Control viewlet.
    */
  val command: js.UndefOr[Command] = js.native
  
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
  val contextValue: js.UndefOr[String] = js.native
  
  /**
    * The [decorations](#SourceControlResourceDecorations) for this source control
    * resource state.
    */
  val decorations: js.UndefOr[SourceControlResourceDecorations] = js.native
  
  /**
    * The [uri](#Uri) of the underlying resource inside the workspace.
    */
  val resourceUri: Uri = js.native
}
object SourceControlResourceState {
  
  @scala.inline
  def apply(resourceUri: Uri): SourceControlResourceState = {
    val __obj = js.Dynamic.literal(resourceUri = resourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceControlResourceState]
  }
  
  @scala.inline
  implicit class SourceControlResourceStateOps[Self <: SourceControlResourceState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResourceUri(value: Uri): Self = this.set("resourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommand(value: Command): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    
    @scala.inline
    def setContextValue(value: String): Self = this.set("contextValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextValue: Self = this.set("contextValue", js.undefined)
    
    @scala.inline
    def setDecorations(value: SourceControlResourceDecorations): Self = this.set("decorations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecorations: Self = this.set("decorations", js.undefined)
  }
}
