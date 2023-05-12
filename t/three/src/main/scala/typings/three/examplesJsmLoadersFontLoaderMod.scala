package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.srcThreeMod.Loader
import typings.three.srcThreeMod.LoadingManager
import typings.three.srcThreeMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersFontLoaderMod {
  
  @JSImport("three/examples/jsm/loaders/FontLoader", "Font")
  @js.native
  open class Font protected () extends StObject {
    def this(jsondata: Any) = this()
    
    var data: String = js.native
    
    def generateShapes(text: String, size: Double): js.Array[Shape] = js.native
    
    /**
      * @default 'Font'
      */
    var `type`: String = js.native
  }
  
  @JSImport("three/examples/jsm/loaders/FontLoader", "FontLoader")
  @js.native
  open class FontLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String): Unit = js.native
    def load(url: String, onLoad: js.Function1[/* responseFont */ Font, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* responseFont */ Font, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* responseFont */ Font, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* responseFont */ Font, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(url: String, onLoad: Unit, onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: Unit,
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(url: String, onLoad: Unit, onProgress: Unit, onError: js.Function1[/* event */ ErrorEvent, Unit]): Unit = js.native
    
    def loadAsync(url: String): js.Promise[Font] = js.native
    def loadAsync(url: String, onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]): js.Promise[Font] = js.native
    
    def parse(json: Any): Font = js.native
  }
}
