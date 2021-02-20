package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Derivatives extends StObject {
  
  var derivatives: js.UndefOr[Boolean] = js.native
  
  var drawBuffers: js.UndefOr[Boolean] = js.native
  
  var fragDepth: js.UndefOr[Boolean] = js.native
  
  var shaderTextureLOD: js.UndefOr[Boolean] = js.native
}
object Derivatives {
  
  @scala.inline
  def apply(): Derivatives = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Derivatives]
  }
  
  @scala.inline
  implicit class DerivativesMutableBuilder[Self <: Derivatives] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDerivatives(value: Boolean): Self = StObject.set(x, "derivatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDerivativesUndefined: Self = StObject.set(x, "derivatives", js.undefined)
    
    @scala.inline
    def setDrawBuffers(value: Boolean): Self = StObject.set(x, "drawBuffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawBuffersUndefined: Self = StObject.set(x, "drawBuffers", js.undefined)
    
    @scala.inline
    def setFragDepth(value: Boolean): Self = StObject.set(x, "fragDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragDepthUndefined: Self = StObject.set(x, "fragDepth", js.undefined)
    
    @scala.inline
    def setShaderTextureLOD(value: Boolean): Self = StObject.set(x, "shaderTextureLOD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShaderTextureLODUndefined: Self = StObject.set(x, "shaderTextureLOD", js.undefined)
  }
}
