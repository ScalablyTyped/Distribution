package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioBufferOptions extends js.Object {
  var length: scala.Double
  var numberOfChannels: js.UndefOr[scala.Double] = js.undefined
  var sampleRate: scala.Double
}

object AudioBufferOptions {
  @scala.inline
  def apply(length: scala.Double, sampleRate: scala.Double, numberOfChannels: scala.Int | scala.Double = null): AudioBufferOptions = {
    val __obj = js.Dynamic.literal(length = length, sampleRate = sampleRate)
    if (numberOfChannels != null) __obj.updateDynamic("numberOfChannels")(numberOfChannels.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioBufferOptions]
  }
}

