package typings
package sylvesterLib.SylvesterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorStatic extends js.Object {
  var i: sylvesterLib.Vector = js.native
  var j: sylvesterLib.Vector = js.native
  var k: sylvesterLib.Vector = js.native
  /**
    * Random vector of size n.
    *
    * @param {number} n The vector size.
    */
  def Random(n: scala.Double): sylvesterLib.Vector = js.native
  /**
    * Vector filled with zeros.
    *
    * @param {number} n The vector size.
    */
  def Zero(n: scala.Double): sylvesterLib.Vector = js.native
  def create(elements: js.Array[scala.Double]): sylvesterLib.Vector = js.native
  /**
    * Constructor function.
    */
  def create(elements: sylvesterLib.Vector): sylvesterLib.Vector = js.native
}

