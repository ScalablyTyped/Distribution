package typings.svgo

import typings.svgo.mod.DefaultPlugin
import typings.svgo.mod.Overrides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FloatPrecision extends StObject {
    
    var floatPrecision: js.UndefOr[Double] = js.undefined
    
    /**
      * All default plugins can be customized or disabled here
      * for example
      * {
      *   sortAttrs: { xmlnsOrder: "alphabetical" },
      *   cleanupAttrs: false,
      * }
      */
    var overrides: js.UndefOr[Overrides[DefaultPlugin]] = js.undefined
  }
  object FloatPrecision {
    
    inline def apply(): FloatPrecision = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FloatPrecision]
    }
    
    extension [Self <: FloatPrecision](x: Self) {
      
      inline def setFloatPrecision(value: Double): Self = StObject.set(x, "floatPrecision", value.asInstanceOf[js.Any])
      
      inline def setFloatPrecisionUndefined: Self = StObject.set(x, "floatPrecision", js.undefined)
      
      inline def setOverrides(value: Overrides[DefaultPlugin]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
}
