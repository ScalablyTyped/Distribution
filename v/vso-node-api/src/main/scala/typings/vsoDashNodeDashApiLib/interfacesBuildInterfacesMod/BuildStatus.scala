package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

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
  sealed trait All
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildStatus
  
  /**
    * The build is cancelling
    */
  @js.native
  sealed trait Cancelling
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildStatus
  
  /**
    * The build has completed.
    */
  @js.native
  sealed trait Completed
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildStatus
  
  /**
    * The build is currently in progress.
    */
  @js.native
  sealed trait InProgress
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildStatus
  
  /**
    * No status.
    */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildStatus
  
  /**
    * The build has not yet started.
    */
  @js.native
  sealed trait NotStarted
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildStatus
  
  /**
    * The build is inactive in the queue.
    */
  @js.native
  sealed trait Postponed
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildStatus
  
  /* 47 */ val All: All with scala.Double = js.native
  /* 4 */ val Cancelling: Cancelling with scala.Double = js.native
  /* 2 */ val Completed: Completed with scala.Double = js.native
  /* 1 */ val InProgress: InProgress with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 32 */ val NotStarted: NotStarted with scala.Double = js.native
  /* 8 */ val Postponed: Postponed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildStatus with scala.Double] = js.native
}

