package typings.typedoc.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof typedoc.typedoc/dist/lib/serialization/browser.SourceReferenceContainer<typedoc.typedoc/dist/lib/serialization/browser.SourceReferenceObject> ]:? typedoc.typedoc/dist/lib/serialization/browser.SourceReferenceContainer<typedoc.typedoc/dist/lib/serialization/browser.SourceReferenceObject>[P]}
- Dropped {[ P in keyof typedoc.typedoc/dist/lib/serialization/browser.GroupsContainer<typedoc.typedoc/dist/lib/serialization/browser.ReflectionGroupObject> ]:? typedoc.typedoc/dist/lib/serialization/browser.GroupsContainer<typedoc.typedoc/dist/lib/serialization/browser.ReflectionGroupObject>[P]} */ trait ContainerReflectionObject
  extends ReflectionObject
     with ContainerReflectionContainer[ReflectionObject]

object ContainerReflectionObject {
  @scala.inline
  def apply(
    children: js.Array[ReflectionObject],
    flags: ReflectionFlagsObject,
    id: Double,
    kind: Double,
    kindString: String,
    name: String,
    originalName: String = null
  ): ContainerReflectionObject = {
    val __obj = js.Dynamic.literal(children = children, flags = flags, id = id, kind = kind, kindString = kindString, name = name)
    if (originalName != null) __obj.updateDynamic("originalName")(originalName)
    __obj.asInstanceOf[ContainerReflectionObject]
  }
}

