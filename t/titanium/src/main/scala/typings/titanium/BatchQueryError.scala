package typings.titanium

import typings.titanium.Titanium.Database.ResultSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple `Error` instance thrown from the
  * [executeAll](Titanium.Database.DB.executeAll) method in case of failure
  */
@js.native
trait BatchQueryError extends StObject {
  
  /**
    * Index of the failed query
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * partial `ResultSet`s of any successful queries before the failure
    */
  var results: js.UndefOr[js.Array[ResultSet]] = js.native
}
object BatchQueryError {
  
  @scala.inline
  def apply(): BatchQueryError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchQueryError]
  }
  
  @scala.inline
  implicit class BatchQueryErrorMutableBuilder[Self <: BatchQueryError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[ResultSet]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: ResultSet*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
