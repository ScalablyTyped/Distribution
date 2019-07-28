package typings.sylvester.SylvesterNs

import typings.sylvester.Plane
import typings.sylvester.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaneStatic extends js.Object {
  var XY: Plane = js.native
  var YX: Plane = js.native
  var YZ: Plane = js.native
  var ZX: Plane = js.native
  /**
    * Constructor function.
    */
  def create(anchor: js.Array[Double], normal: js.Array[Double]): Plane = js.native
  def create(anchor: js.Array[Double], normal: Vector): Plane = js.native
  /**
    * Constructor function.
    */
  def create(anchor: js.Array[Double], v1: js.Array[Double], v2: js.Array[Double]): Plane = js.native
  def create(anchor: js.Array[Double], v1: js.Array[Double], v2: Vector): Plane = js.native
  def create(anchor: js.Array[Double], v1: Vector, v2: js.Array[Double]): Plane = js.native
  def create(anchor: js.Array[Double], v1: Vector, v2: Vector): Plane = js.native
  def create(anchor: Vector, normal: js.Array[Double]): Plane = js.native
  def create(anchor: Vector, normal: Vector): Plane = js.native
  def create(anchor: Vector, v1: js.Array[Double], v2: js.Array[Double]): Plane = js.native
  def create(anchor: Vector, v1: js.Array[Double], v2: Vector): Plane = js.native
  def create(anchor: Vector, v1: Vector, v2: js.Array[Double]): Plane = js.native
  def create(anchor: Vector, v1: Vector, v2: Vector): Plane = js.native
}

