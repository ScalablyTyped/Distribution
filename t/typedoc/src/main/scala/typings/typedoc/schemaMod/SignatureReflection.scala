package typings.typedoc.schemaMod

import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.serializersMod.DecoratorWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Reflection */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.SignatureReflection, 'type' | 'overwrites' | 'inheritedFrom' | 'implementationOf'> */
trait SignatureReflection
  extends __ModelToObject[js.Any] {
  var children: js.UndefOr[js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]] = js.undefined
  var comment: js.UndefOr[
    ModelToObject[js.UndefOr[typings.typedoc.commentsCommentMod.Comment]] | typings.typedoc.commentsCommentMod.Comment
  ] = js.undefined
  var decorates: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[typings.typedoc.modelsTypesMod.Type]]] | js.Array[typings.typedoc.modelsTypesMod.Type]
  ] = js.undefined
  var decorators: js.UndefOr[ModelToObject[js.Array[DecoratorWrapper]]] = js.undefined
  var flags: ReflectionFlags
  var getSignature: js.UndefOr[js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]] = js.undefined
  var id: ModelToObject[Double] | Double
  var implementationOf: js.UndefOr[
    ModelToObject[js.UndefOr[typings.typedoc.modelsTypesMod.Type]] | typings.typedoc.modelsTypesMod.Type
  ] = js.undefined
  var indexSignature: js.UndefOr[js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]] = js.undefined
  var inheritedFrom: js.UndefOr[
    ModelToObject[js.UndefOr[typings.typedoc.modelsTypesMod.Type]] | typings.typedoc.modelsTypesMod.Type
  ] = js.undefined
  var kind: ModelToObject[ReflectionKind] | ReflectionKind
  var kindString: js.UndefOr[ModelToObject[js.UndefOr[String]] | String] = js.undefined
  var name: ModelToObject[String] | String
  var originalName: js.UndefOr[String] = js.undefined
  var overwrites: js.UndefOr[
    ModelToObject[js.UndefOr[typings.typedoc.modelsTypesMod.Type]] | typings.typedoc.modelsTypesMod.Type
  ] = js.undefined
  var parameters: js.UndefOr[js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]] = js.undefined
  var setSignature: js.UndefOr[js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]] = js.undefined
  var signatures: js.UndefOr[js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]] = js.undefined
  var `type`: js.UndefOr[
    ModelToObject[js.UndefOr[typings.typedoc.modelsTypesMod.Type]] | typings.typedoc.modelsTypesMod.Type
  ] = js.undefined
  var typeParameter: js.UndefOr[js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]] = js.undefined
}

object SignatureReflection {
  @scala.inline
  def apply(
    flags: ReflectionFlags,
    id: ModelToObject[Double] | Double,
    kind: ModelToObject[ReflectionKind] | ReflectionKind,
    name: ModelToObject[String] | String,
    children: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]] = null,
    comment: ModelToObject[js.UndefOr[typings.typedoc.commentsCommentMod.Comment]] | typings.typedoc.commentsCommentMod.Comment = null,
    decorates: ModelToObject[js.UndefOr[js.Array[typings.typedoc.modelsTypesMod.Type]]] | js.Array[typings.typedoc.modelsTypesMod.Type] = null,
    decorators: ModelToObject[js.Array[DecoratorWrapper]] = null,
    getSignature: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]] = null,
    implementationOf: ModelToObject[js.UndefOr[typings.typedoc.modelsTypesMod.Type]] | typings.typedoc.modelsTypesMod.Type = null,
    indexSignature: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]] = null,
    inheritedFrom: ModelToObject[js.UndefOr[typings.typedoc.modelsTypesMod.Type]] | typings.typedoc.modelsTypesMod.Type = null,
    kindString: ModelToObject[js.UndefOr[String]] | String = null,
    originalName: String = null,
    overwrites: ModelToObject[js.UndefOr[typings.typedoc.modelsTypesMod.Type]] | typings.typedoc.modelsTypesMod.Type = null,
    parameters: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]] = null,
    setSignature: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]] = null,
    signatures: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]] = null,
    `type`: ModelToObject[js.UndefOr[typings.typedoc.modelsTypesMod.Type]] | typings.typedoc.modelsTypesMod.Type = null,
    typeParameter: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]] = null
  ): SignatureReflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (decorates != null) __obj.updateDynamic("decorates")(decorates.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (getSignature != null) __obj.updateDynamic("getSignature")(getSignature.asInstanceOf[js.Any])
    if (implementationOf != null) __obj.updateDynamic("implementationOf")(implementationOf.asInstanceOf[js.Any])
    if (indexSignature != null) __obj.updateDynamic("indexSignature")(indexSignature.asInstanceOf[js.Any])
    if (inheritedFrom != null) __obj.updateDynamic("inheritedFrom")(inheritedFrom.asInstanceOf[js.Any])
    if (kindString != null) __obj.updateDynamic("kindString")(kindString.asInstanceOf[js.Any])
    if (originalName != null) __obj.updateDynamic("originalName")(originalName.asInstanceOf[js.Any])
    if (overwrites != null) __obj.updateDynamic("overwrites")(overwrites.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (setSignature != null) __obj.updateDynamic("setSignature")(setSignature.asInstanceOf[js.Any])
    if (signatures != null) __obj.updateDynamic("signatures")(signatures.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeParameter != null) __obj.updateDynamic("typeParameter")(typeParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureReflection]
  }
}

