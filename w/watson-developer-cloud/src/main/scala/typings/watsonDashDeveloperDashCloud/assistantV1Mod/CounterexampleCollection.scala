package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** CounterexampleCollection. */
trait CounterexampleCollection extends js.Object {
  /** An array of objects describing the examples marked as irrelevant input. */
  var counterexamples: js.Array[Counterexample]
  /** The pagination data for the returned objects. */
  var pagination: Pagination
}

object CounterexampleCollection {
  @scala.inline
  def apply(counterexamples: js.Array[Counterexample], pagination: Pagination): CounterexampleCollection = {
    val __obj = js.Dynamic.literal(counterexamples = counterexamples.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CounterexampleCollection]
  }
}

