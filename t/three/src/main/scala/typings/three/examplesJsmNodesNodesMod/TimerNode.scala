package typings.three.examplesJsmNodesNodesMod

import typings.three.examplesJsmNodesUtilsTimerNodeMod.TimerNodeScope
import typings.three.examplesJsmNodesUtilsTimerNodeMod.default
import typings.three.threeStrings.delta
import typings.three.threeStrings.frame
import typings.three.threeStrings.global
import typings.three.threeStrings.local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/nodes/Nodes", "TimerNode")
@js.native
open class TimerNode () extends default {
  def this(scope: TimerNodeScope) = this()
  def this(scope: Unit, scale: Double) = this()
  def this(scope: TimerNodeScope, scale: Double) = this()
  def this(scope: Unit, scale: Double, value: Double) = this()
  def this(scope: Unit, scale: Unit, value: Double) = this()
  def this(scope: TimerNodeScope, scale: Double, value: Double) = this()
  def this(scope: TimerNodeScope, scale: Unit, value: Double) = this()
}
/* static members */
object TimerNode {
  
  @JSImport("three/examples/jsm/nodes/Nodes", "TimerNode")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/examples/jsm/nodes/Nodes", "TimerNode.DELTA")
  @js.native
  def DELTA: delta = js.native
  inline def DELTA_=(x: delta): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELTA")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "TimerNode.FRAME")
  @js.native
  def FRAME: frame = js.native
  inline def FRAME_=(x: frame): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAME")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "TimerNode.GLOBAL")
  @js.native
  def GLOBAL: global = js.native
  inline def GLOBAL_=(x: global): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GLOBAL")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "TimerNode.LOCAL")
  @js.native
  def LOCAL: local = js.native
  inline def LOCAL_=(x: local): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCAL")(x.asInstanceOf[js.Any])
}
