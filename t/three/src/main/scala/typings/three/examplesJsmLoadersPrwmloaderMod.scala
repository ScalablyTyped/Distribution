package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcThreeMod.BufferGeometry
import typings.three.srcThreeMod.Loader
import typings.three.srcThreeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersPrwmloaderMod {
  
  @JSImport("three/examples/jsm/loaders/PRWMLoader", "PRWMLoader")
  @js.native
  open class PRWMLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* geometry */ BufferGeometry[NormalBufferAttributes], Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* geometry */ BufferGeometry[NormalBufferAttributes], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* geometry */ BufferGeometry[NormalBufferAttributes], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* geometry */ BufferGeometry[NormalBufferAttributes], Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def loadAsync(url: String): js.Promise[BufferGeometry[NormalBufferAttributes]] = js.native
    def loadAsync(url: String, onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]): js.Promise[BufferGeometry[NormalBufferAttributes]] = js.native
    
    def parse(data: js.typedarray.ArrayBuffer): BufferGeometry[NormalBufferAttributes] = js.native
  }
  /* static members */
  object PRWMLoader {
    
    @JSImport("three/examples/jsm/loaders/PRWMLoader", "PRWMLoader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isBigEndianPlatform(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBigEndianPlatform")().asInstanceOf[Boolean]
  }
}
