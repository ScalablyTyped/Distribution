package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebviewOptions extends js.Object {
  
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
  implicit class WebviewOptionsOps[Self <: WebviewOptions] (val x: Self) extends AnyVal {
    
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
    def setWebviewOptions(value: RetainContextWhenHidden): Self = this.set("webviewOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebviewOptions: Self = this.set("webviewOptions", js.undefined)
  }
}
