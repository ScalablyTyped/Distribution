package typings
package sylvesterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  var Line: sylvesterLib.SylvesterNs.LineStatic = js.native
  var Matrix: sylvesterLib.SylvesterNs.MatrixStatic = js.native
  var Plane: sylvesterLib.SylvesterNs.PlaneStatic = js.native
  var Vector: sylvesterLib.SylvesterNs.VectorStatic = js.native
  /**
  * Constructor function.
  *
  * @param Array<number>|Vector anchor The anchor vector.
  * @param Array<number>|Vector direction The direction vector.
  */
  @JSName("$L")
  def $L(anchor: js.Array[scala.Double], direction: js.Array[scala.Double]): sylvesterLib.Line = js.native
  @JSName("$L")
  def $L(anchor: js.Array[scala.Double], direction: sylvesterLib.Vector): sylvesterLib.Line = js.native
  @JSName("$L")
  def $L(anchor: sylvesterLib.Vector, direction: js.Array[scala.Double]): sylvesterLib.Line = js.native
  @JSName("$L")
  def $L(anchor: sylvesterLib.Vector, direction: sylvesterLib.Vector): sylvesterLib.Line = js.native
  /**
  * Constructor function.
  *
  * @param {Array<number>|Array<Array<number>>|Vector|Matrix} elements The elements.
  */
  @JSName("$M")
  def $M(elements: js.Array[js.Array[scala.Double] | scala.Double]): sylvesterLib.Matrix = js.native
  @JSName("$M")
  def $M(elements: sylvesterLib.Matrix): sylvesterLib.Matrix = js.native
  @JSName("$M")
  def $M(elements: sylvesterLib.Vector): sylvesterLib.Matrix = js.native
  /**
  * Constructor function.
  *
  * @param {Array<number>|Vector} anchor The anchor vector.
  * @param {Array<number>|Vector} normal The normal vector.
  */
  @JSName("$P")
  def $P(anchor: js.Array[scala.Double], normal: js.Array[scala.Double]): sylvesterLib.Plane = js.native
  @JSName("$P")
  def $P(anchor: js.Array[scala.Double], normal: sylvesterLib.Vector): sylvesterLib.Plane = js.native
  /**
    * Constructor function.
    *
    * @param {Array<number>|Vector} anchor The anchor vector.
    * @param {Array<number>|Vector} v1 The first direction vector.
    * @param {Array<number>|Vecotr} v2 The second direction vector.
    */
  @JSName("$P")
  def $P(anchor: js.Array[scala.Double], v1: js.Array[scala.Double], v2: js.Array[scala.Double]): sylvesterLib.Plane = js.native
  @JSName("$P")
  def $P(anchor: js.Array[scala.Double], v1: js.Array[scala.Double], v2: sylvesterLib.Vector): sylvesterLib.Plane = js.native
  @JSName("$P")
  def $P(anchor: js.Array[scala.Double], v1: sylvesterLib.Vector, v2: js.Array[scala.Double]): sylvesterLib.Plane = js.native
  @JSName("$P")
  def $P(anchor: js.Array[scala.Double], v1: sylvesterLib.Vector, v2: sylvesterLib.Vector): sylvesterLib.Plane = js.native
  @JSName("$P")
  def $P(anchor: sylvesterLib.Vector, normal: js.Array[scala.Double]): sylvesterLib.Plane = js.native
  @JSName("$P")
  def $P(anchor: sylvesterLib.Vector, normal: sylvesterLib.Vector): sylvesterLib.Plane = js.native
  @JSName("$P")
  def $P(anchor: sylvesterLib.Vector, v1: js.Array[scala.Double], v2: js.Array[scala.Double]): sylvesterLib.Plane = js.native
  @JSName("$P")
  def $P(anchor: sylvesterLib.Vector, v1: js.Array[scala.Double], v2: sylvesterLib.Vector): sylvesterLib.Plane = js.native
  @JSName("$P")
  def $P(anchor: sylvesterLib.Vector, v1: sylvesterLib.Vector, v2: js.Array[scala.Double]): sylvesterLib.Plane = js.native
  @JSName("$P")
  def $P(anchor: sylvesterLib.Vector, v1: sylvesterLib.Vector, v2: sylvesterLib.Vector): sylvesterLib.Plane = js.native
  @JSName("$V")
  def $V(elements: js.Array[scala.Double]): sylvesterLib.Vector = js.native
  /**
  * Constructor function.
  *
  * @param {Vector|Array<number} elements The elements.
  */
  @JSName("$V")
  def $V(elements: sylvesterLib.Vector): sylvesterLib.Vector = js.native
}

