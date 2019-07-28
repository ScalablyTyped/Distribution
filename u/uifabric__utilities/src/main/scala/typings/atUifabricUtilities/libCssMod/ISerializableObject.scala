package typings.atUifabricUtilities.libCssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISerializableObject extends js.Object {
  @JSName("toString")
  var toString_FISerializableObject: js.UndefOr[js.Function0[String]] = js.undefined
}

object ISerializableObject {
  @scala.inline
  def apply(toString: () => String = null): ISerializableObject = {
    val __obj = js.Dynamic.literal()
    if (toString != null) __obj.updateDynamic("toString")(js.Any.fromFunction0(toString))
    __obj.asInstanceOf[ISerializableObject]
  }
}

