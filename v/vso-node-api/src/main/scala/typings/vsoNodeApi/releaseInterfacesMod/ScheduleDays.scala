package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScheduleDays extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ScheduleDays")
@js.native
object ScheduleDays extends js.Object {
  @js.native
  sealed trait All extends ScheduleDays
  
  @js.native
  sealed trait Friday extends ScheduleDays
  
  @js.native
  sealed trait Monday extends ScheduleDays
  
  @js.native
  sealed trait None extends ScheduleDays
  
  @js.native
  sealed trait Saturday extends ScheduleDays
  
  @js.native
  sealed trait Sunday extends ScheduleDays
  
  @js.native
  sealed trait Thursday extends ScheduleDays
  
  @js.native
  sealed trait Tuesday extends ScheduleDays
  
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

