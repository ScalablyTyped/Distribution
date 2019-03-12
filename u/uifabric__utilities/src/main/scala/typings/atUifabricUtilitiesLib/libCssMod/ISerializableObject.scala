package typings
package atUifabricUtilitiesLib.libCssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISerializableObject extends js.Object {
  @JSName("toString")
  var toString_FISerializableObject: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
}

object ISerializableObject {
  @scala.inline
  def apply(toString: () => java.lang.String = null): ISerializableObject = {
    val __obj = js.Dynamic.literal()
    if (toString != null) __obj.updateDynamic("toString")(js.Any.fromFunction0(toString))
    __obj.asInstanceOf[ISerializableObject]
  }
}

