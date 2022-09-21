package typings.three

import typings.three.threeMod.HemisphereLight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hemisphereLightNodeMod {
  
  @JSImport("three/examples/jsm/nodes/lighting/HemisphereLightNode", JSImport.Default)
  @js.native
  open class default () extends HemisphereLightNode {
    def this(light: HemisphereLight) = this()
  }
  
  @js.native
  trait HemisphereLightNode
    extends typings.three.analyticLightNodeMod.default[HemisphereLight] {
    
    var groundColorNode: typings.three.nodeMod.default = js.native
    
    var lightDirectionNode: typings.three.nodeMod.default = js.native
    
    var lightPositionNode: typings.three.object3DNodeMod.default = js.native
  }
}
