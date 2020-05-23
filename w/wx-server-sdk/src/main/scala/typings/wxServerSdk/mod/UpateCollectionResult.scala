package typings.wxServerSdk.mod

import typings.wxServerSdk.anon.Updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpateCollectionResult extends js.Object {
  var stats: Updated
}

object UpateCollectionResult {
  @scala.inline
  def apply(stats: Updated): UpateCollectionResult = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpateCollectionResult]
  }
}

