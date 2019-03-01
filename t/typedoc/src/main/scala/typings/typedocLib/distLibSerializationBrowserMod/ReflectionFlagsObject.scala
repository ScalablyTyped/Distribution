package typings
package typedocLib.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReflectionFlagsObject extends js.Object {
  var hasExportAssignment: js.UndefOr[scala.Boolean] = js.undefined
  var isConstructorProperty: js.UndefOr[scala.Boolean] = js.undefined
  var isExported: js.UndefOr[scala.Boolean] = js.undefined
  var isExternal: js.UndefOr[scala.Boolean] = js.undefined
  var isOptional: js.UndefOr[scala.Boolean] = js.undefined
  var isPrivate: js.UndefOr[scala.Boolean] = js.undefined
  var isProtected: js.UndefOr[scala.Boolean] = js.undefined
  var isPublic: js.UndefOr[scala.Boolean] = js.undefined
  var isRest: js.UndefOr[scala.Boolean] = js.undefined
  var isStatic: js.UndefOr[scala.Boolean] = js.undefined
}

object ReflectionFlagsObject {
  @scala.inline
  def apply(
    hasExportAssignment: js.UndefOr[scala.Boolean] = js.undefined,
    isConstructorProperty: js.UndefOr[scala.Boolean] = js.undefined,
    isExported: js.UndefOr[scala.Boolean] = js.undefined,
    isExternal: js.UndefOr[scala.Boolean] = js.undefined,
    isOptional: js.UndefOr[scala.Boolean] = js.undefined,
    isPrivate: js.UndefOr[scala.Boolean] = js.undefined,
    isProtected: js.UndefOr[scala.Boolean] = js.undefined,
    isPublic: js.UndefOr[scala.Boolean] = js.undefined,
    isRest: js.UndefOr[scala.Boolean] = js.undefined,
    isStatic: js.UndefOr[scala.Boolean] = js.undefined
  ): ReflectionFlagsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasExportAssignment)) __obj.updateDynamic("hasExportAssignment")(hasExportAssignment)
    if (!js.isUndefined(isConstructorProperty)) __obj.updateDynamic("isConstructorProperty")(isConstructorProperty)
    if (!js.isUndefined(isExported)) __obj.updateDynamic("isExported")(isExported)
    if (!js.isUndefined(isExternal)) __obj.updateDynamic("isExternal")(isExternal)
    if (!js.isUndefined(isOptional)) __obj.updateDynamic("isOptional")(isOptional)
    if (!js.isUndefined(isPrivate)) __obj.updateDynamic("isPrivate")(isPrivate)
    if (!js.isUndefined(isProtected)) __obj.updateDynamic("isProtected")(isProtected)
    if (!js.isUndefined(isPublic)) __obj.updateDynamic("isPublic")(isPublic)
    if (!js.isUndefined(isRest)) __obj.updateDynamic("isRest")(isRest)
    if (!js.isUndefined(isStatic)) __obj.updateDynamic("isStatic")(isStatic)
    __obj.asInstanceOf[ReflectionFlagsObject]
  }
}

