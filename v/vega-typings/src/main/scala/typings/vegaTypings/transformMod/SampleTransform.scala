package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.sample
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SampleTransform
  extends StObject
     with Transforms {
  
  var size: Double | SignalRef
  
  var `type`: sample
}
object SampleTransform {
  
  inline def apply(size: Double | SignalRef): SampleTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sample")
    __obj.asInstanceOf[SampleTransform]
  }
  
  extension [Self <: SampleTransform](x: Self) {
    
    inline def setSize(value: Double | SignalRef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: sample): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
