package typings
package typedocLib.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureReflectionContainer[TParameters] extends js.Object {
  var implementationOf: js.UndefOr[TypeObject] = js.undefined
  var inheritedFrom: js.UndefOr[TypeObject] = js.undefined
  var overwrites: js.UndefOr[TypeObject] = js.undefined
  var parameters: js.UndefOr[js.Array[TParameters]] = js.undefined
}

object SignatureReflectionContainer {
  @scala.inline
  def apply[TParameters](
    implementationOf: TypeObject = null,
    inheritedFrom: TypeObject = null,
    overwrites: TypeObject = null,
    parameters: js.Array[TParameters] = null
  ): SignatureReflectionContainer[TParameters] = {
    val __obj = js.Dynamic.literal()
    if (implementationOf != null) __obj.updateDynamic("implementationOf")(implementationOf)
    if (inheritedFrom != null) __obj.updateDynamic("inheritedFrom")(inheritedFrom)
    if (overwrites != null) __obj.updateDynamic("overwrites")(overwrites)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[SignatureReflectionContainer[TParameters]]
  }
}

