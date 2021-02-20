package typings.winrtUwp.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result to the application that launched the current application for results. */
@js.native
trait ProtocolForResultsOperation extends StObject {
  
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
  implicit class ProtocolForResultsOperationMutableBuilder[Self <: ProtocolForResultsOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReportCompleted(value: ValueSet => Unit): Self = StObject.set(x, "reportCompleted", js.Any.fromFunction1(value))
  }
}
