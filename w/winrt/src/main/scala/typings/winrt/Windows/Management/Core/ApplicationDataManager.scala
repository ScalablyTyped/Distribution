package typings.winrt.Windows.Management.Core

import typings.winrt.Windows.Storage.ApplicationData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Management.Core.ApplicationDataManager")
@js.native
class ApplicationDataManager () extends IApplicationDataManager

/* static members */
@JSGlobal("Windows.Management.Core.ApplicationDataManager")
@js.native
object ApplicationDataManager extends js.Object {
  def createForPackageFamily(packageFamilyName: String): ApplicationData = js.native
}

