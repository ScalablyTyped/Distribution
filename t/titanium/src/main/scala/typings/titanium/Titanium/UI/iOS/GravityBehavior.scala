package typings.titanium.Titanium.UI.iOS

import typings.titanium.Point
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gravitational force to apply to an item.
  */
@js.native
trait GravityBehavior extends Proxy {
  
  /**
    * Adds an item to this behavior.
    */
  def addItem(item: View): Unit = js.native
  
  /**
    * Specifies the angle of the gravity vector in radians.
    */
  var angle: Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.GravityBehavior.angle> property.
    * @deprecated Access <Titanium.UI.iOS.GravityBehavior.angle> instead.
    */
  def getAngle(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.GravityBehavior.gravityDirection> property.
    * @deprecated Access <Titanium.UI.iOS.GravityBehavior.gravityDirection> instead.
    */
  def getGravityDirection(): Point = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.GravityBehavior.items> property.
    * @deprecated Access <Titanium.UI.iOS.GravityBehavior.items> instead.
    */
  def getItems(): js.Array[View] = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.GravityBehavior.magnitude> property.
    * @deprecated Access <Titanium.UI.iOS.GravityBehavior.magnitude> instead.
    */
  def getMagnitude(): Double = js.native
  
  /**
    * Specifies the direction of the gravity vector as an x, y pair.
    */
  var gravityDirection: Point = js.native
  
  /**
    * Items added to this behavior.
    */
  val items: js.Array[View] = js.native
  
  /**
    * Specifies the magnitude of the gravity vector.
    */
  var magnitude: Double = js.native
  
  /**
    * Removes the specified item from this behavior.
    */
  def removeItem(item: View): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.GravityBehavior.angle> property.
    * @deprecated Set the value using <Titanium.UI.iOS.GravityBehavior.angle> instead.
    */
  def setAngle(angle: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.GravityBehavior.gravityDirection> property.
    * @deprecated Set the value using <Titanium.UI.iOS.GravityBehavior.gravityDirection> instead.
    */
  def setGravityDirection(gravityDirection: Point): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.GravityBehavior.magnitude> property.
    * @deprecated Set the value using <Titanium.UI.iOS.GravityBehavior.magnitude> instead.
    */
  def setMagnitude(magnitude: Double): Unit = js.native
}
