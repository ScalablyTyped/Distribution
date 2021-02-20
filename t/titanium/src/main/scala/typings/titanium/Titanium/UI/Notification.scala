package typings.titanium.Titanium.UI

import typings.titanium.Titanium.Proxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A toast notification.
  */
@js.native
trait Notification extends Proxy {
  
  /**
    * Determines how long the notification stays on screen.
    */
  var duration: Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Notification.duration> property.
    * @deprecated Access <Titanium.UI.Notification.duration> instead.
    */
  def getDuration(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Notification.gravity> property.
    * @deprecated Access <Titanium.UI.Notification.gravity> instead.
    */
  def getGravity(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Notification.horizontalMargin> property.
    * @deprecated Access <Titanium.UI.Notification.horizontalMargin> instead.
    */
  def getHorizontalMargin(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Notification.message> property.
    * @deprecated Access <Titanium.UI.Notification.message> instead.
    */
  def getMessage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Notification.verticalMargin> property.
    * @deprecated Access <Titanium.UI.Notification.verticalMargin> instead.
    */
  def getVerticalMargin(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Notification.xOffset> property.
    * @deprecated Access <Titanium.UI.Notification.xOffset> instead.
    */
  def getXOffset(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Notification.yOffset> property.
    * @deprecated Access <Titanium.UI.Notification.yOffset> instead.
    */
  def getYOffset(): Double = js.native
  
  /**
    * Determines the location at which the notification should appear on the screen.
    */
  var gravity: Double = js.native
  
  /**
    * Horizontal placement of the notification, *as a fraction of the screen width*.
    */
  var horizontalMargin: Double = js.native
  
  /**
    * Notification text to display.
    */
  var message: String = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Notification.duration> property.
    * @deprecated Set the value using <Titanium.UI.Notification.duration> instead.
    */
  def setDuration(duration: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Notification.gravity> property.
    * @deprecated Set the value using <Titanium.UI.Notification.gravity> instead.
    */
  def setGravity(gravity: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Notification.horizontalMargin> property.
    * @deprecated Set the value using <Titanium.UI.Notification.horizontalMargin> instead.
    */
  def setHorizontalMargin(horizontalMargin: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Notification.message> property.
    * @deprecated Set the value using <Titanium.UI.Notification.message> instead.
    */
  def setMessage(message: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Notification.verticalMargin> property.
    * @deprecated Set the value using <Titanium.UI.Notification.verticalMargin> instead.
    */
  def setVerticalMargin(verticalMargin: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Notification.xOffset> property.
    * @deprecated Set the value using <Titanium.UI.Notification.xOffset> instead.
    */
  def setXOffset(xOffset: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Notification.yOffset> property.
    * @deprecated Set the value using <Titanium.UI.Notification.yOffset> instead.
    */
  def setYOffset(yOffset: Double): Unit = js.native
  
  /**
    * Show the notification.
    */
  def show(): Unit = js.native
  
  /**
    * Vertical placement of the notifcation, *as a fraction of the screen height*.
    */
  var verticalMargin: Double = js.native
  
  /**
    * X offset from the default position, in pixels.
    */
  var xOffset: Double = js.native
  
  /**
    * Y offset from the default position, in pixels.
    */
  var yOffset: Double = js.native
}
