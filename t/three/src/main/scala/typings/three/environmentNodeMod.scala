package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object environmentNodeMod {
  
  @JSImport("three/examples/jsm/nodes/lighting/EnvironmentNode", JSImport.Default)
  @js.native
  open class default () extends EnvironmentNode {
    def this(envNode: typings.three.nodeMod.default) = this()
  }
  
  @js.native
  trait EnvironmentNode
    extends typings.three.lightingNodeMod.default {
    
    var envNode: typings.three.nodeMod.default | Null = js.native
  }
}
