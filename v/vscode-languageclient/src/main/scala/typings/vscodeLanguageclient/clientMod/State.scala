package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait State extends StObject
@JSImport("vscode-languageclient/lib/common/client", "State")
@js.native
object State extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[State & Double] = js.native
  
  /**
    * The client is running and ready.
    */
  @js.native
  sealed trait Running
    extends StObject
       with State
  /* 2 */ val Running: typings.vscodeLanguageclient.clientMod.State.Running & Double = js.native
  
  /**
    * The client is starting but not ready yet.
    */
  @js.native
  sealed trait Starting
    extends StObject
       with State
  /* 3 */ val Starting: typings.vscodeLanguageclient.clientMod.State.Starting & Double = js.native
  
  /**
    * The client is stopped or got never started.
    */
  @js.native
  sealed trait Stopped
    extends StObject
       with State
  /* 1 */ val Stopped: typings.vscodeLanguageclient.clientMod.State.Stopped & Double = js.native
}
