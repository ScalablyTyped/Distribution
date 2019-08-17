package typings.atUifabricFoundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Slots[TSlots] extends js.Object {
  var slots: js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof TSlots ]:? @uifabric/foundation.@uifabric/foundation/lib/ISlots.ISlotOptions<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[key]>>}
    */ typings.atUifabricFoundation.atUifabricFoundationStrings.Anon_Slots with TSlots
  ] = js.undefined
}

object Anon_Slots {
  @scala.inline
  def apply[TSlots](
    slots: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof TSlots ]:? @uifabric/foundation.@uifabric/foundation/lib/ISlots.ISlotOptions<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[key]>>}
    */ typings.atUifabricFoundation.atUifabricFoundationStrings.Anon_Slots with TSlots = null
  ): Anon_Slots[TSlots] = {
    val __obj = js.Dynamic.literal()
    if (slots != null) __obj.updateDynamic("slots")(slots)
    __obj.asInstanceOf[Anon_Slots[TSlots]]
  }
}

