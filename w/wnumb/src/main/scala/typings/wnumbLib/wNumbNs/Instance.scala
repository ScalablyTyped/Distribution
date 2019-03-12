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
  def apply(from: java.lang.String => scala.Double, to: scala.Double => java.lang.String): Instance = {
    val __obj = js.Dynamic.literal(from = js.Any.fromFunction1(from), to = js.Any.fromFunction1(to))
  
    __obj.asInstanceOf[Instance]
  }
}

