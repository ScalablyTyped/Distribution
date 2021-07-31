package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** CounterexampleCollection. */
trait CounterexampleCollection extends StObject {
  
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
  
  @scala.inline
  implicit class CounterexampleCollectionMutableBuilder[Self <: CounterexampleCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounterexamples(value: js.Array[Counterexample]): Self = StObject.set(x, "counterexamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterexamplesVarargs(value: Counterexample*): Self = StObject.set(x, "counterexamples", js.Array(value :_*))
    
    @scala.inline
    def setPagination(value: Pagination): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
  }
}
