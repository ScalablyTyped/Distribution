package typings.xrm.Xrm.Controls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for showAutoComplete argument
  */
trait AutoCompleteResultSet extends StObject {
  
  /**
    * Command to show/execute at the bottom of the results displayed
    */
  var commands: js.UndefOr[AutoCompleteCommand] = js.undefined
  
  /**
    * Results to show
    */
  var results: js.Array[AutoCompleteResult]
}
object AutoCompleteResultSet {
  
  inline def apply(results: js.Array[AutoCompleteResult]): AutoCompleteResultSet = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteResultSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoCompleteResultSet] (val x: Self) extends AnyVal {
    
    inline def setCommands(value: AutoCompleteCommand): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    inline def setResults(value: js.Array[AutoCompleteResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: AutoCompleteResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
