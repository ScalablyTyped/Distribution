package typings.telejson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<telejson.telejson.Options> */
  trait PartialOptions extends StObject {
    
    var allowClass: js.UndefOr[Boolean] = js.undefined
    
    var allowDate: js.UndefOr[Boolean] = js.undefined
    
    var allowFunction: js.UndefOr[Boolean] = js.undefined
    
    var allowRegExp: js.UndefOr[Boolean] = js.undefined
    
    var allowSymbol: js.UndefOr[Boolean] = js.undefined
    
    var allowUndefined: js.UndefOr[Boolean] = js.undefined
    
    var lazyEval: js.UndefOr[Boolean] = js.undefined
    
    var maxDepth: js.UndefOr[Double] = js.undefined
    
    var space: js.UndefOr[Double] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setAllowClass(value: Boolean): Self = StObject.set(x, "allowClass", value.asInstanceOf[js.Any])
      
      inline def setAllowClassUndefined: Self = StObject.set(x, "allowClass", js.undefined)
      
      inline def setAllowDate(value: Boolean): Self = StObject.set(x, "allowDate", value.asInstanceOf[js.Any])
      
      inline def setAllowDateUndefined: Self = StObject.set(x, "allowDate", js.undefined)
      
      inline def setAllowFunction(value: Boolean): Self = StObject.set(x, "allowFunction", value.asInstanceOf[js.Any])
      
      inline def setAllowFunctionUndefined: Self = StObject.set(x, "allowFunction", js.undefined)
      
      inline def setAllowRegExp(value: Boolean): Self = StObject.set(x, "allowRegExp", value.asInstanceOf[js.Any])
      
      inline def setAllowRegExpUndefined: Self = StObject.set(x, "allowRegExp", js.undefined)
      
      inline def setAllowSymbol(value: Boolean): Self = StObject.set(x, "allowSymbol", value.asInstanceOf[js.Any])
      
      inline def setAllowSymbolUndefined: Self = StObject.set(x, "allowSymbol", js.undefined)
      
      inline def setAllowUndefined(value: Boolean): Self = StObject.set(x, "allowUndefined", value.asInstanceOf[js.Any])
      
      inline def setAllowUndefinedUndefined: Self = StObject.set(x, "allowUndefined", js.undefined)
      
      inline def setLazyEval(value: Boolean): Self = StObject.set(x, "lazyEval", value.asInstanceOf[js.Any])
      
      inline def setLazyEvalUndefined: Self = StObject.set(x, "lazyEval", js.undefined)
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      inline def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
}
