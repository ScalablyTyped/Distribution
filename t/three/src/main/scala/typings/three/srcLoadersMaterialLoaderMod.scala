package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.srcLoadersLoaderMod.Loader
import typings.three.srcLoadersLoadingManagerMod.LoadingManager
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcTexturesTextureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLoadersMaterialLoaderMod {
  
  @JSImport("three/src/loaders/MaterialLoader", "MaterialLoader")
  @js.native
  open class MaterialLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* material */ Material, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* material */ Material, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* material */ Material, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ js.Error | ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* material */ Material, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ js.Error | ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(json: Any): Material = js.native
    
    def setTextures(textures: StringDictionary[Texture]): this.type = js.native
    
    /**
      * @default {}
      */
    var textures: StringDictionary[Texture] = js.native
  }
}
