package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.cubeTextureMod.CubeTexture
import typings.three.loaderMod.Loader
import typings.three.loadingManagerMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cubeTextureLoaderMod {
  
  @JSImport("three/src/loaders/CubeTextureLoader", "CubeTextureLoader")
  @js.native
  class CubeTextureLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(urls: js.Array[String]): CubeTexture = js.native
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
    def load(
      urls: js.Array[String],
      onLoad: Unit,
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): CubeTexture = js.native
    def load(
      urls: js.Array[String],
      onLoad: Unit,
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): CubeTexture = js.native
    def load(
      urls: js.Array[String],
      onLoad: Unit,
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): CubeTexture = js.native
  }
}
