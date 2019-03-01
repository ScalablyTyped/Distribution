package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The bar that contains the volume level and can be clicked on to adjust the level
	 */
@js.native
trait VolumeBar extends Slider {
  /**
  		 * If the player is muted unmute it.
  		 */
  def checkMuted(): scala.Unit = js.native
  /**
  		 * Get percent of volume level
  		 *
  		 * @return Volume level percent as a decimal number.
  		 */
  def getPercent(): scala.Double = js.native
  /**
  		 * Decrease volume level for keyboard users
  		 */
  def stepBack(): scala.Unit = js.native
  /**
  		 * Increase volume level for keyboard users
  		 */
  def stepForward(): scala.Unit = js.native
  /**
  		 * Update ARIA accessibility attributes
  		 *
  		 * @param [event]
  		 *        The `volumechange` event that caused this function to run.
  		 *
  		 * @listens Player#volumechange
  		 */
  def updateARIAAttributes(event: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.Event): scala.Unit = js.native
}

