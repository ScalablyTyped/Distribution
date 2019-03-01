package typings
package typedocLib.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof typedoc.typedoc/dist/lib/serialization/browser.TypeContainer ]:? typedoc.typedoc/dist/lib/serialization/browser.TypeContainer[P]}
- Dropped {[ P in keyof typedoc.typedoc/dist/lib/serialization/browser.TypeParameterContainer ]:? typedoc.typedoc/dist/lib/serialization/browser.TypeParameterContainer[P]}
- Dropped {[ P in keyof typedoc.typedoc/dist/lib/serialization/browser.SignatureReflectionContainer<typedoc.typedoc/dist/lib/serialization/browser.ParameterReflectionObject> ]:? typedoc.typedoc/dist/lib/serialization/browser.SignatureReflectionContainer<typedoc.typedoc/dist/lib/serialization/browser.ParameterReflectionObject>[P]} */ trait DeclarationReflectionObject
  extends ContainerReflectionObject
     with DefaultValueContainer
     with DeclarationReflectionContainer[SignatureReflectionObject]

object DeclarationReflectionObject {
  @scala.inline
  def apply(
    children: js.Array[ReflectionObject],
    defaultValue: java.lang.String,
    flags: ReflectionFlagsObject,
    id: scala.Double,
    kind: scala.Double,
    kindString: java.lang.String,
    name: java.lang.String,
    extendedBy: js.Array[TypeObject] = null,
    extendedTypes: js.Array[TypeObject] = null,
    getSignature: js.Array[SignatureReflectionObject] = null,
    implementedBy: js.Array[TypeObject] = null,
    implementedTypes: js.Array[TypeObject] = null,
    indexSignature: js.Array[SignatureReflectionObject] = null,
    originalName: java.lang.String = null,
    setSignature: js.Array[SignatureReflectionObject] = null,
    signatures: js.Array[SignatureReflectionObject] = null
  ): DeclarationReflectionObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("kindString")(kindString)
    __obj.updateDynamic("name")(name)
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

