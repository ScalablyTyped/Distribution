package typings.uifabricUtilities.customizerTypesMod

import typings.uifabricUtilities.anon.ReadonlyICustomizerContex
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.customizationsMod.ISettings
import typings.uifabricUtilities.customizationsMod.ISettingsFunction
import typings.uifabricUtilities.customizerContextMod.ICustomizerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @uifabric/utilities.@uifabric/utilities/lib/BaseComponent.types.IBaseProps<any> & std.Partial<{  settings :@uifabric/utilities.@uifabric/utilities/lib/customizations/Customizations.ISettings | @uifabric/utilities.@uifabric/utilities/lib/customizations/Customizations.ISettingsFunction,   scopedSettings :@uifabric/utilities.@uifabric/utilities/lib/customizations/Customizations.ISettings | @uifabric/utilities.@uifabric/utilities/lib/customizations/Customizations.ISettingsFunction}> & {  contextTransform :(context : std.Readonly<@uifabric/utilities.@uifabric/utilities/lib/customizations/CustomizerContext.ICustomizerContext>): @uifabric/utilities.@uifabric/utilities/lib/customizations/CustomizerContext.ICustomizerContext | undefined} */
@js.native
trait ICustomizerProps extends js.Object {
  var componentRef: js.UndefOr[IRefObject[_]] = js.native
  /**
    * Optional transform function for context. Any implementations should take care to return context without
    * mutating it.
    */
  var contextTransform: js.UndefOr[js.Function1[/* context */ ReadonlyICustomizerContex, ICustomizerContext]] = js.native
  var scopedSettings: js.UndefOr[ISettings | ISettingsFunction] = js.native
  var settings: js.UndefOr[ISettings | ISettingsFunction] = js.native
}

object ICustomizerProps {
  @scala.inline
  def apply(): ICustomizerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICustomizerProps]
  }
  @scala.inline
  implicit class ICustomizerPropsOps[Self <: ICustomizerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ _ | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[_]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setContextTransform(value: /* context */ ReadonlyICustomizerContex => ICustomizerContext): Self = this.set("contextTransform", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContextTransform: Self = this.set("contextTransform", js.undefined)
    @scala.inline
    def setScopedSettingsFunction1(value: /* settings */ ISettings => ISettings): Self = this.set("scopedSettings", js.Any.fromFunction1(value))
    @scala.inline
    def setScopedSettings(value: ISettings | ISettingsFunction): Self = this.set("scopedSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopedSettings: Self = this.set("scopedSettings", js.undefined)
    @scala.inline
    def setSettingsFunction1(value: /* settings */ ISettings => ISettings): Self = this.set("settings", js.Any.fromFunction1(value))
    @scala.inline
    def setSettings(value: ISettings | ISettingsFunction): Self = this.set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
  }
  
}

