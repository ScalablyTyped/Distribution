package typings.three

import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreCacheNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/CacheNode", JSImport.Default)
  @js.native
  open class default protected () extends CacheNode {
    def this(node: typings.three.examplesJsmNodesCoreNodeMod.default) = this()
    def this(
      node: typings.three.examplesJsmNodesCoreNodeMod.default,
      cache: typings.three.examplesJsmNodesCoreNodeCacheMod.default
    ) = this()
  }
  
  @js.native
  trait CacheNode
    extends typings.three.examplesJsmNodesCoreNodeMod.default {
    
    var cache: typings.three.examplesJsmNodesCoreNodeCacheMod.default = js.native
    
    var isCacheNode: `true` = js.native
    
    var node: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
  }
}
