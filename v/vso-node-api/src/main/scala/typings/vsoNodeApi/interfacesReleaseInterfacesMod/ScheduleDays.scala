package typings.vsoNodeApi.interfacesReleaseInterfacesMod

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
  /* 127 */ val All: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ScheduleDays.All & Double = js.native
  
  @js.native
  sealed trait Friday
    extends StObject
       with ScheduleDays
  /* 16 */ val Friday: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ScheduleDays.Friday & Double = js.native
  
  @js.native
  sealed trait Monday
    extends StObject
       with ScheduleDays
  /* 1 */ val Monday: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ScheduleDays.Monday & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ScheduleDays
  /* 0 */ val None: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ScheduleDays.None & Double = js.native
  
  @js.native
  sealed trait Saturday
    extends StObject
       with ScheduleDays
  /* 32 */ val Saturday: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ScheduleDays.Saturday & Double = js.native
  
  @js.native
  sealed trait Sunday
    extends StObject
       with ScheduleDays
  /* 64 */ val Sunday: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ScheduleDays.Sunday & Double = js.native
  
  @js.native
  sealed trait Thursday
    extends StObject
       with ScheduleDays
  /* 8 */ val Thursday: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ScheduleDays.Thursday & Double = js.native
  
  @js.native
  sealed trait Tuesday
    extends StObject
       with ScheduleDays
  /* 2 */ val Tuesday: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ScheduleDays.Tuesday & Double = js.native
  
  @js.native
  sealed trait Wednesday
    extends StObject
       with ScheduleDays
  /* 4 */ val Wednesday: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ScheduleDays.Wednesday & Double = js.native
}
