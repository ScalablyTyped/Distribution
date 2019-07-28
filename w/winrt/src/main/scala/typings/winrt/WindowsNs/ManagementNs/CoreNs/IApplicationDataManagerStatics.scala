package typings.winrt.WindowsNs.ManagementNs.CoreNs

import typings.winrt.WindowsNs.StorageNs.ApplicationData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplicationDataManagerStatics extends js.Object {
  def createForPackageFamily(packageFamilyName: String): ApplicationData
}

object IApplicationDataManagerStatics {
  @scala.inline
  def apply(createForPackageFamily: String => ApplicationData): IApplicationDataManagerStatics = {
    val __obj = js.Dynamic.literal(createForPackageFamily = js.Any.fromFunction1(createForPackageFamily))
  
    __obj.asInstanceOf[IApplicationDataManagerStatics]
  }
}

