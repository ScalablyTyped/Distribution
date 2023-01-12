package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUBindGroupDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  /**
    * A list of entries describing the resources to expose to the shader for each binding
    * described by the {@link GPUBindGroupDescriptor#layout}.
    */
  var entries: js.Iterable[GPUBindGroupEntry]
  
  /**
    * The {@link GPUBindGroupLayout} the entries of this bind group will conform to.
    */
  var layout: GPUBindGroupLayout
}
object GPUBindGroupDescriptor {
  
  inline def apply(entries: js.Iterable[GPUBindGroupEntry], layout: GPUBindGroupLayout): GPUBindGroupDescriptor = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUBindGroupDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUBindGroupDescriptor] (val x: Self) extends AnyVal {
    
    inline def setEntries(value: js.Iterable[GPUBindGroupEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: GPUBindGroupLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
  }
}
