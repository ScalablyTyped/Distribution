package typings.three

import typings.three.srcConstantsMod.CompressedPixelFormat
import typings.three.srcThreeMod.CompressedTextureLoader
import typings.three.srcThreeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersPvrloaderMod {
  
  @JSImport("three/examples/jsm/loaders/PVRLoader", "PVRLoader")
  @js.native
  open class PVRLoader () extends CompressedTextureLoader {
    def this(manager: LoadingManager) = this()
    
    def parse(buffer: js.typedarray.ArrayBuffer, loadMipmaps: Boolean): PVR = js.native
  }
  
  trait PVR extends StObject {
    
    var format: CompressedPixelFormat
    
    var height: Double
    
    var isCubemap: Boolean
    
    var mipmapCount: Double
    
    var mipmaps: js.Array[js.Object]
    
    var width: Double
  }
  object PVR {
    
    inline def apply(
      format: CompressedPixelFormat,
      height: Double,
      isCubemap: Boolean,
      mipmapCount: Double,
      mipmaps: js.Array[js.Object],
      width: Double
    ): PVR = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isCubemap = isCubemap.asInstanceOf[js.Any], mipmapCount = mipmapCount.asInstanceOf[js.Any], mipmaps = mipmaps.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PVR]
    }
    
    extension [Self <: PVR](x: Self) {
      
      inline def setFormat(value: CompressedPixelFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIsCubemap(value: Boolean): Self = StObject.set(x, "isCubemap", value.asInstanceOf[js.Any])
      
      inline def setMipmapCount(value: Double): Self = StObject.set(x, "mipmapCount", value.asInstanceOf[js.Any])
      
      inline def setMipmaps(value: js.Array[js.Object]): Self = StObject.set(x, "mipmaps", value.asInstanceOf[js.Any])
      
      inline def setMipmapsVarargs(value: js.Object*): Self = StObject.set(x, "mipmaps", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
