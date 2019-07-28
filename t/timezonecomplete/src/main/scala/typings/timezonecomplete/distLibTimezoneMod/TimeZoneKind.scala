package typings.timezonecomplete.distLibTimezoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimeZoneKind extends js.Object

@JSImport("timezonecomplete/dist/lib/timezone", "TimeZoneKind")
@js.native
object TimeZoneKind extends js.Object {
  /**
    * Local time offset as determined by JavaScript Date class.
    */
  @js.native
  sealed trait Local extends TimeZoneKind
  
  /**
    * Fixed offset from UTC, without DST.
    */
  @js.native
  sealed trait Offset extends TimeZoneKind
  
  /**
    * IANA timezone managed through Olsen TZ database. Includes
    * DST if applicable.
    */
  @js.native
  sealed trait Proper extends TimeZoneKind
  
  /* 0 */ val Local: typings.timezonecomplete.distLibTimezoneMod.TimeZoneKind.Local with Double = js.native
  /* 1 */ val Offset: typings.timezonecomplete.distLibTimezoneMod.TimeZoneKind.Offset with Double = js.native
  /* 2 */ val Proper: typings.timezonecomplete.distLibTimezoneMod.TimeZoneKind.Proper with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimeZoneKind with Double] = js.native
}

