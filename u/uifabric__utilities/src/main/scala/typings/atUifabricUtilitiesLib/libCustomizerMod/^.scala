package typings
package atUifabricUtilitiesLib.libCustomizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/Customizer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CustomizerContext: reactLib.reactMod.ReactNs.Context[atUifabricUtilitiesLib.libCustomizerMod.ICustomizerContext] = js.native
  def mergeCustomizations(
    props: atUifabricUtilitiesLib.libCustomizerMod.ICustomizerProps,
    parentContext: atUifabricUtilitiesLib.libCustomizerMod.ICustomizerContext
  ): atUifabricUtilitiesLib.libCustomizerMod.ICustomizerContext = js.native
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

