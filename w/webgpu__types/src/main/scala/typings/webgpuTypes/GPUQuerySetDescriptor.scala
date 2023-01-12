package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUQuerySetDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  /**
    * The number of queries managed by {@link GPUQuerySet}.
    */
  var count: GPUSize32
  
  /**
    * The type of queries managed by {@link GPUQuerySet}.
    */
  var `type`: GPUQueryType
}
object GPUQuerySetDescriptor {
  
  inline def apply(count: GPUSize32, `type`: GPUQueryType): GPUQuerySetDescriptor = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUQuerySetDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUQuerySetDescriptor] (val x: Self) extends AnyVal {
    
    inline def setCount(value: GPUSize32): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setType(value: GPUQueryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
