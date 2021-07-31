package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskAgentPoolMaintenanceScheduleDays extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentPoolMaintenanceScheduleDays")
@js.native
object TaskAgentPoolMaintenanceScheduleDays extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolMaintenanceScheduleDays & Double] = js.native
  
  /**
    * Run on all days of the week.
    */
  @js.native
  sealed trait All
    extends StObject
       with TaskAgentPoolMaintenanceScheduleDays
  /* 127 */ val All: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.All & Double = js.native
  
  /**
    * Run on Friday.
    */
  @js.native
  sealed trait Friday
    extends StObject
       with TaskAgentPoolMaintenanceScheduleDays
  /* 16 */ val Friday: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Friday & Double = js.native
  
  /**
    * Run on Monday.
    */
  @js.native
  sealed trait Monday
    extends StObject
       with TaskAgentPoolMaintenanceScheduleDays
  /* 1 */ val Monday: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Monday & Double = js.native
  
  /**
    * Do not run.
    */
  @js.native
  sealed trait None
    extends StObject
       with TaskAgentPoolMaintenanceScheduleDays
  /* 0 */ val None: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.None & Double = js.native
  
  /**
    * Run on Saturday.
    */
  @js.native
  sealed trait Saturday
    extends StObject
       with TaskAgentPoolMaintenanceScheduleDays
  /* 32 */ val Saturday: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Saturday & Double = js.native
  
  /**
    * Run on Sunday.
    */
  @js.native
  sealed trait Sunday
    extends StObject
       with TaskAgentPoolMaintenanceScheduleDays
  /* 64 */ val Sunday: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Sunday & Double = js.native
  
  /**
    * Run on Thursday.
    */
  @js.native
  sealed trait Thursday
    extends StObject
       with TaskAgentPoolMaintenanceScheduleDays
  /* 8 */ val Thursday: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Thursday & Double = js.native
  
  /**
    * Run on Tuesday.
    */
  @js.native
  sealed trait Tuesday
    extends StObject
       with TaskAgentPoolMaintenanceScheduleDays
  /* 2 */ val Tuesday: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Tuesday & Double = js.native
  
  /**
    * Run on Wednesday.
    */
  @js.native
  sealed trait Wednesday
    extends StObject
       with TaskAgentPoolMaintenanceScheduleDays
  /* 4 */ val Wednesday: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Wednesday & Double = js.native
}
