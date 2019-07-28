package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskAgentPoolMaintenanceScheduleDays extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentPoolMaintenanceScheduleDays")
@js.native
object TaskAgentPoolMaintenanceScheduleDays extends js.Object {
  /**
    * Run on all days of the week.
    */
  @js.native
  sealed trait All extends TaskAgentPoolMaintenanceScheduleDays
  
  /**
    * Run on Friday.
    */
  @js.native
  sealed trait Friday extends TaskAgentPoolMaintenanceScheduleDays
  
  /**
    * Run on Monday.
    */
  @js.native
  sealed trait Monday extends TaskAgentPoolMaintenanceScheduleDays
  
  /**
    * Do not run.
    */
  @js.native
  sealed trait None extends TaskAgentPoolMaintenanceScheduleDays
  
  /**
    * Run on Saturday.
    */
  @js.native
  sealed trait Saturday extends TaskAgentPoolMaintenanceScheduleDays
  
  /**
    * Run on Sunday.
    */
  @js.native
  sealed trait Sunday extends TaskAgentPoolMaintenanceScheduleDays
  
  /**
    * Run on Thursday.
    */
  @js.native
  sealed trait Thursday extends TaskAgentPoolMaintenanceScheduleDays
  
  /**
    * Run on Tuesday.
    */
  @js.native
  sealed trait Tuesday extends TaskAgentPoolMaintenanceScheduleDays
  
  /**
    * Run on Wednesday.
    */
  @js.native
  sealed trait Wednesday extends TaskAgentPoolMaintenanceScheduleDays
  
  /* 127 */ val All: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.All with Double = js.native
  /* 16 */ val Friday: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Friday with Double = js.native
  /* 1 */ val Monday: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Monday with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.None with Double = js.native
  /* 32 */ val Saturday: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Saturday with Double = js.native
  /* 64 */ val Sunday: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Sunday with Double = js.native
  /* 8 */ val Thursday: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Thursday with Double = js.native
  /* 2 */ val Tuesday: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Tuesday with Double = js.native
  /* 4 */ val Wednesday: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Wednesday with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolMaintenanceScheduleDays with Double] = js.native
}

