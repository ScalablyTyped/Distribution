package typings
package winrtLib.WindowsNs.ManagementNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplicationDataManagerStatics extends js.Object {
  def createForPackageFamily(packageFamilyName: java.lang.String): winrtLib.WindowsNs.StorageNs.ApplicationData
}

object IApplicationDataManagerStatics {
  @scala.inline
  def apply(
    createForPackageFamily: js.Function1[java.lang.String, winrtLib.WindowsNs.StorageNs.ApplicationData]
  ): IApplicationDataManagerStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createForPackageFamily")(createForPackageFamily)
    __obj.asInstanceOf[IApplicationDataManagerStatics]
  }
}

