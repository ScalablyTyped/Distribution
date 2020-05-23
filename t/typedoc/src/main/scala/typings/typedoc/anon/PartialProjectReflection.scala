package typings.typedoc.anon

import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.commentsCommentMod.Comment
import typings.typedoc.modelsMod.Reflection
import typings.typedoc.modelsTypesMod.Type
import typings.typedoc.reflectionCategoryMod.ReflectionCategory
import typings.typedoc.reflectionGroupMod.ReflectionGroup
import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod.ReflectionFlags
import typings.typedoc.serializersMod.DecoratorWrapper
import typings.typedoc.serializersMod.SourceReferenceWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<typedoc.typedoc/dist/lib/serialization/schema.ProjectReflection> */
trait PartialProjectReflection extends js.Object {
  var categories: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[ReflectionCategory]]] | js.Array[ReflectionCategory]
  ] = js.undefined
  var children: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.undefined
  var comment: js.UndefOr[ModelToObject[js.UndefOr[Comment]] | Comment] = js.undefined
  var decorates: js.UndefOr[ModelToObject[js.UndefOr[js.Array[Type]]] | js.Array[Type]] = js.undefined
  var decorators: js.UndefOr[ModelToObject[js.Array[DecoratorWrapper]]] = js.undefined
  var flags: js.UndefOr[ReflectionFlags] = js.undefined
  var getSignature: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.undefined
  var groups: js.UndefOr[ModelToObject[js.UndefOr[js.Array[ReflectionGroup]]] | js.Array[ReflectionGroup]] = js.undefined
  var id: js.UndefOr[ModelToObject[Double] | Double] = js.undefined
  var indexSignature: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.undefined
  var kind: js.UndefOr[ModelToObject[ReflectionKind] | ReflectionKind] = js.undefined
  var kindString: js.UndefOr[ModelToObject[js.UndefOr[String]] | String] = js.undefined
  var name: js.UndefOr[ModelToObject[String] | String] = js.undefined
  var originalName: js.UndefOr[String] = js.undefined
  var parameters: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.undefined
  var setSignature: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.undefined
  var signatures: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.undefined
  var sources: js.UndefOr[ModelToObject[js.Array[SourceReferenceWrapper]]] = js.undefined
  var typeParameter: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.undefined
}

object PartialProjectReflection {
  @scala.inline
  def apply(
    categories: ModelToObject[js.UndefOr[js.Array[ReflectionCategory]]] | js.Array[ReflectionCategory] = null,
    children: js.Array[ModelToObject[Reflection]] = null,
    comment: ModelToObject[js.UndefOr[Comment]] | Comment = null,
    decorates: ModelToObject[js.UndefOr[js.Array[Type]]] | js.Array[Type] = null,
    decorators: ModelToObject[js.Array[DecoratorWrapper]] = null,
    flags: ReflectionFlags = null,
    getSignature: js.Array[ModelToObject[Reflection]] = null,
    groups: ModelToObject[js.UndefOr[js.Array[ReflectionGroup]]] | js.Array[ReflectionGroup] = null,
    id: ModelToObject[Double] | Double = null,
    indexSignature: js.Array[ModelToObject[Reflection]] = null,
    kind: ModelToObject[ReflectionKind] | ReflectionKind = null,
    kindString: ModelToObject[js.UndefOr[String]] | String = null,
    name: ModelToObject[String] | String = null,
    originalName: String = null,
    parameters: js.Array[ModelToObject[Reflection]] = null,
    setSignature: js.Array[ModelToObject[Reflection]] = null,
    signatures: js.Array[ModelToObject[Reflection]] = null,
    sources: ModelToObject[js.Array[SourceReferenceWrapper]] = null,
    typeParameter: js.Array[ModelToObject[Reflection]] = null
  ): PartialProjectReflection = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (decorates != null) __obj.updateDynamic("decorates")(decorates.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (getSignature != null) __obj.updateDynamic("getSignature")(getSignature.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (indexSignature != null) __obj.updateDynamic("indexSignature")(indexSignature.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (kindString != null) __obj.updateDynamic("kindString")(kindString.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (originalName != null) __obj.updateDynamic("originalName")(originalName.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (setSignature != null) __obj.updateDynamic("setSignature")(setSignature.asInstanceOf[js.Any])
    if (signatures != null) __obj.updateDynamic("signatures")(signatures.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (typeParameter != null) __obj.updateDynamic("typeParameter")(typeParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialProjectReflection]
  }
}

