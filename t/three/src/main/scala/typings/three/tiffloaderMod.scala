package typings.three

import typings.three.mod.DataTextureLoader
import typings.three.mod.LoadingManager
import typings.three.srcConstantsMod.TextureFilter
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tiffloaderMod {
  
  @JSImport("three/examples/jsm/loaders/TIFFLoader", "TIFFLoader")
  @js.native
  open class TIFFLoader () extends DataTextureLoader {
    def this(manager: LoadingManager) = this()
    
    def parse(buffer: js.Iterable[Double]): TIFFResult = js.native
  }
  
  trait TIFFResult extends StObject {
    
    var data: js.typedarray.Uint8Array
    
    var flipY: `true`
    
    var height: Double
    
    var magFilter: TextureFilter
    
    var minFilter: TextureFilter
    
    var width: Double
  }
  object TIFFResult {
    
    inline def apply(
      data: js.typedarray.Uint8Array,
      height: Double,
      magFilter: TextureFilter,
      minFilter: TextureFilter,
      width: Double
    ): TIFFResult = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], flipY = true, height = height.asInstanceOf[js.Any], magFilter = magFilter.asInstanceOf[js.Any], minFilter = minFilter.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TIFFResult]
    }
    
    extension [Self <: TIFFResult](x: Self) {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFlipY(value: `true`): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMagFilter(value: TextureFilter): Self = StObject.set(x, "magFilter", value.asInstanceOf[js.Any])
      
      inline def setMinFilter(value: TextureFilter): Self = StObject.set(x, "minFilter", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
