package typings
package vegaDashTypingsLib.typesSpecEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupFieldRef extends _Field {
  var group: Field
  var level: js.UndefOr[scala.Double] = js.undefined
}

object GroupFieldRef {
  @scala.inline
  def apply(group: Field, level: scala.Int | scala.Double = null): GroupFieldRef = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupFieldRef]
  }
}

