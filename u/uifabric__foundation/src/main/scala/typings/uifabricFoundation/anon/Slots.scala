package typings.uifabricFoundation.anon

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Slots[TSlots] extends js.Object {
  var slots: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof TSlots ]:? @uifabric/foundation.@uifabric/foundation/lib/ISlots.ISlotOptions<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[key]>>}
    */ typings.uifabricFoundation.uifabricFoundationStrings.Slots with TopLevel[TSlots]
  ] = js.undefined
}

object Slots {
  @scala.inline
  def apply[TSlots](
    slots: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof TSlots ]:? @uifabric/foundation.@uifabric/foundation/lib/ISlots.ISlotOptions<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[key]>>}
    */ typings.uifabricFoundation.uifabricFoundationStrings.Slots with TopLevel[TSlots] = null
  ): Slots[TSlots] = {
    val __obj = js.Dynamic.literal()
    if (slots != null) __obj.updateDynamic("slots")(slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slots[TSlots]]
  }
}

