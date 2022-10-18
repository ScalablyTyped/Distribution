package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.srcThreeMod.BufferGeometry
import typings.three.srcThreeMod.Loader
import typings.three.srcThreeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersXyzloaderMod {
  
  @JSImport("three/examples/jsm/loaders/XYZLoader", "XYZLoader")
  @js.native
  open class XYZLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* geometry */ BufferGeometry, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* geometry */ BufferGeometry, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* geometry */ BufferGeometry, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* geometry */ BufferGeometry, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(data: String, onLoad: js.Function1[/* geometry */ BufferGeometry, Unit]): js.Object = js.native
  }
}
