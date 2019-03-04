package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldOrderArray
  extends vegaDashTypingsLib.typesSpecMarkMod.Compare {
  var field: js.Array[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]
  var order: js.UndefOr[js.Array[vegaDashTypingsLib.typesSpecScaleMod.SortOrder]] = js.undefined
}

object Anon_FieldOrderArray {
  @scala.inline
  def apply(
    field: js.Array[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef],
    order: js.Array[vegaDashTypingsLib.typesSpecScaleMod.SortOrder] = null
  ): Anon_FieldOrderArray = {
    val __obj = js.Dynamic.literal(field = field)
    if (order != null) __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[Anon_FieldOrderArray]
  }
}

