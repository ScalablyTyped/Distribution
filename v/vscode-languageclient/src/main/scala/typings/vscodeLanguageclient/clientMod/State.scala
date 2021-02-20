package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait State extends StObject
@JSImport("vscode-languageclient/lib/client", "State")
@js.native
object State extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[State with Double] = js.native
  
  @js.native
  sealed trait Running extends State
  /* 2 */ val Running: typings.vscodeLanguageclient.clientMod.State.Running with Double = js.native
  
  @js.native
  sealed trait Starting extends State
  /* 3 */ val Starting: typings.vscodeLanguageclient.clientMod.State.Starting with Double = js.native
  
  @js.native
  sealed trait Stopped extends State
  /* 1 */ val Stopped: typings.vscodeLanguageclient.clientMod.State.Stopped with Double = js.native
}
