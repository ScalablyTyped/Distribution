package typings.sylvester

import typings.sylvester.SylvesterNs.LineStatic
import typings.sylvester.SylvesterNs.MatrixStatic
import typings.sylvester.SylvesterNs.PlaneStatic
import typings.sylvester.SylvesterNs.VectorStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  var Line: LineStatic = js.native
  var Matrix: MatrixStatic = js.native
  var Plane: PlaneStatic = js.native
  var Vector: VectorStatic = js.native
  /**
  * Constructor function.
  *
  * @param Array<number>|Vector anchor The anchor vector.
  * @param Array<number>|Vector direction The direction vector.
  */
  @JSName("$L")
  def $L(anchor: js.Array[Double], direction: js.Array[Double]): Line = js.native
  @JSName("$L")
  def $L(anchor: js.Array[Double], direction: Vector): Line = js.native
  @JSName("$L")
  def $L(anchor: Vector, direction: js.Array[Double]): Line = js.native
  @JSName("$L")
  def $L(anchor: Vector, direction: Vector): Line = js.native
  /**
  * Constructor function.
  *
  * @param {Array<number>|Array<Array<number>>|Vector|Matrix} elements The elements.
  */
  @JSName("$M")
  def $M(elements: js.Array[js.Array[Double] | Double]): Matrix = js.native
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
  def $P(anchor: js.Array[Double], normal: js.Array[Double]): Plane = js.native
  @JSName("$P")
  def $P(anchor: js.Array[Double], normal: Vector): Plane = js.native
  /**
    * Constructor function.
    *
    * @param {Array<number>|Vector} anchor The anchor vector.
    * @param {Array<number>|Vector} v1 The first direction vector.
    * @param {Array<number>|Vecotr} v2 The second direction vector.
    */
  @JSName("$P")
  def $P(anchor: js.Array[Double], v1: js.Array[Double], v2: js.Array[Double]): Plane = js.native
  @JSName("$P")
  def $P(anchor: js.Array[Double], v1: js.Array[Double], v2: Vector): Plane = js.native
  @JSName("$P")
  def $P(anchor: js.Array[Double], v1: Vector, v2: js.Array[Double]): Plane = js.native
  @JSName("$P")
  def $P(anchor: js.Array[Double], v1: Vector, v2: Vector): Plane = js.native
  @JSName("$P")
  def $P(anchor: Vector, normal: js.Array[Double]): Plane = js.native
  @JSName("$P")
  def $P(anchor: Vector, normal: Vector): Plane = js.native
  @JSName("$P")
  def $P(anchor: Vector, v1: js.Array[Double], v2: js.Array[Double]): Plane = js.native
  @JSName("$P")
  def $P(anchor: Vector, v1: js.Array[Double], v2: Vector): Plane = js.native
  @JSName("$P")
  def $P(anchor: Vector, v1: Vector, v2: js.Array[Double]): Plane = js.native
  @JSName("$P")
  def $P(anchor: Vector, v1: Vector, v2: Vector): Plane = js.native
  @JSName("$V")
  def $V(elements: js.Array[Double]): Vector = js.native
  /**
  * Constructor function.
  *
  * @param {Vector|Array<number} elements The elements.
  */
  @JSName("$V")
  def $V(elements: Vector): Vector = js.native
}

