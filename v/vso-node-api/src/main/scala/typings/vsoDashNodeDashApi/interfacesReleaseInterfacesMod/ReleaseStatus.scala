package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseStatus.Abandoned
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseStatus.Active
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseStatus.Draft
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseStatus.Undefined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReleaseStatus extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseStatus")
@js.native
object ReleaseStatus extends js.Object {
  @js.native
  sealed trait Abandoned extends ReleaseStatus
  
  @js.native
  sealed trait Active extends ReleaseStatus
  
  @js.native
  sealed trait Draft extends ReleaseStatus
  
  @js.native
  sealed trait Undefined extends ReleaseStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseStatus with Double] = js.native
  /* 4 */ @js.native
  object Abandoned extends TopLevel[Abandoned with Double]
  
  /* 2 */ @js.native
  object Active extends TopLevel[Active with Double]
  
  /* 1 */ @js.native
  object Draft extends TopLevel[Draft with Double]
  
  /* 0 */ @js.native
  object Undefined extends TopLevel[Undefined with Double]
  
}

