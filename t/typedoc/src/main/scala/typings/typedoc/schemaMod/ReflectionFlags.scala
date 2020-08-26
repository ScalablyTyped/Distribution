package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ReflectionFlags, 'isPrivate' | 'isProtected' | 'isPublic' | 'isStatic' | 'isExported' | 'isExternal' | 'isOptional' | 'isRest' | 'hasExportAssignment' | 'isConstructorProperty' | 'isAbstract' | 'isConst' | 'isLet'>> */
@js.native
trait ReflectionFlags extends js.Object {
  var hasExportAssignment: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.native
  var isAbstract: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.native
  var isConst: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.native
  var isConstructorProperty: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.native
  var isExported: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.native
  var isExternal: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.native
  var isLet: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.native
  var isOptional: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.native
  var isPrivate: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.native
  var isProtected: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.native
  var isPublic: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.native
  var isRest: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.native
  var isStatic: js.UndefOr[ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]] = js.native
}

object ReflectionFlags {
  @scala.inline
  def apply(): ReflectionFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReflectionFlags]
  }
  @scala.inline
  implicit class ReflectionFlagsOps[Self <: ReflectionFlags] (val x: Self) extends AnyVal {
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
    def setHasExportAssignmentVarargs(value: _ModelToObject[js.Any]*): Self = this.set("hasExportAssignment", js.Array(value :_*))
    @scala.inline
    def setHasExportAssignmentFunction0(value: () => Boolean): Self = this.set("hasExportAssignment", js.Any.fromFunction0(value))
    @scala.inline
    def setHasExportAssignment(value: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]): Self = this.set("hasExportAssignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasExportAssignment: Self = this.set("hasExportAssignment", js.undefined)
    @scala.inline
    def setIsAbstractVarargs(value: _ModelToObject[js.Any]*): Self = this.set("isAbstract", js.Array(value :_*))
    @scala.inline
    def setIsAbstractFunction0(value: () => Boolean): Self = this.set("isAbstract", js.Any.fromFunction0(value))
    @scala.inline
    def setIsAbstract(value: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]): Self = this.set("isAbstract", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAbstract: Self = this.set("isAbstract", js.undefined)
    @scala.inline
    def setIsConstVarargs(value: _ModelToObject[js.Any]*): Self = this.set("isConst", js.Array(value :_*))
    @scala.inline
    def setIsConstFunction0(value: () => Boolean): Self = this.set("isConst", js.Any.fromFunction0(value))
    @scala.inline
    def setIsConst(value: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]): Self = this.set("isConst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsConst: Self = this.set("isConst", js.undefined)
    @scala.inline
    def setIsConstructorPropertyVarargs(value: _ModelToObject[js.Any]*): Self = this.set("isConstructorProperty", js.Array(value :_*))
    @scala.inline
    def setIsConstructorPropertyFunction0(value: () => Boolean): Self = this.set("isConstructorProperty", js.Any.fromFunction0(value))
    @scala.inline
    def setIsConstructorProperty(value: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]): Self = this.set("isConstructorProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsConstructorProperty: Self = this.set("isConstructorProperty", js.undefined)
    @scala.inline
    def setIsExportedVarargs(value: _ModelToObject[js.Any]*): Self = this.set("isExported", js.Array(value :_*))
    @scala.inline
    def setIsExportedFunction0(value: () => Boolean): Self = this.set("isExported", js.Any.fromFunction0(value))
    @scala.inline
    def setIsExported(value: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]): Self = this.set("isExported", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsExported: Self = this.set("isExported", js.undefined)
    @scala.inline
    def setIsExternalVarargs(value: _ModelToObject[js.Any]*): Self = this.set("isExternal", js.Array(value :_*))
    @scala.inline
    def setIsExternalFunction0(value: () => Boolean): Self = this.set("isExternal", js.Any.fromFunction0(value))
    @scala.inline
    def setIsExternal(value: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]): Self = this.set("isExternal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsExternal: Self = this.set("isExternal", js.undefined)
    @scala.inline
    def setIsLetVarargs(value: _ModelToObject[js.Any]*): Self = this.set("isLet", js.Array(value :_*))
    @scala.inline
    def setIsLetFunction0(value: () => Boolean): Self = this.set("isLet", js.Any.fromFunction0(value))
    @scala.inline
    def setIsLet(value: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]): Self = this.set("isLet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLet: Self = this.set("isLet", js.undefined)
    @scala.inline
    def setIsOptionalVarargs(value: _ModelToObject[js.Any]*): Self = this.set("isOptional", js.Array(value :_*))
    @scala.inline
    def setIsOptionalFunction0(value: () => Boolean): Self = this.set("isOptional", js.Any.fromFunction0(value))
    @scala.inline
    def setIsOptional(value: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]): Self = this.set("isOptional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOptional: Self = this.set("isOptional", js.undefined)
    @scala.inline
    def setIsPrivateVarargs(value: _ModelToObject[js.Any]*): Self = this.set("isPrivate", js.Array(value :_*))
    @scala.inline
    def setIsPrivateFunction0(value: () => Boolean): Self = this.set("isPrivate", js.Any.fromFunction0(value))
    @scala.inline
    def setIsPrivate(value: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]): Self = this.set("isPrivate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPrivate: Self = this.set("isPrivate", js.undefined)
    @scala.inline
    def setIsProtectedVarargs(value: _ModelToObject[js.Any]*): Self = this.set("isProtected", js.Array(value :_*))
    @scala.inline
    def setIsProtectedFunction0(value: () => Boolean): Self = this.set("isProtected", js.Any.fromFunction0(value))
    @scala.inline
    def setIsProtected(value: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]): Self = this.set("isProtected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsProtected: Self = this.set("isProtected", js.undefined)
    @scala.inline
    def setIsPublicVarargs(value: _ModelToObject[js.Any]*): Self = this.set("isPublic", js.Array(value :_*))
    @scala.inline
    def setIsPublicFunction0(value: () => Boolean): Self = this.set("isPublic", js.Any.fromFunction0(value))
    @scala.inline
    def setIsPublic(value: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]): Self = this.set("isPublic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPublic: Self = this.set("isPublic", js.undefined)
    @scala.inline
    def setIsRestVarargs(value: _ModelToObject[js.Any]*): Self = this.set("isRest", js.Array(value :_*))
    @scala.inline
    def setIsRestFunction0(value: () => Boolean): Self = this.set("isRest", js.Any.fromFunction0(value))
    @scala.inline
    def setIsRest(value: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]): Self = this.set("isRest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRest: Self = this.set("isRest", js.undefined)
    @scala.inline
    def setIsStaticVarargs(value: _ModelToObject[js.Any]*): Self = this.set("isStatic", js.Array(value :_*))
    @scala.inline
    def setIsStaticFunction0(value: () => Boolean): Self = this.set("isStatic", js.Any.fromFunction0(value))
    @scala.inline
    def setIsStatic(value: ModelToObject[js.Function0[Boolean]] | js.Function0[Boolean]): Self = this.set("isStatic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsStatic: Self = this.set("isStatic", js.undefined)
  }
  
}

