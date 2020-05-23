package typings.winrtUwp.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result to the application that launched the current application for results. */
trait ProtocolForResultsOperation extends js.Object {
  /**
    * Indicates that the application activated for results is ready to return to the application that launched it for results.
    * @param data The data to return to the application that activated this app.
    */
  def reportCompleted(data: ValueSet): Unit
}

object ProtocolForResultsOperation {
  @scala.inline
  def apply(reportCompleted: ValueSet => Unit): ProtocolForResultsOperation = {
    val __obj = js.Dynamic.literal(reportCompleted = js.Any.fromFunction1(reportCompleted))
    __obj.asInstanceOf[ProtocolForResultsOperation]
  }
}

