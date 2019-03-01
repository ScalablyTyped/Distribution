package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplicationDataStatics extends js.Object {
  var current: ApplicationData
}

object IApplicationDataStatics {
  @scala.inline
  def apply(current: ApplicationData): IApplicationDataStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current")(current)
    __obj.asInstanceOf[IApplicationDataStatics]
  }
}

