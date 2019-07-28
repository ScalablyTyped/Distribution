package typings.atUifabricUtilities.libCustomizationsCustomizerContextMod

import typings.atUifabricUtilities.libCustomizationsCustomizationsMod.ICustomizations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomizerContext extends js.Object {
  var customizations: ICustomizations
}

object ICustomizerContext {
  @scala.inline
  def apply(customizations: ICustomizations): ICustomizerContext = {
    val __obj = js.Dynamic.literal(customizations = customizations)
  
    __obj.asInstanceOf[ICustomizerContext]
  }
}

