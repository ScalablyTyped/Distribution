package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ValueCollection. */
trait ValueCollection extends js.Object {
  /** The pagination data for the returned objects. */
  var pagination: Pagination
  /** An array of entity values. */
  var values: js.Array[Value]
}

object ValueCollection {
  @scala.inline
  def apply(pagination: Pagination, values: js.Array[Value]): ValueCollection = {
    val __obj = js.Dynamic.literal(pagination = pagination.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValueCollection]
  }
}

