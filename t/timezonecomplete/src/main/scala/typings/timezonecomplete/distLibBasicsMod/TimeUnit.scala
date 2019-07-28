package typings.timezonecomplete.distLibBasicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimeUnit extends js.Object

@JSImport("timezonecomplete/dist/lib/basics", "TimeUnit")
@js.native
object TimeUnit extends js.Object {
  @js.native
  sealed trait Day extends TimeUnit
  
  @js.native
  sealed trait Hour extends TimeUnit
  
  /**
    * End-of-enum marker, do not use
    */
  @js.native
  sealed trait MAX extends TimeUnit
  
  @js.native
  sealed trait Millisecond extends TimeUnit
  
  @js.native
  sealed trait Minute extends TimeUnit
  
  @js.native
  sealed trait Month extends TimeUnit
  
  @js.native
  sealed trait Second extends TimeUnit
  
  @js.native
  sealed trait Week extends TimeUnit
  
  @js.native
  sealed trait Year extends TimeUnit
  
  /* 4 */ val Day: typings.timezonecomplete.distLibBasicsMod.TimeUnit.Day with Double = js.native
  /* 3 */ val Hour: typings.timezonecomplete.distLibBasicsMod.TimeUnit.Hour with Double = js.native
  /* 8 */ val MAX: typings.timezonecomplete.distLibBasicsMod.TimeUnit.MAX with Double = js.native
  /* 0 */ val Millisecond: typings.timezonecomplete.distLibBasicsMod.TimeUnit.Millisecond with Double = js.native
  /* 2 */ val Minute: typings.timezonecomplete.distLibBasicsMod.TimeUnit.Minute with Double = js.native
  /* 6 */ val Month: typings.timezonecomplete.distLibBasicsMod.TimeUnit.Month with Double = js.native
  /* 1 */ val Second: typings.timezonecomplete.distLibBasicsMod.TimeUnit.Second with Double = js.native
  /* 5 */ val Week: typings.timezonecomplete.distLibBasicsMod.TimeUnit.Week with Double = js.native
  /* 7 */ val Year: typings.timezonecomplete.distLibBasicsMod.TimeUnit.Year with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimeUnit with Double] = js.native
}

