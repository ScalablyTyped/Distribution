package typings
package swfobjectLib.swfobjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFlashPlayerVersion extends js.Object {
  var major: scala.Double
  var minor: scala.Double
  var release: scala.Double
}

object IFlashPlayerVersion {
  @scala.inline
  def apply(major: scala.Double, minor: scala.Double, release: scala.Double): IFlashPlayerVersion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("major")(major)
    __obj.updateDynamic("minor")(minor)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[IFlashPlayerVersion]
  }
}

