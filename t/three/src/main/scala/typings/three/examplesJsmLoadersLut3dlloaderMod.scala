package typings.three

import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.srcThreeMod.Data3DTexture
import typings.three.srcThreeMod.DataTexture
import typings.three.srcThreeMod.Loader
import typings.three.srcThreeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersLut3dlloaderMod {
  
  @JSImport("three/examples/jsm/loaders/LUT3dlLoader", "LUT3dlLoader")
  @js.native
  open class LUT3dlLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* result */ LUT3dlResult, Unit]): Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* result */ LUT3dlResult, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* result */ LUT3dlResult, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ js.Error, Unit]
    ): Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* result */ LUT3dlResult, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ js.Error, Unit]
    ): Any = js.native
    
    def parse(data: String): LUT3dlResult = js.native
  }
  
  trait LUT3dlResult extends StObject {
    
    var size: Double
    
    var texture: DataTexture
    
    var texture3D: Data3DTexture
  }
  object LUT3dlResult {
    
    inline def apply(size: Double, texture: DataTexture, texture3D: Data3DTexture): LUT3dlResult = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], texture3D = texture3D.asInstanceOf[js.Any])
      __obj.asInstanceOf[LUT3dlResult]
    }
    
    extension [Self <: LUT3dlResult](x: Self) {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTexture(value: DataTexture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
      
      inline def setTexture3D(value: Data3DTexture): Self = StObject.set(x, "texture3D", value.asInstanceOf[js.Any])
    }
  }
}
