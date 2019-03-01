package typings
package atUifabricUtilitiesLib.libCustomizationsCustomizerContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomizerContext extends js.Object {
  var customizations: atUifabricUtilitiesLib.libCustomizationsCustomizationsMod.ICustomizations
}

object ICustomizerContext {
  @scala.inline
  def apply(customizations: atUifabricUtilitiesLib.libCustomizationsCustomizationsMod.ICustomizations): ICustomizerContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("customizations")(customizations)
    __obj.asInstanceOf[ICustomizerContext]
  }
}

