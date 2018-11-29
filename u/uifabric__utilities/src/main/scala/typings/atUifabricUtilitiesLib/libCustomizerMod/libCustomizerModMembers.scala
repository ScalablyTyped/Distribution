package typings
package atUifabricUtilitiesLib.libCustomizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/Customizer", JSImport.Namespace)
@js.native
object libCustomizerModMembers extends js.Object {
  val CustomizerContext: reactLib.reactMod.ReactNs.Context[ICustomizerContext] = js.native
  def mergeCustomizations(props: ICustomizerProps, parentContext: ICustomizerContext): ICustomizerContext = js.native
  def mergeSettings(): atUifabricUtilitiesLib.libCustomizationsMod.Settings = js.native
  def mergeSettings(oldSettings: atUifabricUtilitiesLib.libCustomizationsMod.Settings): atUifabricUtilitiesLib.libCustomizationsMod.Settings = js.native
  def mergeSettings(
    oldSettings: atUifabricUtilitiesLib.libCustomizationsMod.Settings,
    newSettings: atUifabricUtilitiesLib.libCustomizationsMod.Settings
  ): atUifabricUtilitiesLib.libCustomizationsMod.Settings = js.native
  def mergeSettings(
    oldSettings: atUifabricUtilitiesLib.libCustomizationsMod.Settings,
    newSettings: atUifabricUtilitiesLib.libCustomizationsMod.SettingsFunction
  ): atUifabricUtilitiesLib.libCustomizationsMod.Settings = js.native
}

