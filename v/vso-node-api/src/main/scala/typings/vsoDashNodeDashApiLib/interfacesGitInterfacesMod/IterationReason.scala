package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IterationReason extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "IterationReason")
@js.native
object IterationReason extends js.Object {
  @js.native
  sealed trait Create
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.IterationReason
  
  @js.native
  sealed trait ForcePush
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.IterationReason
  
  @js.native
  sealed trait Push
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.IterationReason
  
  @js.native
  sealed trait Rebase
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.IterationReason
  
  @js.native
  sealed trait Unknown
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.IterationReason
  
  /* 2 */ val Create: Create with scala.Double = js.native
  /* 1 */ val ForcePush: ForcePush with scala.Double = js.native
  /* 0 */ val Push: Push with scala.Double = js.native
  /* 4 */ val Rebase: Rebase with scala.Double = js.native
  /* 8 */ val Unknown: Unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.IterationReason with scala.Double
  ] = js.native
}

