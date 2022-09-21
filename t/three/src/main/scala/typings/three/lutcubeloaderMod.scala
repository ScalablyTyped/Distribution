package typings.three

import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.threeMod.Data3DTexture
import typings.three.threeMod.DataTexture
import typings.three.threeMod.Loader
import typings.three.threeMod.LoadingManager
import typings.three.threeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lutcubeloaderMod {
  
  @JSImport("three/examples/jsm/loaders/LUTCubeLoader", "LUTCubeLoader")
  @js.native
  open class LUTCubeLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* result */ LUTCubeResult, Unit]): Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* result */ LUTCubeResult, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* result */ LUTCubeResult, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ js.Error, Unit]
    ): Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* result */ LUTCubeResult, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ js.Error, Unit]
    ): Any = js.native
    
    def parse(data: String): LUTCubeResult = js.native
  }
  
  trait LUTCubeResult extends StObject {
    
    var domainMax: Vector3
    
    var domainMin: Vector3
    
    var size: Double
    
    var texture: DataTexture
    
    var texture3D: Data3DTexture
    
    var title: String
  }
  object LUTCubeResult {
    
    inline def apply(
      domainMax: Vector3,
      domainMin: Vector3,
      size: Double,
      texture: DataTexture,
      texture3D: Data3DTexture,
      title: String
    ): LUTCubeResult = {
      val __obj = js.Dynamic.literal(domainMax = domainMax.asInstanceOf[js.Any], domainMin = domainMin.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], texture3D = texture3D.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[LUTCubeResult]
    }
    
    extension [Self <: LUTCubeResult](x: Self) {
      
      inline def setDomainMax(value: Vector3): Self = StObject.set(x, "domainMax", value.asInstanceOf[js.Any])
      
      inline def setDomainMin(value: Vector3): Self = StObject.set(x, "domainMin", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTexture(value: DataTexture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
      
      inline def setTexture3D(value: Data3DTexture): Self = StObject.set(x, "texture3D", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
