package typings.wxServerSdk.mod

import typings.wxServerSdk.anon.Total
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountCollectionResult extends js.Object {
  var stats: Total
}

object CountCollectionResult {
  @scala.inline
  def apply(stats: Total): CountCollectionResult = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountCollectionResult]
  }
}

