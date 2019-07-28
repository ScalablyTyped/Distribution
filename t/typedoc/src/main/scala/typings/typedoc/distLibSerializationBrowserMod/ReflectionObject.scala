package typings.typedoc.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof typedoc.typedoc/dist/lib/serialization/browser.CommentContainer<typedoc.typedoc/dist/lib/serialization/browser.CommentObject> ]:? typedoc.typedoc/dist/lib/serialization/browser.CommentContainer<typedoc.typedoc/dist/lib/serialization/browser.CommentObject>[P]}
- Dropped {[ P in keyof typedoc.typedoc/dist/lib/serialization/browser.DecoratesContainer ]:? typedoc.typedoc/dist/lib/serialization/browser.DecoratesContainer[P]}
- Dropped {[ P in keyof typedoc.typedoc/dist/lib/serialization/browser.DecoratorsContainer<typedoc.typedoc/dist/lib/serialization/browser.DecoratorObject> ]:? typedoc.typedoc/dist/lib/serialization/browser.DecoratorsContainer<typedoc.typedoc/dist/lib/serialization/browser.DecoratorObject>[P]} */ trait ReflectionObject extends ReflectionContainer

object ReflectionObject {
  @scala.inline
  def apply(
    flags: ReflectionFlagsObject,
    id: Double,
    kind: Double,
    kindString: String,
    name: String,
    originalName: String = null
  ): ReflectionObject = {
    val __obj = js.Dynamic.literal(flags = flags, id = id, kind = kind, kindString = kindString, name = name)
    if (originalName != null) __obj.updateDynamic("originalName")(originalName)
    __obj.asInstanceOf[ReflectionObject]
  }
}

