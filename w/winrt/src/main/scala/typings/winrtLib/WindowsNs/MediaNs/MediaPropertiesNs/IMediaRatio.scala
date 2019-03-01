package typings
package winrtLib.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaRatio extends js.Object {
  var denominator: scala.Double
  var numerator: scala.Double
}

object IMediaRatio {
  @scala.inline
  def apply(denominator: scala.Double, numerator: scala.Double): IMediaRatio = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("denominator")(denominator)
    __obj.updateDynamic("numerator")(numerator)
    __obj.asInstanceOf[IMediaRatio]
  }
}

