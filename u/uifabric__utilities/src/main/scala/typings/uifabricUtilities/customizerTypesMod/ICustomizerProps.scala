package typings.uifabricUtilities.customizerTypesMod

import typings.uifabricUtilities.anon.ReadonlyICustomizerContex
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.customizationsMod.ISettings
import typings.uifabricUtilities.customizationsMod.ISettingsFunction
import typings.uifabricUtilities.customizerContextMod.ICustomizerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @uifabric/utilities.@uifabric/utilities/lib/BaseComponent.types.IBaseProps<any> & std.Partial<{  settings  :@uifabric/utilities.@uifabric/utilities/lib/customizations/Customizations.ISettings | @uifabric/utilities.@uifabric/utilities/lib/customizations/Customizations.ISettingsFunction,   scopedSettings  :@uifabric/utilities.@uifabric/utilities/lib/customizations/Customizations.ISettings | @uifabric/utilities.@uifabric/utilities/lib/customizations/Customizations.ISettingsFunction}> & {contextTransform ? (context : std.Readonly<@uifabric/utilities.@uifabric/utilities/lib/customizations/CustomizerContext.ICustomizerContext>): @uifabric/utilities.@uifabric/utilities/lib/customizations/CustomizerContext.ICustomizerContext} */
trait ICustomizerProps extends js.Object {
  var componentRef: js.UndefOr[IRefObject[_]] = js.undefined
  /**
    * Optional transform function for context. Any implementations should take care to return context without
    * mutating it.
    */
  var contextTransform: js.UndefOr[js.Function1[/* context */ ReadonlyICustomizerContex, ICustomizerContext]] = js.undefined
  var scopedSettings: js.UndefOr[ISettings | ISettingsFunction] = js.undefined
  var settings: js.UndefOr[ISettings | ISettingsFunction] = js.undefined
}

object ICustomizerProps {
  @scala.inline
  def apply(
    componentRef: IRefObject[_] = null,
    contextTransform: /* context */ ReadonlyICustomizerContex => ICustomizerContext = null,
    scopedSettings: ISettings | ISettingsFunction = null,
    settings: ISettings | ISettingsFunction = null
  ): ICustomizerProps = {
    val __obj = js.Dynamic.literal()
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (contextTransform != null) __obj.updateDynamic("contextTransform")(js.Any.fromFunction1(contextTransform))
    if (scopedSettings != null) __obj.updateDynamic("scopedSettings")(scopedSettings.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomizerProps]
  }
}

