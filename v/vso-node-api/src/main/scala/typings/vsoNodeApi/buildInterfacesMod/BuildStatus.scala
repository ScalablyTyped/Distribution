package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuildStatus extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildStatus")
@js.native
object BuildStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildStatus with Double] = js.native
  
  /**
    * All status.
    */
  @js.native
  sealed trait All extends BuildStatus
  /* 47 */ val All: typings.vsoNodeApi.buildInterfacesMod.BuildStatus.All with Double = js.native
  
  /**
    * The build is cancelling
    */
  @js.native
  sealed trait Cancelling extends BuildStatus
  /* 4 */ val Cancelling: typings.vsoNodeApi.buildInterfacesMod.BuildStatus.Cancelling with Double = js.native
  
  /**
    * The build has completed.
    */
  @js.native
  sealed trait Completed extends BuildStatus
  /* 2 */ val Completed: typings.vsoNodeApi.buildInterfacesMod.BuildStatus.Completed with Double = js.native
  
  /**
    * The build is currently in progress.
    */
  @js.native
  sealed trait InProgress extends BuildStatus
  /* 1 */ val InProgress: typings.vsoNodeApi.buildInterfacesMod.BuildStatus.InProgress with Double = js.native
  
  /**
    * No status.
    */
  @js.native
  sealed trait None extends BuildStatus
  /* 0 */ val None: typings.vsoNodeApi.buildInterfacesMod.BuildStatus.None with Double = js.native
  
  /**
    * The build has not yet started.
    */
  @js.native
  sealed trait NotStarted extends BuildStatus
  /* 32 */ val NotStarted: typings.vsoNodeApi.buildInterfacesMod.BuildStatus.NotStarted with Double = js.native
  
  /**
    * The build is inactive in the queue.
    */
  @js.native
  sealed trait Postponed extends BuildStatus
  /* 8 */ val Postponed: typings.vsoNodeApi.buildInterfacesMod.BuildStatus.Postponed with Double = js.native
}
