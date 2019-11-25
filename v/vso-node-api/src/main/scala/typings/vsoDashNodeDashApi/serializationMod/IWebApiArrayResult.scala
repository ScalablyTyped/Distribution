package typings.vsoDashNodeDashApi.serializationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebApiArrayResult extends js.Object {
  var count: Double
  var value: js.Array[_]
}

object IWebApiArrayResult {
  @scala.inline
  def apply(count: Double, value: js.Array[_]): IWebApiArrayResult = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IWebApiArrayResult]
  }
}

