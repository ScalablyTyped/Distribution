package typings.uifabricFoundation

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Slots[TSlots] extends StObject {
    
    var slots: js.UndefOr[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof TSlots ]:? @uifabric/foundation.@uifabric/foundation/lib/ISlots.ISlotOptions<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[key]>>}
      */ typings.uifabricFoundation.uifabricFoundationStrings.Slots & TopLevel[TSlots]
      ] = js.undefined
  }
  object Slots {
    
    @scala.inline
    def apply[TSlots](): Slots[TSlots] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Slots[TSlots]]
    }
    
    @scala.inline
    implicit class SlotsMutableBuilder[Self <: Slots[?], TSlots] (val x: Self & Slots[TSlots]) extends AnyVal {
      
      @scala.inline
      def setSlots(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ key in keyof TSlots ]:? @uifabric/foundation.@uifabric/foundation/lib/ISlots.ISlotOptions<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[key]>>}
        */ typings.uifabricFoundation.uifabricFoundationStrings.Slots & TopLevel[TSlots]
      ): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    }
  }
}
