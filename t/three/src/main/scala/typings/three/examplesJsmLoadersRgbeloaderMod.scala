package typings.three

import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcThreeMod.DataTextureLoader
import typings.three.srcThreeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersRgbeloaderMod {
  
  @JSImport("three/examples/jsm/loaders/RGBELoader", "RGBELoader")
  @js.native
  open class RGBELoader () extends DataTextureLoader {
    def this(manager: LoadingManager) = this()
    
    def parse(buffer: js.typedarray.ArrayBuffer): RGBE = js.native
    
    def setDataType(`type`: TextureDataType): this.type = js.native
    
    var `type`: TextureDataType = js.native
  }
  
  trait RGBE extends StObject {
    
    var data: js.typedarray.Float32Array | js.typedarray.Uint8Array
    
    var exposure: Double
    
    var gamma: Double
    
    var header: String
    
    var height: Double
    
    var `type`: TextureDataType
    
    var width: Double
  }
  object RGBE {
    
    inline def apply(
      data: js.typedarray.Float32Array | js.typedarray.Uint8Array,
      exposure: Double,
      gamma: Double,
      header: String,
      height: Double,
      `type`: TextureDataType,
      width: Double
    ): RGBE = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], exposure = exposure.asInstanceOf[js.Any], gamma = gamma.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBE]
    }
    
    extension [Self <: RGBE](x: Self) {
      
      inline def setData(value: js.typedarray.Float32Array | js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setExposure(value: Double): Self = StObject.set(x, "exposure", value.asInstanceOf[js.Any])
      
      inline def setGamma(value: Double): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setType(value: TextureDataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
