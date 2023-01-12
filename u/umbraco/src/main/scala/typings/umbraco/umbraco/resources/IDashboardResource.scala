package typings.umbraco.umbraco.resources

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.resources.dashboardResource
  * @description Handles loading the dashboard manifest
  **/
trait IDashboardResource extends StObject {
  
  /**
    * @ngdoc method
    * @name umbraco.resources.dashboardResource#getDashboard
    * @methodOf umbraco.resources.dashboardResource
    *
    * @description
    * Retrieves the dashboard configuration for a given section
    *
    * @param {string} section Alias of section to retrieve dashboard configuraton for
    * @returns {Promise} resourcePromise object containing the user array.
    *
    */
  def getDashboard(section: String): IPromise[IResourcePromise]
}
object IDashboardResource {
  
  inline def apply(getDashboard: String => IPromise[IResourcePromise]): IDashboardResource = {
    val __obj = js.Dynamic.literal(getDashboard = js.Any.fromFunction1(getDashboard))
    __obj.asInstanceOf[IDashboardResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDashboardResource] (val x: Self) extends AnyVal {
    
    inline def setGetDashboard(value: String => IPromise[IResourcePromise]): Self = StObject.set(x, "getDashboard", js.Any.fromFunction1(value))
  }
}
