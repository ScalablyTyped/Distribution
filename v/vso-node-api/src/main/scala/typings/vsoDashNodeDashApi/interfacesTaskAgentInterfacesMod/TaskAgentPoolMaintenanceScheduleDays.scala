package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.All
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Friday
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Monday
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.None
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Saturday
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Sunday
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Thursday
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Tuesday
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Wednesday
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolMaintenanceScheduleDays with Double] = js.native
  /* 127 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 16 */ @js.native
  object Friday extends TopLevel[Friday with Double]
  
  /* 1 */ @js.native
  object Monday extends TopLevel[Monday with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 32 */ @js.native
  object Saturday extends TopLevel[Saturday with Double]
  
  /* 64 */ @js.native
  object Sunday extends TopLevel[Sunday with Double]
  
  /* 8 */ @js.native
  object Thursday extends TopLevel[Thursday with Double]
  
  /* 2 */ @js.native
  object Tuesday extends TopLevel[Tuesday with Double]
  
  /* 4 */ @js.native
  object Wednesday extends TopLevel[Wednesday with Double]
  
}

