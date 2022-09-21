package typings.three

import typings.three.threeStrings.geometry
import typings.three.threeStrings.local
import typings.three.threeStrings.view
import typings.three.threeStrings.viewDirection
import typings.three.threeStrings.world
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object positionNodeMod {
  
  @JSImport("three/examples/jsm/nodes/accessors/PositionNode", JSImport.Default)
  @js.native
  open class default () extends PositionNode {
    def this(scope: PositionNodeScope) = this()
  }
  /* static members */
  object default {
    
    @JSImport("three/examples/jsm/nodes/accessors/PositionNode", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/nodes/accessors/PositionNode", "default.GEOMETRY")
    @js.native
    def GEOMETRY: geometry = js.native
    inline def GEOMETRY_=(x: geometry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GEOMETRY")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/accessors/PositionNode", "default.LOCAL")
    @js.native
    def LOCAL: local = js.native
    inline def LOCAL_=(x: local): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCAL")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/accessors/PositionNode", "default.VIEW")
    @js.native
    def VIEW: view = js.native
    inline def VIEW_=(x: view): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/accessors/PositionNode", "default.VIEW_DIRECTION")
    @js.native
    def VIEW_DIRECTION: viewDirection = js.native
    inline def VIEW_DIRECTION_=(x: viewDirection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW_DIRECTION")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/accessors/PositionNode", "default.WORLD")
    @js.native
    def WORLD: world = js.native
    inline def WORLD_=(x: world): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WORLD")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PositionNode
    extends typings.three.nodeMod.default {
    
    var scope: PositionNodeScope = js.native
  }
  
  type PositionNodeScope = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PositionNode.GEOMETRY */ Any
}
