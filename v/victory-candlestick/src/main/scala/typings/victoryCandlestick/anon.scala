package typings.victoryCandlestick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Close extends StObject {
    
    var close: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ] = js.undefined
    
    var high: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ] = js.undefined
    
    var low: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ] = js.undefined
    
    var open: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ] = js.undefined
  }
  object Close {
    
    inline def apply(): Close = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Close]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Close] (val x: Self) extends AnyVal {
      
      inline def setClose(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setHigh(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      inline def setLow(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      inline def setOpen(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    }
  }
  
  trait Negative extends StObject {
    
    var negative: js.UndefOr[String] = js.undefined
    
    var positive: js.UndefOr[String] = js.undefined
  }
  object Negative {
    
    inline def apply(): Negative = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Negative]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Negative] (val x: Self) extends AnyVal {
      
      inline def setNegative(value: String): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
      
      inline def setPositive(value: String): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
    }
  }
}
