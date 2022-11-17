package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesUtilsOscNodeMod {
  
  @JSImport("three/examples/jsm/nodes/utils/OscNode", JSImport.Default)
  @js.native
  open class default protected () extends OscNode {
    def this(method: OscNodeMethod) = this()
    def this(method: OscNodeMethod, timeNode: typings.three.examplesJsmNodesCoreNodeMod.default) = this()
  }
  /* static members */
  object default {
    
    @JSImport("three/examples/jsm/nodes/utils/OscNode", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/nodes/utils/OscNode", "default.SAWTOOTH")
    @js.native
    def SAWTOOTH: "sawtooth" = js.native
    inline def SAWTOOTH_=(x: "sawtooth"): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SAWTOOTH")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/utils/OscNode", "default.SINE")
    @js.native
    def SINE: "sine" = js.native
    inline def SINE_=(x: "sine"): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SINE")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/utils/OscNode", "default.SQUARE")
    @js.native
    def SQUARE: "square" = js.native
    inline def SQUARE_=(x: "square"): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SQUARE")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/utils/OscNode", "default.TRIANGLE")
    @js.native
    def TRIANGLE: "triangle" = js.native
    inline def TRIANGLE_=(x: "triangle"): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRIANGLE")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait OscNode
    extends typings.three.examplesJsmNodesCoreNodeMod.default {
    
    var method: OscNodeMethod = js.native
    
    var timeNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
  }
  
  type OscNodeMethod = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OscNode.SINE */ Any
}
