package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FieldAggregationType extends js.Object

@JSGlobal("tableau.FieldAggregationType")
@js.native
object FieldAggregationType extends js.Object {
  @js.native
  sealed trait ATTR
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait AVG
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait COUNT
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait COUNTD
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait DAY
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait END
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait HOUR
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait INOUT
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait KURTOSIS
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait MAX
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait MDY
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait MEDIAN
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait MIN
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait MINUTE
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait MONTH
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait MONTHYEAR
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait NONE
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait QTR
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait QUART1
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait QUART3
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait SECOND
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait SKEWNESS
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait STDEV
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait STDEVP
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait SUM
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait TRUNC_DAY
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait TRUNC_HOUR
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait TRUNC_MINUTE
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait TRUNC_MONTH
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait TRUNC_QTR
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait TRUNC_SECOND
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait TRUNC_WEEK
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait TRUNC_YEAR
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait USER
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait VAR
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait VARP
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait WEEK
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait WEEKDAY
    extends tableauLib.tableauNs.FieldAggregationType
  
  @js.native
  sealed trait YEAR
    extends tableauLib.tableauNs.FieldAggregationType
  
  /* 11 */ val ATTR: ATTR with scala.Double = js.native
  /* 1 */ val AVG: AVG with scala.Double = js.native
  /* 8 */ val COUNT: COUNT with scala.Double = js.native
  /* 9 */ val COUNTD: COUNTD with scala.Double = js.native
  /* 16 */ val DAY: DAY with scala.Double = js.native
  /* 24 */ val END: END with scala.Double = js.native
  /* 17 */ val HOUR: HOUR with scala.Double = js.native
  /* 37 */ val INOUT: INOUT with scala.Double = js.native
  /* 36 */ val KURTOSIS: KURTOSIS with scala.Double = js.native
  /* 3 */ val MAX: MAX with scala.Double = js.native
  /* 23 */ val MDY: MDY with scala.Double = js.native
  /* 10 */ val MEDIAN: MEDIAN with scala.Double = js.native
  /* 2 */ val MIN: MIN with scala.Double = js.native
  /* 18 */ val MINUTE: MINUTE with scala.Double = js.native
  /* 15 */ val MONTH: MONTH with scala.Double = js.native
  /* 22 */ val MONTHYEAR: MONTHYEAR with scala.Double = js.native
  /* 12 */ val NONE: NONE with scala.Double = js.native
  /* 14 */ val QTR: QTR with scala.Double = js.native
  /* 33 */ val QUART1: QUART1 with scala.Double = js.native
  /* 34 */ val QUART3: QUART3 with scala.Double = js.native
  /* 19 */ val SECOND: SECOND with scala.Double = js.native
  /* 35 */ val SKEWNESS: SKEWNESS with scala.Double = js.native
  /* 4 */ val STDEV: STDEV with scala.Double = js.native
  /* 5 */ val STDEVP: STDEVP with scala.Double = js.native
  /* 0 */ val SUM: SUM with scala.Double = js.native
  /* 29 */ val TRUNC_DAY: TRUNC_DAY with scala.Double = js.native
  /* 30 */ val TRUNC_HOUR: TRUNC_HOUR with scala.Double = js.native
  /* 31 */ val TRUNC_MINUTE: TRUNC_MINUTE with scala.Double = js.native
  /* 27 */ val TRUNC_MONTH: TRUNC_MONTH with scala.Double = js.native
  /* 26 */ val TRUNC_QTR: TRUNC_QTR with scala.Double = js.native
  /* 32 */ val TRUNC_SECOND: TRUNC_SECOND with scala.Double = js.native
  /* 28 */ val TRUNC_WEEK: TRUNC_WEEK with scala.Double = js.native
  /* 25 */ val TRUNC_YEAR: TRUNC_YEAR with scala.Double = js.native
  /* 38 */ val USER: USER with scala.Double = js.native
  /* 6 */ val VAR: VAR with scala.Double = js.native
  /* 7 */ val VARP: VARP with scala.Double = js.native
  /* 20 */ val WEEK: WEEK with scala.Double = js.native
  /* 21 */ val WEEKDAY: WEEKDAY with scala.Double = js.native
  /* 13 */ val YEAR: YEAR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[tableauLib.tableauNs.FieldAggregationType with scala.Double] = js.native
}

