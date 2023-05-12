package typings.thunderbirdWebextBrowser.messenger.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnUpdatedChangeInfo extends StObject {
  
  /** The tab's new favicon URL. */
  var favIconUrl: js.UndefOr[String] = js.undefined
  
  /** The status of the tab. Can be either `loading` or `complete`. */
  var status: js.UndefOr[String] = js.undefined
  
  /** The tab's URL if it has changed. */
  var url: js.UndefOr[String] = js.undefined
}
object OnUpdatedChangeInfo {
  
  inline def apply(): OnUpdatedChangeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnUpdatedChangeInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnUpdatedChangeInfo] (val x: Self) extends AnyVal {
    
    inline def setFavIconUrl(value: String): Self = StObject.set(x, "favIconUrl", value.asInstanceOf[js.Any])
    
    inline def setFavIconUrlUndefined: Self = StObject.set(x, "favIconUrl", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
