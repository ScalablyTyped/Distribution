package typings
package tocktimerLib.tocktimerMod.tNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TockOptions extends js.Object {
  /**
           * Defaults to false. If true, the clock will count down from a given time, otherwise it will count up from 0:00.
           */
  var countdown: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Defaults to 10 milliseconds. How often, in milliseconds, that the clock will tick.
           */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /**
           * Callback function executed on each tick
           */
  def callback(): scala.Unit
  /**
           * Callback function executed when the timer is complete
           */
  def complete(): scala.Unit
}

