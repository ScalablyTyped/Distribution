package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentsQueryType.FailingSince
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentsQueryType.Regular
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentsQueryType with Double] = js.native
  /* 2 */ @js.native
  object FailingSince extends TopLevel[FailingSince with Double]
  
  /* 1 */ @js.native
  object Regular extends TopLevel[Regular with Double]
  
}

