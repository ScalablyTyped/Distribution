package typings.winrtDashUwp.Windows.Foundation.Diagnostics

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LoggingLevel extends js.Object

/** Specifies the severity level of an event. */
@JSGlobal("Windows.Foundation.Diagnostics.LoggingLevel")
@js.native
object LoggingLevel extends js.Object {
  /** Log only critical messages. */
  @js.native
  sealed trait critical extends LoggingLevel
  
  /** Log messages of error level and higher. */
  @js.native
  sealed trait error extends LoggingLevel
  
  /** Log messages of information level and higher. */
  @js.native
  sealed trait information extends LoggingLevel
  
  /** Log all messages. */
  @js.native
  sealed trait verbose extends LoggingLevel
  
  /** Log messages of warning level and higher. */
  @js.native
  sealed trait warning extends LoggingLevel
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LoggingLevel with Double] = js.native
  /* 4 */ @js.native
  object critical extends TopLevel[critical with Double]
  
  /* 3 */ @js.native
  object error extends TopLevel[error with Double]
  
  /* 1 */ @js.native
  object information extends TopLevel[information with Double]
  
  /* 0 */ @js.native
  object verbose extends TopLevel[verbose with Double]
  
  /* 2 */ @js.native
  object warning extends TopLevel[warning with Double]
  
}

