package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IterationReason extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "IterationReason")
@js.native
object IterationReason extends js.Object {
  @js.native
  sealed trait Create extends IterationReason
  
  @js.native
  sealed trait ForcePush extends IterationReason
  
  @js.native
  sealed trait Push extends IterationReason
  
  @js.native
  sealed trait Rebase extends IterationReason
  
  @js.native
  sealed trait Unknown extends IterationReason
  
  /* 2 */ val Create: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.IterationReason.Create with Double = js.native
  /* 1 */ val ForcePush: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.IterationReason.ForcePush with Double = js.native
  /* 0 */ val Push: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.IterationReason.Push with Double = js.native
  /* 4 */ val Rebase: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.IterationReason.Rebase with Double = js.native
  /* 8 */ val Unknown: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.IterationReason.Unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IterationReason with Double] = js.native
}

