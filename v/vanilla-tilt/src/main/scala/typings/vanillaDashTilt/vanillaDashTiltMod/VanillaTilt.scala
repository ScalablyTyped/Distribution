package typings.vanillaDashTilt.vanillaDashTiltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VanillaTilt extends js.Object {
  /**
    * Start listening to events
    */
  def addEventListeners(): Unit
  /**
    * Destroys the instance and removes the listeners.
    */
  def destroy(): Unit
  /**
    * Get values of instance
    */
  def getValues(): TiltValues
  /**
    * Stop listening to events
    */
  def removeEventListener(): Unit
  /**
    * Resets the styling
    */
  def reset(): Unit
}

object VanillaTilt {
  @scala.inline
  def apply(
    addEventListeners: () => Unit,
    destroy: () => Unit,
    getValues: () => TiltValues,
    removeEventListener: () => Unit,
    reset: () => Unit
  ): VanillaTilt = {
    val __obj = js.Dynamic.literal(addEventListeners = js.Any.fromFunction0(addEventListeners), destroy = js.Any.fromFunction0(destroy), getValues = js.Any.fromFunction0(getValues), removeEventListener = js.Any.fromFunction0(removeEventListener), reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[VanillaTilt]
  }
}

