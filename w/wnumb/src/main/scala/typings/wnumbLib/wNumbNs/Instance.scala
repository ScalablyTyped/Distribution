package typings
package wnumbLib.wNumbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  /**
    * get number from formatted string
    */
  def from(`val`: java.lang.String): scala.Double
  /**
    * format to string
    */
  def to(`val`: scala.Double): java.lang.String
}

object Instance {
  @scala.inline
  def apply(
    from: js.Function1[java.lang.String, scala.Double],
    to: js.Function1[scala.Double, java.lang.String]
  ): Instance = {
    val __obj = js.Dynamic.literal(from = from, to = to)
  
    __obj.asInstanceOf[Instance]
  }
}

