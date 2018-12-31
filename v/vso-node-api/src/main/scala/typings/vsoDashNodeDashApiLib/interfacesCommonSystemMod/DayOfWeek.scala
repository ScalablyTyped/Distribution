package typings
package vsoDashNodeDashApiLib.interfacesCommonSystemMod

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
  sealed trait Friday
    extends vsoDashNodeDashApiLib.interfacesCommonSystemMod.DayOfWeek
  
  /**
    * Indicates Monday.
    */
  @js.native
  sealed trait Monday
    extends vsoDashNodeDashApiLib.interfacesCommonSystemMod.DayOfWeek
  
  /**
    * Indicates Saturday.
    */
  @js.native
  sealed trait Saturday
    extends vsoDashNodeDashApiLib.interfacesCommonSystemMod.DayOfWeek
  
  /**
    * Indicates Sunday.
    */
  @js.native
  sealed trait Sunday
    extends vsoDashNodeDashApiLib.interfacesCommonSystemMod.DayOfWeek
  
  /**
    * Indicates Thursday.
    */
  @js.native
  sealed trait Thursday
    extends vsoDashNodeDashApiLib.interfacesCommonSystemMod.DayOfWeek
  
  /**
    * Indicates Tuesday.
    */
  @js.native
  sealed trait Tuesday
    extends vsoDashNodeDashApiLib.interfacesCommonSystemMod.DayOfWeek
  
  /**
    * Indicates Wednesday.
    */
  @js.native
  sealed trait Wednesday
    extends vsoDashNodeDashApiLib.interfacesCommonSystemMod.DayOfWeek
  
  /* 5 */ val Friday: Friday with scala.Double = js.native
  /* 1 */ val Monday: Monday with scala.Double = js.native
  /* 6 */ val Saturday: Saturday with scala.Double = js.native
  /* 0 */ val Sunday: Sunday with scala.Double = js.native
  /* 4 */ val Thursday: Thursday with scala.Double = js.native
  /* 2 */ val Tuesday: Tuesday with scala.Double = js.native
  /* 3 */ val Wednesday: Wednesday with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vsoDashNodeDashApiLib.interfacesCommonSystemMod.DayOfWeek with scala.Double] = js.native
}

