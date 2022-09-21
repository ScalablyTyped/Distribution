package typings.three

import typings.three.shaderPassMod.ShaderPass
import typings.three.threeMod.Data3DTexture
import typings.three.threeMod.DataTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lutpassMod {
  
  @JSImport("three/examples/jsm/postprocessing/LUTPass", "LUTPass")
  @js.native
  open class LUTPass protected () extends ShaderPass {
    def this(params: LUTPassParameters) = this()
    
    var intensity: js.UndefOr[Double] = js.native
    
    var lut: js.UndefOr[DataTexture | Data3DTexture] = js.native
  }
  
  trait LUTPassParameters extends StObject {
    
    var intensity: js.UndefOr[Double] = js.undefined
    
    var lut: js.UndefOr[DataTexture | Data3DTexture] = js.undefined
  }
  object LUTPassParameters {
    
    inline def apply(): LUTPassParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LUTPassParameters]
    }
    
    extension [Self <: LUTPassParameters](x: Self) {
      
      inline def setIntensity(value: Double): Self = StObject.set(x, "intensity", value.asInstanceOf[js.Any])
      
      inline def setIntensityUndefined: Self = StObject.set(x, "intensity", js.undefined)
      
      inline def setLut(value: DataTexture | Data3DTexture): Self = StObject.set(x, "lut", value.asInstanceOf[js.Any])
      
      inline def setLutUndefined: Self = StObject.set(x, "lut", js.undefined)
    }
  }
}
