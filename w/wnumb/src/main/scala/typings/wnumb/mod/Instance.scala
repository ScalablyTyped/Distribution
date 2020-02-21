package typings.wnumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  /**
    * get number from formatted string
    */
  def from(`val`: String): Double
  /**
    * format to string
    */
  def to(`val`: Double): String
}

object Instance {
  @scala.inline
  def apply(from: String => Double, to: Double => String): Instance = {
    val __obj = js.Dynamic.literal(from = js.Any.fromFunction1(from), to = js.Any.fromFunction1(to))
  
    __obj.asInstanceOf[Instance]
  }
}

