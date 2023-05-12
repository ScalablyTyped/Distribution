package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.std.Record
import typings.three.srcThreeMod.Group
import typings.three.srcThreeMod.Loader
import typings.three.srcThreeMod.LoadingManager
import typings.three.srcThreeMod.Material
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersLdrawloaderMod {
  
  @JSImport("three/examples/jsm/loaders/LDrawLoader", "LDrawLoader")
  @js.native
  open class LDrawLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def addMaterial(material: Material): Unit = js.native
    
    var fileMap: Record[String, String] = js.native
    
    def getMaterial(colourCode: String): Material | Null = js.native
    
    def load(url: String, onLoad: js.Function1[/* data */ Group, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* data */ Group, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* data */ Group, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* data */ Group, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def loadAsync(url: String): js.Promise[Group] = js.native
    def loadAsync(url: String, onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]): js.Promise[Group] = js.native
    
    var materials: js.Array[Material] = js.native
    
    var materialsLibrary: Record[String, Material] = js.native
    
    def parse(text: String, path: String, onLoad: js.Function1[/* data */ Group, Unit]): Unit = js.native
    
    def preloadMaterials(url: String): js.Promise[Unit] = js.native
    
    def setFileMap(fileMap: Record[String, String]): Unit = js.native
    
    def setMaterials(materials: js.Array[Material]): Unit = js.native
    
    var smoothNormals: Boolean = js.native
  }
}
