package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScheduleDays extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ScheduleDays")
@js.native
object ScheduleDays extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScheduleDays & Double] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with ScheduleDays
  /* 127 */ val All: typings.vsoNodeApi.releaseInterfacesMod.ScheduleDays.All & Double = js.native
  
  @js.native
  sealed trait Friday
    extends StObject
       with ScheduleDays
  /* 16 */ val Friday: typings.vsoNodeApi.releaseInterfacesMod.ScheduleDays.Friday & Double = js.native
  
  @js.native
  sealed trait Monday
    extends StObject
       with ScheduleDays
  /* 1 */ val Monday: typings.vsoNodeApi.releaseInterfacesMod.ScheduleDays.Monday & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ScheduleDays
  /* 0 */ val None: typings.vsoNodeApi.releaseInterfacesMod.ScheduleDays.None & Double = js.native
  
  @js.native
  sealed trait Saturday
    extends StObject
       with ScheduleDays
  /* 32 */ val Saturday: typings.vsoNodeApi.releaseInterfacesMod.ScheduleDays.Saturday & Double = js.native
  
  @js.native
  sealed trait Sunday
    extends StObject
       with ScheduleDays
  /* 64 */ val Sunday: typings.vsoNodeApi.releaseInterfacesMod.ScheduleDays.Sunday & Double = js.native
  
  @js.native
  sealed trait Thursday
    extends StObject
       with ScheduleDays
  /* 8 */ val Thursday: typings.vsoNodeApi.releaseInterfacesMod.ScheduleDays.Thursday & Double = js.native
  
  @js.native
  sealed trait Tuesday
    extends StObject
       with ScheduleDays
  /* 2 */ val Tuesday: typings.vsoNodeApi.releaseInterfacesMod.ScheduleDays.Tuesday & Double = js.native
  
  @js.native
  sealed trait Wednesday
    extends StObject
       with ScheduleDays
  /* 4 */ val Wednesday: typings.vsoNodeApi.releaseInterfacesMod.ScheduleDays.Wednesday & Double = js.native
}
