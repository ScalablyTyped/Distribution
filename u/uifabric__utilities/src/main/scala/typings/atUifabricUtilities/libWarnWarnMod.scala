package typings.atUifabricUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/warn/warn", JSImport.Namespace)
@js.native
object libWarnWarnMod extends js.Object {
  def setWarningCallback(): Unit = js.native
  def setWarningCallback(warningCallback: js.Function1[/* message */ String, Unit]): Unit = js.native
  def warn(message: String): Unit = js.native
  type ISettingsMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string}
    */ typings.atUifabricUtilities.atUifabricUtilitiesStrings.ISettingsMap with js.Any
}

