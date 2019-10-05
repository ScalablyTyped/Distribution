package typings.tableau.tableau

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
  
  /* "atleast" */ val ATLEAST: typings.tableau.tableau.SheetSizeBehaviour.ATLEAST with String = js.native
  /* "atmost" */ val ATMOST: typings.tableau.tableau.SheetSizeBehaviour.ATMOST with String = js.native
  /* "automatic" */ val AUTOMATIC: typings.tableau.tableau.SheetSizeBehaviour.AUTOMATIC with String = js.native
  /* "exactly" */ val EXACTLY: typings.tableau.tableau.SheetSizeBehaviour.EXACTLY with String = js.native
  /* "range" */ val RANGE: typings.tableau.tableau.SheetSizeBehaviour.RANGE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SheetSizeBehaviour with String] = js.native
}

