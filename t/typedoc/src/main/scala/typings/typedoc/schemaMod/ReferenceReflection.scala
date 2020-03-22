package typings.typedoc.schemaMod

import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.serializersMod.DecoratorWrapper
import typings.typedoc.serializersMod.SourceReferenceWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {-readonly [ K2 in 'type' | 'defaultValue' | 'overwrites' | 'inheritedFrom' | 'extendedTypes' | 'extendedBy' | 'implementedTypes' | 'implementedBy' | 'implementationOf' ]: typedoc.typedoc/dist/lib/models.DeclarationReflection[K2] extends typedoc.typedoc/dist/lib/serialization/schema.Primitive? typedoc.typedoc/dist/lib/models.DeclarationReflection[K2] : typedoc.typedoc/dist/lib/serialization/schema.ModelToObject<typedoc.typedoc/dist/lib/models.DeclarationReflection[K2]>}
- Dropped {-readonly [ K2 in never ]: typedoc.typedoc/dist/lib/models.ReferenceReflection[K2] extends typedoc.typedoc/dist/lib/serialization/schema.Primitive? typedoc.typedoc/dist/lib/models.ReferenceReflection[K2] : typedoc.typedoc/dist/lib/serialization/schema.ModelToObject<typedoc.typedoc/dist/lib/models.ReferenceReflection[K2]>} */ /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ trait ReferenceReflection extends ContainerReflection {
  var target: Double
}

object ReferenceReflection {
  @scala.inline
  def apply(
    flags: ReflectionFlags,
    id: ModelToObject[Double] | Double,
    kind: ModelToObject[ReflectionKind] | ReflectionKind,
    name: ModelToObject[String] | String,
    target: Double,
    categories: ModelToObject[js.UndefOr[js.Array[typings.typedoc.reflectionCategoryMod.ReflectionCategory]]] | js.Array[typings.typedoc.reflectionCategoryMod.ReflectionCategory] = null,
    children: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]] = null,
    comment: ModelToObject[js.UndefOr[typings.typedoc.commentsCommentMod.Comment]] | typings.typedoc.commentsCommentMod.Comment = null,
    decorates: ModelToObject[js.UndefOr[js.Array[typings.typedoc.modelsTypesMod.Type]]] | js.Array[typings.typedoc.modelsTypesMod.Type] = null,
    decorators: ModelToObject[js.Array[DecoratorWrapper]] = null,
    getSignature: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]] = null,
    groups: ModelToObject[js.UndefOr[js.Array[typings.typedoc.reflectionGroupMod.ReflectionGroup]]] | js.Array[typings.typedoc.reflectionGroupMod.ReflectionGroup] = null,
    indexSignature: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]] = null,
    kindString: ModelToObject[js.UndefOr[String]] | String = null,
    originalName: String = null,
    parameters: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]] = null,
    setSignature: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]] = null,
    signatures: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]] = null,
    sources: ModelToObject[js.Array[SourceReferenceWrapper]] = null,
    typeParameter: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]] = null
  ): ReferenceReflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (decorates != null) __obj.updateDynamic("decorates")(decorates.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (getSignature != null) __obj.updateDynamic("getSignature")(getSignature.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (indexSignature != null) __obj.updateDynamic("indexSignature")(indexSignature.asInstanceOf[js.Any])
    if (kindString != null) __obj.updateDynamic("kindString")(kindString.asInstanceOf[js.Any])
    if (originalName != null) __obj.updateDynamic("originalName")(originalName.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (setSignature != null) __obj.updateDynamic("setSignature")(setSignature.asInstanceOf[js.Any])
    if (signatures != null) __obj.updateDynamic("signatures")(signatures.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (typeParameter != null) __obj.updateDynamic("typeParameter")(typeParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceReflection]
  }
}

