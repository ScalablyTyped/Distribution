package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.GateStatus.Failed
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.GateStatus.InProgress
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.GateStatus.None
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.GateStatus.Pending
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.GateStatus.Succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GateStatus extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "GateStatus")
@js.native
object GateStatus extends js.Object {
  @js.native
  sealed trait Failed extends GateStatus
  
  @js.native
  sealed trait InProgress extends GateStatus
  
  @js.native
  sealed trait None extends GateStatus
  
  @js.native
  sealed trait Pending extends GateStatus
  
  @js.native
  sealed trait Succeeded extends GateStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GateStatus with Double] = js.native
  /* 8 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /* 2 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Pending extends TopLevel[Pending with Double]
  
  /* 4 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
}

