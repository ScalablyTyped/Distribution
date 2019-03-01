package typings
package vegaDashTypingsLib.typesSpecEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentFieldRef extends _Field {
  var level: js.UndefOr[scala.Double] = js.undefined
  var parent: Field
}

object ParentFieldRef {
  @scala.inline
  def apply(parent: Field, level: scala.Int | scala.Double = null): ParentFieldRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentFieldRef]
  }
}

