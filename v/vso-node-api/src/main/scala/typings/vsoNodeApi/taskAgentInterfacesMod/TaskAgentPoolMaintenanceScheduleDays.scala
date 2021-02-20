package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskAgentPoolMaintenanceScheduleDays extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentPoolMaintenanceScheduleDays")
@js.native
object TaskAgentPoolMaintenanceScheduleDays extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolMaintenanceScheduleDays with Double] = js.native
  
  /**
    * Run on all days of the week.
    */
  @js.native
  sealed trait All extends TaskAgentPoolMaintenanceScheduleDays
  /* 127 */ val All: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.All with Double = js.native
  
  /**
    * Run on Friday.
    */
  @js.native
  sealed trait Friday extends TaskAgentPoolMaintenanceScheduleDays
  /* 16 */ val Friday: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Friday with Double = js.native
  
  /**
    * Run on Monday.
    */
  @js.native
  sealed trait Monday extends TaskAgentPoolMaintenanceScheduleDays
  /* 1 */ val Monday: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Monday with Double = js.native
  
  /**
    * Do not run.
    */
  @js.native
  sealed trait None extends TaskAgentPoolMaintenanceScheduleDays
  /* 0 */ val None: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.None with Double = js.native
  
  /**
    * Run on Saturday.
    */
  @js.native
  sealed trait Saturday extends TaskAgentPoolMaintenanceScheduleDays
  /* 32 */ val Saturday: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Saturday with Double = js.native
  
  /**
    * Run on Sunday.
    */
  @js.native
  sealed trait Sunday extends TaskAgentPoolMaintenanceScheduleDays
  /* 64 */ val Sunday: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Sunday with Double = js.native
  
  /**
    * Run on Thursday.
    */
  @js.native
  sealed trait Thursday extends TaskAgentPoolMaintenanceScheduleDays
  /* 8 */ val Thursday: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Thursday with Double = js.native
  
  /**
    * Run on Tuesday.
    */
  @js.native
  sealed trait Tuesday extends TaskAgentPoolMaintenanceScheduleDays
  /* 2 */ val Tuesday: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Tuesday with Double = js.native
  
  /**
    * Run on Wednesday.
    */
  @js.native
  sealed trait Wednesday extends TaskAgentPoolMaintenanceScheduleDays
  /* 4 */ val Wednesday: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Wednesday with Double = js.native
}
