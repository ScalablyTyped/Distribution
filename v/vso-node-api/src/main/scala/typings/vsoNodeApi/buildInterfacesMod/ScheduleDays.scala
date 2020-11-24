package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScheduleDays extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "ScheduleDays")
@js.native
object ScheduleDays extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScheduleDays with Double] = js.native
  
  /**
    * Run on all days of the week.
    */
  @js.native
  sealed trait All extends ScheduleDays
  /* 127 */ @js.native
  object All extends TopLevel[All with Double]
  
  /**
    * Run on Friday.
    */
  @js.native
  sealed trait Friday extends ScheduleDays
  /* 16 */ @js.native
  object Friday extends TopLevel[Friday with Double]
  
  /**
    * Run on Monday.
    */
  @js.native
  sealed trait Monday extends ScheduleDays
  /* 1 */ @js.native
  object Monday extends TopLevel[Monday with Double]
  
  /**
    * Do not run.
    */
  @js.native
  sealed trait None extends ScheduleDays
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /**
    * Run on Saturday.
    */
  @js.native
  sealed trait Saturday extends ScheduleDays
  /* 32 */ @js.native
  object Saturday extends TopLevel[Saturday with Double]
  
  /**
    * Run on Sunday.
    */
  @js.native
  sealed trait Sunday extends ScheduleDays
  /* 64 */ @js.native
  object Sunday extends TopLevel[Sunday with Double]
  
  /**
    * Run on Thursday.
    */
  @js.native
  sealed trait Thursday extends ScheduleDays
  /* 8 */ @js.native
  object Thursday extends TopLevel[Thursday with Double]
  
  /**
    * Run on Tuesday.
    */
  @js.native
  sealed trait Tuesday extends ScheduleDays
  /* 2 */ @js.native
  object Tuesday extends TopLevel[Tuesday with Double]
  
  /**
    * Run on Wednesday.
    */
  @js.native
  sealed trait Wednesday extends ScheduleDays
  /* 4 */ @js.native
  object Wednesday extends TopLevel[Wednesday with Double]
}
