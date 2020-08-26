package typings.uifabricFoundation.anon

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slots[TSlots] extends js.Object {
  var slots: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof TSlots ]:? @uifabric/foundation.@uifabric/foundation/lib/ISlots.ISlotOptions<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[key]>>}
    */ typings.uifabricFoundation.uifabricFoundationStrings.Slots with TopLevel[TSlots]
  ] = js.native
}

object Slots {
  @scala.inline
  def apply[TSlots](): Slots[TSlots] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Slots[TSlots]]
  }
  @scala.inline
  implicit class SlotsOps[Self <: Slots[_], TSlots] (val x: Self with Slots[TSlots]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSlots(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof TSlots ]:? @uifabric/foundation.@uifabric/foundation/lib/ISlots.ISlotOptions<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[key]>>}
      */ typings.uifabricFoundation.uifabricFoundationStrings.Slots with TopLevel[TSlots]
    ): Self = this.set("slots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlots: Self = this.set("slots", js.undefined)
  }
  
}

