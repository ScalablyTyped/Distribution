package typings
package winrtLib.WindowsNs.ApplicationModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPackageStatics extends js.Object {
  var current: Package
}

object IPackageStatics {
  @scala.inline
  def apply(current: Package): IPackageStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current")(current)
    __obj.asInstanceOf[IPackageStatics]
  }
}

