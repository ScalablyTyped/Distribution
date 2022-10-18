package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuildStatus extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildStatus")
@js.native
object BuildStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildStatus & Double] = js.native
  
  /**
    * All status.
    */
  @js.native
  sealed trait All
    extends StObject
       with BuildStatus
  /* 47 */ val All: typings.vsoNodeApi.interfacesBuildInterfacesMod.BuildStatus.All & Double = js.native
  
  /**
    * The build is cancelling
    */
  @js.native
  sealed trait Cancelling
    extends StObject
       with BuildStatus
  /* 4 */ val Cancelling: typings.vsoNodeApi.interfacesBuildInterfacesMod.BuildStatus.Cancelling & Double = js.native
  
  /**
    * The build has completed.
    */
  @js.native
  sealed trait Completed
    extends StObject
       with BuildStatus
  /* 2 */ val Completed: typings.vsoNodeApi.interfacesBuildInterfacesMod.BuildStatus.Completed & Double = js.native
  
  /**
    * The build is currently in progress.
    */
  @js.native
  sealed trait InProgress
    extends StObject
       with BuildStatus
  /* 1 */ val InProgress: typings.vsoNodeApi.interfacesBuildInterfacesMod.BuildStatus.InProgress & Double = js.native
  
  /**
    * No status.
    */
  @js.native
  sealed trait None
    extends StObject
       with BuildStatus
  /* 0 */ val None: typings.vsoNodeApi.interfacesBuildInterfacesMod.BuildStatus.None & Double = js.native
  
  /**
    * The build has not yet started.
    */
  @js.native
  sealed trait NotStarted
    extends StObject
       with BuildStatus
  /* 32 */ val NotStarted: typings.vsoNodeApi.interfacesBuildInterfacesMod.BuildStatus.NotStarted & Double = js.native
  
  /**
    * The build is inactive in the queue.
    */
  @js.native
  sealed trait Postponed
    extends StObject
       with BuildStatus
  /* 8 */ val Postponed: typings.vsoNodeApi.interfacesBuildInterfacesMod.BuildStatus.Postponed & Double = js.native
}
