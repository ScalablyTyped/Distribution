package typings.winrtUwp.Windows.Media.DialProtocol

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DialAppState extends js.Object

/** The state of the application on the remote device. */
@JSGlobal("Windows.Media.DialProtocol.DialAppState")
@js.native
object DialAppState extends js.Object {
  /** An error occurred while attempting to retrieve the state. */
  @js.native
  sealed trait networkFailure extends DialAppState
  
  /** The app is running on the remote device. */
  @js.native
  sealed trait running extends DialAppState
  
  /** The app is stopped on the remote device. */
  @js.native
  sealed trait stopped extends DialAppState
  
  /** The state cannot be determined. */
  @js.native
  sealed trait unknown extends DialAppState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DialAppState with Double] = js.native
  /* 3 */ @js.native
  object networkFailure extends TopLevel[networkFailure with Double]
  
  /* 2 */ @js.native
  object running extends TopLevel[running with Double]
  
  /* 1 */ @js.native
  object stopped extends TopLevel[stopped with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

