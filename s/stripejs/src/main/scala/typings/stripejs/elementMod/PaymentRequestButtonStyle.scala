package typings.stripejs.elementMod

import typings.stripejs.stripejsStrings.`light-outline`
import typings.stripejs.stripejsStrings.buy
import typings.stripejs.stripejsStrings.dark
import typings.stripejs.stripejsStrings.default
import typings.stripejs.stripejsStrings.donate
import typings.stripejs.stripejsStrings.light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentRequestButtonStyle extends js.Object {
  
  /**
    * The height of the button
    * @example '25px'
    */
  var height: js.UndefOr[String] = js.native
  
  /**
    * The theme of the button that should be used
    * @default 'dark'
    */
  var theme: js.UndefOr[dark | light | `light-outline`] = js.native
  
  /**
    * The type of button that should be shown
    * @default 'default'
    */
  var `type`: js.UndefOr[default | donate | buy] = js.native
}
object PaymentRequestButtonStyle {
  
  @scala.inline
  def apply(): PaymentRequestButtonStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentRequestButtonStyle]
  }
  
  @scala.inline
  implicit class PaymentRequestButtonStyleOps[Self <: PaymentRequestButtonStyle] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setTheme(value: dark | light | `light-outline`): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setType(value: default | donate | buy): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
