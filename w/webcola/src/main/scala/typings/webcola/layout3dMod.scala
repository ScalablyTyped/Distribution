package typings.webcola

import typings.webcola.descentMod.Descent
import typings.webcola.rectangleMod.GraphNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola/dist/src/layout3d", JSImport.Namespace)
@js.native
object layout3dMod extends js.Object {
  
  @js.native
  class Layout3D protected () extends js.Object {
    def this(nodes: js.Array[Node3D], links: js.Array[Link3D]) = this()
    def this(nodes: js.Array[Node3D], links: js.Array[Link3D], idealLinkLength: Double) = this()
    
    var constraints: js.Array[_] = js.native
    
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
  @js.native
  object Layout3D extends js.Object {
    
    var dims: js.Array[String] = js.native
    
    var k: Double = js.native
  }
  
  @js.native
  class Link3D protected () extends js.Object {
    def this(source: Double, target: Double) = this()
    
    def actualLength(x: js.Array[js.Array[Double]]): Double = js.native
    
    var length: Double = js.native
    
    var source: Double = js.native
    
    var target: Double = js.native
  }
  
  @js.native
  class Node3D () extends GraphNode {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    
    var z: Double = js.native
  }
}
