package typings.titanium.Titanium.UI.iOS

import typings.titanium.Point
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Continuous or instantaneous force to apply to an item.
  */
@js.native
trait PushBehavior extends Proxy {
  /**
    * State of the push behavior's force.
    */
  var active: Boolean = js.native
  /**
    * Specifies the angle of the force vector in radians.
    */
  var angle: Double = js.native
  /**
    * Items added to this behavior.
    */
  val items: js.Array[View] = js.native
  /**
    * Specifies the magnitude of the force vector.
    */
  var magnitude: Double = js.native
  /**
    * Specifies the direction of the force vector as an x, y pair.
    */
  var pushDirection: Point = js.native
  /**
    * Specifies the push mode.
    */
  var pushMode: Double = js.native
  /**
    * Adds an item to this behavior.
    */
  def addItem(item: View): Unit = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.PushBehavior.active> property.
    * @deprecated Access <Titanium.UI.iOS.PushBehavior.active> instead.
    */
  def getActive(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.PushBehavior.angle> property.
    * @deprecated Access <Titanium.UI.iOS.PushBehavior.angle> instead.
    */
  def getAngle(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.PushBehavior.items> property.
    * @deprecated Access <Titanium.UI.iOS.PushBehavior.items> instead.
    */
  def getItems(): js.Array[View] = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.PushBehavior.magnitude> property.
    * @deprecated Access <Titanium.UI.iOS.PushBehavior.magnitude> instead.
    */
  def getMagnitude(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.PushBehavior.pushDirection> property.
    * @deprecated Access <Titanium.UI.iOS.PushBehavior.pushDirection> instead.
    */
  def getPushDirection(): Point = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.PushBehavior.pushMode> property.
    * @deprecated Access <Titanium.UI.iOS.PushBehavior.pushMode> instead.
    */
  def getPushMode(): Double = js.native
  /**
    * Removes the specified item from this behavior.
    */
  def removeItem(item: View): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.PushBehavior.active> property.
    * @deprecated Set the value using <Titanium.UI.iOS.PushBehavior.active> instead.
    */
  def setActive(active: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.PushBehavior.angle> property.
    * @deprecated Set the value using <Titanium.UI.iOS.PushBehavior.angle> instead.
    */
  def setAngle(angle: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.PushBehavior.magnitude> property.
    * @deprecated Set the value using <Titanium.UI.iOS.PushBehavior.magnitude> instead.
    */
  def setMagnitude(magnitude: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.PushBehavior.pushDirection> property.
    * @deprecated Set the value using <Titanium.UI.iOS.PushBehavior.pushDirection> instead.
    */
  def setPushDirection(pushDirection: Point): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.PushBehavior.pushMode> property.
    * @deprecated Set the value using <Titanium.UI.iOS.PushBehavior.pushMode> instead.
    */
  def setPushMode(pushMode: Double): Unit = js.native
}

