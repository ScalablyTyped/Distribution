package typings.thunderbirdWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUpdateProperties extends StObject {
  
  /**
    * Set this to `true`, if the tab should be active. Does not affect
    * whether the window is focused (see {@link windows.update}). Setting
    * this to `false` has no effect.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A URL to navigate the tab to. Only applicable for `content` tabs and
    * active `mail` tabs.
    */
  var url: js.UndefOr[String] = js.undefined
}
object UpdateUpdateProperties {
  
  inline def apply(): UpdateUpdateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUpdateProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateUpdateProperties] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
