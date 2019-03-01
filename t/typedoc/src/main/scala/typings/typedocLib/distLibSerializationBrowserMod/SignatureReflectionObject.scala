package typings
package typedocLib.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof typedoc.typedoc/dist/lib/serialization/browser.SignatureReflectionContainer<typedoc.typedoc/dist/lib/serialization/browser.ParameterReflectionObject> ]:? typedoc.typedoc/dist/lib/serialization/browser.SignatureReflectionContainer<typedoc.typedoc/dist/lib/serialization/browser.ParameterReflectionObject>[P]}
- Dropped {[ P in keyof typedoc.typedoc/dist/lib/serialization/browser.TypeContainer ]:? typedoc.typedoc/dist/lib/serialization/browser.TypeContainer[P]}
- Dropped {[ P in keyof typedoc.typedoc/dist/lib/serialization/browser.TypeParameterContainer ]:? typedoc.typedoc/dist/lib/serialization/browser.TypeParameterContainer[P]} */ trait SignatureReflectionObject extends ReflectionObject

object SignatureReflectionObject {
  @scala.inline
  def apply(
    flags: ReflectionFlagsObject,
    id: scala.Double,
    kind: scala.Double,
    kindString: java.lang.String,
    name: java.lang.String,
    originalName: java.lang.String = null
  ): SignatureReflectionObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("kindString")(kindString)
    __obj.updateDynamic("name")(name)
    if (originalName != null) __obj.updateDynamic("originalName")(originalName)
    __obj.asInstanceOf[SignatureReflectionObject]
  }
}

