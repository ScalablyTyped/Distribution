package typings.winrt.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationViewTitleBar extends js.Object {
  
  /**
    * Gets or sets the color of the title bar background.
    **/
  var backgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
  
  /**
    * Gets or sets the background color of the title bar buttons.
    **/
  var buttonBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
  
  /**
    * Gets or sets the foreground color of the title bar buttons.
    **/
  var buttonForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
  
  /**
    * Gets or sets the background color of a title bar button when the pointer is over it.
    **/
  var buttonHoverBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
  
  /**
    * Gets or sets the foreground color of a title bar button when the pointer is over it.
    **/
  var buttonHoverForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
  
  /**
    * Gets or sets the background color of a title bar button when it's inactive.
    **/
  var buttonInactiveBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
  
  /**
    * Gets or sets the foreground color of a title bar button when it's inactive.
    **/
  var buttonInactiveForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
  
  /**
    * Gets or sets the background color of a title bar button when it's pressed.
    **/
  var buttonPressedBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
  
  /**
    * Gets or sets the foreground color of a title bar button when it's pressed.
    **/
  var buttonPressedForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
  
  /**
    * Gets or sets the color of the title bar foreground.
    **/
  var foregroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
  
  /**
    * Gets or sets the color of the title bar background when it's inactive.
    **/
  var inactiveBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
  
  /**
    * Gets or sets the color of the title bar foreground when it's inactive.
    **/
  var inactiveForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
}
object ApplicationViewTitleBar {
  
  @scala.inline
  def apply(
    backgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any,
    buttonBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any,
    buttonForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any,
    buttonHoverBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any,
    buttonHoverForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any,
    buttonInactiveBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any,
    buttonInactiveForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any,
    buttonPressedBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any,
    buttonPressedForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any,
    foregroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any,
    inactiveBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any,
    inactiveForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
  ): ApplicationViewTitleBar = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], buttonBackgroundColor = buttonBackgroundColor.asInstanceOf[js.Any], buttonForegroundColor = buttonForegroundColor.asInstanceOf[js.Any], buttonHoverBackgroundColor = buttonHoverBackgroundColor.asInstanceOf[js.Any], buttonHoverForegroundColor = buttonHoverForegroundColor.asInstanceOf[js.Any], buttonInactiveBackgroundColor = buttonInactiveBackgroundColor.asInstanceOf[js.Any], buttonInactiveForegroundColor = buttonInactiveForegroundColor.asInstanceOf[js.Any], buttonPressedBackgroundColor = buttonPressedBackgroundColor.asInstanceOf[js.Any], buttonPressedForegroundColor = buttonPressedForegroundColor.asInstanceOf[js.Any], foregroundColor = foregroundColor.asInstanceOf[js.Any], inactiveBackgroundColor = inactiveBackgroundColor.asInstanceOf[js.Any], inactiveForegroundColor = inactiveForegroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationViewTitleBar]
  }
  
  @scala.inline
  implicit class ApplicationViewTitleBarOps[Self <: ApplicationViewTitleBar] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
    ): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonBackgroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
    ): Self = this.set("buttonBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonForegroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
    ): Self = this.set("buttonForegroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonHoverBackgroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
    ): Self = this.set("buttonHoverBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonHoverForegroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
    ): Self = this.set("buttonHoverForegroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonInactiveBackgroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
    ): Self = this.set("buttonInactiveBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonInactiveForegroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
    ): Self = this.set("buttonInactiveForegroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonPressedBackgroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
    ): Self = this.set("buttonPressedBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonPressedForegroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
    ): Self = this.set("buttonPressedForegroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
    ): Self = this.set("foregroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactiveBackgroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
    ): Self = this.set("inactiveBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactiveForegroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
    ): Self = this.set("inactiveForegroundColor", value.asInstanceOf[js.Any])
  }
}
