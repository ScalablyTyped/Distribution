package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdUnitId extends js.Object {
  /**
    * 广告单元 id
    */
  var adUnitId: String
}

object AdUnitId {
  @scala.inline
  def apply(adUnitId: String): AdUnitId = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdUnitId]
  }
}

