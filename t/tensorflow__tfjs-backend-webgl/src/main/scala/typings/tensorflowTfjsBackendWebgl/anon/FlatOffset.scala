package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsCore.kernelRegistryMod.DataId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlatOffset extends StObject {
  
  var flatOffset: Double
  
  var origDataId: DataId
}
object FlatOffset {
  
  inline def apply(flatOffset: Double, origDataId: DataId): FlatOffset = {
    val __obj = js.Dynamic.literal(flatOffset = flatOffset.asInstanceOf[js.Any], origDataId = origDataId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlatOffset]
  }
  
  extension [Self <: FlatOffset](x: Self) {
    
    inline def setFlatOffset(value: Double): Self = StObject.set(x, "flatOffset", value.asInstanceOf[js.Any])
    
    inline def setOrigDataId(value: DataId): Self = StObject.set(x, "origDataId", value.asInstanceOf[js.Any])
  }
}
