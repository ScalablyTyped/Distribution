package typings.uifabricFoundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Slots[TSlots] extends StObject {
    
    var slots: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TSlots ]:? @uifabric/foundation.@uifabric/foundation/lib/ISlots.ISlotOptions<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[key]>>} */ js.Any
      ] = js.undefined
  }
  object Slots {
    
    inline def apply[TSlots](): Slots[TSlots] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Slots[TSlots]]
    }
    
    extension [Self <: Slots[?], TSlots](x: Self & Slots[TSlots]) {
      
      inline def setSlots(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TSlots ]:? @uifabric/foundation.@uifabric/foundation/lib/ISlots.ISlotOptions<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[key]>>} */ js.Any
      ): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    }
  }
}
