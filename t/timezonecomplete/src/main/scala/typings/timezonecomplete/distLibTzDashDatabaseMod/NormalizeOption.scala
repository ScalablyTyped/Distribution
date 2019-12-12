package typings.timezonecomplete.distLibTzDashDatabaseMod

import org.scalablytyped.runtime.TopLevel
import typings.timezonecomplete.distLibTzDashDatabaseMod.NormalizeOption.Down
import typings.timezonecomplete.distLibTzDashDatabaseMod.NormalizeOption.Up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NormalizeOption extends js.Object

@JSImport("timezonecomplete/dist/lib/tz-database", "NormalizeOption")
@js.native
object NormalizeOption extends js.Object {
  /**
    * Normalize non-existing times by SUBTRACTING the DST offset
    */
  @js.native
  sealed trait Down extends NormalizeOption
  
  /**
    * Normalize non-existing times by ADDING the DST offset
    */
  @js.native
  sealed trait Up extends NormalizeOption
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NormalizeOption with Double] = js.native
  /* 1 */ @js.native
  object Down extends TopLevel[Down with Double]
  
  /* 0 */ @js.native
  object Up extends TopLevel[Up with Double]
  
}

