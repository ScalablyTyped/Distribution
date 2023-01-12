package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distIoTypesMod.WeightsManifestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: js.typedarray.ArrayBuffer
  
  var specs: js.Array[WeightsManifestEntry]
}
object Data {
  
  inline def apply(data: js.typedarray.ArrayBuffer, specs: js.Array[WeightsManifestEntry]): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], specs = specs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setSpecs(value: js.Array[WeightsManifestEntry]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
    
    inline def setSpecsVarargs(value: WeightsManifestEntry*): Self = StObject.set(x, "specs", js.Array(value*))
  }
}
