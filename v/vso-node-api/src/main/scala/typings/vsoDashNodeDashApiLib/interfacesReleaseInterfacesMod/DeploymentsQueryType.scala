package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeploymentsQueryType extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentsQueryType")
@js.native
object DeploymentsQueryType extends js.Object {
  @js.native
  sealed trait FailingSince
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentsQueryType
  
  @js.native
  sealed trait Regular
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentsQueryType
  
  /* 2 */ val FailingSince: FailingSince with scala.Double = js.native
  /* 1 */ val Regular: Regular with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentsQueryType with scala.Double
  ] = js.native
}

