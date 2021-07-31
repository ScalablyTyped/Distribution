package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromPixelsAttrs extends StObject {
  
  var numChannels: Double
}
object FromPixelsAttrs {
  
  @scala.inline
  def apply(numChannels: Double): FromPixelsAttrs = {
    val __obj = js.Dynamic.literal(numChannels = numChannels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromPixelsAttrs]
  }
  
  @scala.inline
  implicit class FromPixelsAttrsMutableBuilder[Self <: FromPixelsAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumChannels(value: Double): Self = StObject.set(x, "numChannels", value.asInstanceOf[js.Any])
  }
}
