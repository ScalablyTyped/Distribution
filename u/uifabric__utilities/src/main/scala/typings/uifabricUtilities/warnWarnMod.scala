package typings.uifabricUtilities

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object warnWarnMod {
  
  @JSImport("@uifabric/utilities/lib/warn/warn", "setWarningCallback")
  @js.native
  def setWarningCallback(): Unit = js.native
  @JSImport("@uifabric/utilities/lib/warn/warn", "setWarningCallback")
  @js.native
  def setWarningCallback(warningCallback: js.Function1[/* message */ String, Unit]): Unit = js.native
  
  @JSImport("@uifabric/utilities/lib/warn/warn", "warn")
  @js.native
  def warn(message: String): Unit = js.native
  
  type ISettingsMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string}
    */ typings.uifabricUtilities.uifabricUtilitiesStrings.ISettingsMap with TopLevel[js.Any]
}
