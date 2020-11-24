package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional information the webview view being resolved.
  *
  * @param T Type of the webview's state.
  */
@js.native
trait WebviewViewResolveContext[T] extends js.Object {
  
  /**
    * Persisted state from the webview content.
    *
    * To save resources, VS Code normally deallocates webview documents (the iframe content) that are not visible.
    * For example, when the user collapse a view or switches to another top level activity in the sidebar, the
    * `WebviewView` itself is kept alive but the webview's underlying document is deallocated. It is recreated when
    * the view becomes visible again.
    *
    * You can prevent this behavior by setting `retainContextWhenHidden` in the `WebviewOptions`. However this
    * increases resource usage and should be avoided wherever possible. Instead, you can use persisted state to
    * save off a webview's state so that it can be quickly recreated as needed.
    *
    * To save off a persisted state, inside the webview call `acquireVsCodeApi().setState()` with
    * any json serializable object. To restore the state again, call `getState()`. For example:
    *
    * ```js
    * // Within the webview
    * const vscode = acquireVsCodeApi();
    *
    * // Get existing state
    * const oldState = vscode.getState() || { value: 0 };
    *
    * // Update state
    * setState({ value: oldState.value + 1 })
    * ```
    *
    * VS Code ensures that the persisted state is saved correctly when a webview is hidden and across
    * editor restarts.
    */
  val state: js.UndefOr[T] = js.native
}
object WebviewViewResolveContext {
  
  @scala.inline
  def apply[T](): WebviewViewResolveContext[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebviewViewResolveContext[T]]
  }
  
  @scala.inline
  implicit class WebviewViewResolveContextOps[Self <: WebviewViewResolveContext[_], T] (val x: Self with WebviewViewResolveContext[T]) extends AnyVal {
    
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
    def setState(value: T): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
