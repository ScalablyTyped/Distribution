package typings.telegramWebApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object controls the back button, which can be displayed in the header of
  * the Web App in the Telegram interface.
  */
trait BackButton extends StObject {
  
  /**
    * A method to hide the button.
    */
  def hide(): Unit
  
  /**
    * Shows whether the button is visible. Set to false by default.
    */
  var isVisible: Boolean
  
  /**
    *  A method that removes the button press event handler. An alias for
    *  Telegram.WebApp.offEvent('backButtonClicked', callback)
    */
  def offClick(callback: js.Function0[Unit]): BackButton
  
  /**
    * A method that sets the button press event handler. An alias for
    * Telegram.WebApp.onEvent('backButtonClicked', callback)
    */
  def onClick(callback: js.Function0[Unit]): BackButton
  
  /**
    * A method to make the button active and visible.
    */
  def show(): Unit
}
object BackButton {
  
  inline def apply(
    hide: () => Unit,
    isVisible: Boolean,
    offClick: js.Function0[Unit] => BackButton,
    onClick: js.Function0[Unit] => BackButton,
    show: () => Unit
  ): BackButton = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), isVisible = isVisible.asInstanceOf[js.Any], offClick = js.Any.fromFunction1(offClick), onClick = js.Any.fromFunction1(onClick), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[BackButton]
  }
  
  extension [Self <: BackButton](x: Self) {
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setOffClick(value: js.Function0[Unit] => BackButton): Self = StObject.set(x, "offClick", js.Any.fromFunction1(value))
    
    inline def setOnClick(value: js.Function0[Unit] => BackButton): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
