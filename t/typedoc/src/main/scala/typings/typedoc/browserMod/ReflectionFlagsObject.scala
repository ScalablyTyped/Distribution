package typings.typedoc.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReflectionFlagsObject extends js.Object {
  var hasExportAssignment: js.UndefOr[Boolean] = js.undefined
  var isConstructorProperty: js.UndefOr[Boolean] = js.undefined
  var isExported: js.UndefOr[Boolean] = js.undefined
  var isExternal: js.UndefOr[Boolean] = js.undefined
  var isOptional: js.UndefOr[Boolean] = js.undefined
  var isPrivate: js.UndefOr[Boolean] = js.undefined
  var isProtected: js.UndefOr[Boolean] = js.undefined
  var isPublic: js.UndefOr[Boolean] = js.undefined
  var isRest: js.UndefOr[Boolean] = js.undefined
  var isStatic: js.UndefOr[Boolean] = js.undefined
}

object ReflectionFlagsObject {
  @scala.inline
  def apply(
    hasExportAssignment: js.UndefOr[Boolean] = js.undefined,
    isConstructorProperty: js.UndefOr[Boolean] = js.undefined,
    isExported: js.UndefOr[Boolean] = js.undefined,
    isExternal: js.UndefOr[Boolean] = js.undefined,
    isOptional: js.UndefOr[Boolean] = js.undefined,
    isPrivate: js.UndefOr[Boolean] = js.undefined,
    isProtected: js.UndefOr[Boolean] = js.undefined,
    isPublic: js.UndefOr[Boolean] = js.undefined,
    isRest: js.UndefOr[Boolean] = js.undefined,
    isStatic: js.UndefOr[Boolean] = js.undefined
  ): ReflectionFlagsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasExportAssignment)) __obj.updateDynamic("hasExportAssignment")(hasExportAssignment.asInstanceOf[js.Any])
    if (!js.isUndefined(isConstructorProperty)) __obj.updateDynamic("isConstructorProperty")(isConstructorProperty.asInstanceOf[js.Any])
    if (!js.isUndefined(isExported)) __obj.updateDynamic("isExported")(isExported.asInstanceOf[js.Any])
    if (!js.isUndefined(isExternal)) __obj.updateDynamic("isExternal")(isExternal.asInstanceOf[js.Any])
    if (!js.isUndefined(isOptional)) __obj.updateDynamic("isOptional")(isOptional.asInstanceOf[js.Any])
    if (!js.isUndefined(isPrivate)) __obj.updateDynamic("isPrivate")(isPrivate.asInstanceOf[js.Any])
    if (!js.isUndefined(isProtected)) __obj.updateDynamic("isProtected")(isProtected.asInstanceOf[js.Any])
    if (!js.isUndefined(isPublic)) __obj.updateDynamic("isPublic")(isPublic.asInstanceOf[js.Any])
    if (!js.isUndefined(isRest)) __obj.updateDynamic("isRest")(isRest.asInstanceOf[js.Any])
    if (!js.isUndefined(isStatic)) __obj.updateDynamic("isStatic")(isStatic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectionFlagsObject]
  }
}

