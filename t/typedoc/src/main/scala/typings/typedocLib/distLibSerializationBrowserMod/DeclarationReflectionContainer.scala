package typings
package typedocLib.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationReflectionContainer[T] extends js.Object {
  var extendedBy: js.UndefOr[js.Array[TypeObject]] = js.undefined
  var extendedTypes: js.UndefOr[js.Array[TypeObject]] = js.undefined
  var getSignature: js.UndefOr[js.Array[T]] = js.undefined
  var implementedBy: js.UndefOr[js.Array[TypeObject]] = js.undefined
  var implementedTypes: js.UndefOr[js.Array[TypeObject]] = js.undefined
  var indexSignature: js.UndefOr[js.Array[T]] = js.undefined
  var setSignature: js.UndefOr[js.Array[T]] = js.undefined
  var signatures: js.UndefOr[js.Array[T]] = js.undefined
}

object DeclarationReflectionContainer {
  @scala.inline
  def apply[T](
    extendedBy: js.Array[TypeObject] = null,
    extendedTypes: js.Array[TypeObject] = null,
    getSignature: js.Array[T] = null,
    implementedBy: js.Array[TypeObject] = null,
    implementedTypes: js.Array[TypeObject] = null,
    indexSignature: js.Array[T] = null,
    setSignature: js.Array[T] = null,
    signatures: js.Array[T] = null
  ): DeclarationReflectionContainer[T] = {
    val __obj = js.Dynamic.literal()
    if (extendedBy != null) __obj.updateDynamic("extendedBy")(extendedBy)
    if (extendedTypes != null) __obj.updateDynamic("extendedTypes")(extendedTypes)
    if (getSignature != null) __obj.updateDynamic("getSignature")(getSignature)
    if (implementedBy != null) __obj.updateDynamic("implementedBy")(implementedBy)
    if (implementedTypes != null) __obj.updateDynamic("implementedTypes")(implementedTypes)
    if (indexSignature != null) __obj.updateDynamic("indexSignature")(indexSignature)
    if (setSignature != null) __obj.updateDynamic("setSignature")(setSignature)
    if (signatures != null) __obj.updateDynamic("signatures")(signatures)
    __obj.asInstanceOf[DeclarationReflectionContainer[T]]
  }
}

