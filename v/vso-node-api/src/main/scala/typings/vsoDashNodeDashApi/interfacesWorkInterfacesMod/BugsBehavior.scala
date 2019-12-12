package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BugsBehavior.AsRequirements
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BugsBehavior.AsTasks
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BugsBehavior.Off
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BugsBehavior with Double] = js.native
  /* 1 */ @js.native
  object AsRequirements extends TopLevel[AsRequirements with Double]
  
  /* 2 */ @js.native
  object AsTasks extends TopLevel[AsTasks with Double]
  
  /* 0 */ @js.native
  object Off extends TopLevel[Off with Double]
  
}

