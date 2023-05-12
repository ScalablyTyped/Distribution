package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUBlendState extends StObject {
  
  /**
    * Defines the blending behavior of the corresponding render target for the alpha channel.
    */
  var alpha: GPUBlendComponent
  
  /**
    * Defines the blending behavior of the corresponding render target for color channels.
    */
  var color: GPUBlendComponent
}
object GPUBlendState {
  
  inline def apply(alpha: GPUBlendComponent, color: GPUBlendComponent): GPUBlendState = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUBlendState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUBlendState] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: GPUBlendComponent): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setColor(value: GPUBlendComponent): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
