package typings.vsoNodeApi.dashboardInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dashboard extends StObject {
  
  var _links: js.Any
  
  /**
    * Description of the dashboard.
    */
  var description: String
  
  /**
    * Server defined version tracking value, used for edit collision detection.
    */
  var eTag: String
  
  /**
    * ID of the Dashboard. Provided by service at creation time.
    */
  var id: String
  
  /**
    * Name of the Dashboard.
    */
  var name: String
  
  /**
    * ID of the Owner for a dashboard. For any legacy dashboards, this would be the unique identifier for the team associated with the dashboard.
    */
  var ownerId: String
  
  /**
    * Position of the dashboard, within a dashboard group. If unset at creation time, position is decided by the service.
    */
  var position: Double
  
  /**
    * Interval for client to automatically refresh the dashboard. Expressed in minutes.
    */
  var refreshInterval: Double
  
  var url: String
  
  /**
    * The set of Widgets on the dashboard.
    */
  var widgets: js.Array[Widget]
}
object Dashboard {
  
  @scala.inline
  def apply(
    _links: js.Any,
    description: String,
    eTag: String,
    id: String,
    name: String,
    ownerId: String,
    position: Double,
    refreshInterval: Double,
    url: String,
    widgets: js.Array[Widget]
  ): Dashboard = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], eTag = eTag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], refreshInterval = refreshInterval.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], widgets = widgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dashboard]
  }
  
  @scala.inline
  implicit class DashboardMutableBuilder[Self <: Dashboard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshInterval(value: Double): Self = StObject.set(x, "refreshInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgets(value: js.Array[Widget]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetsVarargs(value: Widget*): Self = StObject.set(x, "widgets", js.Array(value :_*))
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
