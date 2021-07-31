package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DashboardObjectType extends StObject
@JSGlobal("tableau.DashboardObjectType")
@js.native
object DashboardObjectType extends StObject {
  
  @js.native
  sealed trait ADDIN
    extends StObject
       with DashboardObjectType
  
  @js.native
  sealed trait BLANK
    extends StObject
       with DashboardObjectType
  
  @js.native
  sealed trait IMAGE
    extends StObject
       with DashboardObjectType
  
  @js.native
  sealed trait LEGEND
    extends StObject
       with DashboardObjectType
  
  @js.native
  sealed trait PAGE_FILTER
    extends StObject
       with DashboardObjectType
  
  @js.native
  sealed trait PARAMETER_CONTROL
    extends StObject
       with DashboardObjectType
  
  @js.native
  sealed trait QUICK_FILTER
    extends StObject
       with DashboardObjectType
  
  @js.native
  sealed trait TEXT
    extends StObject
       with DashboardObjectType
  
  @js.native
  sealed trait TITLE
    extends StObject
       with DashboardObjectType
  
  @js.native
  sealed trait WEB_PAGE
    extends StObject
       with DashboardObjectType
  
  @js.native
  sealed trait WORKSHEET
    extends StObject
       with DashboardObjectType
}
