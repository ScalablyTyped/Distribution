package typings.vegaLite.transformMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SampleTransform extends Transform {
  
  /**
    * The maximum number of data objects to include in the sample.
    *
    * __Default value:__ `1000`
    */
  var sample: Double = js.native
}
object SampleTransform {
  
  @scala.inline
  def apply(sample: Double): SampleTransform = {
    val __obj = js.Dynamic.literal(sample = sample.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampleTransform]
  }
  
  @scala.inline
  implicit class SampleTransformMutableBuilder[Self <: SampleTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSample(value: Double): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
  }
}
