package typings.yeast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yeast", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Yeast: A tiny growing id generator.
    */
  def apply(): String = js.native
  /**
    * Return the integer value specified by the given string.
    */
  def decode(str: String): Double = js.native
  /**
    * Return a string representing the specified number.
    */
  def encode(num: Double): String = js.native
}

