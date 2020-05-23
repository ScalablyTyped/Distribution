package typings.wxServerSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var _id: String | Double
  var stats: Created
}

object Id {
  @scala.inline
  def apply(_id: String | Double, stats: Created): Id = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

