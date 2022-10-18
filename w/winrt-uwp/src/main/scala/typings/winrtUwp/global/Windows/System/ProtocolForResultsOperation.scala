package typings.winrtUwp.global.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result to the application that launched the current application for results. */
/* note: abstract class */ @JSGlobal("Windows.System.ProtocolForResultsOperation")
@js.native
open class ProtocolForResultsOperation ()
  extends StObject
     with typings.winrtUwp.Windows.System.ProtocolForResultsOperation {
  
  /**
    * Indicates that the application activated for results is ready to return to the application that launched it for results.
    * @param data The data to return to the application that activated this app.
    */
  /* CompleteClass */
  override def reportCompleted(data: ValueSet): Unit = js.native
}
