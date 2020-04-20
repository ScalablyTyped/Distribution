package typings.wxServerSdk.mod

import typings.wxServerSdk.AnonTotal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountCollectionResult extends js.Object {
  var stats: AnonTotal
}

object CountCollectionResult {
  @scala.inline
  def apply(stats: AnonTotal): CountCollectionResult = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountCollectionResult]
  }
}

