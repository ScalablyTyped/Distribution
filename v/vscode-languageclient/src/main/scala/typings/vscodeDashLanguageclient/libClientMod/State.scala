package typings.vscodeDashLanguageclient.libClientMod

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
  
  /* 2 */ val Running: typings.vscodeDashLanguageclient.libClientMod.State.Running with Double = js.native
  /* 3 */ val Starting: typings.vscodeDashLanguageclient.libClientMod.State.Starting with Double = js.native
  /* 1 */ val Stopped: typings.vscodeDashLanguageclient.libClientMod.State.Stopped with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[State with Double] = js.native
}

