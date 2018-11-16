package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SheetSizeBehaviour extends js.Object

@JSGlobal("tableau.SheetSizeBehaviour")
@js.native
object SheetSizeBehaviour extends js.Object {
  @js.native
  sealed trait ATLEAST
    extends tableauLib.tableauNs.SheetSizeBehaviour
  
  @js.native
  sealed trait ATMOST
    extends tableauLib.tableauNs.SheetSizeBehaviour
  
  @js.native
  sealed trait AUTOMATIC
    extends tableauLib.tableauNs.SheetSizeBehaviour
  
  @js.native
  sealed trait EXACTLY
    extends tableauLib.tableauNs.SheetSizeBehaviour
  
  @js.native
  sealed trait RANGE
    extends tableauLib.tableauNs.SheetSizeBehaviour
  
  /* "atleast" */ val ATLEAST: ATLEAST with java.lang.String = js.native
  /* "atmost" */ val ATMOST: ATMOST with java.lang.String = js.native
  /* "automatic" */ val AUTOMATIC: AUTOMATIC with java.lang.String = js.native
  /* "exactly" */ val EXACTLY: EXACTLY with java.lang.String = js.native
  /* "range" */ val RANGE: RANGE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[tableauLib.tableauNs.SheetSizeBehaviour with java.lang.String] = js.native
}

