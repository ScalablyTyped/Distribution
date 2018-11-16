package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateRangeType extends js.Object

@JSGlobal("tableau.DateRangeType")
@js.native
object DateRangeType extends js.Object {
   /** Refers to the current day, week, month, etc. of the date period. */@js.native
  sealed trait CURRENT
    extends tableauLib.tableauNs.DateRangeType
  
   /** Refers to the last day, week, month, etc. of the date period. */@js.native
  sealed trait LAST
    extends tableauLib.tableauNs.DateRangeType
  
   /** Refers to the last N days, weeks, months, etc. of the date period. */@js.native
  sealed trait LASTN
    extends tableauLib.tableauNs.DateRangeType
  
   /** Refers to the next day, week, month, etc. of the date period. */@js.native
  sealed trait NEXT
    extends tableauLib.tableauNs.DateRangeType
  
   /** Refers to the next N days, weeks, months, etc. of the date period. */@js.native
  sealed trait NEXTN
    extends tableauLib.tableauNs.DateRangeType
  
   /** Refers to everything up to and including the current day, week, month, etc. of the date period. */@js.native
  sealed trait TODATE
    extends tableauLib.tableauNs.DateRangeType
  
  /* "current" */ val CURRENT: CURRENT with java.lang.String = js.native
  /* "last" */ val LAST: LAST with java.lang.String = js.native
  /* "lastn" */ val LASTN: LASTN with java.lang.String = js.native
  /* "next" */ val NEXT: NEXT with java.lang.String = js.native
  /* "nextn" */ val NEXTN: NEXTN with java.lang.String = js.native
  /* "todate" */ val TODATE: TODATE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[tableauLib.tableauNs.DateRangeType with java.lang.String] = js.native
}

