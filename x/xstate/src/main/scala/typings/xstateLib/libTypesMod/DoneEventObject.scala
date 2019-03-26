package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoneEventObject extends EventObject {
  var data: js.UndefOr[js.Any] = js.undefined
}

object DoneEventObject {
  @scala.inline
  def apply(
    toString: () => java.lang.String,
    `type`: java.lang.String,
    data: js.Any = null,
    id: java.lang.String | scala.Double = null
  ): DoneEventObject = {
    val __obj = js.Dynamic.literal(toString = js.Any.fromFunction0(toString))
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoneEventObject]
  }
}

