package typings.titanium.Titanium.App.iOS

import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An action the user selects in response to an interactive notification.
  */
@js.native
trait UserNotificationAction extends Proxy {
  
  /**
    * Selects how to activate the application.
    */
  var activationMode: Double = js.native
  
  /**
    * Set to true if the action requires the device to be unlocked. On the Apple Watch actions never require authentication.
    */
  var authenticationRequired: Boolean = js.native
  
  /**
    * Custom behavior the user notification supports.
    */
  var behavior: Double = js.native
  
  /**
    * Set to true if the action causes destructive behavior to the user's data or the application.
    */
  var destructive: Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.iOS.UserNotificationAction.activationMode> property.
    * @deprecated Access <Titanium.App.iOS.UserNotificationAction.activationMode> instead.
    */
  def getActivationMode(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.App.iOS.UserNotificationAction.behavior> property.
    * @deprecated Access <Titanium.App.iOS.UserNotificationAction.behavior> instead.
    */
  def getBehavior(): Double = js.native
  
  /**
    * Identifier for this action. Used to identify the action the user pressed.
    */
  var identifier: String = js.native
  
  /**
    * Sets the value of the <Titanium.App.iOS.UserNotificationAction.activationMode> property.
    * @deprecated Set the value using <Titanium.App.iOS.UserNotificationAction.activationMode> instead.
    */
  def setActivationMode(activationMode: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.App.iOS.UserNotificationAction.behavior> property.
    * @deprecated Set the value using <Titanium.App.iOS.UserNotificationAction.behavior> instead.
    */
  def setBehavior(behavior: Double): Unit = js.native
  
  /**
    * Title of the button displayed in the notification.
    */
  var title: String = js.native
}
