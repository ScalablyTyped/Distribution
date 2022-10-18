package typings.typeformEmbed

import typings.typeformEmbed.typesBaseBehavioralTypeMod.BehavioralType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBaseBehavioralOptionsMod {
  
  trait BehavioralOptions extends StObject {
    
    /**
      * Your typeform will launch based on behavioral triggers.
      *
      * @type {BehavioralType}
      */
    var open: js.UndefOr[BehavioralType] = js.undefined
    
    var openValue: js.UndefOr[Double] = js.undefined
  }
  object BehavioralOptions {
    
    inline def apply(): BehavioralOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BehavioralOptions]
    }
    
    extension [Self <: BehavioralOptions](x: Self) {
      
      inline def setOpen(value: BehavioralType): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOpenValue(value: Double): Self = StObject.set(x, "openValue", value.asInstanceOf[js.Any])
      
      inline def setOpenValueUndefined: Self = StObject.set(x, "openValue", js.undefined)
    }
  }
}
