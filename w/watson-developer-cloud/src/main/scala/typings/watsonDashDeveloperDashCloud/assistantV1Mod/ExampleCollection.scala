package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ExampleCollection. */
trait ExampleCollection extends js.Object {
  /** An array of objects describing the examples defined for the intent. */
  var examples: js.Array[Example]
  /** The pagination data for the returned objects. */
  var pagination: Pagination
}

object ExampleCollection {
  @scala.inline
  def apply(examples: js.Array[Example], pagination: Pagination): ExampleCollection = {
    val __obj = js.Dynamic.literal(examples = examples.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExampleCollection]
  }
}

