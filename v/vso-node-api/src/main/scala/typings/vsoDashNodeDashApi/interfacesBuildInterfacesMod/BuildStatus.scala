package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuildStatus extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildStatus")
@js.native
object BuildStatus extends js.Object {
  /**
    * All status.
    */
  @js.native
  sealed trait All extends BuildStatus
  
  /**
    * The build is cancelling
    */
  @js.native
  sealed trait Cancelling extends BuildStatus
  
  /**
    * The build has completed.
    */
  @js.native
  sealed trait Completed extends BuildStatus
  
  /**
    * The build is currently in progress.
    */
  @js.native
  sealed trait InProgress extends BuildStatus
  
  /**
    * No status.
    */
  @js.native
  sealed trait None extends BuildStatus
  
  /**
    * The build has not yet started.
    */
  @js.native
  sealed trait NotStarted extends BuildStatus
  
  /**
    * The build is inactive in the queue.
    */
  @js.native
  sealed trait Postponed extends BuildStatus
  
  /* 47 */ val All: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildStatus.All with Double = js.native
  /* 4 */ val Cancelling: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildStatus.Cancelling with Double = js.native
  /* 2 */ val Completed: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildStatus.Completed with Double = js.native
  /* 1 */ val InProgress: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildStatus.InProgress with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildStatus.None with Double = js.native
  /* 32 */ val NotStarted: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildStatus.NotStarted with Double = js.native
  /* 8 */ val Postponed: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildStatus.Postponed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildStatus with Double] = js.native
}

