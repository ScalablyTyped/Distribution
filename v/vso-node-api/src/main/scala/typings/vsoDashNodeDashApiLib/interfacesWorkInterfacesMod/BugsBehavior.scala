package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BugsBehavior extends js.Object

@JSImport("vso-node-api/interfaces/WorkInterfaces", "BugsBehavior")
@js.native
object BugsBehavior extends js.Object {
  @js.native
  sealed trait AsRequirements
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BugsBehavior
  
  @js.native
  sealed trait AsTasks
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BugsBehavior
  
  @js.native
  sealed trait Off
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BugsBehavior
  
  /* 1 */ val AsRequirements: AsRequirements with scala.Double = js.native
  /* 2 */ val AsTasks: AsTasks with scala.Double = js.native
  /* 0 */ val Off: Off with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BugsBehavior with scala.Double] = js.native
}

