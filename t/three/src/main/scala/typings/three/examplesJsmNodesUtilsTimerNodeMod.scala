package typings.three

import typings.three.threeStrings.delta
import typings.three.threeStrings.frame
import typings.three.threeStrings.local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesUtilsTimerNodeMod {
  
  @JSImport("three/examples/jsm/nodes/utils/TimerNode", JSImport.Default)
  @js.native
  open class default () extends TimerNode {
    def this(scope: TimerNodeScope) = this()
    def this(scope: Unit, scale: Double) = this()
    def this(scope: TimerNodeScope, scale: Double) = this()
    def this(scope: Unit, scale: Double, value: Double) = this()
    def this(scope: Unit, scale: Unit, value: Double) = this()
    def this(scope: TimerNodeScope, scale: Double, value: Double) = this()
    def this(scope: TimerNodeScope, scale: Unit, value: Double) = this()
  }
  /* static members */
  object default {
    
    @JSImport("three/examples/jsm/nodes/utils/TimerNode", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/nodes/utils/TimerNode", "default.DELTA")
    @js.native
    def DELTA: delta = js.native
    inline def DELTA_=(x: delta): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELTA")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/utils/TimerNode", "default.FRAME")
    @js.native
    def FRAME: frame = js.native
    inline def FRAME_=(x: frame): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAME")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/utils/TimerNode", "default.GLOBAL")
    @js.native
    def GLOBAL: typings.three.threeStrings.global = js.native
    inline def GLOBAL_=(x: typings.three.threeStrings.global): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GLOBAL")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/utils/TimerNode", "default.LOCAL")
    @js.native
    def LOCAL: local = js.native
    inline def LOCAL_=(x: local): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCAL")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait TimerNode
    extends typings.three.examplesJsmNodesCoreUniformNodeMod.default {
    
    var scale: Double = js.native
    
    var scope: TimerNodeScope = js.native
  }
  
  type TimerNodeScope = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TimerNode.LOCAL */ Any
}
