package typings.uifabricFoundation.controlledMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IControlledStateOptions[TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */] extends js.Object {
  var defaultPropName: js.UndefOr[TDefaultProp] = js.undefined
  var defaultPropValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
  ] = js.undefined
}

object IControlledStateOptions {
  @scala.inline
  def apply[TProps, TProp, TDefaultProp](
    defaultPropName: TDefaultProp = null,
    defaultPropValue: /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any = null
  ): IControlledStateOptions[TProps, TProp, TDefaultProp] = {
    val __obj = js.Dynamic.literal()
    if (defaultPropName != null) __obj.updateDynamic("defaultPropName")(defaultPropName.asInstanceOf[js.Any])
    if (defaultPropValue != null) __obj.updateDynamic("defaultPropValue")(defaultPropValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IControlledStateOptions[TProps, TProp, TDefaultProp]]
  }
}

