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
- Dropped {[ P in keyof typedoc.typedoc/dist/lib/serialization/browser.CategoriesContainer<typedoc.typedoc/dist/lib/serialization/browser.ReflectionCategoryObject> ]:? typedoc.typedoc/dist/lib/serialization/browser.CategoriesContainer<typedoc.typedoc/dist/lib/serialization/browser.ReflectionCategoryObject>[P]} */ trait ProjectReflectionObject
  extends ReflectionContainer
     with ContainerReflectionContainer[ReflectionObject]

object ProjectReflectionObject {
  @scala.inline
  def apply(
    children: js.Array[ReflectionObject],
    flags: ReflectionFlagsObject,
    id: Double,
    kind: Double,
    kindString: String,
    name: String,
    originalName: String = null
  ): ProjectReflectionObject = {
    val __obj = js.Dynamic.literal(children = children, flags = flags, id = id, kind = kind, kindString = kindString, name = name)
    if (originalName != null) __obj.updateDynamic("originalName")(originalName)
    __obj.asInstanceOf[ProjectReflectionObject]
  }
}

