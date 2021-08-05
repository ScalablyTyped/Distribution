package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoardChart
  extends StObject
     with BoardChartReference {
  
  /**
    * The links for the resource
    */
  var _links: js.Any
  
  /**
    * The settings for the resource
    */
  var settings: StringDictionary[js.Any]
}
object BoardChart {
  
  inline def apply(_links: js.Any, name: String, settings: StringDictionary[js.Any], url: String): BoardChart = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardChart]
  }
  
  extension [Self <: BoardChart](x: Self) {
    
    inline def setSettings(value: StringDictionary[js.Any]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
