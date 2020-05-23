package typings.tweezerJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[
    js.Function4[
      /* currentTime */ Double, 
      /* beginningTime */ Double, 
      /* changeInValue */ Double, 
      /* duration */ Double, 
      Double
    ]
  ] = js.undefined
  var end: Double
  var start: Double
}

object Options {
  @scala.inline
  def apply(
    end: Double,
    start: Double,
    duration: js.UndefOr[Double] = js.undefined,
    easing: (/* currentTime */ Double, /* beginningTime */ Double, /* changeInValue */ Double, /* duration */ Double) => Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction4(easing))
    __obj.asInstanceOf[Options]
  }
}

