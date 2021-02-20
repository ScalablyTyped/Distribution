package typings.titanium

import typings.titanium.Titanium.UI.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary of options for the <Titanium.UI.OptionDialog.show> method.
  */
@js.native
trait showParams extends StObject {
  
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
  implicit class showParamsMutableBuilder[Self <: showParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setButtonNames(value: js.Array[String]): Self = StObject.set(x, "buttonNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonNamesUndefined: Self = StObject.set(x, "buttonNames", js.undefined)
    
    @scala.inline
    def setButtonNamesVarargs(value: String*): Self = StObject.set(x, "buttonNames", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setRect(value: Dimension): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
