package typings.telegramWebApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object controls the main button, which is displayed at the bottom of the
  * Web App in the Telegram interface.
  */
@js.native
trait MainButton extends StObject {
  
  /** Current button color. Set to themeParams.button_color by default. */
  var color: String = js.native
  
  /** A method to disable the button. */
  def disable(): MainButton = js.native
  
  /** A method to enable the button. */
  def enable(): MainButton = js.native
  
  /** A method to hide the button. */
  def hide(): MainButton = js.native
  
  /** A method to hide the loading indicator. */
  def hideProgress(): MainButton = js.native
  
  /** Shows whether the button is active. Set to true by default. */
  var isActive: Boolean = js.native
  
  /** Readonly. Shows whether the button is displaying a loading indicator. */
  var isProgressVisible: Boolean = js.native
  
  /** Shows whether the button is visible. Set to false by default. */
  var isVisible: Boolean = js.native
  
  /** A method that deletes a previously set handler */
  def offClick(callback: js.Function0[Unit]): MainButton = js.native
  
  /**
    * A method that sets the button press event handler. An alias for
    * Telegram.WebApp.onEvent('mainButtonClicked', callback)
    */
  def onClick(callback: js.Function0[Unit]): MainButton = js.native
  
  /**
    * A method to set the button parameters. The params parameter is an object
    * containing one or several fields that need to be changed:
    * - text - button text;
    * - color - button color;
    * - text_color - button text color;
    * - is_active - enable the button;
    * - is_visible - show the button.
    */
  def setParams(params: MainButtonParams): MainButton = js.native
  
  /** A method to set the button text. */
  def setText(text: String): MainButton = js.native
  
  /**
    * A method to make the button visible. Note that opening the Web App from the
    * attachment menu hides the main button until the user interacts with the
    * Web App interface.
    */
  def show(): MainButton = js.native
  
  /**
    * A method to show a loading indicator on the button. It is recommended to
    * display loading progress if the action tied to the button may take a long
    * time. By default, the button is disabled while the action is in progress.
    * If the parameter leaveActive=true is passed, the button remains enabled.
    */
  def showProgress(): MainButton = js.native
  def showProgress(leaveActive: Boolean): MainButton = js.native
  
  /** Current button text. Set to CONTINUE by default. */
  var text: String = js.native
  
  /**
    * Current button text color. Set to themeParams.button_text_color by default.
    */
  var textColor: String = js.native
}
