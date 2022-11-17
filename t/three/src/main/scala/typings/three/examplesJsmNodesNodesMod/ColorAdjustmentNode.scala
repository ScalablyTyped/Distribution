package typings.three.examplesJsmNodesNodesMod

import typings.three.examplesJsmNodesDisplayColorAdjustmentNodeMod.ColorAdjustmentMethod
import typings.three.examplesJsmNodesDisplayColorAdjustmentNodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/nodes/Nodes", "ColorAdjustmentNode")
@js.native
open class ColorAdjustmentNode protected () extends default {
  def this(method: ColorAdjustmentMethod, colorNode: Node) = this()
  def this(method: ColorAdjustmentMethod, colorNode: Node, adjustmentNode: Node) = this()
}
/* static members */
object ColorAdjustmentNode {
  
  @JSImport("three/examples/jsm/nodes/Nodes", "ColorAdjustmentNode")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/examples/jsm/nodes/Nodes", "ColorAdjustmentNode.HUE")
  @js.native
  def HUE: "hue" = js.native
  inline def HUE_=(x: "hue"): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HUE")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "ColorAdjustmentNode.SATURATION")
  @js.native
  def SATURATION: "saturation" = js.native
  inline def SATURATION_=(x: "saturation"): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SATURATION")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "ColorAdjustmentNode.VIBRANCE")
  @js.native
  def VIBRANCE: "vibrance" = js.native
  inline def VIBRANCE_=(x: "vibrance"): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIBRANCE")(x.asInstanceOf[js.Any])
}
