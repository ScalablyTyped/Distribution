package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultinomialAttrs extends StObject {
  
  var normalized: Boolean
  
  var numSamples: Double
  
  var seed: Double
}
object MultinomialAttrs {
  
  inline def apply(normalized: Boolean, numSamples: Double, seed: Double): MultinomialAttrs = {
    val __obj = js.Dynamic.literal(normalized = normalized.asInstanceOf[js.Any], numSamples = numSamples.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultinomialAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultinomialAttrs] (val x: Self) extends AnyVal {
    
    inline def setNormalized(value: Boolean): Self = StObject.set(x, "normalized", value.asInstanceOf[js.Any])
    
    inline def setNumSamples(value: Double): Self = StObject.set(x, "numSamples", value.asInstanceOf[js.Any])
    
    inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
  }
}
