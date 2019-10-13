package typings.typedoc.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof typedoc.typedoc/dist/lib/serialization/browser.CommentContainer<typedoc.typedoc/dist/lib/serialization/browser.CommentObject> ]:? typedoc.typedoc/dist/lib/serialization/browser.CommentContainer<typedoc.typedoc/dist/lib/serialization/browser.CommentObject>[P]}
- Dropped {[ P in keyof typedoc.typedoc/dist/lib/serialization/browser.DecoratesContainer ]:? typedoc.typedoc/dist/lib/serialization/browser.DecoratesContainer[P]}
- Dropped {[ P in keyof typedoc.typedoc/dist/lib/serialization/browser.DecoratorsContainer<typedoc.typedoc/dist/lib/serialization/browser.DecoratorObject> ]:? typedoc.typedoc/dist/lib/serialization/browser.DecoratorsContainer<typedoc.typedoc/dist/lib/serialization/browser.DecoratorObject>[P]}
- Dropped {[ P in keyof typedoc.typedoc/dist/lib/serialization/browser.SourceReferenceContainer<typedoc.typedoc/dist/lib/serialization/browser.SourceReferenceObject> ]:? typedoc.typedoc/dist/lib/serialization/browser.SourceReferenceContainer<typedoc.typedoc/dist/lib/serialization/browser.SourceReferenceObject>[P]}
- Dropped {[ P in keyof typedoc.typedoc/dist/lib/serialization/browser.GroupsContainer<typedoc.typedoc/dist/lib/serialization/browser.ReflectionGroupObject> ]:? typedoc.typedoc/dist/lib/serialization/browser.GroupsContainer<typedoc.typedoc/dist/lib/serialization/browser.ReflectionGroupObject>[P]}
- Dropped {[ P in keyof typedoc.typedoc/dist/lib/serialization/browser.CategoriesContainer<typedoc.typedoc/dist/lib/serialization/browser.ReflectionCategoryObject> ]:? typedoc.typedoc/dist/lib/serialization/browser.CategoriesContainer<typedoc.typedoc/dist/lib/serialization/browser.ReflectionCategoryObject>[P]}
- Dropped {[ P in keyof typedoc.typedoc/dist/lib/serialization/browser.TypeContainer ]:? typedoc.typedoc/dist/lib/serialization/browser.TypeContainer[P]}
- Dropped {[ P in keyof typedoc.typedoc/dist/lib/serialization/browser.TypeParameterContainer ]:? typedoc.typedoc/dist/lib/serialization/browser.TypeParameterContainer[P]}
- Dropped {[ P in keyof typedoc.typedoc/dist/lib/serialization/browser.SignatureReflectionContainer<typedoc.typedoc/dist/lib/serialization/browser.ParameterReflectionObject> ]:? typedoc.typedoc/dist/lib/serialization/browser.SignatureReflectionContainer<typedoc.typedoc/dist/lib/serialization/browser.ParameterReflectionObject>[P]} */ trait DeclarationReflectionObject
  extends ReflectionContainer
     with ContainerReflectionContainer[ReflectionObject]
     with DefaultValueContainer
     with DeclarationReflectionContainer[SignatureReflectionObject]

object DeclarationReflectionObject {
  @scala.inline
  def apply(
    children: js.Array[ReflectionObject],
    defaultValue: String,
    flags: ReflectionFlagsObject,
    id: Double,
    kind: Double,
    kindString: String,
    name: String,
    extendedBy: js.Array[TypeObject] = null,
    extendedTypes: js.Array[TypeObject] = null,
    getSignature: js.Array[SignatureReflectionObject] = null,
    implementedBy: js.Array[TypeObject] = null,
    implementedTypes: js.Array[TypeObject] = null,
    indexSignature: js.Array[SignatureReflectionObject] = null,
    originalName: String = null,
    setSignature: js.Array[SignatureReflectionObject] = null,
    signatures: js.Array[SignatureReflectionObject] = null
  ): DeclarationReflectionObject = {
    val __obj = js.Dynamic.literal(children = children, defaultValue = defaultValue, flags = flags, id = id, kind = kind, kindString = kindString, name = name)
    if (extendedBy != null) __obj.updateDynamic("extendedBy")(extendedBy)
    if (extendedTypes != null) __obj.updateDynamic("extendedTypes")(extendedTypes)
    if (getSignature != null) __obj.updateDynamic("getSignature")(getSignature)
    if (implementedBy != null) __obj.updateDynamic("implementedBy")(implementedBy)
    if (implementedTypes != null) __obj.updateDynamic("implementedTypes")(implementedTypes)
    if (indexSignature != null) __obj.updateDynamic("indexSignature")(indexSignature)
    if (originalName != null) __obj.updateDynamic("originalName")(originalName)
    if (setSignature != null) __obj.updateDynamic("setSignature")(setSignature)
    if (signatures != null) __obj.updateDynamic("signatures")(signatures)
    __obj.asInstanceOf[DeclarationReflectionObject]
  }
}

