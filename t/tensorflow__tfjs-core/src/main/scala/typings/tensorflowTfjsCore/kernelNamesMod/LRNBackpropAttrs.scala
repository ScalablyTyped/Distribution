package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LRNBackpropAttrs extends StObject {
  
  var alpha: Double
  
  var beta: Double
  
  var bias: Double
  
  var depthRadius: Double
}
object LRNBackpropAttrs {
  
  @scala.inline
  def apply(alpha: Double, beta: Double, bias: Double, depthRadius: Double): LRNBackpropAttrs = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], bias = bias.asInstanceOf[js.Any], depthRadius = depthRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[LRNBackpropAttrs]
  }
  
  @scala.inline
  implicit class LRNBackpropAttrsMutableBuilder[Self <: LRNBackpropAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeta(value: Double): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBias(value: Double): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthRadius(value: Double): Self = StObject.set(x, "depthRadius", value.asInstanceOf[js.Any])
  }
}
