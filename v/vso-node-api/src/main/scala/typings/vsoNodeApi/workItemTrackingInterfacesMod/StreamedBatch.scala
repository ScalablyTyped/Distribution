package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamedBatch[T] extends js.Object {
  var continuationToken: String
  var isLastBatch: Boolean
  var nextLink: String
  var values: js.Array[T]
}

object StreamedBatch {
  @scala.inline
  def apply[T](continuationToken: String, isLastBatch: Boolean, nextLink: String, values: js.Array[T]): StreamedBatch[T] = {
    val __obj = js.Dynamic.literal(continuationToken = continuationToken.asInstanceOf[js.Any], isLastBatch = isLastBatch.asInstanceOf[js.Any], nextLink = nextLink.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StreamedBatch[T]]
  }
}

