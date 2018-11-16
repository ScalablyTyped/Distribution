package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScheduleDays extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ScheduleDays")
@js.native
object ScheduleDays extends js.Object {
  @js.native
  sealed trait All
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ScheduleDays
  
  @js.native
  sealed trait Friday
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ScheduleDays
  
  @js.native
  sealed trait Monday
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ScheduleDays
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ScheduleDays
  
  @js.native
  sealed trait Saturday
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ScheduleDays
  
  @js.native
  sealed trait Sunday
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ScheduleDays
  
  @js.native
  sealed trait Thursday
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ScheduleDays
  
  @js.native
  sealed trait Tuesday
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ScheduleDays
  
  @js.native
  sealed trait Wednesday
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ScheduleDays
  
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
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ScheduleDays with scala.Double
  ] = js.native
}

