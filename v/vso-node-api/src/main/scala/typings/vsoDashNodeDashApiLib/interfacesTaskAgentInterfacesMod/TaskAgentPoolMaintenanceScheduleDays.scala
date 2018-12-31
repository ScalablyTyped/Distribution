package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

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
  sealed trait All
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays
  
  /**
    * Run on Friday.
    */
  @js.native
  sealed trait Friday
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays
  
  /**
    * Run on Monday.
    */
  @js.native
  sealed trait Monday
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays
  
  /**
    * Do not run.
    */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays
  
  /**
    * Run on Saturday.
    */
  @js.native
  sealed trait Saturday
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays
  
  /**
    * Run on Sunday.
    */
  @js.native
  sealed trait Sunday
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays
  
  /**
    * Run on Thursday.
    */
  @js.native
  sealed trait Thursday
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays
  
  /**
    * Run on Tuesday.
    */
  @js.native
  sealed trait Tuesday
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays
  
  /**
    * Run on Wednesday.
    */
  @js.native
  sealed trait Wednesday
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays
  
  /* 127 */ val All: All with scala.Double = js.native
  /* 16 */ val Friday: Friday with scala.Double = js.native
  /* 1 */ val Monday: Monday with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 32 */ val Saturday: Saturday with scala.Double = js.native
  /* 64 */ val Sunday: Sunday with scala.Double = js.native
  /* 8 */ val Thursday: Thursday with scala.Double = js.native
  /* 2 */ val Tuesday: Tuesday with scala.Double = js.native
  /* 4 */ val Wednesday: Wednesday with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays with scala.Double
  ] = js.native
}

