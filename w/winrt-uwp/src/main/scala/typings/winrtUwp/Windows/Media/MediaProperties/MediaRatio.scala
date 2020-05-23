package typings.winrtUwp.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents ratios used in media operations. */
trait MediaRatio extends js.Object {
  /** The denominator of the MediaRatio. */
  var denominator: Double
  /** The numerator of the MediaRatio. */
  var numerator: Double
}

object MediaRatio {
  @scala.inline
  def apply(denominator: Double, numerator: Double): MediaRatio = {
    val __obj = js.Dynamic.literal(denominator = denominator.asInstanceOf[js.Any], numerator = numerator.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRatio]
  }
}

