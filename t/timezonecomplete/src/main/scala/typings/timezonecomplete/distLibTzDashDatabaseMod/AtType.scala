package typings.timezonecomplete.distLibTzDashDatabaseMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AtType extends js.Object

@JSImport("timezonecomplete/dist/lib/tz-database", "AtType")
@js.native
object AtType extends js.Object {
  /**
    * Local time (no DST)
    */
  @js.native
  sealed trait Standard extends AtType
  
  /**
    * Utc time
    */
  @js.native
  sealed trait Utc extends AtType
  
  /**
    * Wall clock time (local time with DST)
    */
  @js.native
  sealed trait Wall extends AtType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AtType with Double] = js.native
  /* 0 */ @js.native
  object Standard extends TopLevel[Standard with Double]
  
  /* 2 */ @js.native
  object Utc extends TopLevel[Utc with Double]
  
  /* 1 */ @js.native
  object Wall extends TopLevel[Wall with Double]
  
}

