package typings.xstate.interpreterMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InterpreterStatus extends js.Object
@JSImport("xstate/lib/interpreter", "InterpreterStatus")
@js.native
object InterpreterStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InterpreterStatus with Double] = js.native
  
  @js.native
  sealed trait NotStarted extends InterpreterStatus
  /* 0 */ @js.native
  object NotStarted extends TopLevel[NotStarted with Double]
  
  @js.native
  sealed trait Running extends InterpreterStatus
  /* 1 */ @js.native
  object Running extends TopLevel[Running with Double]
  
  @js.native
  sealed trait Stopped extends InterpreterStatus
  /* 2 */ @js.native
  object Stopped extends TopLevel[Stopped with Double]
}
