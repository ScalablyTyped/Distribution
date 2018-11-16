package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DashboardObjectType extends js.Object

@JSGlobal("tableau.DashboardObjectType")
@js.native
object DashboardObjectType extends js.Object {
  @js.native
  sealed trait ADDIN
    extends tableauLib.tableauNs.DashboardObjectType
  
  @js.native
  sealed trait BLANK
    extends tableauLib.tableauNs.DashboardObjectType
  
  @js.native
  sealed trait IMAGE
    extends tableauLib.tableauNs.DashboardObjectType
  
  @js.native
  sealed trait LEGEND
    extends tableauLib.tableauNs.DashboardObjectType
  
  @js.native
  sealed trait PAGE_FILTER
    extends tableauLib.tableauNs.DashboardObjectType
  
  @js.native
  sealed trait PARAMETER_CONTROL
    extends tableauLib.tableauNs.DashboardObjectType
  
  @js.native
  sealed trait QUICK_FILTER
    extends tableauLib.tableauNs.DashboardObjectType
  
  @js.native
  sealed trait TEXT
    extends tableauLib.tableauNs.DashboardObjectType
  
  @js.native
  sealed trait TITLE
    extends tableauLib.tableauNs.DashboardObjectType
  
  @js.native
  sealed trait WEB_PAGE
    extends tableauLib.tableauNs.DashboardObjectType
  
  @js.native
  sealed trait WORKSHEET
    extends tableauLib.tableauNs.DashboardObjectType
  
  /* "addIn" */ val ADDIN: ADDIN with java.lang.String = js.native
  /* "blank" */ val BLANK: BLANK with java.lang.String = js.native
  /* "image" */ val IMAGE: IMAGE with java.lang.String = js.native
  /* "legend" */ val LEGEND: LEGEND with java.lang.String = js.native
  /* "pageFilter" */ val PAGE_FILTER: PAGE_FILTER with java.lang.String = js.native
  /* "parameterControl" */ val PARAMETER_CONTROL: PARAMETER_CONTROL with java.lang.String = js.native
  /* "quickFilter" */ val QUICK_FILTER: QUICK_FILTER with java.lang.String = js.native
  /* "text" */ val TEXT: TEXT with java.lang.String = js.native
  /* "title" */ val TITLE: TITLE with java.lang.String = js.native
  /* "webPage" */ val WEB_PAGE: WEB_PAGE with java.lang.String = js.native
  /* "worksheet" */ val WORKSHEET: WORKSHEET with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[tableauLib.tableauNs.DashboardObjectType with java.lang.String] = js.native
}

