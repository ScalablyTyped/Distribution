package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BugsBehavior extends js.Object

@JSImport("vso-node-api/interfaces/WorkInterfaces", "BugsBehavior")
@js.native
object BugsBehavior extends js.Object {
  @js.native
  sealed trait AsRequirements extends BugsBehavior
  
  @js.native
  sealed trait AsTasks extends BugsBehavior
  
  @js.native
  sealed trait Off extends BugsBehavior
  
  /* 1 */ val AsRequirements: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BugsBehavior.AsRequirements with Double = js.native
  /* 2 */ val AsTasks: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BugsBehavior.AsTasks with Double = js.native
  /* 0 */ val Off: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BugsBehavior.Off with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BugsBehavior with Double] = js.native
}

