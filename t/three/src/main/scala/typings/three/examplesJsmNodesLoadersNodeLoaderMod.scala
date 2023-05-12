package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.examplesJsmNodesCoreConstantsMod.AnyJson
import typings.three.examplesJsmNodesNodesMod.Node
import typings.three.srcThreeMod.Loader
import typings.three.srcThreeMod.LoadingManager
import typings.three.srcThreeMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesLoadersNodeLoaderMod {
  
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
    
    def loadAsync(url: String): js.Promise[NodeLoaderResult] = js.native
    def loadAsync(url: String, onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]): js.Promise[NodeLoaderResult] = js.native
    
    def parse(json: AnyJson): Node = js.native
    
    def parseNodes(json: AnyJson): NodeLoaderResult = js.native
    
    def setTextures(textures: StringDictionary[Texture]): this.type = js.native
  }
  
  type NodeLoaderResult = StringDictionary[Node]
}
