package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.examplesJsmLoadersMtlloaderMod.MTLLoader.MaterialCreator
import typings.three.srcThreeMod.Group
import typings.three.srcThreeMod.Loader
import typings.three.srcThreeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersObjloaderMod {
  
  @JSImport("three/examples/jsm/loaders/OBJLoader", "OBJLoader")
  @js.native
  open class OBJLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* group */ Group, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* group */ Group, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* group */ Group, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* group */ Group, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def loadAsync(url: String): js.Promise[Group] = js.native
    def loadAsync(url: String, onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]): js.Promise[Group] = js.native
    
    var materials: MaterialCreator = js.native
    
    def parse(data: String): Group = js.native
    
    def setMaterials(materials: MaterialCreator): this.type = js.native
  }
}
