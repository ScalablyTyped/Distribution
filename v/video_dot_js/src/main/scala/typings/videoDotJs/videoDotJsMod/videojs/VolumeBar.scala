package typings.videoDotJs.videoDotJsMod.videojs

import typings.videoDotJs.videoDotJsMod.videojs.EventTarget.Event
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
  def checkMuted(): Unit = js.native
  /**
    * Get percent of volume level
    *
    * @return Volume level percent as a decimal number.
    */
  def getPercent(): Double = js.native
  /**
    * Decrease volume level for keyboard users
    */
  def stepBack(): Unit = js.native
  /**
    * Increase volume level for keyboard users
    */
  def stepForward(): Unit = js.native
  /**
    * Update ARIA accessibility attributes
    *
    * @param [event]
    *        The `volumechange` event that caused this function to run.
    *
    * @listens Player#volumechange
    */
  def updateARIAAttributes(event: Event): Unit = js.native
}

