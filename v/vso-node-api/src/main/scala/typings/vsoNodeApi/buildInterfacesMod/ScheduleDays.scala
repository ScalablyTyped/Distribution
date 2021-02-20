package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScheduleDays extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "ScheduleDays")
@js.native
object ScheduleDays extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScheduleDays with Double] = js.native
  
  /**
    * Run on all days of the week.
    */
  @js.native
  sealed trait All extends ScheduleDays
  /* 127 */ val All: typings.vsoNodeApi.buildInterfacesMod.ScheduleDays.All with Double = js.native
  
  /**
    * Run on Friday.
    */
  @js.native
  sealed trait Friday extends ScheduleDays
  /* 16 */ val Friday: typings.vsoNodeApi.buildInterfacesMod.ScheduleDays.Friday with Double = js.native
  
  /**
    * Run on Monday.
    */
  @js.native
  sealed trait Monday extends ScheduleDays
  /* 1 */ val Monday: typings.vsoNodeApi.buildInterfacesMod.ScheduleDays.Monday with Double = js.native
  
  /**
    * Do not run.
    */
  @js.native
  sealed trait None extends ScheduleDays
  /* 0 */ val None: typings.vsoNodeApi.buildInterfacesMod.ScheduleDays.None with Double = js.native
  
  /**
    * Run on Saturday.
    */
  @js.native
  sealed trait Saturday extends ScheduleDays
  /* 32 */ val Saturday: typings.vsoNodeApi.buildInterfacesMod.ScheduleDays.Saturday with Double = js.native
  
  /**
    * Run on Sunday.
    */
  @js.native
  sealed trait Sunday extends ScheduleDays
  /* 64 */ val Sunday: typings.vsoNodeApi.buildInterfacesMod.ScheduleDays.Sunday with Double = js.native
  
  /**
    * Run on Thursday.
    */
  @js.native
  sealed trait Thursday extends ScheduleDays
  /* 8 */ val Thursday: typings.vsoNodeApi.buildInterfacesMod.ScheduleDays.Thursday with Double = js.native
  
  /**
    * Run on Tuesday.
    */
  @js.native
  sealed trait Tuesday extends ScheduleDays
  /* 2 */ val Tuesday: typings.vsoNodeApi.buildInterfacesMod.ScheduleDays.Tuesday with Double = js.native
  
  /**
    * Run on Wednesday.
    */
  @js.native
  sealed trait Wednesday extends ScheduleDays
  /* 4 */ val Wednesday: typings.vsoNodeApi.buildInterfacesMod.ScheduleDays.Wednesday with Double = js.native
}
