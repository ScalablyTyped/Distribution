package typings.vsoDashNodeDashApi.interfacesCommonSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DayOfWeek extends js.Object

@JSImport("vso-node-api/interfaces/common/System", "DayOfWeek")
@js.native
object DayOfWeek extends js.Object {
  /**
    * Indicates Friday.
    */
  @js.native
  sealed trait Friday extends DayOfWeek
  
  /**
    * Indicates Monday.
    */
  @js.native
  sealed trait Monday extends DayOfWeek
  
  /**
    * Indicates Saturday.
    */
  @js.native
  sealed trait Saturday extends DayOfWeek
  
  /**
    * Indicates Sunday.
    */
  @js.native
  sealed trait Sunday extends DayOfWeek
  
  /**
    * Indicates Thursday.
    */
  @js.native
  sealed trait Thursday extends DayOfWeek
  
  /**
    * Indicates Tuesday.
    */
  @js.native
  sealed trait Tuesday extends DayOfWeek
  
  /**
    * Indicates Wednesday.
    */
  @js.native
  sealed trait Wednesday extends DayOfWeek
  
  /* 5 */ val Friday: typings.vsoDashNodeDashApi.interfacesCommonSystemMod.DayOfWeek.Friday with Double = js.native
  /* 1 */ val Monday: typings.vsoDashNodeDashApi.interfacesCommonSystemMod.DayOfWeek.Monday with Double = js.native
  /* 6 */ val Saturday: typings.vsoDashNodeDashApi.interfacesCommonSystemMod.DayOfWeek.Saturday with Double = js.native
  /* 0 */ val Sunday: typings.vsoDashNodeDashApi.interfacesCommonSystemMod.DayOfWeek.Sunday with Double = js.native
  /* 4 */ val Thursday: typings.vsoDashNodeDashApi.interfacesCommonSystemMod.DayOfWeek.Thursday with Double = js.native
  /* 2 */ val Tuesday: typings.vsoDashNodeDashApi.interfacesCommonSystemMod.DayOfWeek.Tuesday with Double = js.native
  /* 3 */ val Wednesday: typings.vsoDashNodeDashApi.interfacesCommonSystemMod.DayOfWeek.Wednesday with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DayOfWeek with Double] = js.native
}

