package typings.webcola

import typings.webcola.descentMod.Descent
import typings.webcola.rectangleMod.GraphNode
import typings.webcola.rectangleMod.Rectangle
import typings.webcola.vpscMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    var links: js.Array[Link3D] = js.native
    var nodes: js.Array[Node3D] = js.native
    var result: js.Array[js.Array[Double]] = js.native
    var useJaccardLinkLengths: Boolean = js.native
    def linkLength(l: Link3D): Double = js.native
    def start(): Layout3D = js.native
    def start(iterations: Double): Layout3D = js.native
    def tick(): Double = js.native
  }
  
  @js.native
  class Link3D protected () extends js.Object {
    def this(source: Double, target: Double) = this()
    var length: Double = js.native
    var source: Double = js.native
    var target: Double = js.native
    def actualLength(x: js.Array[js.Array[Double]]): Double = js.native
  }
  
  @js.native
  class Node3D () extends GraphNode {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    /* CompleteClass */
    override var bounds: Rectangle = js.native
    /* CompleteClass */
    override var fixed: Boolean = js.native
    /* CompleteClass */
    override var height: Double = js.native
    /* CompleteClass */
    override var px: Double = js.native
    /* CompleteClass */
    override var py: Double = js.native
    /* CompleteClass */
    override var variable: Variable = js.native
    /* CompleteClass */
    override var width: Double = js.native
    /* CompleteClass */
    override var x: Double = js.native
    /* CompleteClass */
    override var y: Double = js.native
    var z: Double = js.native
  }
  
  /* static members */
  @js.native
  object Layout3D extends js.Object {
    var dims: js.Array[String] = js.native
    var k: Double = js.native
  }
  
}

