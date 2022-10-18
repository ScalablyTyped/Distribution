package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScheduleDays extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "ScheduleDays")
@js.native
object ScheduleDays extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScheduleDays & Double] = js.native
  
  /**
    * Run on all days of the week.
    */
  @js.native
  sealed trait All
    extends StObject
       with ScheduleDays
  /* 127 */ val All: typings.vsoNodeApi.interfacesBuildInterfacesMod.ScheduleDays.All & Double = js.native
  
  /**
    * Run on Friday.
    */
  @js.native
  sealed trait Friday
    extends StObject
       with ScheduleDays
  /* 16 */ val Friday: typings.vsoNodeApi.interfacesBuildInterfacesMod.ScheduleDays.Friday & Double = js.native
  
  /**
    * Run on Monday.
    */
  @js.native
  sealed trait Monday
    extends StObject
       with ScheduleDays
  /* 1 */ val Monday: typings.vsoNodeApi.interfacesBuildInterfacesMod.ScheduleDays.Monday & Double = js.native
  
  /**
    * Do not run.
    */
  @js.native
  sealed trait None
    extends StObject
       with ScheduleDays
  /* 0 */ val None: typings.vsoNodeApi.interfacesBuildInterfacesMod.ScheduleDays.None & Double = js.native
  
  /**
    * Run on Saturday.
    */
  @js.native
  sealed trait Saturday
    extends StObject
       with ScheduleDays
  /* 32 */ val Saturday: typings.vsoNodeApi.interfacesBuildInterfacesMod.ScheduleDays.Saturday & Double = js.native
  
  /**
    * Run on Sunday.
    */
  @js.native
  sealed trait Sunday
    extends StObject
       with ScheduleDays
  /* 64 */ val Sunday: typings.vsoNodeApi.interfacesBuildInterfacesMod.ScheduleDays.Sunday & Double = js.native
  
  /**
    * Run on Thursday.
    */
  @js.native
  sealed trait Thursday
    extends StObject
       with ScheduleDays
  /* 8 */ val Thursday: typings.vsoNodeApi.interfacesBuildInterfacesMod.ScheduleDays.Thursday & Double = js.native
  
  /**
    * Run on Tuesday.
    */
  @js.native
  sealed trait Tuesday
    extends StObject
       with ScheduleDays
  /* 2 */ val Tuesday: typings.vsoNodeApi.interfacesBuildInterfacesMod.ScheduleDays.Tuesday & Double = js.native
  
  /**
    * Run on Wednesday.
    */
  @js.native
  sealed trait Wednesday
    extends StObject
       with ScheduleDays
  /* 4 */ val Wednesday: typings.vsoNodeApi.interfacesBuildInterfacesMod.ScheduleDays.Wednesday & Double = js.native
}
