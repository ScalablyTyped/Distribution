package typings.threeGifLoader

import typings.omggif.mod.GifReader
import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.mod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("three-gif-loader", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with GifLoader {
    def this(manager: LoadingManager) = this()
  }
  
  @js.native
  trait GifLoader extends StObject {
    
    def load(url: String, onLoad: js.Function1[/* reader */ GifReader, Unit]): typings.threeGifLoader.gifTextureMod.default = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* reader */ GifReader, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit]
    ): typings.threeGifLoader.gifTextureMod.default = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* reader */ GifReader, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): typings.threeGifLoader.gifTextureMod.default = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* reader */ GifReader, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): typings.threeGifLoader.gifTextureMod.default = js.native
    
    def setPath(value: String): Unit = js.native
  }
}
