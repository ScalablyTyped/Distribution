package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentStatus.All
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentStatus.Failed
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentStatus.InProgress
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentStatus.NotDeployed
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentStatus.PartiallySucceeded
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentStatus.Succeeded
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentStatus.Undefined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeploymentStatus extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentStatus")
@js.native
object DeploymentStatus extends js.Object {
  /**
    * The deployment status is all.
    */
  @js.native
  sealed trait All extends DeploymentStatus
  
  /**
    * The deployment status is failed.
    */
  @js.native
  sealed trait Failed extends DeploymentStatus
  
  /**
    * The deployment status is inprogress.
    */
  @js.native
  sealed trait InProgress extends DeploymentStatus
  
  /**
    * The deployment status is not deployed.
    */
  @js.native
  sealed trait NotDeployed extends DeploymentStatus
  
  /**
    * The deployment status is partiallysucceeded.
    */
  @js.native
  sealed trait PartiallySucceeded extends DeploymentStatus
  
  /**
    * The deployment status is succeeded.
    */
  @js.native
  sealed trait Succeeded extends DeploymentStatus
  
  /**
    * The deployment status is undefined.
    */
  @js.native
  sealed trait Undefined extends DeploymentStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentStatus with Double] = js.native
  /* 31 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 16 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /* 2 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  /* 1 */ @js.native
  object NotDeployed extends TopLevel[NotDeployed with Double]
  
  /* 8 */ @js.native
  object PartiallySucceeded extends TopLevel[PartiallySucceeded with Double]
  
  /* 4 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
  /* 0 */ @js.native
  object Undefined extends TopLevel[Undefined with Double]
  
}

