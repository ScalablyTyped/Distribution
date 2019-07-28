package typings.ydnDashDb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullTextSource extends js.Object {
  var keyPath: String
  var storeName: String
  var weight: js.UndefOr[Double] = js.undefined
}

object FullTextSource {
  @scala.inline
  def apply(keyPath: String, storeName: String, weight: Int | Double = null): FullTextSource = {
    val __obj = js.Dynamic.literal(keyPath = keyPath, storeName = storeName)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTextSource]
  }
}

