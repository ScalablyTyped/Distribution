package typings.tensorflowTfjsCore.anon

import typings.std.ArrayBuffer
import typings.tensorflowTfjsCore.typesMod.WeightsManifestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: ArrayBuffer
  
  var specs: js.Array[WeightsManifestEntry]
}
object Data {
  
  @scala.inline
  def apply(data: ArrayBuffer, specs: js.Array[WeightsManifestEntry]): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], specs = specs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecs(value: js.Array[WeightsManifestEntry]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecsVarargs(value: WeightsManifestEntry*): Self = StObject.set(x, "specs", js.Array(value :_*))
  }
}
