package typings
package timezonecompleteLib.distLibBasicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WeekDay extends js.Object

@JSImport("timezonecomplete/dist/lib/basics", "WeekDay")
@js.native
object WeekDay extends js.Object {
  @js.native
  sealed trait Friday
    extends timezonecompleteLib.distLibBasicsMod.WeekDay
  
  @js.native
  sealed trait Monday
    extends timezonecompleteLib.distLibBasicsMod.WeekDay
  
  @js.native
  sealed trait Saturday
    extends timezonecompleteLib.distLibBasicsMod.WeekDay
  
  @js.native
  sealed trait Sunday
    extends timezonecompleteLib.distLibBasicsMod.WeekDay
  
  @js.native
  sealed trait Thursday
    extends timezonecompleteLib.distLibBasicsMod.WeekDay
  
  @js.native
  sealed trait Tuesday
    extends timezonecompleteLib.distLibBasicsMod.WeekDay
  
  @js.native
  sealed trait Wednesday
    extends timezonecompleteLib.distLibBasicsMod.WeekDay
  
  /* 5 */ val Friday: Friday with scala.Double = js.native
  /* 1 */ val Monday: Monday with scala.Double = js.native
  /* 6 */ val Saturday: Saturday with scala.Double = js.native
  /* 0 */ val Sunday: Sunday with scala.Double = js.native
  /* 4 */ val Thursday: Thursday with scala.Double = js.native
  /* 2 */ val Tuesday: Tuesday with scala.Double = js.native
  /* 3 */ val Wednesday: Wednesday with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[timezonecompleteLib.distLibBasicsMod.WeekDay with scala.Double] = js.native
}

