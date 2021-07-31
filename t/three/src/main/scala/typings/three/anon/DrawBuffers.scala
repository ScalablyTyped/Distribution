package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawBuffers extends StObject {
  
  var derivatives: Boolean
  
  var drawBuffers: Boolean
  
  var fragDepth: Boolean
  
  var shaderTextureLOD: Boolean
}
object DrawBuffers {
  
  @scala.inline
  def apply(derivatives: Boolean, drawBuffers: Boolean, fragDepth: Boolean, shaderTextureLOD: Boolean): DrawBuffers = {
    val __obj = js.Dynamic.literal(derivatives = derivatives.asInstanceOf[js.Any], drawBuffers = drawBuffers.asInstanceOf[js.Any], fragDepth = fragDepth.asInstanceOf[js.Any], shaderTextureLOD = shaderTextureLOD.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawBuffers]
  }
  
  @scala.inline
  implicit class DrawBuffersMutableBuilder[Self <: DrawBuffers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDerivatives(value: Boolean): Self = StObject.set(x, "derivatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawBuffers(value: Boolean): Self = StObject.set(x, "drawBuffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragDepth(value: Boolean): Self = StObject.set(x, "fragDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShaderTextureLOD(value: Boolean): Self = StObject.set(x, "shaderTextureLOD", value.asInstanceOf[js.Any])
  }
}
