package typings.three

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcThreeMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesAccessorsObject3DNodeMod {
  
  @JSImport("three/examples/jsm/nodes/accessors/Object3DNode", JSImport.Default)
  @js.native
  open class default () extends Object3DNode {
    def this(scope: Object3DNodeScope) = this()
    def this(scope: Unit, object3d: Object3D[Event]) = this()
    def this(scope: Object3DNodeScope, object3d: Object3D[Event]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("three/examples/jsm/nodes/accessors/Object3DNode", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/nodes/accessors/Object3DNode", "default.NORMAL_MATRIX")
    @js.native
    def NORMAL_MATRIX: "normalMatrix" = js.native
    inline def NORMAL_MATRIX_=(x: "normalMatrix"): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NORMAL_MATRIX")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/accessors/Object3DNode", "default.POSITION")
    @js.native
    def POSITION: "position" = js.native
    inline def POSITION_=(x: "position"): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSITION")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/accessors/Object3DNode", "default.VIEW_MATRIX")
    @js.native
    def VIEW_MATRIX: "viewMatrix" = js.native
    inline def VIEW_MATRIX_=(x: "viewMatrix"): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW_MATRIX")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/accessors/Object3DNode", "default.VIEW_POSITION")
    @js.native
    def VIEW_POSITION: "viewPosition" = js.native
    inline def VIEW_POSITION_=(x: "viewPosition"): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW_POSITION")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/accessors/Object3DNode", "default.WORLD_MATRIX")
    @js.native
    def WORLD_MATRIX: "worldMatrix" = js.native
    inline def WORLD_MATRIX_=(x: "worldMatrix"): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WORLD_MATRIX")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Object3DNode
    extends typings.three.examplesJsmNodesCoreNodeMod.default {
    
    var object3d: Object3D[Event] | Null = js.native
    
    var scope: Object3DNodeScope = js.native
  }
  
  type Object3DNodeScope = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Object3DNode.VIEW_MATRIX */ Any
}
