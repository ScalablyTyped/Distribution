package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

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
  
  /* 127 */ val All: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ScheduleDays.All with Double = js.native
  /* 16 */ val Friday: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ScheduleDays.Friday with Double = js.native
  /* 1 */ val Monday: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ScheduleDays.Monday with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ScheduleDays.None with Double = js.native
  /* 32 */ val Saturday: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ScheduleDays.Saturday with Double = js.native
  /* 64 */ val Sunday: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ScheduleDays.Sunday with Double = js.native
  /* 8 */ val Thursday: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ScheduleDays.Thursday with Double = js.native
  /* 2 */ val Tuesday: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ScheduleDays.Tuesday with Double = js.native
  /* 4 */ val Wednesday: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ScheduleDays.Wednesday with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScheduleDays with Double] = js.native
}

