package typings.tableau.tableau

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SheetSizeBehaviour extends js.Object

@JSGlobal("tableau.SheetSizeBehaviour")
@js.native
object SheetSizeBehaviour extends js.Object {
  @js.native
  sealed trait ATLEAST extends SheetSizeBehaviour
  
  @js.native
  sealed trait ATMOST extends SheetSizeBehaviour
  
  @js.native
  sealed trait AUTOMATIC extends SheetSizeBehaviour
  
  @js.native
  sealed trait EXACTLY extends SheetSizeBehaviour
  
  @js.native
  sealed trait RANGE extends SheetSizeBehaviour
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SheetSizeBehaviour with String] = js.native
  /* "atleast" */ @js.native
  object ATLEAST extends TopLevel[ATLEAST with String]
  
  /* "atmost" */ @js.native
  object ATMOST extends TopLevel[ATMOST with String]
  
  /* "automatic" */ @js.native
  object AUTOMATIC extends TopLevel[AUTOMATIC with String]
  
  /* "exactly" */ @js.native
  object EXACTLY extends TopLevel[EXACTLY with String]
  
  /* "range" */ @js.native
  object RANGE extends TopLevel[RANGE with String]
  
}

