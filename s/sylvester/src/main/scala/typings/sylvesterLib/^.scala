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
  def $L(anchor: js.Array[scala.Double], direction: js.Array[scala.Double]): Line = js.native
  @JSName("$L")
  def $L(anchor: js.Array[scala.Double], direction: Vector): Line = js.native
  @JSName("$L")
  def $L(anchor: Vector, direction: js.Array[scala.Double]): Line = js.native
  @JSName("$L")
  def $L(anchor: Vector, direction: Vector): Line = js.native
  /**
  * Constructor function.
  *
  * @param {Array<number>|Array<Array<number>>|Vector|Matrix} elements The elements.
  */
  @JSName("$M")
  def $M(elements: js.Array[js.Array[scala.Double] | scala.Double]): Matrix = js.native
  @JSName("$M")
  def $M(elements: Matrix): Matrix = js.native
  @JSName("$M")
  def $M(elements: Vector): Matrix = js.native
  /**
  * Constructor function.
  *
  * @param {Array<number>|Vector} anchor The anchor vector.
  * @param {Array<number>|Vector} normal The normal vector.
  */
  @JSName("$P")
  def $P(anchor: js.Array[scala.Double], normal: js.Array[scala.Double]): Plane = js.native
  @JSName("$P")
  def $P(anchor: js.Array[scala.Double], normal: Vector): Plane = js.native
  /**
    * Constructor function.
    *
    * @param {Array<number>|Vector} anchor The anchor vector.
    * @param {Array<number>|Vector} v1 The first direction vector.
    * @param {Array<number>|Vecotr} v2 The second direction vector.
    */
  @JSName("$P")
  def $P(anchor: js.Array[scala.Double], v1: js.Array[scala.Double], v2: js.Array[scala.Double]): Plane = js.native
  @JSName("$P")
  def $P(anchor: js.Array[scala.Double], v1: js.Array[scala.Double], v2: Vector): Plane = js.native
  @JSName("$P")
  def $P(anchor: js.Array[scala.Double], v1: Vector, v2: js.Array[scala.Double]): Plane = js.native
  @JSName("$P")
  def $P(anchor: js.Array[scala.Double], v1: Vector, v2: Vector): Plane = js.native
  @JSName("$P")
  def $P(anchor: Vector, normal: js.Array[scala.Double]): Plane = js.native
  @JSName("$P")
  def $P(anchor: Vector, normal: Vector): Plane = js.native
  @JSName("$P")
  def $P(anchor: Vector, v1: js.Array[scala.Double], v2: js.Array[scala.Double]): Plane = js.native
  @JSName("$P")
  def $P(anchor: Vector, v1: js.Array[scala.Double], v2: Vector): Plane = js.native
  @JSName("$P")
  def $P(anchor: Vector, v1: Vector, v2: js.Array[scala.Double]): Plane = js.native
  @JSName("$P")
  def $P(anchor: Vector, v1: Vector, v2: Vector): Plane = js.native
  @JSName("$V")
  def $V(elements: js.Array[scala.Double]): Vector = js.native
  /**
  * Constructor function.
  *
  * @param {Vector|Array<number} elements The elements.
  */
  @JSName("$V")
  def $V(elements: Vector): Vector = js.native
}

