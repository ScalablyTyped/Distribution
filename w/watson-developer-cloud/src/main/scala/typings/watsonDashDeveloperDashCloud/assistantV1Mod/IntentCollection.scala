package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IntentCollection. */
trait IntentCollection extends js.Object {
  /** An array of objects describing the intents defined for the workspace. */
  var intents: js.Array[Intent]
  /** The pagination data for the returned objects. */
  var pagination: Pagination
}

object IntentCollection {
  @scala.inline
  def apply(intents: js.Array[Intent], pagination: Pagination): IntentCollection = {
    val __obj = js.Dynamic.literal(intents = intents, pagination = pagination)
  
    __obj.asInstanceOf[IntentCollection]
  }
}

