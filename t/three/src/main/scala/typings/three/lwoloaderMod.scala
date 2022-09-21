package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.eventDispatcherMod.Event
import typings.three.threeMod.Loader
import typings.three.threeMod.LoadingManager
import typings.three.threeMod.Material
import typings.three.threeMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lwoloaderMod {
  
  @JSImport("three/examples/jsm/loaders/LWOLoader", "LWOLoader")
  @js.native
  open class LWOLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    def this(manager: Unit, parameters: LWOLoaderParameters) = this()
    def this(manager: LoadingManager, parameters: LWOLoaderParameters) = this()
    
    def load(url: String, onLoad: js.Function1[/* lwo */ LWO, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* lwo */ LWO, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* lwo */ LWO, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* lwo */ LWO, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(data: js.typedarray.ArrayBuffer, path: String, modelName: String): LWO = js.native
  }
  
  trait LWO extends StObject {
    
    var materials: js.Array[Material]
    
    var meshes: js.Array[Object3D[Event]]
  }
  object LWO {
    
    inline def apply(materials: js.Array[Material], meshes: js.Array[Object3D[Event]]): LWO = {
      val __obj = js.Dynamic.literal(materials = materials.asInstanceOf[js.Any], meshes = meshes.asInstanceOf[js.Any])
      __obj.asInstanceOf[LWO]
    }
    
    extension [Self <: LWO](x: Self) {
      
      inline def setMaterials(value: js.Array[Material]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
      
      inline def setMaterialsVarargs(value: Material*): Self = StObject.set(x, "materials", js.Array(value*))
      
      inline def setMeshes(value: js.Array[Object3D[Event]]): Self = StObject.set(x, "meshes", value.asInstanceOf[js.Any])
      
      inline def setMeshesVarargs(value: Object3D[Event]*): Self = StObject.set(x, "meshes", js.Array(value*))
    }
  }
  
  trait LWOLoaderParameters extends StObject {
    
    /**
      * Base content delivery folder path, use when it differs from Lightwave default structure
      */
    var resourcePath: js.UndefOr[String] = js.undefined
  }
  object LWOLoaderParameters {
    
    inline def apply(): LWOLoaderParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LWOLoaderParameters]
    }
    
    extension [Self <: LWOLoaderParameters](x: Self) {
      
      inline def setResourcePath(value: String): Self = StObject.set(x, "resourcePath", value.asInstanceOf[js.Any])
      
      inline def setResourcePathUndefined: Self = StObject.set(x, "resourcePath", js.undefined)
    }
  }
}
