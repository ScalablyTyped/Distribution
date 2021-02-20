package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a button in the dialog is clicked.
  */
@js.native
trait AlertDialogClickEvent extends AlertDialogBaseEvent {
  
  /**
    * Boolean type on Android; Number on iOS.
    * On Android, indicates whether the cancel button was clicked, in which
    * case returns `true`.
    * On iOS, the value of the [cancel](Titanium.UI.AlertDialog.cancel) property is
    * returned, if defined, or `-1` otherwise. Also note that the cancel button may not be
    * used on the iPad, because iOS will internally decide whether or not to show it in
    * the current context (e.g. in a popover).
    * See the `Three-button Alert Dialog` example for a cross-platform workaround for this
    * parity issue.
    */
  var cancel: Boolean | Double = js.native
  
  /**
    * Index of the button that was clicked.
    */
  var index: Double = js.native
  
  /**
    * Value of login field if dialog `style` property is defined as
    * <Titanium.UI.iOS.AlertDialogStyle.LOGIN_AND_PASSWORD_INPUT>.
    */
  var login: String = js.native
  
  /**
    * Value of password field if dialog `style` property is defined as
    * <Titanium.UI.iOS.AlertDialogStyle.LOGIN_AND_PASSWORD_INPUT>.
    */
  var password: String = js.native
  
  /**
    * Value of text field if dialog `style` property is defined as
    * <Titanium.UI.iOS.AlertDialogStyle.PLAIN_TEXT_INPUT> or
    * <Titanium.UI.iOS.AlertDialogStyle.SECURE_TEXT_INPUT>.
    */
  var text: String = js.native
}
object AlertDialogClickEvent {
  
  @scala.inline
  def apply(
    cancel: Boolean | Double,
    index: Double,
    login: String,
    password: String,
    source: AlertDialog,
    text: String
  ): AlertDialogClickEvent = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertDialogClickEvent]
  }
  
  @scala.inline
  implicit class AlertDialogClickEventMutableBuilder[Self <: AlertDialogClickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean | Double): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
