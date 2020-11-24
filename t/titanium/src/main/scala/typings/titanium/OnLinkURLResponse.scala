package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object returned when the <Titanium.UI.WebView.onlink> callback is fired.
  */
@js.native
trait OnLinkURLResponse extends js.Object {
  
  /**
    * The url of the link that should be navigated to.
    */
  var url: js.UndefOr[String] = js.native
}
object OnLinkURLResponse {
  
  @scala.inline
  def apply(): OnLinkURLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnLinkURLResponse]
  }
  
  @scala.inline
  implicit class OnLinkURLResponseOps[Self <: OnLinkURLResponse] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
