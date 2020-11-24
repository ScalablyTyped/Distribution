package typings.ukCoWorkingedgePhonegapPluginLaunchnavigator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromptsOptions extends js.Object {
  
  /**
    * text to display in the native prompt body asking user whether to remember their choice.
    * Defaults to "Use the same app for navigating next time?" if not specified.
    */
  var bodyText: js.UndefOr[String] = js.native
  
  /**
    * a function to pass the user's decision whether to remember their choice of app.
    * This will be passed a single boolean value indicating the user's decision.
    * @param rememberChoice
    */
  var callback: js.UndefOr[js.Function1[/* rememberChoice */ Boolean, Unit]] = js.native
  
  /**
    * text to display in the native prompt header asking user whether to remember their choice.
    * Defaults to "Remember your choice?" if not specified.
    */
  var headerText: js.UndefOr[String] = js.native
  
  /**
    * text to display for the No button.
    * Defaults to "No" if not specified.
    */
  var noButtonText: js.UndefOr[String] = js.native
  
  /**
    * text to display for the Yes button.
    * Defaults to "Yes" if not specified.
    */
  var yesButtonText: js.UndefOr[String] = js.native
}
object PromptsOptions {
  
  @scala.inline
  def apply(): PromptsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromptsOptions]
  }
  
  @scala.inline
  implicit class PromptsOptionsOps[Self <: PromptsOptions] (val x: Self) extends AnyVal {
    
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
    def setBodyText(value: String): Self = this.set("bodyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyText: Self = this.set("bodyText", js.undefined)
    
    @scala.inline
    def setCallback(value: /* rememberChoice */ Boolean => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setHeaderText(value: String): Self = this.set("headerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderText: Self = this.set("headerText", js.undefined)
    
    @scala.inline
    def setNoButtonText(value: String): Self = this.set("noButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoButtonText: Self = this.set("noButtonText", js.undefined)
    
    @scala.inline
    def setYesButtonText(value: String): Self = this.set("yesButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYesButtonText: Self = this.set("yesButtonText", js.undefined)
  }
}
