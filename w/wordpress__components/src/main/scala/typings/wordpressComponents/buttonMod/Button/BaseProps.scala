package typings.wordpressComponents.buttonMod.Button

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates activity while a action is being performed.
    */
  var isBusy: js.UndefOr[Boolean] = js.native
  
  /**
    * Renders a default button style.
    * @deprecated use `isSecondary`
    */
  var isDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * Renders a red text-based button style to indicate destructive
    * behavior.
    */
  var isDestructive: js.UndefOr[Boolean] = js.native
  
  /**
    * Increases the size of the button.
    */
  var isLarge: js.UndefOr[Boolean] = js.native
  
  /**
    * Renders a button with an anchor style.
    */
  var isLink: js.UndefOr[Boolean] = js.native
  
  /**
    * Renders a primary button style.
    */
  var isPrimary: js.UndefOr[Boolean] = js.native
  
  /**
    * Renders a default button style.
    */
  var isSecondary: js.UndefOr[Boolean] = js.native
  
  /**
    * Decreases the size of the button.
    */
  var isSmall: js.UndefOr[Boolean] = js.native
  
  /**
    * Renders a text-based button style.
    */
  var isTertiary: js.UndefOr[Boolean] = js.native
  
  /**
    * Renders a toggled button style.
    */
  var isToggled: js.UndefOr[Boolean] = js.native
}
object BaseProps {
  
  @scala.inline
  def apply(): BaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseProps]
  }
  
  @scala.inline
  implicit class BasePropsOps[Self <: BaseProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setIsBusy(value: Boolean): Self = this.set("isBusy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBusy: Self = this.set("isBusy", js.undefined)
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefault: Self = this.set("isDefault", js.undefined)
    
    @scala.inline
    def setIsDestructive(value: Boolean): Self = this.set("isDestructive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDestructive: Self = this.set("isDestructive", js.undefined)
    
    @scala.inline
    def setIsLarge(value: Boolean): Self = this.set("isLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLarge: Self = this.set("isLarge", js.undefined)
    
    @scala.inline
    def setIsLink(value: Boolean): Self = this.set("isLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLink: Self = this.set("isLink", js.undefined)
    
    @scala.inline
    def setIsPrimary(value: Boolean): Self = this.set("isPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPrimary: Self = this.set("isPrimary", js.undefined)
    
    @scala.inline
    def setIsSecondary(value: Boolean): Self = this.set("isSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSecondary: Self = this.set("isSecondary", js.undefined)
    
    @scala.inline
    def setIsSmall(value: Boolean): Self = this.set("isSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSmall: Self = this.set("isSmall", js.undefined)
    
    @scala.inline
    def setIsTertiary(value: Boolean): Self = this.set("isTertiary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTertiary: Self = this.set("isTertiary", js.undefined)
    
    @scala.inline
    def setIsToggled(value: Boolean): Self = this.set("isToggled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsToggled: Self = this.set("isToggled", js.undefined)
  }
}
