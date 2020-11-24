package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.loaderMod.Loader
import typings.three.loadingManagerMod.LoadingManager
import typings.three.materialMod.Material
import typings.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/loaders/MaterialLoader", JSImport.Namespace)
@js.native
object materialLoaderMod extends js.Object {
  
  @js.native
  class MaterialLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* material */ Material, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* material */ Material, Unit],
      onProgress: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* event */ Error | ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* material */ Material, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* material */ Material, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ Error | ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(json: js.Any): Material = js.native
    
    def setTextures(textures: StringDictionary[Texture]): this.type = js.native
    
    /**
    	 * @default {}
    	 */
    var textures: StringDictionary[Texture] = js.native
  }
}
