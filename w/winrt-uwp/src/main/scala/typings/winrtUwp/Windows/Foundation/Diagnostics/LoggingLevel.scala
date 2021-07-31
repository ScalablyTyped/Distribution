package typings.winrtUwp.Windows.Foundation.Diagnostics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LoggingLevel extends StObject
/** Specifies the severity level of an event. */
@JSGlobal("Windows.Foundation.Diagnostics.LoggingLevel")
@js.native
object LoggingLevel extends StObject {
  
  /** Log only critical messages. */
  @js.native
  sealed trait critical
    extends StObject
       with LoggingLevel
  
  /** Log messages of error level and higher. */
  @js.native
  sealed trait error
    extends StObject
       with LoggingLevel
  
  /** Log messages of information level and higher. */
  @js.native
  sealed trait information
    extends StObject
       with LoggingLevel
  
  /** Log all messages. */
  @js.native
  sealed trait verbose
    extends StObject
       with LoggingLevel
  
  /** Log messages of warning level and higher. */
  @js.native
  sealed trait warning
    extends StObject
       with LoggingLevel
}
