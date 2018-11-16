package typings
package timezonecompleteLib.distLibTimezoneMod

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
  sealed trait Local
    extends timezonecompleteLib.distLibTimezoneMod.TimeZoneKind
  
  /**
       * Fixed offset from UTC, without DST.
       */
  @js.native
  sealed trait Offset
    extends timezonecompleteLib.distLibTimezoneMod.TimeZoneKind
  
  /**
       * IANA timezone managed through Olsen TZ database. Includes
       * DST if applicable.
       */
  @js.native
  sealed trait Proper
    extends timezonecompleteLib.distLibTimezoneMod.TimeZoneKind
  
  /* 0 */ val Local: Local with scala.Double = js.native
  /* 1 */ val Offset: Offset with scala.Double = js.native
  /* 2 */ val Proper: Proper with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[timezonecompleteLib.distLibTimezoneMod.TimeZoneKind with scala.Double] = js.native
}

