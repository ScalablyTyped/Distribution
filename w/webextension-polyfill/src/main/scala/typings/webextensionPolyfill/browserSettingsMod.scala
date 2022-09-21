package typings.webextensionPolyfill

import typings.webextensionPolyfill.typesMod.Types.Setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserSettingsMod {
  
  object BrowserSettings {
    
    /**
      * Color management mode.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.off
      - typings.webextensionPolyfill.webextensionPolyfillStrings.full
      - typings.webextensionPolyfill.webextensionPolyfillStrings.tagged_only
    */
    trait ColorManagementMode extends StObject
    object ColorManagementMode {
      
      inline def full: typings.webextensionPolyfill.webextensionPolyfillStrings.full = "full".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.full]
      
      inline def off: typings.webextensionPolyfill.webextensionPolyfillStrings.off = "off".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.off]
      
      inline def tagged_only: typings.webextensionPolyfill.webextensionPolyfillStrings.tagged_only = "tagged_only".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.tagged_only]
    }
    
    /**
      * After which mouse event context menus should popup.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.mouseup
      - typings.webextensionPolyfill.webextensionPolyfillStrings.mousedown
    */
    trait ContextMenuMouseEvent extends StObject
    object ContextMenuMouseEvent {
      
      inline def mousedown: typings.webextensionPolyfill.webextensionPolyfillStrings.mousedown = "mousedown".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.mousedown]
      
      inline def mouseup: typings.webextensionPolyfill.webextensionPolyfillStrings.mouseup = "mouseup".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.mouseup]
    }
    
    /**
      * How images should be animated in the browser.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.normal
      - typings.webextensionPolyfill.webextensionPolyfillStrings.none
      - typings.webextensionPolyfill.webextensionPolyfillStrings.once
    */
    trait ImageAnimationBehavior extends StObject
    object ImageAnimationBehavior {
      
      inline def none: typings.webextensionPolyfill.webextensionPolyfillStrings.none = "none".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.none]
      
      inline def normal: typings.webextensionPolyfill.webextensionPolyfillStrings.normal = "normal".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.normal]
      
      inline def once: typings.webextensionPolyfill.webextensionPolyfillStrings.once = "once".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.once]
    }
    
    trait Static extends StObject {
      
      /**
        * Allows or disallows pop-up windows from opening in response to user events.
        */
      var allowPopupsForUserEvents: Setting
      
      /**
        * Enables or disables the browser cache.
        */
      var cacheEnabled: Setting
      
      /**
        * This boolean setting controls whether the selected tab can be closed with a double click.
        */
      var closeTabsByDoubleClick: Setting
      
      var colorManagement: typings.webextensionPolyfill.browserSettingsColorManagementMod.BrowserSettingsColorManagement.Static
      
      /**
        * Controls after which mouse event context menus popup. This setting's value is of type ContextMenuMouseEvent,
        * which has possible values of <code>mouseup</code> and <code>mousedown</code>.
        */
      var contextMenuShowEvent: Setting
      
      /**
        * Returns the value of the overridden home page. Read-only.
        */
      var homepageOverride: Setting
      
      /**
        * Controls the behaviour of image animation in the browser. This setting's value is of type ImageAnimationBehavior,
        * defaulting to <code>normal</code>.
        */
      var imageAnimationBehavior: Setting
      
      /**
        * Returns the value of the overridden new tab page. Read-only.
        */
      var newTabPageOverride: Setting
      
      /**
        * Controls where new tabs are opened. `afterCurrent` will open all new tabs next to the current tab,
        * `relatedAfterCurrent` will open only related tabs next to the current tab, and `atEnd` will open all tabs at the end of
        * the tab strip. The default is `relatedAfterCurrent`.
        */
      var newTabPosition: Setting
      
      /**
        * This boolean setting controls whether bookmarks are opened in the current tab or in a new tab.
        */
      var openBookmarksInNewTabs: Setting
      
      /**
        * This boolean setting controls whether search results are opened in the current tab or in a new tab.
        */
      var openSearchResultsInNewTabs: Setting
      
      /**
        * This boolean setting controls whether urlbar results are opened in the current tab or in a new tab.
        */
      var openUrlbarResultsInNewTabs: Setting
      
      /**
        * This setting controls whether a light or dark color scheme overrides the page's preferred color scheme.
        */
      var overrideContentColorScheme: Setting
      
      /**
        * This setting controls whether the user-chosen colors override the page's colors.
        */
      var overrideDocumentColors: Setting
      
      /**
        * This setting controls whether the document's fonts are used.
        */
      var useDocumentFonts: Setting
      
      /**
        * Disables webAPI notifications.
        */
      var webNotificationsDisabled: Setting
      
      /**
        * This boolean setting controls whether zoom is applied to the full page or to text only.
        */
      var zoomFullPage: Setting
      
      /**
        * This boolean setting controls whether zoom is applied on a per-site basis or to the current tab only. If privacy.
        * resistFingerprinting is true, this setting has no effect and zoom is applied to the current tab only.
        */
      var zoomSiteSpecific: Setting
    }
    object Static {
      
      inline def apply(
        allowPopupsForUserEvents: Setting,
        cacheEnabled: Setting,
        closeTabsByDoubleClick: Setting,
        colorManagement: typings.webextensionPolyfill.browserSettingsColorManagementMod.BrowserSettingsColorManagement.Static,
        contextMenuShowEvent: Setting,
        homepageOverride: Setting,
        imageAnimationBehavior: Setting,
        newTabPageOverride: Setting,
        newTabPosition: Setting,
        openBookmarksInNewTabs: Setting,
        openSearchResultsInNewTabs: Setting,
        openUrlbarResultsInNewTabs: Setting,
        overrideContentColorScheme: Setting,
        overrideDocumentColors: Setting,
        useDocumentFonts: Setting,
        webNotificationsDisabled: Setting,
        zoomFullPage: Setting,
        zoomSiteSpecific: Setting
      ): Static = {
        val __obj = js.Dynamic.literal(allowPopupsForUserEvents = allowPopupsForUserEvents.asInstanceOf[js.Any], cacheEnabled = cacheEnabled.asInstanceOf[js.Any], closeTabsByDoubleClick = closeTabsByDoubleClick.asInstanceOf[js.Any], colorManagement = colorManagement.asInstanceOf[js.Any], contextMenuShowEvent = contextMenuShowEvent.asInstanceOf[js.Any], homepageOverride = homepageOverride.asInstanceOf[js.Any], imageAnimationBehavior = imageAnimationBehavior.asInstanceOf[js.Any], newTabPageOverride = newTabPageOverride.asInstanceOf[js.Any], newTabPosition = newTabPosition.asInstanceOf[js.Any], openBookmarksInNewTabs = openBookmarksInNewTabs.asInstanceOf[js.Any], openSearchResultsInNewTabs = openSearchResultsInNewTabs.asInstanceOf[js.Any], openUrlbarResultsInNewTabs = openUrlbarResultsInNewTabs.asInstanceOf[js.Any], overrideContentColorScheme = overrideContentColorScheme.asInstanceOf[js.Any], overrideDocumentColors = overrideDocumentColors.asInstanceOf[js.Any], useDocumentFonts = useDocumentFonts.asInstanceOf[js.Any], webNotificationsDisabled = webNotificationsDisabled.asInstanceOf[js.Any], zoomFullPage = zoomFullPage.asInstanceOf[js.Any], zoomSiteSpecific = zoomSiteSpecific.asInstanceOf[js.Any])
        __obj.asInstanceOf[Static]
      }
      
      extension [Self <: Static](x: Self) {
        
        inline def setAllowPopupsForUserEvents(value: Setting): Self = StObject.set(x, "allowPopupsForUserEvents", value.asInstanceOf[js.Any])
        
        inline def setCacheEnabled(value: Setting): Self = StObject.set(x, "cacheEnabled", value.asInstanceOf[js.Any])
        
        inline def setCloseTabsByDoubleClick(value: Setting): Self = StObject.set(x, "closeTabsByDoubleClick", value.asInstanceOf[js.Any])
        
        inline def setColorManagement(
          value: typings.webextensionPolyfill.browserSettingsColorManagementMod.BrowserSettingsColorManagement.Static
        ): Self = StObject.set(x, "colorManagement", value.asInstanceOf[js.Any])
        
        inline def setContextMenuShowEvent(value: Setting): Self = StObject.set(x, "contextMenuShowEvent", value.asInstanceOf[js.Any])
        
        inline def setHomepageOverride(value: Setting): Self = StObject.set(x, "homepageOverride", value.asInstanceOf[js.Any])
        
        inline def setImageAnimationBehavior(value: Setting): Self = StObject.set(x, "imageAnimationBehavior", value.asInstanceOf[js.Any])
        
        inline def setNewTabPageOverride(value: Setting): Self = StObject.set(x, "newTabPageOverride", value.asInstanceOf[js.Any])
        
        inline def setNewTabPosition(value: Setting): Self = StObject.set(x, "newTabPosition", value.asInstanceOf[js.Any])
        
        inline def setOpenBookmarksInNewTabs(value: Setting): Self = StObject.set(x, "openBookmarksInNewTabs", value.asInstanceOf[js.Any])
        
        inline def setOpenSearchResultsInNewTabs(value: Setting): Self = StObject.set(x, "openSearchResultsInNewTabs", value.asInstanceOf[js.Any])
        
        inline def setOpenUrlbarResultsInNewTabs(value: Setting): Self = StObject.set(x, "openUrlbarResultsInNewTabs", value.asInstanceOf[js.Any])
        
        inline def setOverrideContentColorScheme(value: Setting): Self = StObject.set(x, "overrideContentColorScheme", value.asInstanceOf[js.Any])
        
        inline def setOverrideDocumentColors(value: Setting): Self = StObject.set(x, "overrideDocumentColors", value.asInstanceOf[js.Any])
        
        inline def setUseDocumentFonts(value: Setting): Self = StObject.set(x, "useDocumentFonts", value.asInstanceOf[js.Any])
        
        inline def setWebNotificationsDisabled(value: Setting): Self = StObject.set(x, "webNotificationsDisabled", value.asInstanceOf[js.Any])
        
        inline def setZoomFullPage(value: Setting): Self = StObject.set(x, "zoomFullPage", value.asInstanceOf[js.Any])
        
        inline def setZoomSiteSpecific(value: Setting): Self = StObject.set(x, "zoomSiteSpecific", value.asInstanceOf[js.Any])
      }
    }
  }
}
