package typings.webcola

import typings.webcola.distSrcDescentMod.Descent
import typings.webcola.distSrcRectangleMod.GraphNode
import typings.webcola.distSrcRectangleMod.Rectangle
import typings.webcola.distSrcVpscMod.Variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcLayout3dMod {
  
  @JSImport("webcola/dist/src/layout3d", "Layout3D")
  @js.native
  open class Layout3D protected () extends StObject {
    def this(nodes: js.Array[Node3D], links: js.Array[Link3D]) = this()
    def this(nodes: js.Array[Node3D], links: js.Array[Link3D], idealLinkLength: Double) = this()
    
    var constraints: js.Array[Any] = js.native
    
    var descent: Descent = js.native
    
    var idealLinkLength: Double = js.native
    
    def linkLength(l: Link3D): Double = js.native
    
    var links: js.Array[Link3D] = js.native
    
    var nodes: js.Array[Node3D] = js.native
    
    var result: js.Array[js.Array[Double]] = js.native
    
    def start(): Layout3D = js.native
    def start(iterations: Double): Layout3D = js.native
    
    def tick(): Double = js.native
    
    var useJaccardLinkLengths: Boolean = js.native
  }
  /* static members */
  object Layout3D {
    
    @JSImport("webcola/dist/src/layout3d", "Layout3D")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webcola/dist/src/layout3d", "Layout3D.dims")
    @js.native
    def dims: js.Array[String] = js.native
    inline def dims_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dims")(x.asInstanceOf[js.Any])
    
    @JSImport("webcola/dist/src/layout3d", "Layout3D.k")
    @js.native
    def k: Double = js.native
    inline def k_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("k")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("webcola/dist/src/layout3d", "Link3D")
  @js.native
  open class Link3D protected () extends StObject {
    def this(source: Double, target: Double) = this()
    
    def actualLength(x: js.Array[js.Array[Double]]): Double = js.native
    
    var length: Double = js.native
    
    var source: Double = js.native
    
    var target: Double = js.native
  }
  
  @JSImport("webcola/dist/src/layout3d", "Node3D")
  @js.native
  open class Node3D ()
    extends StObject
       with GraphNode {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Unit, z: Double) = this()
    def this(x: Unit, y: Double, z: Double) = this()
    def this(x: Unit, y: Unit, z: Double) = this()
    
    /* CompleteClass */
    var bounds: Rectangle = js.native
    
    /* CompleteClass */
    var fixed: Boolean = js.native
    
    /* CompleteClass */
    var height: Double = js.native
    
    /* CompleteClass */
    var px: Double = js.native
    
    /* CompleteClass */
    var py: Double = js.native
    
    /* CompleteClass */
    var variable: Variable = js.native
    
    /* CompleteClass */
    var width: Double = js.native
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
    
    var z: Double = js.native
  }
}
