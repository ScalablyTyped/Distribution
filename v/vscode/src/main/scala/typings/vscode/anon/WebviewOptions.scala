package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebviewOptions extends StObject {
  
  /**
    * Content settings for the webview created for this view.
    */
  val webviewOptions: js.UndefOr[RetainContextWhenHidden] = js.undefined
}
object WebviewOptions {
  
  inline def apply(): WebviewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebviewOptions]
  }
  
  extension [Self <: WebviewOptions](x: Self) {
    
    inline def setWebviewOptions(value: RetainContextWhenHidden): Self = StObject.set(x, "webviewOptions", value.asInstanceOf[js.Any])
    
    inline def setWebviewOptionsUndefined: Self = StObject.set(x, "webviewOptions", js.undefined)
  }
}
