package typings.timezonecomplete.tzDatabaseMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AtType extends js.Object
@JSImport("timezonecomplete/dist/lib/tz-database", "AtType")
@js.native
object AtType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AtType with Double] = js.native
  
  /**
    * Local time (no DST)
    */
  @js.native
  sealed trait Standard extends AtType
  /* 0 */ @js.native
  object Standard extends TopLevel[Standard with Double]
  
  /**
    * Utc time
    */
  @js.native
  sealed trait Utc extends AtType
  /* 2 */ @js.native
  object Utc extends TopLevel[Utc with Double]
  
  /**
    * Wall clock time (local time with DST)
    */
  @js.native
  sealed trait Wall extends AtType
  /* 1 */ @js.native
  object Wall extends TopLevel[Wall with Double]
}
