package typings.tableauJsApi.enumsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DateRangeType extends StObject
@JSImport("tableau-js-api/enums", "DateRangeType")
@js.native
object DateRangeType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DateRangeType & String] = js.native
  
  @js.native
  sealed trait CURR
    extends StObject
       with DateRangeType
  /* "curr" */ val CURR: typings.tableauJsApi.enumsMod.DateRangeType.CURR & String = js.native
  
  @js.native
  sealed trait LAST
    extends StObject
       with DateRangeType
  /* "last" */ val LAST: typings.tableauJsApi.enumsMod.DateRangeType.LAST & String = js.native
  
  @js.native
  sealed trait LASTN
    extends StObject
       with DateRangeType
  /* "lastn" */ val LASTN: typings.tableauJsApi.enumsMod.DateRangeType.LASTN & String = js.native
  
  @js.native
  sealed trait NEXT
    extends StObject
       with DateRangeType
  /* "next" */ val NEXT: typings.tableauJsApi.enumsMod.DateRangeType.NEXT & String = js.native
  
  @js.native
  sealed trait NEXTN
    extends StObject
       with DateRangeType
  /* "nextn" */ val NEXTN: typings.tableauJsApi.enumsMod.DateRangeType.NEXTN & String = js.native
  
  @js.native
  sealed trait TODATE
    extends StObject
       with DateRangeType
  /* "todate" */ val TODATE: typings.tableauJsApi.enumsMod.DateRangeType.TODATE & String = js.native
}
