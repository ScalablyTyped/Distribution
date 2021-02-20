package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object returned when the <Titanium.UI.WebView.onlink> callback is fired.
  */
@js.native
trait OnLinkURLResponse extends StObject {
  
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
  implicit class OnLinkURLResponseMutableBuilder[Self <: OnLinkURLResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
