package typings
package xDashEditableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XEditable extends js.Object {
  var options: XEditableOptions
  def activate(): scala.Unit
  def destroy(): scala.Unit
  def disable(): scala.Unit
  def enable(): scala.Unit
  def getValue(isSingle: scala.Boolean): js.Any
  def hide(): scala.Unit
  def option(key: js.Any, value: js.Any): scala.Unit
  def setValue(value: js.Any, convertStr: scala.Boolean): scala.Unit
  def show(closeAll: scala.Boolean): scala.Unit
  def submit(options: XEditableSubmitOptions): scala.Unit
  def toggle(closeAll: scala.Boolean): scala.Unit
  def toggleDisabled(): scala.Unit
  def validate(): scala.Unit
}

object XEditable {
  @scala.inline
  def apply(
    activate: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    disable: js.Function0[scala.Unit],
    enable: js.Function0[scala.Unit],
    getValue: js.Function1[scala.Boolean, js.Any],
    hide: js.Function0[scala.Unit],
    option: js.Function2[js.Any, js.Any, scala.Unit],
    options: XEditableOptions,
    setValue: js.Function2[js.Any, scala.Boolean, scala.Unit],
    show: js.Function1[scala.Boolean, scala.Unit],
    submit: js.Function1[XEditableSubmitOptions, scala.Unit],
    toggle: js.Function1[scala.Boolean, scala.Unit],
    toggleDisabled: js.Function0[scala.Unit],
    validate: js.Function0[scala.Unit]
  ): XEditable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activate")(activate)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("disable")(disable)
    __obj.updateDynamic("enable")(enable)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("option")(option)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("setValue")(setValue)
    __obj.updateDynamic("show")(show)
    __obj.updateDynamic("submit")(submit)
    __obj.updateDynamic("toggle")(toggle)
    __obj.updateDynamic("toggleDisabled")(toggleDisabled)
    __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[XEditable]
  }
}

