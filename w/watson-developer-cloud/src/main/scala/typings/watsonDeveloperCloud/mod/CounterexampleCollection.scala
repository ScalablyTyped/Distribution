package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** CounterexampleCollection. */
@js.native
trait CounterexampleCollection extends js.Object {
  /** An array of objects describing the examples marked as irrelevant input. */
  var counterexamples: js.Array[Counterexample] = js.native
  /** The pagination data for the returned objects. */
  var pagination: Pagination = js.native
}

object CounterexampleCollection {
  @scala.inline
  def apply(counterexamples: js.Array[Counterexample], pagination: Pagination): CounterexampleCollection = {
    val __obj = js.Dynamic.literal(counterexamples = counterexamples.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[CounterexampleCollection]
  }
  @scala.inline
  implicit class CounterexampleCollectionOps[Self <: CounterexampleCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCounterexamplesVarargs(value: Counterexample*): Self = this.set("counterexamples", js.Array(value :_*))
    @scala.inline
    def setCounterexamples(value: js.Array[Counterexample]): Self = this.set("counterexamples", value.asInstanceOf[js.Any])
    @scala.inline
    def setPagination(value: Pagination): Self = this.set("pagination", value.asInstanceOf[js.Any])
  }
  
}

