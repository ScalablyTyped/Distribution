package typings.ttest

import typings.ttest.anon.OmitOptionsvarEqual
import typings.ttest.ttestStrings.`not equal`
import typings.ttest.ttestStrings.greater
import typings.ttest.ttestStrings.less
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(left: js.Array[Double]): TTest = ^.asInstanceOf[js.Dynamic].apply(left.asInstanceOf[js.Any]).asInstanceOf[TTest]
  inline def apply(left: js.Array[Double], options: OmitOptionsvarEqual): TTest = (^.asInstanceOf[js.Dynamic].apply(left.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TTest]
  inline def apply(left: js.Array[Double], right: js.Array[Double]): TTest = (^.asInstanceOf[js.Dynamic].apply(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[TTest]
  inline def apply(left: js.Array[Double], right: js.Array[Double], options: Options): TTest = (^.asInstanceOf[js.Dynamic].apply(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TTest]
  
  @JSImport("ttest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var alternative: js.UndefOr[less | greater | (`not equal`)] = js.undefined
    
    var mu: js.UndefOr[Double] = js.undefined
    
    var varEqual: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setAlternative(value: less | greater | (`not equal`)): Self = StObject.set(x, "alternative", value.asInstanceOf[js.Any])
      
      inline def setAlternativeUndefined: Self = StObject.set(x, "alternative", js.undefined)
      
      inline def setMu(value: Double): Self = StObject.set(x, "mu", value.asInstanceOf[js.Any])
      
      inline def setMuUndefined: Self = StObject.set(x, "mu", js.undefined)
      
      inline def setVarEqual(value: Boolean): Self = StObject.set(x, "varEqual", value.asInstanceOf[js.Any])
      
      inline def setVarEqualUndefined: Self = StObject.set(x, "varEqual", js.undefined)
    }
  }
  
  trait TTest extends StObject {
    
    def confidence(): js.Array[Double]
    
    def freedom(): Double
    
    def pValue(): Double
    
    def testValue(): Double
    
    def valid(): Boolean
  }
  object TTest {
    
    inline def apply(
      confidence: () => js.Array[Double],
      freedom: () => Double,
      pValue: () => Double,
      testValue: () => Double,
      valid: () => Boolean
    ): TTest = {
      val __obj = js.Dynamic.literal(confidence = js.Any.fromFunction0(confidence), freedom = js.Any.fromFunction0(freedom), pValue = js.Any.fromFunction0(pValue), testValue = js.Any.fromFunction0(testValue), valid = js.Any.fromFunction0(valid))
      __obj.asInstanceOf[TTest]
    }
    
    extension [Self <: TTest](x: Self) {
      
      inline def setConfidence(value: () => js.Array[Double]): Self = StObject.set(x, "confidence", js.Any.fromFunction0(value))
      
      inline def setFreedom(value: () => Double): Self = StObject.set(x, "freedom", js.Any.fromFunction0(value))
      
      inline def setPValue(value: () => Double): Self = StObject.set(x, "pValue", js.Any.fromFunction0(value))
      
      inline def setTestValue(value: () => Double): Self = StObject.set(x, "testValue", js.Any.fromFunction0(value))
      
      inline def setValid(value: () => Boolean): Self = StObject.set(x, "valid", js.Any.fromFunction0(value))
    }
  }
}
