package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SheetType extends js.Object

@JSGlobal("tableau.SheetType")
@js.native
object SheetType extends js.Object {
  @js.native
  sealed trait DASHBOARD extends SheetType
  
  @js.native
  sealed trait STORY extends SheetType
  
  @js.native
  sealed trait WORKSHEET extends SheetType
  
  /* "dashboard" */ val DASHBOARD: typings.tableau.tableau.SheetType.DASHBOARD with String = js.native
  /* "story" */ val STORY: typings.tableau.tableau.SheetType.STORY with String = js.native
  /* "worksheet" */ val WORKSHEET: typings.tableau.tableau.SheetType.WORKSHEET with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SheetType with String] = js.native
}

