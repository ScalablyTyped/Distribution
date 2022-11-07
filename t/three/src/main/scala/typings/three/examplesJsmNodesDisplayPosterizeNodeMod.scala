package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesDisplayPosterizeNodeMod {
  
  @JSImport("three/examples/jsm/nodes/display/PosterizeNode", JSImport.Default)
  @js.native
  open class default protected () extends PosterizeNode {
    def this(
      sourceNode: typings.three.examplesJsmNodesCoreNodeMod.default,
      stepsNode: typings.three.examplesJsmNodesCoreNodeMod.default
    ) = this()
  }
  
  @js.native
  trait PosterizeNode
    extends typings.three.examplesJsmNodesCoreNodeMod.default {
    
    var sourceNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var stepsNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
  }
}
