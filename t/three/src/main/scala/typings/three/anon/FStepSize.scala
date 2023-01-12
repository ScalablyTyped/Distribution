package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FStepSize extends StObject {
  
  var fStepSize: IUniform[Any]
  
  var tInput: IUniform[Any]
  
  var vSunPositionScreenSpace: IUniform[Any]
}
object FStepSize {
  
  inline def apply(fStepSize: IUniform[Any], tInput: IUniform[Any], vSunPositionScreenSpace: IUniform[Any]): FStepSize = {
    val __obj = js.Dynamic.literal(fStepSize = fStepSize.asInstanceOf[js.Any], tInput = tInput.asInstanceOf[js.Any], vSunPositionScreenSpace = vSunPositionScreenSpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[FStepSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FStepSize] (val x: Self) extends AnyVal {
    
    inline def setFStepSize(value: IUniform[Any]): Self = StObject.set(x, "fStepSize", value.asInstanceOf[js.Any])
    
    inline def setTInput(value: IUniform[Any]): Self = StObject.set(x, "tInput", value.asInstanceOf[js.Any])
    
    inline def setVSunPositionScreenSpace(value: IUniform[Any]): Self = StObject.set(x, "vSunPositionScreenSpace", value.asInstanceOf[js.Any])
  }
}
