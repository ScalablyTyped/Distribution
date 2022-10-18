package typings.three

import typings.three.srcConstantsMod.CompressedPixelFormat
import typings.three.srcConstantsMod.PixelFormat
import typings.three.srcThreeMod.CompressedTextureLoader
import typings.three.srcThreeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersDdsloaderMod {
  
  @JSImport("three/examples/jsm/loaders/DDSLoader", "DDSLoader")
  @js.native
  open class DDSLoader () extends CompressedTextureLoader {
    def this(manager: LoadingManager) = this()
    
    def parse(buffer: js.typedarray.ArrayBuffer, loadMipmaps: Boolean): DDS = js.native
  }
  
  trait DDS extends StObject {
    
    var format: PixelFormat | CompressedPixelFormat
    
    var height: Double
    
    var isCubemap: Boolean
    
    var mipmapCount: Double
    
    var mipmaps: js.Array[js.Object]
    
    var width: Double
  }
  object DDS {
    
    inline def apply(
      format: PixelFormat | CompressedPixelFormat,
      height: Double,
      isCubemap: Boolean,
      mipmapCount: Double,
      mipmaps: js.Array[js.Object],
      width: Double
    ): DDS = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isCubemap = isCubemap.asInstanceOf[js.Any], mipmapCount = mipmapCount.asInstanceOf[js.Any], mipmaps = mipmaps.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[DDS]
    }
    
    extension [Self <: DDS](x: Self) {
      
      inline def setFormat(value: PixelFormat | CompressedPixelFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIsCubemap(value: Boolean): Self = StObject.set(x, "isCubemap", value.asInstanceOf[js.Any])
      
      inline def setMipmapCount(value: Double): Self = StObject.set(x, "mipmapCount", value.asInstanceOf[js.Any])
      
      inline def setMipmaps(value: js.Array[js.Object]): Self = StObject.set(x, "mipmaps", value.asInstanceOf[js.Any])
      
      inline def setMipmapsVarargs(value: js.Object*): Self = StObject.set(x, "mipmaps", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
