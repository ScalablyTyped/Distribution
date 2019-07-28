package typings.tableau.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DashboardObjectType extends js.Object

@JSGlobal("tableau.DashboardObjectType")
@js.native
object DashboardObjectType extends js.Object {
  @js.native
  sealed trait ADDIN extends DashboardObjectType
  
  @js.native
  sealed trait BLANK extends DashboardObjectType
  
  @js.native
  sealed trait IMAGE extends DashboardObjectType
  
  @js.native
  sealed trait LEGEND extends DashboardObjectType
  
  @js.native
  sealed trait PAGE_FILTER extends DashboardObjectType
  
  @js.native
  sealed trait PARAMETER_CONTROL extends DashboardObjectType
  
  @js.native
  sealed trait QUICK_FILTER extends DashboardObjectType
  
  @js.native
  sealed trait TEXT extends DashboardObjectType
  
  @js.native
  sealed trait TITLE extends DashboardObjectType
  
  @js.native
  sealed trait WEB_PAGE extends DashboardObjectType
  
  @js.native
  sealed trait WORKSHEET extends DashboardObjectType
  
  /* "addIn" */ val ADDIN: typings.tableau.tableauNs.DashboardObjectType.ADDIN with String = js.native
  /* "blank" */ val BLANK: typings.tableau.tableauNs.DashboardObjectType.BLANK with String = js.native
  /* "image" */ val IMAGE: typings.tableau.tableauNs.DashboardObjectType.IMAGE with String = js.native
  /* "legend" */ val LEGEND: typings.tableau.tableauNs.DashboardObjectType.LEGEND with String = js.native
  /* "pageFilter" */ val PAGE_FILTER: typings.tableau.tableauNs.DashboardObjectType.PAGE_FILTER with String = js.native
  /* "parameterControl" */ val PARAMETER_CONTROL: typings.tableau.tableauNs.DashboardObjectType.PARAMETER_CONTROL with String = js.native
  /* "quickFilter" */ val QUICK_FILTER: typings.tableau.tableauNs.DashboardObjectType.QUICK_FILTER with String = js.native
  /* "text" */ val TEXT: typings.tableau.tableauNs.DashboardObjectType.TEXT with String = js.native
  /* "title" */ val TITLE: typings.tableau.tableauNs.DashboardObjectType.TITLE with String = js.native
  /* "webPage" */ val WEB_PAGE: typings.tableau.tableauNs.DashboardObjectType.WEB_PAGE with String = js.native
  /* "worksheet" */ val WORKSHEET: typings.tableau.tableauNs.DashboardObjectType.WORKSHEET with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DashboardObjectType with String] = js.native
}

