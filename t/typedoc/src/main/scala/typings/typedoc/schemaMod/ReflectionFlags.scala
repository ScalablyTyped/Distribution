package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ReflectionFlags, 'isPrivate' | 'isProtected' | 'isPublic' | 'isStatic' | 'isExported' | 'isExternal' | 'isOptional' | 'isRest' | 'hasExportAssignment' | 'isConstructorProperty' | 'isAbstract' | 'isConst' | 'isLet'>> */
trait ReflectionFlags extends js.Object {
  var hasExportAssignment: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.undefined
  var isAbstract: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.undefined
  var isConst: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.undefined
  var isConstructorProperty: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.undefined
  var isExported: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.undefined
  var isExternal: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.undefined
  var isLet: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.undefined
  var isOptional: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.undefined
  var isPrivate: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.undefined
  var isProtected: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.undefined
  var isPublic: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.undefined
  var isRest: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.undefined
  var isStatic: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.undefined
}

object ReflectionFlags {
  @scala.inline
  def apply(
    hasExportAssignment: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean] = null,
    isAbstract: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean] = null,
    isConst: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean] = null,
    isConstructorProperty: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean] = null,
    isExported: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean] = null,
    isExternal: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean] = null,
    isLet: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean] = null,
    isOptional: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean] = null,
    isPrivate: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean] = null,
    isProtected: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean] = null,
    isPublic: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean] = null,
    isRest: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean] = null,
    isStatic: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean] = null
  ): ReflectionFlags = {
    val __obj = js.Dynamic.literal()
    if (hasExportAssignment != null) __obj.updateDynamic("hasExportAssignment")(hasExportAssignment.asInstanceOf[js.Any])
    if (isAbstract != null) __obj.updateDynamic("isAbstract")(isAbstract.asInstanceOf[js.Any])
    if (isConst != null) __obj.updateDynamic("isConst")(isConst.asInstanceOf[js.Any])
    if (isConstructorProperty != null) __obj.updateDynamic("isConstructorProperty")(isConstructorProperty.asInstanceOf[js.Any])
    if (isExported != null) __obj.updateDynamic("isExported")(isExported.asInstanceOf[js.Any])
    if (isExternal != null) __obj.updateDynamic("isExternal")(isExternal.asInstanceOf[js.Any])
    if (isLet != null) __obj.updateDynamic("isLet")(isLet.asInstanceOf[js.Any])
    if (isOptional != null) __obj.updateDynamic("isOptional")(isOptional.asInstanceOf[js.Any])
    if (isPrivate != null) __obj.updateDynamic("isPrivate")(isPrivate.asInstanceOf[js.Any])
    if (isProtected != null) __obj.updateDynamic("isProtected")(isProtected.asInstanceOf[js.Any])
    if (isPublic != null) __obj.updateDynamic("isPublic")(isPublic.asInstanceOf[js.Any])
    if (isRest != null) __obj.updateDynamic("isRest")(isRest.asInstanceOf[js.Any])
    if (isStatic != null) __obj.updateDynamic("isStatic")(isStatic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectionFlags]
  }
}

