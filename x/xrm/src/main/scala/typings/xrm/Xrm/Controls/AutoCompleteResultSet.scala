package typings.xrm.Xrm.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for showAutoComplete argument
  */
@js.native
trait AutoCompleteResultSet extends js.Object {
  
  /**
    * Command to show/execute at the bottom of the results displayed
    */
  var commands: js.UndefOr[AutoCompleteCommand] = js.native
  
  /**
    * Results to show
    */
  var results: js.Array[AutoCompleteResult] = js.native
}
object AutoCompleteResultSet {
  
  @scala.inline
  def apply(results: js.Array[AutoCompleteResult]): AutoCompleteResultSet = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteResultSet]
  }
  
  @scala.inline
  implicit class AutoCompleteResultSetOps[Self <: AutoCompleteResultSet] (val x: Self) extends AnyVal {
    
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
    def setResultsVarargs(value: AutoCompleteResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[AutoCompleteResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommands(value: AutoCompleteCommand): Self = this.set("commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommands: Self = this.set("commands", js.undefined)
  }
}
