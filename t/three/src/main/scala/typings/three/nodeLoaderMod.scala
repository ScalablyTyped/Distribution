package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.constantsMod.AnyJson
import typings.three.nodesMod.Node
import typings.three.threeMod.Loader
import typings.three.threeMod.LoadingManager
import typings.three.threeMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeLoaderMod {
  
  @JSImport("three/examples/jsm/nodes/loaders/NodeLoader", JSImport.Default)
  @js.native
  open class default () extends NodeLoader {
    def this(manager: LoadingManager) = this()
  }
  
  @js.native
  trait NodeLoader extends Loader {
    
    def load(url: String, onLoad: js.Function1[/* gltf */ NodeLoaderResult, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* gltf */ NodeLoaderResult, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* gltf */ NodeLoaderResult, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* gltf */ NodeLoaderResult, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(json: AnyJson): Node = js.native
    
    def parseNodes(json: AnyJson): NodeLoaderResult = js.native
    
    def setTextures(textures: StringDictionary[Texture]): this.type = js.native
  }
  
  type NodeLoaderResult = StringDictionary[Node]
}
