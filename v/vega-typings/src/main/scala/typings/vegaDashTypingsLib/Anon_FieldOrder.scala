package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldOrder
  extends vegaDashTypingsLib.typesSpecMarkMod.Compare {
  var field: java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  var order: js.UndefOr[vegaDashTypingsLib.typesSpecScaleMod.SortOrder] = js.undefined
}

object Anon_FieldOrder {
  @scala.inline
  def apply(
    field: java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef,
    order: vegaDashTypingsLib.typesSpecScaleMod.SortOrder = null
  ): Anon_FieldOrder = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[Anon_FieldOrder]
  }
}

