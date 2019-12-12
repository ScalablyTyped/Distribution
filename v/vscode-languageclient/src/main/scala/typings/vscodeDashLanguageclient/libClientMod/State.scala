package typings.vscodeDashLanguageclient.libClientMod

import org.scalablytyped.runtime.TopLevel
import typings.vscodeDashLanguageclient.libClientMod.State.Running
import typings.vscodeDashLanguageclient.libClientMod.State.Starting
import typings.vscodeDashLanguageclient.libClientMod.State.Stopped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait State extends js.Object

@JSImport("vscode-languageclient/lib/client", "State")
@js.native
object State extends js.Object {
  @js.native
  sealed trait Running extends State
  
  @js.native
  sealed trait Starting extends State
  
  @js.native
  sealed trait Stopped extends State
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[State with Double] = js.native
  /* 2 */ @js.native
  object Running extends TopLevel[Running with Double]
  
  /* 3 */ @js.native
  object Starting extends TopLevel[Starting with Double]
  
  /* 1 */ @js.native
  object Stopped extends TopLevel[Stopped with Double]
  
}

