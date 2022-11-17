package typings.three.examplesJsmNodesNodesMod

import typings.three.examplesJsmNodesUtilsOscNodeMod.OscNodeMethod
import typings.three.examplesJsmNodesUtilsOscNodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/nodes/Nodes", "OscNode")
@js.native
open class OscNode protected () extends default {
  def this(method: OscNodeMethod) = this()
  def this(method: OscNodeMethod, timeNode: typings.three.examplesJsmNodesCoreNodeMod.default) = this()
}
/* static members */
object OscNode {
  
  @JSImport("three/examples/jsm/nodes/Nodes", "OscNode")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/examples/jsm/nodes/Nodes", "OscNode.SAWTOOTH")
  @js.native
  def SAWTOOTH: "sawtooth" = js.native
  inline def SAWTOOTH_=(x: "sawtooth"): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SAWTOOTH")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "OscNode.SINE")
  @js.native
  def SINE: "sine" = js.native
  inline def SINE_=(x: "sine"): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SINE")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "OscNode.SQUARE")
  @js.native
  def SQUARE: "square" = js.native
  inline def SQUARE_=(x: "square"): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SQUARE")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "OscNode.TRIANGLE")
  @js.native
  def TRIANGLE: "triangle" = js.native
  inline def TRIANGLE_=(x: "triangle"): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRIANGLE")(x.asInstanceOf[js.Any])
}
