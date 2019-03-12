package typings
package vanillaDashTiltLib.vanillaDashTiltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VanillaTilt extends js.Object {
  /**
    * Start listening to events
    */
  def addEventListeners(): scala.Unit
  /**
    * Destroys the instance and removes the listeners.
    */
  def destroy(): scala.Unit
  /**
    * Get values of instance
    */
  def getValues(): TiltValues
  /**
    * Stop listening to events
    */
  def removeEventListener(): scala.Unit
  /**
    * Resets the styling
    */
  def reset(): scala.Unit
}

object VanillaTilt {
  @scala.inline
  def apply(
    addEventListeners: () => scala.Unit,
    destroy: () => scala.Unit,
    getValues: () => TiltValues,
    removeEventListener: () => scala.Unit,
    reset: () => scala.Unit
  ): VanillaTilt = {
    val __obj = js.Dynamic.literal(addEventListeners = js.Any.fromFunction0(addEventListeners), destroy = js.Any.fromFunction0(destroy), getValues = js.Any.fromFunction0(getValues), removeEventListener = js.Any.fromFunction0(removeEventListener), reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[VanillaTilt]
  }
}

