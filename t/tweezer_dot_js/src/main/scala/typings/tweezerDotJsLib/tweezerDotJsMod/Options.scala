package typings
package tweezerDotJsLib.tweezerDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[
    js.Function4[
      /* currentTime */ scala.Double, 
      /* beginningTime */ scala.Double, 
      /* changeInValue */ scala.Double, 
      /* duration */ scala.Double, 
      scala.Double
    ]
  ] = js.undefined
  var end: scala.Double
  var start: scala.Double
}

object Options {
  @scala.inline
  def apply(
    end: scala.Double,
    start: scala.Double,
    duration: scala.Int | scala.Double = null,
    easing: js.Function4[
      /* currentTime */ scala.Double, 
      /* beginningTime */ scala.Double, 
      /* changeInValue */ scala.Double, 
      /* duration */ scala.Double, 
      scala.Double
    ] = null
  ): Options = {
    val __obj = js.Dynamic.literal(end = end, start = start)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    __obj.asInstanceOf[Options]
  }
}

