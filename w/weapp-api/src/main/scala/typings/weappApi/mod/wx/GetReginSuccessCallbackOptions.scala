package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReginSuccessCallbackOptions extends js.Object {
  //  东北角经纬度
  var northeast: Double
  //  西南角经纬度
  var southwest: Double
}

object GetReginSuccessCallbackOptions {
  @scala.inline
  def apply(northeast: Double, southwest: Double): GetReginSuccessCallbackOptions = {
    val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetReginSuccessCallbackOptions]
  }
}

