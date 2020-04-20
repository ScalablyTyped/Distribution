package typings.uifabricUtilities

import typings.uifabricUtilities.customizationsMod.ICustomizations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@uifabric/utilities.@uifabric/utilities/lib/customizations/CustomizerContext.ICustomizerContext> */
trait ReadonlyICustomizerContex extends js.Object {
  val customizations: ICustomizations
}

object ReadonlyICustomizerContex {
  @scala.inline
  def apply(customizations: ICustomizations): ReadonlyICustomizerContex = {
    val __obj = js.Dynamic.literal(customizations = customizations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyICustomizerContex]
  }
}

