package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebviewViewProvider extends StObject {
  
  /**
    * Revolves a webview view.
    *
    * `resolveWebviewView` is called when a view first becomes visible. This may happen when the view is
    * first loaded or when the user hides and then shows a view again.
    *
    * @param webviewView Webview view to restore. The provider should take ownership of this view. The
    *    provider must set the webview's `.html` and hook up all webview events it is interested in.
    * @param context Additional metadata about the view being resolved.
    * @param token Cancellation token indicating that the view being provided is no longer needed.
    *
    * @return Optional thenable indicating that the view has been fully resolved.
    */
  def resolveWebviewView(webviewView: WebviewView, context: WebviewViewResolveContext[_], token: CancellationToken): Thenable[Unit] | Unit = js.native
}
object WebviewViewProvider {
  
  @scala.inline
  def apply(
    resolveWebviewView: (WebviewView, WebviewViewResolveContext[_], CancellationToken) => Thenable[Unit] | Unit
  ): WebviewViewProvider = {
    val __obj = js.Dynamic.literal(resolveWebviewView = js.Any.fromFunction3(resolveWebviewView))
    __obj.asInstanceOf[WebviewViewProvider]
  }
  
  @scala.inline
  implicit class WebviewViewProviderMutableBuilder[Self <: WebviewViewProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolveWebviewView(value: (WebviewView, WebviewViewResolveContext[_], CancellationToken) => Thenable[Unit] | Unit): Self = StObject.set(x, "resolveWebviewView", js.Any.fromFunction3(value))
  }
}
