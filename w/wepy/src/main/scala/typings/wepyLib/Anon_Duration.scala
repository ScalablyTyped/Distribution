package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var duration: scala.Double
  var height: scala.Double
  var size: scala.Double
  var tempFilePath: java.lang.String
  var width: scala.Double
}

object Anon_Duration {
  @scala.inline
  def apply(
    duration: scala.Double,
    height: scala.Double,
    size: scala.Double,
    tempFilePath: java.lang.String,
    width: scala.Double
  ): Anon_Duration = {
    val __obj = js.Dynamic.literal(duration = duration, height = height, size = size, tempFilePath = tempFilePath, width = width)
  
    __obj.asInstanceOf[Anon_Duration]
  }
}

