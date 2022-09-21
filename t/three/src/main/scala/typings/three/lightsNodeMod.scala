package typings.three

import typings.three.anon.Instantiable
import typings.three.anon.InstantiableDefault
import typings.three.threeMod.Light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightsNodeMod {
  
  @JSImport("three/examples/jsm/nodes/lighting/LightsNode", JSImport.Default)
  @js.native
  open class default () extends LightsNode {
    def this(lightNodes: js.Array[typings.three.lightingNodeMod.default]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("three/examples/jsm/nodes/lighting/LightsNode", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def setReference[T /* <: Light */](lightClass: Instantiable[T], lightNodeClass: InstantiableDefault[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setReference")(lightClass.asInstanceOf[js.Any], lightNodeClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @js.native
  trait LightsNode
    extends typings.three.nodeMod.default {
    
    def fromLights(lights: js.Array[Light]): this.type = js.native
    
    def getLightNodeByHash(hash: String): typings.three.lightingNodeMod.default | Null = js.native
    
    def hasLight: Boolean = js.native
    
    var lightNodes: js.Array[typings.three.lightingNodeMod.default] = js.native
  }
}
