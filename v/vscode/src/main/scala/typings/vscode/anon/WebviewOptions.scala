package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebviewOptions extends StObject {
  
  /**
    * Content settings for the webview created for this view.
    */
  val webviewOptions: js.UndefOr[RetainContextWhenHidden] = js.native
}
object WebviewOptions {
  
  @scala.inline
  def apply(): WebviewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebviewOptions]
  }
  
  @scala.inline
  implicit class WebviewOptionsMutableBuilder[Self <: WebviewOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWebviewOptions(value: RetainContextWhenHidden): Self = StObject.set(x, "webviewOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebviewOptionsUndefined: Self = StObject.set(x, "webviewOptions", js.undefined)
  }
}
