package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SheetType extends js.Object

@JSGlobal("tableau.SheetType")
@js.native
object SheetType extends js.Object {
  @js.native
  sealed trait DASHBOARD
    extends tableauLib.tableauNs.SheetType
  
  @js.native
  sealed trait STORY
    extends tableauLib.tableauNs.SheetType
  
  @js.native
  sealed trait WORKSHEET
    extends tableauLib.tableauNs.SheetType
  
  /* "dashboard" */ val DASHBOARD: DASHBOARD with java.lang.String = js.native
  /* "story" */ val STORY: STORY with java.lang.String = js.native
  /* "worksheet" */ val WORKSHEET: WORKSHEET with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[tableauLib.tableauNs.SheetType with java.lang.String] = js.native
}

