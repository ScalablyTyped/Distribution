package typings.three

import typings.three.examplesJsmNodesLoadersNodeLoaderMod.NodeLoaderResult
import typings.three.srcThreeMod.MaterialLoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesLoadersNodeMaterialLoaderMod {
  
  @JSImport("three/examples/jsm/nodes/loaders/NodeMaterialLoader", JSImport.Default)
  @js.native
  open class default () extends NodeMaterialLoader
  
  @js.native
  trait NodeMaterialLoader extends MaterialLoader {
    
    var nodes: NodeLoaderResult = js.native
    
    def setNodes(value: NodeLoaderResult): this.type = js.native
  }
}
