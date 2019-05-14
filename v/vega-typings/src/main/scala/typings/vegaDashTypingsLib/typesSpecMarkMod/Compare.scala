package typings
package vegaDashTypingsLib.typesSpecMarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compare extends js.Object {
  var field: js.UndefOr[
    (js.Array[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | java.lang.String
  ] = js.undefined
  var order: js.UndefOr[
    js.Array[vegaDashTypingsLib.typesSpecScaleMod.SortOrder] | vegaDashTypingsLib.typesSpecScaleMod.SortOrder
  ] = js.undefined
}

object Compare {
  @scala.inline
  def apply(
    field: java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    order: vegaDashTypingsLib.typesSpecScaleMod.SortOrder = null
  ): Compare = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[Compare]
  }
}

