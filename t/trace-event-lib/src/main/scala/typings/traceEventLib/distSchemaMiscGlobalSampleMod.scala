package typings.traceEventLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSchemaMiscGlobalSampleMod {
  
  trait GlobalSample extends StObject {
    
    var cpu: js.UndefOr[Double] = js.undefined
    
    var name: String
    
    var sf: Double
    
    var tid: Double
    
    var ts: Double
    
    var weight: Double
  }
  object GlobalSample {
    
    inline def apply(name: String, sf: Double, tid: Double, ts: Double, weight: Double): GlobalSample = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sf = sf.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalSample]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobalSample] (val x: Self) extends AnyVal {
      
      inline def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSf(value: Double): Self = StObject.set(x, "sf", value.asInstanceOf[js.Any])
      
      inline def setTid(value: Double): Self = StObject.set(x, "tid", value.asInstanceOf[js.Any])
      
      inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
}
