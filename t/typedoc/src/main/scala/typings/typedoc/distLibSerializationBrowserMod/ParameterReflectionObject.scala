package typings.typedoc.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof typedoc.typedoc/dist/lib/serialization/browser.CommentContainer<typedoc.typedoc/dist/lib/serialization/browser.CommentObject> ]:? typedoc.typedoc/dist/lib/serialization/browser.CommentContainer<typedoc.typedoc/dist/lib/serialization/browser.CommentObject>[P]}
- Dropped {[ P in keyof typedoc.typedoc/dist/lib/serialization/browser.DecoratesContainer ]:? typedoc.typedoc/dist/lib/serialization/browser.DecoratesContainer[P]}
- Dropped {[ P in keyof typedoc.typedoc/dist/lib/serialization/browser.DecoratorsContainer<typedoc.typedoc/dist/lib/serialization/browser.DecoratorObject> ]:? typedoc.typedoc/dist/lib/serialization/browser.DecoratorsContainer<typedoc.typedoc/dist/lib/serialization/browser.DecoratorObject>[P]} */ trait ParameterReflectionObject
  extends ReflectionContainer
     with TypeContainer
     with DefaultValueContainer

object ParameterReflectionObject {
  @scala.inline
  def apply(
    defaultValue: String,
    flags: ReflectionFlagsObject,
    id: Double,
    kind: Double,
    kindString: String,
    name: String,
    `type`: TypeObject,
    originalName: String = null
  ): ParameterReflectionObject = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, flags = flags, id = id, kind = kind, kindString = kindString, name = name)
    __obj.updateDynamic("type")(`type`)
    if (originalName != null) __obj.updateDynamic("originalName")(originalName)
    __obj.asInstanceOf[ParameterReflectionObject]
  }
}

