package typings.tableau.tableau

import org.scalablytyped.runtime.TopLevel
import typings.tableau.tableau.DashboardObjectType.ADDIN
import typings.tableau.tableau.DashboardObjectType.BLANK
import typings.tableau.tableau.DashboardObjectType.IMAGE
import typings.tableau.tableau.DashboardObjectType.LEGEND
import typings.tableau.tableau.DashboardObjectType.PAGE_FILTER
import typings.tableau.tableau.DashboardObjectType.PARAMETER_CONTROL
import typings.tableau.tableau.DashboardObjectType.QUICK_FILTER
import typings.tableau.tableau.DashboardObjectType.TEXT
import typings.tableau.tableau.DashboardObjectType.TITLE
import typings.tableau.tableau.DashboardObjectType.WEB_PAGE
import typings.tableau.tableau.DashboardObjectType.WORKSHEET
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DashboardObjectType with String] = js.native
  /* "addIn" */ @js.native
  object ADDIN extends TopLevel[ADDIN with String]
  
  /* "blank" */ @js.native
  object BLANK extends TopLevel[BLANK with String]
  
  /* "image" */ @js.native
  object IMAGE extends TopLevel[IMAGE with String]
  
  /* "legend" */ @js.native
  object LEGEND extends TopLevel[LEGEND with String]
  
  /* "pageFilter" */ @js.native
  object PAGE_FILTER extends TopLevel[PAGE_FILTER with String]
  
  /* "parameterControl" */ @js.native
  object PARAMETER_CONTROL extends TopLevel[PARAMETER_CONTROL with String]
  
  /* "quickFilter" */ @js.native
  object QUICK_FILTER extends TopLevel[QUICK_FILTER with String]
  
  /* "text" */ @js.native
  object TEXT extends TopLevel[TEXT with String]
  
  /* "title" */ @js.native
  object TITLE extends TopLevel[TITLE with String]
  
  /* "webPage" */ @js.native
  object WEB_PAGE extends TopLevel[WEB_PAGE with String]
  
  /* "worksheet" */ @js.native
  object WORKSHEET extends TopLevel[WORKSHEET with String]
  
}

