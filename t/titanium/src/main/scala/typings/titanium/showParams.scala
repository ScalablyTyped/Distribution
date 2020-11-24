package typings.titanium

import typings.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary of options for the <Titanium.UI.OptionDialog.show> method.
  */
@js.native
trait showParams extends js.Object {
  
  /**
    * Determines whether to animate the dialog as it is shown.
    */
  var animated: js.UndefOr[Boolean] = js.native
  
  /**
    * Array of String instances.
    */
  var buttonNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * String to be used as a message for the dialog.
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * Array of String instances.
    */
  var options: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Positions the arrow of the option dialog relative to the attached view's dimensions.
    */
  var rect: js.UndefOr[Dimension] = js.native
  
  /**
    * String to be used as title for the dialog.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * View to which to attach the dialog.
    */
  var view: js.UndefOr[View] = js.native
}
object showParams {
  
  @scala.inline
  def apply(): showParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[showParams]
  }
  
  @scala.inline
  implicit class showParamsOps[Self <: showParams] (val x: Self) extends AnyVal {
    
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
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    
    @scala.inline
    def setButtonNamesVarargs(value: String*): Self = this.set("buttonNames", js.Array(value :_*))
    
    @scala.inline
    def setButtonNames(value: js.Array[String]): Self = this.set("buttonNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonNames: Self = this.set("buttonNames", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: String*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[String]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setRect(value: Dimension): Self = this.set("rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRect: Self = this.set("rect", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setView(value: View): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
