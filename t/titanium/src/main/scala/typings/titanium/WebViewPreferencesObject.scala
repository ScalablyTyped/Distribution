package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The parameter passed to the <Titanium.UI.iOS.WebViewConfiguration.preferences> method.
  */
@js.native
trait WebViewPreferencesObject extends StObject {
  
  /**
    * A Boolean value indicating whether JavaScript can open windows without user interaction.
    */
  var javaScriptCanOpenWindowsAutomatically: js.UndefOr[Boolean] = js.native
  
  /**
    * A Boolean value indicating whether JavaScript is enabled.
    */
  var javaScriptEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The minimum font size in points.
    */
  var minimumFontSize: js.UndefOr[Double] = js.native
}
object WebViewPreferencesObject {
  
  @scala.inline
  def apply(): WebViewPreferencesObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebViewPreferencesObject]
  }
  
  @scala.inline
  implicit class WebViewPreferencesObjectMutableBuilder[Self <: WebViewPreferencesObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJavaScriptCanOpenWindowsAutomatically(value: Boolean): Self = StObject.set(x, "javaScriptCanOpenWindowsAutomatically", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavaScriptCanOpenWindowsAutomaticallyUndefined: Self = StObject.set(x, "javaScriptCanOpenWindowsAutomatically", js.undefined)
    
    @scala.inline
    def setJavaScriptEnabled(value: Boolean): Self = StObject.set(x, "javaScriptEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavaScriptEnabledUndefined: Self = StObject.set(x, "javaScriptEnabled", js.undefined)
    
    @scala.inline
    def setMinimumFontSize(value: Double): Self = StObject.set(x, "minimumFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumFontSizeUndefined: Self = StObject.set(x, "minimumFontSize", js.undefined)
  }
}
