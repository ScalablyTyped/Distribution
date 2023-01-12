package typings.ttest

import typings.ttest.ttestStrings.`not equal`
import typings.ttest.ttestStrings.greater
import typings.ttest.ttestStrings.less
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Omit<ttest.ttest.Options, 'varEqual'> */
  trait OmitOptionsvarEqual extends StObject {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var alternative: js.UndefOr[less | greater | (`not equal`)] = js.undefined
    
    var mu: js.UndefOr[Double] = js.undefined
  }
  object OmitOptionsvarEqual {
    
    inline def apply(): OmitOptionsvarEqual = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitOptionsvarEqual]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitOptionsvarEqual] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setAlternative(value: less | greater | (`not equal`)): Self = StObject.set(x, "alternative", value.asInstanceOf[js.Any])
      
      inline def setAlternativeUndefined: Self = StObject.set(x, "alternative", js.undefined)
      
      inline def setMu(value: Double): Self = StObject.set(x, "mu", value.asInstanceOf[js.Any])
      
      inline def setMuUndefined: Self = StObject.set(x, "mu", js.undefined)
    }
  }
}
