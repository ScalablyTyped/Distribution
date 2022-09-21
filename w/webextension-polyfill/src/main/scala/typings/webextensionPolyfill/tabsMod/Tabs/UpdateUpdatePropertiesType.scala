package typings.webextensionPolyfill.tabsMod.Tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUpdatePropertiesType extends StObject {
  
  /**
    * Whether the tab should be active. Does not affect whether the window is focused (see $(ref:windows.update)).
    * Optional.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the tab should be discarded automatically by the browser when resources are low.
    * Optional.
    */
  var autoDiscardable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Adds or removes the tab from the current selection.
    * Optional.
    */
  var highlighted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the load should replace the current history entry for the tab.
    * Optional.
    */
  var loadReplace: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the tab should be muted.
    * Optional.
    */
  var muted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the tab that opened this tab. If specified, the opener tab must be in the same window as this tab.
    * Optional.
    */
  var openerTabId: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the tab should be pinned.
    * Optional.
    */
  var pinned: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of this tab's successor. If specified, the successor tab must be in the same window as this tab.
    * Optional.
    */
  var successorTabId: js.UndefOr[Double] = js.undefined
  
  /**
    * A URL to navigate the tab to.
    * Optional.
    */
  var url: js.UndefOr[String] = js.undefined
}
object UpdateUpdatePropertiesType {
  
  inline def apply(): UpdateUpdatePropertiesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUpdatePropertiesType]
  }
  
  extension [Self <: UpdateUpdatePropertiesType](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAutoDiscardable(value: Boolean): Self = StObject.set(x, "autoDiscardable", value.asInstanceOf[js.Any])
    
    inline def setAutoDiscardableUndefined: Self = StObject.set(x, "autoDiscardable", js.undefined)
    
    inline def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
    
    inline def setHighlightedUndefined: Self = StObject.set(x, "highlighted", js.undefined)
    
    inline def setLoadReplace(value: Boolean): Self = StObject.set(x, "loadReplace", value.asInstanceOf[js.Any])
    
    inline def setLoadReplaceUndefined: Self = StObject.set(x, "loadReplace", js.undefined)
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    inline def setOpenerTabId(value: Double): Self = StObject.set(x, "openerTabId", value.asInstanceOf[js.Any])
    
    inline def setOpenerTabIdUndefined: Self = StObject.set(x, "openerTabId", js.undefined)
    
    inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    inline def setSuccessorTabId(value: Double): Self = StObject.set(x, "successorTabId", value.asInstanceOf[js.Any])
    
    inline def setSuccessorTabIdUndefined: Self = StObject.set(x, "successorTabId", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
