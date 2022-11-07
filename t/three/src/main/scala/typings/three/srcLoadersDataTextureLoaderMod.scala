package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.srcLoadersLoaderMod.Loader
import typings.three.srcLoadersLoadingManagerMod.LoadingManager
import typings.three.srcTexturesDataTextureMod.DataTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLoadersDataTextureLoaderMod {
  
  @JSImport("three/src/loaders/DataTextureLoader", "DataTextureLoader")
  @js.native
  open class DataTextureLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String): DataTexture = js.native
    def load(url: String, onLoad: js.Function2[/* dataTexture */ DataTexture, /* texData */ js.Object, Unit]): DataTexture = js.native
    def load(
      url: String,
      onLoad: js.Function2[/* dataTexture */ DataTexture, /* texData */ js.Object, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): DataTexture = js.native
    def load(
      url: String,
      onLoad: js.Function2[/* dataTexture */ DataTexture, /* texData */ js.Object, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): DataTexture = js.native
    def load(
      url: String,
      onLoad: js.Function2[/* dataTexture */ DataTexture, /* texData */ js.Object, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): DataTexture = js.native
    def load(url: String, onLoad: Unit, onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]): DataTexture = js.native
    def load(
      url: String,
      onLoad: Unit,
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): DataTexture = js.native
    def load(url: String, onLoad: Unit, onProgress: Unit, onError: js.Function1[/* event */ ErrorEvent, Unit]): DataTexture = js.native
  }
}
