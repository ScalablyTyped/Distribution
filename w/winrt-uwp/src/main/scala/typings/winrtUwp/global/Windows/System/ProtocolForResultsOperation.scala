package typings.winrtUwp.global.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result to the application that launched the current application for results. */
@JSGlobal("Windows.System.ProtocolForResultsOperation")
@js.native
abstract class ProtocolForResultsOperation ()
  extends typings.winrtUwp.Windows.System.ProtocolForResultsOperation {
  /**
    * Indicates that the application activated for results is ready to return to the application that launched it for results.
    * @param data The data to return to the application that activated this app.
    */
  /* CompleteClass */
  override def reportCompleted(data: ValueSet): Unit = js.native
}

