package typings.three

import typings.three.threeStrings.geometry
import typings.three.threeStrings.local
import typings.three.threeStrings.view
import typings.three.threeStrings.world
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesAccessorsBitangentNodeMod {
  
  @JSImport("three/examples/jsm/nodes/accessors/BitangentNode", JSImport.Default)
  @js.native
  open class default () extends BitangentNode {
    def this(scope: BitangentNodeScope) = this()
  }
  /* static members */
  object default {
    
    @JSImport("three/examples/jsm/nodes/accessors/BitangentNode", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/nodes/accessors/BitangentNode", "default.GEOMETRY")
    @js.native
    def GEOMETRY: geometry = js.native
    inline def GEOMETRY_=(x: geometry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GEOMETRY")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/accessors/BitangentNode", "default.LOCAL")
    @js.native
    def LOCAL: local = js.native
    inline def LOCAL_=(x: local): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCAL")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/accessors/BitangentNode", "default.VIEW")
    @js.native
    def VIEW: view = js.native
    inline def VIEW_=(x: view): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/accessors/BitangentNode", "default.WORLD")
    @js.native
    def WORLD: world = js.native
    inline def WORLD_=(x: world): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WORLD")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait BitangentNode
    extends typings.three.examplesJsmNodesCoreNodeMod.default {
    
    var scope: BitangentNodeScope = js.native
  }
  
  type BitangentNodeScope = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BitangentNode.LOCAL */ Any
}
