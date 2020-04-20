package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** LogCollection. */
trait LogCollection extends js.Object {
  /** An array of objects describing log events. */
  var logs: js.Array[Log]
  /** The pagination data for the returned objects. */
  var pagination: LogPagination
}

object LogCollection {
  @scala.inline
  def apply(logs: js.Array[Log], pagination: LogPagination): LogCollection = {
    val __obj = js.Dynamic.literal(logs = logs.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogCollection]
  }
}

