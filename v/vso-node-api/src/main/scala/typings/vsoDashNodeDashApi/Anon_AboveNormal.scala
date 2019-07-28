package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AboveNormal extends js.Object {
  var aboveNormal: Double
  var belowNormal: Double
  var high: Double
  var low: Double
  var normal: Double
}

object Anon_AboveNormal {
  @scala.inline
  def apply(aboveNormal: Double, belowNormal: Double, high: Double, low: Double, normal: Double): Anon_AboveNormal = {
    val __obj = js.Dynamic.literal(aboveNormal = aboveNormal, belowNormal = belowNormal, high = high, low = low, normal = normal)
  
    __obj.asInstanceOf[Anon_AboveNormal]
  }
}

