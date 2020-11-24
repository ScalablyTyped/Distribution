package typings.winrtUwp.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result to the application that launched the current application for results. */
@js.native
trait ProtocolForResultsOperation extends js.Object {
  
  /**
    * Indicates that the application activated for results is ready to return to the application that launched it for results.
    * @param data The data to return to the application that activated this app.
    */
  def reportCompleted(data: ValueSet): Unit = js.native
}
object ProtocolForResultsOperation {
  
  @scala.inline
  def apply(reportCompleted: ValueSet => Unit): ProtocolForResultsOperation = {
    val __obj = js.Dynamic.literal(reportCompleted = js.Any.fromFunction1(reportCompleted))
    __obj.asInstanceOf[ProtocolForResultsOperation]
  }
  
  @scala.inline
  implicit class ProtocolForResultsOperationOps[Self <: ProtocolForResultsOperation] (val x: Self) extends AnyVal {
    
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
    def setReportCompleted(value: ValueSet => Unit): Self = this.set("reportCompleted", js.Any.fromFunction1(value))
  }
}
