package typings.typedoc.anon

import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.commentsCommentMod.Comment
import typings.typedoc.modelsMod.Reflection
import typings.typedoc.modelsTypesMod.Type
import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod.ReflectionFlags
import typings.typedoc.schemaMod._ModelToObject
import typings.typedoc.serializersMod.DecoratorWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<typedoc.typedoc/dist/lib/serialization/schema.Reflection> */
@js.native
trait PartialReflection extends js.Object {
  var children: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.native
  var comment: js.UndefOr[ModelToObject[js.UndefOr[Comment]] | Comment] = js.native
  var decorates: js.UndefOr[ModelToObject[js.UndefOr[js.Array[Type]]] | js.Array[Type]] = js.native
  var decorators: js.UndefOr[ModelToObject[js.Array[DecoratorWrapper]]] = js.native
  var flags: js.UndefOr[ReflectionFlags] = js.native
  var getSignature: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.native
  var id: js.UndefOr[ModelToObject[Double] | Double] = js.native
  var indexSignature: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.native
  var kind: js.UndefOr[ModelToObject[ReflectionKind] | ReflectionKind] = js.native
  var kindString: js.UndefOr[ModelToObject[js.UndefOr[String]] | String] = js.native
  var name: js.UndefOr[ModelToObject[String] | String] = js.native
  var originalName: js.UndefOr[String] = js.native
  var parameters: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.native
  var setSignature: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.native
  var signatures: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.native
  var typeParameter: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.native
}

object PartialReflection {
  @scala.inline
  def apply(): PartialReflection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReflection]
  }
  @scala.inline
  implicit class PartialReflectionOps[Self <: PartialReflection] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: ModelToObject[Reflection]*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[ModelToObject[Reflection]]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setCommentVarargs(value: _ModelToObject[js.Any]*): Self = this.set("comment", js.Array(value :_*))
    @scala.inline
    def setComment(value: ModelToObject[js.UndefOr[Comment]] | Comment): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setDecoratesVarargs(value: (Type | _ModelToObject[js.Any])*): Self = this.set("decorates", js.Array(value :_*))
    @scala.inline
    def setDecorates(value: ModelToObject[js.UndefOr[js.Array[Type]]] | js.Array[Type]): Self = this.set("decorates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecorates: Self = this.set("decorates", js.undefined)
    @scala.inline
    def setDecoratorsVarargs(value: _ModelToObject[js.Any]*): Self = this.set("decorators", js.Array(value :_*))
    @scala.inline
    def setDecorators(value: ModelToObject[js.Array[DecoratorWrapper]]): Self = this.set("decorators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecorators: Self = this.set("decorators", js.undefined)
    @scala.inline
    def setFlags(value: ReflectionFlags): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    @scala.inline
    def setGetSignatureVarargs(value: ModelToObject[Reflection]*): Self = this.set("getSignature", js.Array(value :_*))
    @scala.inline
    def setGetSignature(value: js.Array[ModelToObject[Reflection]]): Self = this.set("getSignature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetSignature: Self = this.set("getSignature", js.undefined)
    @scala.inline
    def setIdVarargs(value: _ModelToObject[js.Any]*): Self = this.set("id", js.Array(value :_*))
    @scala.inline
    def setId(value: ModelToObject[Double] | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIndexSignatureVarargs(value: ModelToObject[Reflection]*): Self = this.set("indexSignature", js.Array(value :_*))
    @scala.inline
    def setIndexSignature(value: js.Array[ModelToObject[Reflection]]): Self = this.set("indexSignature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexSignature: Self = this.set("indexSignature", js.undefined)
    @scala.inline
    def setKindVarargs(value: _ModelToObject[js.Any]*): Self = this.set("kind", js.Array(value :_*))
    @scala.inline
    def setKind(value: ModelToObject[ReflectionKind] | ReflectionKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setKindStringVarargs(value: _ModelToObject[js.Any]*): Self = this.set("kindString", js.Array(value :_*))
    @scala.inline
    def setKindString(value: ModelToObject[js.UndefOr[String]] | String): Self = this.set("kindString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKindString: Self = this.set("kindString", js.undefined)
    @scala.inline
    def setNameVarargs(value: _ModelToObject[js.Any]*): Self = this.set("name", js.Array(value :_*))
    @scala.inline
    def setName(value: ModelToObject[String] | String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOriginalName(value: String): Self = this.set("originalName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalName: Self = this.set("originalName", js.undefined)
    @scala.inline
    def setParametersVarargs(value: ModelToObject[Reflection]*): Self = this.set("parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: js.Array[ModelToObject[Reflection]]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setSetSignatureVarargs(value: ModelToObject[Reflection]*): Self = this.set("setSignature", js.Array(value :_*))
    @scala.inline
    def setSetSignature(value: js.Array[ModelToObject[Reflection]]): Self = this.set("setSignature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetSignature: Self = this.set("setSignature", js.undefined)
    @scala.inline
    def setSignaturesVarargs(value: ModelToObject[Reflection]*): Self = this.set("signatures", js.Array(value :_*))
    @scala.inline
    def setSignatures(value: js.Array[ModelToObject[Reflection]]): Self = this.set("signatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignatures: Self = this.set("signatures", js.undefined)
    @scala.inline
    def setTypeParameterVarargs(value: ModelToObject[Reflection]*): Self = this.set("typeParameter", js.Array(value :_*))
    @scala.inline
    def setTypeParameter(value: js.Array[ModelToObject[Reflection]]): Self = this.set("typeParameter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeParameter: Self = this.set("typeParameter", js.undefined)
  }
  
}

