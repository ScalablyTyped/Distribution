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

