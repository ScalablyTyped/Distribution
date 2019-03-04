package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  var delay: scala.Double
  var duration: scala.Double
  var timingFunction: java.lang.String
  var transformOrigin: java.lang.String
}

object Anon_Delay {
  @scala.inline
  def apply(
    delay: scala.Double,
    duration: scala.Double,
    timingFunction: java.lang.String,
    transformOrigin: java.lang.String
  ): Anon_Delay = {
    val __obj = js.Dynamic.literal(delay = delay, duration = duration, timingFunction = timingFunction, transformOrigin = transformOrigin)
  
    __obj.asInstanceOf[Anon_Delay]
  }
}

