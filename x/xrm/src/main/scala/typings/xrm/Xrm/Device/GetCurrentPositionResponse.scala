package typings.xrm.Xrm.Device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for Xrm.Device.getCurrentPosition response
  */
trait GetCurrentPositionResponse extends js.Object {
  /**
    * Contains a set of geographic coordinates along with associated accuracy as well as a set of other optional attributes such as altitude and speed.
    */
  var coords: js.Any
  /**
    * Represents the time when the object was acquired and is represented as DOMTimeStamp.
    */
  var timestamp: Double
}

object GetCurrentPositionResponse {
  @scala.inline
  def apply(coords: js.Any, timestamp: Double): GetCurrentPositionResponse = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCurrentPositionResponse]
  }
}

