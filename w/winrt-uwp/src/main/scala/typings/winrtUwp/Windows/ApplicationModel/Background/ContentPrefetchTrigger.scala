package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the ability to run custom handlers when prefetching web resources. */
trait ContentPrefetchTrigger extends js.Object {
  /** Retrieves the time interval for prefetching web content. */
  var waitInterval: Double
}

object ContentPrefetchTrigger {
  @scala.inline
  def apply(waitInterval: Double): ContentPrefetchTrigger = {
    val __obj = js.Dynamic.literal(waitInterval = waitInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentPrefetchTrigger]
  }
}

