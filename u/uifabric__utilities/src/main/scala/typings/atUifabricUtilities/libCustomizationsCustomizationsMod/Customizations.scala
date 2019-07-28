package typings.atUifabricUtilities.libCustomizationsCustomizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/customizations/Customizations", "Customizations")
@js.native
class Customizations () extends js.Object

/* static members */
@JSImport("@uifabric/utilities/lib/customizations/Customizations", "Customizations")
@js.native
object Customizations extends js.Object {
  var _raiseChange: js.Any = js.native
  def applyScopedSettings(scopeName: String, settings: ISettings): Unit = js.native
  def applySettings(settings: ISettings): Unit = js.native
  def getSettings(properties: js.Array[String]): js.Any = js.native
  def getSettings(properties: js.Array[String], scopeName: String): js.Any = js.native
  def getSettings(properties: js.Array[String], scopeName: String, localSettings: ICustomizations): js.Any = js.native
  def observe(onChange: js.Function0[Unit]): Unit = js.native
  def reset(): Unit = js.native
  def unobserve(onChange: js.Function0[Unit]): Unit = js.native
}

