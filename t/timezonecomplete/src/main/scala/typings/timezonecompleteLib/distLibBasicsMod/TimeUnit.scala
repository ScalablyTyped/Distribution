package typings
package timezonecompleteLib.distLibBasicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimeUnit extends js.Object

@JSImport("timezonecomplete/dist/lib/basics", "TimeUnit")
@js.native
object TimeUnit extends js.Object {
  @js.native
  sealed trait Day
    extends timezonecompleteLib.distLibBasicsMod.TimeUnit
  
  @js.native
  sealed trait Hour
    extends timezonecompleteLib.distLibBasicsMod.TimeUnit
  
  /**
       * End-of-enum marker, do not use
       */
  @js.native
  sealed trait MAX
    extends timezonecompleteLib.distLibBasicsMod.TimeUnit
  
  @js.native
  sealed trait Millisecond
    extends timezonecompleteLib.distLibBasicsMod.TimeUnit
  
  @js.native
  sealed trait Minute
    extends timezonecompleteLib.distLibBasicsMod.TimeUnit
  
  @js.native
  sealed trait Month
    extends timezonecompleteLib.distLibBasicsMod.TimeUnit
  
  @js.native
  sealed trait Second
    extends timezonecompleteLib.distLibBasicsMod.TimeUnit
  
  @js.native
  sealed trait Week
    extends timezonecompleteLib.distLibBasicsMod.TimeUnit
  
  @js.native
  sealed trait Year
    extends timezonecompleteLib.distLibBasicsMod.TimeUnit
  
  /* 4 */ val Day: Day with scala.Double = js.native
  /* 3 */ val Hour: Hour with scala.Double = js.native
  /* 8 */ val MAX: MAX with scala.Double = js.native
  /* 0 */ val Millisecond: Millisecond with scala.Double = js.native
  /* 2 */ val Minute: Minute with scala.Double = js.native
  /* 6 */ val Month: Month with scala.Double = js.native
  /* 1 */ val Second: Second with scala.Double = js.native
  /* 5 */ val Week: Week with scala.Double = js.native
  /* 7 */ val Year: Year with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[timezonecompleteLib.distLibBasicsMod.TimeUnit with scala.Double] = js.native
}

