package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ScheduleDays.All
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ScheduleDays.Friday
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ScheduleDays.Monday
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ScheduleDays.None
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ScheduleDays.Saturday
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ScheduleDays.Sunday
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ScheduleDays.Thursday
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ScheduleDays.Tuesday
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ScheduleDays.Wednesday
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScheduleDays with Double] = js.native
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

