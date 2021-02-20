package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsCore.kernelRegistryMod.DataId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlatOffset extends StObject {
  
  var flatOffset: Double = js.native
  
  var origDataId: DataId = js.native
}
object FlatOffset {
  
  @scala.inline
  def apply(flatOffset: Double, origDataId: DataId): FlatOffset = {
    val __obj = js.Dynamic.literal(flatOffset = flatOffset.asInstanceOf[js.Any], origDataId = origDataId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlatOffset]
  }
  
  @scala.inline
  implicit class FlatOffsetMutableBuilder[Self <: FlatOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlatOffset(value: Double): Self = StObject.set(x, "flatOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigDataId(value: DataId): Self = StObject.set(x, "origDataId", value.asInstanceOf[js.Any])
  }
}
