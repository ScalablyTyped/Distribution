package typings.typeformEmbed

import typings.std.Record
import typings.typeformEmbed.typeformEmbedStrings._blank
import typings.typeformEmbed.typeformEmbedStrings._parent
import typings.typeformEmbed.typeformEmbedStrings._self
import typings.typeformEmbed.typeformEmbedStrings._top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBaseUrlOptionsMod {
  
  trait UrlOptions extends StObject {
    
    /**
      * Disables tracking.
      *
      * @type {boolean}
      */
    var disableTracking: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables fullscreen iframe
      *
      * @type {boolean}
      */
    var enableFullscreen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable sandbox mode for the form.
      * Allow testing without adding an entry to results or affecting metrics.
      *
      * @type {boolean}
      */
    var enableSandbox: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Forces mobile for the form
      *
      * @type {boolean}
      */
    var forceTouch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Hide typeform footer, that appears showing the progress bar and the navigation buttons.
      *
      * @type {boolean}
      */
    var hideFooter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Hide typeform header, that appears when you have a Question group, or a long question that you need to scroll through to answer, like a Multiple Choice block.
      *
      * @type {boolean}
      */
    var hideHeaders: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable Hubspot Tracking
      *
      * @type {boolean}
      */
    var hubspot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Name of the plugin built on top of the SDK.
      *
      * @type {string}
      */
    var medium: js.UndefOr[String] = js.undefined
    
    /**
      * Version of the plugin built on top of the SDK.
      *
      * @type {string}
      */
    var mediumVersion: js.UndefOr[String] = js.undefined
    
    /**
      * You can make your typeform's background totally transparent, or opaque. (For example, to have a video as a background).
      *
      * @type {number}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /**
      * Redirect target for redirect on submit or redirect from thank you page.
      *
      * Browser Compatibility Note:
      * Target "_blank" will be blocked in some browsers: Safari on dekstop and iOS, Chrome on Android.
      * Redirecting in new tab works in Chrome and Firefox on desktop.
      *
      * @type {'_self' | '_top' | '_blank' | '_parent'}
      */
    var redirectTarget: js.UndefOr[_self | _top | _blank | _parent] = js.undefined
    
    /**
      * Allows to share the Google instance of the page with the Typeform in the embed.
      * If string value is provided it specifies which Google Analytics instance to share (in case there are more in the host page).
      *
      * @type {string | boolean}
      */
    var shareGaInstance: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * Domain name of the site using the SDK.
      *
      * @type {string}
      */
    var source: js.UndefOr[String] = js.undefined
    
    /**
      * List of tracking query strings
      *
      * @type {Record<string,string>}
      */
    var tracking: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
      * Parameters that we want to transfert from the URL to the Typeform as hidden fields.
      *
      * @type {string[]}
      */
    var transitiveSearchParams: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UrlOptions {
    
    inline def apply(): UrlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlOptions]
    }
    
    extension [Self <: UrlOptions](x: Self) {
      
      inline def setDisableTracking(value: Boolean): Self = StObject.set(x, "disableTracking", value.asInstanceOf[js.Any])
      
      inline def setDisableTrackingUndefined: Self = StObject.set(x, "disableTracking", js.undefined)
      
      inline def setEnableFullscreen(value: Boolean): Self = StObject.set(x, "enableFullscreen", value.asInstanceOf[js.Any])
      
      inline def setEnableFullscreenUndefined: Self = StObject.set(x, "enableFullscreen", js.undefined)
      
      inline def setEnableSandbox(value: Boolean): Self = StObject.set(x, "enableSandbox", value.asInstanceOf[js.Any])
      
      inline def setEnableSandboxUndefined: Self = StObject.set(x, "enableSandbox", js.undefined)
      
      inline def setForceTouch(value: Boolean): Self = StObject.set(x, "forceTouch", value.asInstanceOf[js.Any])
      
      inline def setForceTouchUndefined: Self = StObject.set(x, "forceTouch", js.undefined)
      
      inline def setHideFooter(value: Boolean): Self = StObject.set(x, "hideFooter", value.asInstanceOf[js.Any])
      
      inline def setHideFooterUndefined: Self = StObject.set(x, "hideFooter", js.undefined)
      
      inline def setHideHeaders(value: Boolean): Self = StObject.set(x, "hideHeaders", value.asInstanceOf[js.Any])
      
      inline def setHideHeadersUndefined: Self = StObject.set(x, "hideHeaders", js.undefined)
      
      inline def setHubspot(value: Boolean): Self = StObject.set(x, "hubspot", value.asInstanceOf[js.Any])
      
      inline def setHubspotUndefined: Self = StObject.set(x, "hubspot", js.undefined)
      
      inline def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
      
      inline def setMediumVersion(value: String): Self = StObject.set(x, "mediumVersion", value.asInstanceOf[js.Any])
      
      inline def setMediumVersionUndefined: Self = StObject.set(x, "mediumVersion", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRedirectTarget(value: _self | _top | _blank | _parent): Self = StObject.set(x, "redirectTarget", value.asInstanceOf[js.Any])
      
      inline def setRedirectTargetUndefined: Self = StObject.set(x, "redirectTarget", js.undefined)
      
      inline def setShareGaInstance(value: String | Boolean): Self = StObject.set(x, "shareGaInstance", value.asInstanceOf[js.Any])
      
      inline def setShareGaInstanceUndefined: Self = StObject.set(x, "shareGaInstance", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setTracking(value: Record[String, String]): Self = StObject.set(x, "tracking", value.asInstanceOf[js.Any])
      
      inline def setTrackingUndefined: Self = StObject.set(x, "tracking", js.undefined)
      
      inline def setTransitiveSearchParams(value: js.Array[String]): Self = StObject.set(x, "transitiveSearchParams", value.asInstanceOf[js.Any])
      
      inline def setTransitiveSearchParamsUndefined: Self = StObject.set(x, "transitiveSearchParams", js.undefined)
      
      inline def setTransitiveSearchParamsVarargs(value: String*): Self = StObject.set(x, "transitiveSearchParams", js.Array(value*))
    }
  }
}
