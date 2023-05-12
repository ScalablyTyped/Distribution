package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.examplesJsmLoadersRgbeloaderMod.RGBELoader
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcThreeMod.CubeTexture
import typings.three.srcThreeMod.Loader
import typings.three.srcThreeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersHdrcubetextureloaderMod {
  
  @JSImport("three/examples/jsm/loaders/HDRCubeTextureLoader", "HDRCubeTextureLoader")
  @js.native
  open class HDRCubeTextureLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    var hdrLoader: RGBELoader = js.native
    
    def load(urls: js.Array[String], onLoad: js.Function1[/* texture */ CubeTexture, Unit]): CubeTexture = js.native
    def load(
      urls: js.Array[String],
      onLoad: js.Function1[/* texture */ CubeTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): CubeTexture = js.native
    def load(
      urls: js.Array[String],
      onLoad: js.Function1[/* texture */ CubeTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): CubeTexture = js.native
    def load(
      urls: js.Array[String],
      onLoad: js.Function1[/* texture */ CubeTexture, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): CubeTexture = js.native
    
    def loadAsync(urls: js.Array[String]): js.Promise[CubeTexture] = js.native
    def loadAsync(urls: js.Array[String], onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]): js.Promise[CubeTexture] = js.native
    
    def setDataType(`type`: TextureDataType): this.type = js.native
    
    var `type`: TextureDataType = js.native
  }
}
