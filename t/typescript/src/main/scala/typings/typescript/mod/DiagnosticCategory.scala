package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DiagnosticCategory extends js.Object

@JSImport("typescript", "DiagnosticCategory")
@js.native
object DiagnosticCategory extends js.Object {
  @js.native
  sealed trait Error extends DiagnosticCategory
  
  @js.native
  sealed trait Message extends DiagnosticCategory
  
  @js.native
  sealed trait Suggestion extends DiagnosticCategory
  
  @js.native
  sealed trait Warning extends DiagnosticCategory
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DiagnosticCategory with Double] = js.native
  /* 1 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 3 */ @js.native
  object Message extends TopLevel[Message with Double]
  
  /* 2 */ @js.native
  object Suggestion extends TopLevel[Suggestion with Double]
  
  /* 0 */ @js.native
  object Warning extends TopLevel[Warning with Double]
  
}

