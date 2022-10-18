package typings.vegaLite.buildSrcTransformMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SampleTransform
  extends StObject
     with Transform {
  
  /**
    * The maximum number of data objects to include in the sample.
    *
    * __Default value:__ `1000`
    */
  var sample: Double
}
object SampleTransform {
  
  inline def apply(sample: Double): SampleTransform = {
    val __obj = js.Dynamic.literal(sample = sample.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampleTransform]
  }
  
  extension [Self <: SampleTransform](x: Self) {
    
    inline def setSample(value: Double): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
  }
}
