package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple `Error` argument provided to the callback from the
  * [executeAllAsync](Titanium.Database.DB.executeAllAsync) method in case of failure
  */
@js.native
trait PossibleBatchQueryError extends StObject {
  
  /**
    * Index of the failed query
    */
  var index: js.UndefOr[Double] = js.native
}
object PossibleBatchQueryError {
  
  @scala.inline
  def apply(): PossibleBatchQueryError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PossibleBatchQueryError]
  }
  
  @scala.inline
  implicit class PossibleBatchQueryErrorMutableBuilder[Self <: PossibleBatchQueryError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
