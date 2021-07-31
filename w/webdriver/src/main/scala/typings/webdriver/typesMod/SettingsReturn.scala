package typings.webdriver.typesMod

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
  
  @scala.inline
  def apply(): SettingsReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsReturn]
  }
  
  @scala.inline
  implicit class SettingsReturnMutableBuilder[Self <: SettingsReturn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionAcknowledgmentTimeout(value: Double): Self = StObject.set(x, "actionAcknowledgmentTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionAcknowledgmentTimeoutUndefined: Self = StObject.set(x, "actionAcknowledgmentTimeout", js.undefined)
    
    @scala.inline
    def setAllowInvisibleElements(value: Boolean): Self = StObject.set(x, "allowInvisibleElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowInvisibleElementsUndefined: Self = StObject.set(x, "allowInvisibleElements", js.undefined)
    
    @scala.inline
    def setElementResponseAttributes(value: String): Self = StObject.set(x, "elementResponseAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementResponseAttributesUndefined: Self = StObject.set(x, "elementResponseAttributes", js.undefined)
    
    @scala.inline
    def setEnableNotificationListener(value: Boolean): Self = StObject.set(x, "enableNotificationListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableNotificationListenerUndefined: Self = StObject.set(x, "enableNotificationListener", js.undefined)
    
    @scala.inline
    def setIgnoreUnimportantViews(value: Boolean): Self = StObject.set(x, "ignoreUnimportantViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUnimportantViewsUndefined: Self = StObject.set(x, "ignoreUnimportantViews", js.undefined)
    
    @scala.inline
    def setKeyInjectionDelay(value: Double): Self = StObject.set(x, "keyInjectionDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyInjectionDelayUndefined: Self = StObject.set(x, "keyInjectionDelay", js.undefined)
    
    @scala.inline
    def setMjpegScalingFactor(value: Double): Self = StObject.set(x, "mjpegScalingFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMjpegScalingFactorUndefined: Self = StObject.set(x, "mjpegScalingFactor", js.undefined)
    
    @scala.inline
    def setMjpegServerFramerate(value: Double): Self = StObject.set(x, "mjpegServerFramerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMjpegServerFramerateUndefined: Self = StObject.set(x, "mjpegServerFramerate", js.undefined)
    
    @scala.inline
    def setMjpegServerScreenshotQuality(value: Double): Self = StObject.set(x, "mjpegServerScreenshotQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMjpegServerScreenshotQualityUndefined: Self = StObject.set(x, "mjpegServerScreenshotQuality", js.undefined)
    
    @scala.inline
    def setNormalizeTagNames(value: Boolean): Self = StObject.set(x, "normalizeTagNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizeTagNamesUndefined: Self = StObject.set(x, "normalizeTagNames", js.undefined)
    
    @scala.inline
    def setScreenshotQuality(value: Double): Self = StObject.set(x, "screenshotQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenshotQualityUndefined: Self = StObject.set(x, "screenshotQuality", js.undefined)
    
    @scala.inline
    def setScrollAcknowledgmentTimeout(value: Double): Self = StObject.set(x, "scrollAcknowledgmentTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollAcknowledgmentTimeoutUndefined: Self = StObject.set(x, "scrollAcknowledgmentTimeout", js.undefined)
    
    @scala.inline
    def setShouldUseCompactResponses(value: Boolean): Self = StObject.set(x, "shouldUseCompactResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldUseCompactResponsesUndefined: Self = StObject.set(x, "shouldUseCompactResponses", js.undefined)
    
    @scala.inline
    def setShutdownOnPowerDisconnect(value: Boolean): Self = StObject.set(x, "shutdownOnPowerDisconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShutdownOnPowerDisconnectUndefined: Self = StObject.set(x, "shutdownOnPowerDisconnect", js.undefined)
    
    @scala.inline
    def setWaitForIdleTimeout(value: Double): Self = StObject.set(x, "waitForIdleTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForIdleTimeoutUndefined: Self = StObject.set(x, "waitForIdleTimeout", js.undefined)
    
    @scala.inline
    def setWaitForSelectorTimeout(value: Double): Self = StObject.set(x, "waitForSelectorTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForSelectorTimeoutUndefined: Self = StObject.set(x, "waitForSelectorTimeout", js.undefined)
  }
}
