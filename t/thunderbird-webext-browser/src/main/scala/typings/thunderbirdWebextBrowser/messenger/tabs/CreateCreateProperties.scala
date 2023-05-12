package typings.thunderbirdWebextBrowser.messenger.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCreateProperties extends StObject {
  
  /**
    * Whether the tab should become the active tab in the window. Does not
    * affect whether the window is focused (see {@link windows.update}).
    * Defaults to `true`.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The position the tab should take in the window. The provided value
    * will be clamped to between zero and the number of tabs in the window.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the tab should become the selected tab in the window. Defaults
    * to `true`
    *
    * @deprecated Please use `createProperties.active`.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The URL to navigate the tab to initially. Fully-qualified URLs must
    * include a scheme (i.e. `http://www.google.com`, not `www.google.com`).
    * Relative URLs will be relative to the current page within the
    * extension.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /** The window to create the new tab in. Defaults to the current window. */
  var windowId: js.UndefOr[Double] = js.undefined
}
object CreateCreateProperties {
  
  inline def apply(): CreateCreateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCreateProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCreateProperties] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
  }
}
