package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeploymentsQueryType extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentsQueryType")
@js.native
object DeploymentsQueryType extends js.Object {
  @js.native
  sealed trait FailingSince extends DeploymentsQueryType
  
  @js.native
  sealed trait Regular extends DeploymentsQueryType
  
  /* 2 */ val FailingSince: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentsQueryType.FailingSince with Double = js.native
  /* 1 */ val Regular: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentsQueryType.Regular with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentsQueryType with Double] = js.native
}

