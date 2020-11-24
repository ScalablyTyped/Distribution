package typings.timezonecomplete.tzDatabaseMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NormalizeOption extends js.Object
@JSImport("timezonecomplete/dist/lib/tz-database", "NormalizeOption")
@js.native
object NormalizeOption extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NormalizeOption with Double] = js.native
  
  /**
    * Normalize non-existing times by SUBTRACTING the DST offset
    */
  @js.native
  sealed trait Down extends NormalizeOption
  /* 1 */ @js.native
  object Down extends TopLevel[Down with Double]
  
  /**
    * Normalize non-existing times by ADDING the DST offset
    */
  @js.native
  sealed trait Up extends NormalizeOption
  /* 0 */ @js.native
  object Up extends TopLevel[Up with Double]
}
