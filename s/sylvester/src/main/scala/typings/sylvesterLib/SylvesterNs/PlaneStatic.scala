package typings
package sylvesterLib.SylvesterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaneStatic extends js.Object {
  var XY: sylvesterLib.Plane = js.native
  var YX: sylvesterLib.Plane = js.native
  var YZ: sylvesterLib.Plane = js.native
  var ZX: sylvesterLib.Plane = js.native
  /**
    * Constructor function.
    */
  def create(anchor: js.Array[scala.Double], normal: js.Array[scala.Double]): sylvesterLib.Plane = js.native
  def create(anchor: js.Array[scala.Double], normal: sylvesterLib.Vector): sylvesterLib.Plane = js.native
  /**
    * Constructor function.
    */
  def create(anchor: js.Array[scala.Double], v1: js.Array[scala.Double], v2: js.Array[scala.Double]): sylvesterLib.Plane = js.native
  def create(anchor: js.Array[scala.Double], v1: js.Array[scala.Double], v2: sylvesterLib.Vector): sylvesterLib.Plane = js.native
  def create(anchor: js.Array[scala.Double], v1: sylvesterLib.Vector, v2: js.Array[scala.Double]): sylvesterLib.Plane = js.native
  def create(anchor: js.Array[scala.Double], v1: sylvesterLib.Vector, v2: sylvesterLib.Vector): sylvesterLib.Plane = js.native
  def create(anchor: sylvesterLib.Vector, normal: js.Array[scala.Double]): sylvesterLib.Plane = js.native
  def create(anchor: sylvesterLib.Vector, normal: sylvesterLib.Vector): sylvesterLib.Plane = js.native
  def create(anchor: sylvesterLib.Vector, v1: js.Array[scala.Double], v2: js.Array[scala.Double]): sylvesterLib.Plane = js.native
  def create(anchor: sylvesterLib.Vector, v1: js.Array[scala.Double], v2: sylvesterLib.Vector): sylvesterLib.Plane = js.native
  def create(anchor: sylvesterLib.Vector, v1: sylvesterLib.Vector, v2: js.Array[scala.Double]): sylvesterLib.Plane = js.native
  def create(anchor: sylvesterLib.Vector, v1: sylvesterLib.Vector, v2: sylvesterLib.Vector): sylvesterLib.Plane = js.native
}

