package typings.tableau.tableau

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
  
}

