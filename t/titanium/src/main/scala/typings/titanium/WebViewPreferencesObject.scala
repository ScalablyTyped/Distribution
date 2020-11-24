package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The parameter passed to the <Titanium.UI.iOS.WebViewConfiguration.preferences> method.
  */
@js.native
trait WebViewPreferencesObject extends js.Object {
  
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
  implicit class WebViewPreferencesObjectOps[Self <: WebViewPreferencesObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJavaScriptCanOpenWindowsAutomatically(value: Boolean): Self = this.set("javaScriptCanOpenWindowsAutomatically", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJavaScriptCanOpenWindowsAutomatically: Self = this.set("javaScriptCanOpenWindowsAutomatically", js.undefined)
    
    @scala.inline
    def setJavaScriptEnabled(value: Boolean): Self = this.set("javaScriptEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJavaScriptEnabled: Self = this.set("javaScriptEnabled", js.undefined)
    
    @scala.inline
    def setMinimumFontSize(value: Double): Self = this.set("minimumFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumFontSize: Self = this.set("minimumFontSize", js.undefined)
  }
}
