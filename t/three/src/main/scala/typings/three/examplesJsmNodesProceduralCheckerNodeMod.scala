package typings.three

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesProceduralCheckerNodeMod {
  
  @JSImport("three/examples/jsm/nodes/procedural/CheckerNode", JSImport.Default)
  @js.native
  open class default () extends CheckerNode {
    def this(uvNode: Node) = this()
  }
  
  @js.native
  trait CheckerNode
    extends typings.three.examplesJsmNodesCoreTempNodeMod.default {
    
    var uvNode: Node = js.native
  }
}
