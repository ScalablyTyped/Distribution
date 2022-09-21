package typings.wdioProtocols.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettingsReturn
  extends StObject
     with ProtocolCommandResponse {
  
  var actionAcknowledgmentTimeout: js.UndefOr[Double] = js.undefined
  
  var allowInvisibleElements: js.UndefOr[Boolean] = js.undefined
  
  var elementResponseAttributes: js.UndefOr[String] = js.undefined
  
  var enableNotificationListener: js.UndefOr[Boolean] = js.undefined
  
  var ignoreUnimportantViews: js.UndefOr[Boolean] = js.undefined
  
  var keyInjectionDelay: js.UndefOr[Double] = js.undefined
  
  var mjpegScalingFactor: js.UndefOr[Double] = js.undefined
  
  var mjpegServerFramerate: js.UndefOr[Double] = js.undefined
  
  var mjpegServerScreenshotQuality: js.UndefOr[Double] = js.undefined
  
  var normalizeTagNames: js.UndefOr[Boolean] = js.undefined
  
  var screenshotQuality: js.UndefOr[Double] = js.undefined
  
  var scrollAcknowledgmentTimeout: js.UndefOr[Double] = js.undefined
  
  var shouldUseCompactResponses: js.UndefOr[Boolean] = js.undefined
  
  var shutdownOnPowerDisconnect: js.UndefOr[Boolean] = js.undefined
  
  var waitForIdleTimeout: js.UndefOr[Double] = js.undefined
  
  var waitForSelectorTimeout: js.UndefOr[Double] = js.undefined
}
object SettingsReturn {
  
  inline def apply(): SettingsReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsReturn]
  }
  
  extension [Self <: SettingsReturn](x: Self) {
    
    inline def setActionAcknowledgmentTimeout(value: Double): Self = StObject.set(x, "actionAcknowledgmentTimeout", value.asInstanceOf[js.Any])
    
    inline def setActionAcknowledgmentTimeoutUndefined: Self = StObject.set(x, "actionAcknowledgmentTimeout", js.undefined)
    
    inline def setAllowInvisibleElements(value: Boolean): Self = StObject.set(x, "allowInvisibleElements", value.asInstanceOf[js.Any])
    
    inline def setAllowInvisibleElementsUndefined: Self = StObject.set(x, "allowInvisibleElements", js.undefined)
    
    inline def setElementResponseAttributes(value: String): Self = StObject.set(x, "elementResponseAttributes", value.asInstanceOf[js.Any])
    
    inline def setElementResponseAttributesUndefined: Self = StObject.set(x, "elementResponseAttributes", js.undefined)
    
    inline def setEnableNotificationListener(value: Boolean): Self = StObject.set(x, "enableNotificationListener", value.asInstanceOf[js.Any])
    
    inline def setEnableNotificationListenerUndefined: Self = StObject.set(x, "enableNotificationListener", js.undefined)
    
    inline def setIgnoreUnimportantViews(value: Boolean): Self = StObject.set(x, "ignoreUnimportantViews", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUnimportantViewsUndefined: Self = StObject.set(x, "ignoreUnimportantViews", js.undefined)
    
    inline def setKeyInjectionDelay(value: Double): Self = StObject.set(x, "keyInjectionDelay", value.asInstanceOf[js.Any])
    
    inline def setKeyInjectionDelayUndefined: Self = StObject.set(x, "keyInjectionDelay", js.undefined)
    
    inline def setMjpegScalingFactor(value: Double): Self = StObject.set(x, "mjpegScalingFactor", value.asInstanceOf[js.Any])
    
    inline def setMjpegScalingFactorUndefined: Self = StObject.set(x, "mjpegScalingFactor", js.undefined)
    
    inline def setMjpegServerFramerate(value: Double): Self = StObject.set(x, "mjpegServerFramerate", value.asInstanceOf[js.Any])
    
    inline def setMjpegServerFramerateUndefined: Self = StObject.set(x, "mjpegServerFramerate", js.undefined)
    
    inline def setMjpegServerScreenshotQuality(value: Double): Self = StObject.set(x, "mjpegServerScreenshotQuality", value.asInstanceOf[js.Any])
    
    inline def setMjpegServerScreenshotQualityUndefined: Self = StObject.set(x, "mjpegServerScreenshotQuality", js.undefined)
    
    inline def setNormalizeTagNames(value: Boolean): Self = StObject.set(x, "normalizeTagNames", value.asInstanceOf[js.Any])
    
    inline def setNormalizeTagNamesUndefined: Self = StObject.set(x, "normalizeTagNames", js.undefined)
    
    inline def setScreenshotQuality(value: Double): Self = StObject.set(x, "screenshotQuality", value.asInstanceOf[js.Any])
    
    inline def setScreenshotQualityUndefined: Self = StObject.set(x, "screenshotQuality", js.undefined)
    
    inline def setScrollAcknowledgmentTimeout(value: Double): Self = StObject.set(x, "scrollAcknowledgmentTimeout", value.asInstanceOf[js.Any])
    
    inline def setScrollAcknowledgmentTimeoutUndefined: Self = StObject.set(x, "scrollAcknowledgmentTimeout", js.undefined)
    
    inline def setShouldUseCompactResponses(value: Boolean): Self = StObject.set(x, "shouldUseCompactResponses", value.asInstanceOf[js.Any])
    
    inline def setShouldUseCompactResponsesUndefined: Self = StObject.set(x, "shouldUseCompactResponses", js.undefined)
    
    inline def setShutdownOnPowerDisconnect(value: Boolean): Self = StObject.set(x, "shutdownOnPowerDisconnect", value.asInstanceOf[js.Any])
    
    inline def setShutdownOnPowerDisconnectUndefined: Self = StObject.set(x, "shutdownOnPowerDisconnect", js.undefined)
    
    inline def setWaitForIdleTimeout(value: Double): Self = StObject.set(x, "waitForIdleTimeout", value.asInstanceOf[js.Any])
    
    inline def setWaitForIdleTimeoutUndefined: Self = StObject.set(x, "waitForIdleTimeout", js.undefined)
    
    inline def setWaitForSelectorTimeout(value: Double): Self = StObject.set(x, "waitForSelectorTimeout", value.asInstanceOf[js.Any])
    
    inline def setWaitForSelectorTimeoutUndefined: Self = StObject.set(x, "waitForSelectorTimeout", js.undefined)
  }
}
