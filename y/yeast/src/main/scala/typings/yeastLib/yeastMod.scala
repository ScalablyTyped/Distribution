package typings
package yeastLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yeast", JSImport.Namespace)
@js.native
object yeastMod extends js.Object {
  /**
    * Yeast: A tiny growing id generator.
    */
  def apply(): java.lang.String = js.native
  /**
  	 * Return the integer value specified by the given string.
  	 */
  def decode(str: java.lang.String): scala.Double = js.native
  /**
  	 * Return a string representing the specified number.
  	 */
  def encode(num: scala.Double): java.lang.String = js.native
}

