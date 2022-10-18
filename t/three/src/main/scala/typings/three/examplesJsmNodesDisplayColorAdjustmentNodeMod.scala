package typings.three

import typings.three.examplesJsmNodesNodesMod.Node
import typings.three.threeStrings.hue
import typings.three.threeStrings.saturation
import typings.three.threeStrings.vibrance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesDisplayColorAdjustmentNodeMod {
  
  @JSImport("three/examples/jsm/nodes/display/ColorAdjustmentNode", JSImport.Default)
  @js.native
  open class default protected () extends ColorAdjustmentNode {
    def this(method: ColorAdjustmentMethod, colorNode: Node) = this()
    def this(method: ColorAdjustmentMethod, colorNode: Node, adjustmentNode: Node) = this()
  }
  /* static members */
  object default {
    
    @JSImport("three/examples/jsm/nodes/display/ColorAdjustmentNode", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/nodes/display/ColorAdjustmentNode", "default.HUE")
    @js.native
    def HUE: hue = js.native
    inline def HUE_=(x: hue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HUE")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/display/ColorAdjustmentNode", "default.SATURATION")
    @js.native
    def SATURATION: saturation = js.native
    inline def SATURATION_=(x: saturation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SATURATION")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/display/ColorAdjustmentNode", "default.VIBRANCE")
    @js.native
    def VIBRANCE: vibrance = js.native
    inline def VIBRANCE_=(x: vibrance): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIBRANCE")(x.asInstanceOf[js.Any])
  }
  
  type ColorAdjustmentMethod = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorAdjustmentNode.SATURATION */ Any
  
  @js.native
  trait ColorAdjustmentNode
    extends typings.three.examplesJsmNodesCoreTempNodeMod.default {
    
    var adjustmentNode: Node = js.native
    
    var colorNode: Node = js.native
    
    var method: ColorAdjustmentMethod = js.native
  }
}
