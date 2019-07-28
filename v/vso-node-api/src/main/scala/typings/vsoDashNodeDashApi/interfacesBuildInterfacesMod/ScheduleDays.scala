package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScheduleDays extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "ScheduleDays")
@js.native
object ScheduleDays extends js.Object {
  /**
    * Run on all days of the week.
    */
  @js.native
  sealed trait All extends ScheduleDays
  
  /**
    * Run on Friday.
    */
  @js.native
  sealed trait Friday extends ScheduleDays
  
  /**
    * Run on Monday.
    */
  @js.native
  sealed trait Monday extends ScheduleDays
  
  /**
    * Do not run.
    */
  @js.native
  sealed trait None extends ScheduleDays
  
  /**
    * Run on Saturday.
    */
  @js.native
  sealed trait Saturday extends ScheduleDays
  
  /**
    * Run on Sunday.
    */
  @js.native
  sealed trait Sunday extends ScheduleDays
  
  /**
    * Run on Thursday.
    */
  @js.native
  sealed trait Thursday extends ScheduleDays
  
  /**
    * Run on Tuesday.
    */
  @js.native
  sealed trait Tuesday extends ScheduleDays
  
  /**
    * Run on Wednesday.
    */
  @js.native
  sealed trait Wednesday extends ScheduleDays
  
  /* 127 */ val All: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ScheduleDays.All with Double = js.native
  /* 16 */ val Friday: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ScheduleDays.Friday with Double = js.native
  /* 1 */ val Monday: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ScheduleDays.Monday with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ScheduleDays.None with Double = js.native
  /* 32 */ val Saturday: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ScheduleDays.Saturday with Double = js.native
  /* 64 */ val Sunday: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ScheduleDays.Sunday with Double = js.native
  /* 8 */ val Thursday: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ScheduleDays.Thursday with Double = js.native
  /* 2 */ val Tuesday: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ScheduleDays.Tuesday with Double = js.native
  /* 4 */ val Wednesday: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ScheduleDays.Wednesday with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScheduleDays with Double] = js.native
}

