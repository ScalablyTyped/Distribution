package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.std.Record
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcThreeMod.BufferGeometry
import typings.three.srcThreeMod.Loader
import typings.three.srcThreeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersPlyloaderMod {
  
  @JSImport("three/examples/jsm/loaders/PLYLoader", "PLYLoader")
  @js.native
  open class PLYLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    var customPropertyMapping: Record[String, Any] = js.native
    
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
    
    def parse(data: String): BufferGeometry[NormalBufferAttributes] = js.native
    def parse(data: js.typedarray.ArrayBuffer): BufferGeometry[NormalBufferAttributes] = js.native
    
    var propertyNameMapping: js.Object = js.native
    
    def setCustomPropertyNameMapping(mapping: Record[String, Any]): Unit = js.native
    
    def setPropertyNameMapping(mapping: js.Object): Unit = js.native
  }
}
