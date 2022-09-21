package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUQuerySet
  extends StObject
     with GPUObjectBase {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUQuerySet
  
  /**
    * The number of queries managed by this {@link GPUQuerySet}.
    */
  val count: GPUSize32
  
  /**
    * Destroys the {@link GPUQuerySet}.
    */
  def destroy(): Unit
  
  /**
    * The type of the queries managed by this {@link GPUQuerySet}.
    */
  val `type`: GPUQueryType
}
object GPUQuerySet {
  
  inline def apply(count: GPUSize32, destroy: () => Unit, label: String, `type`: GPUQueryType): GPUQuerySet = {
    val __obj = js.Dynamic.literal(__brand = "GPUQuerySet", count = count.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUQuerySet]
  }
  
  extension [Self <: GPUQuerySet](x: Self) {
    
    inline def setCount(value: GPUSize32): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setType(value: GPUQueryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set__brand(value: typings.webgpuTypes.webgpuTypesStrings.GPUQuerySet): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
