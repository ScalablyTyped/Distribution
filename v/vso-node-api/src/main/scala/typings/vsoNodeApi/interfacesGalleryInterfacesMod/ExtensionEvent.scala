package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionEvent extends StObject {
  
  /**
    * Id which identifies each data point uniquely
    */
  var id: Double
  
  var properties: Any
  
  /**
    * Timestamp of when the event occurred
    */
  var statisticDate: js.Date
  
  /**
    * Version of the extension
    */
  var version: String
}
object ExtensionEvent {
  
  inline def apply(id: Double, properties: Any, statisticDate: js.Date, version: String): ExtensionEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], statisticDate = statisticDate.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionEvent]
  }
  
  extension [Self <: ExtensionEvent](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setStatisticDate(value: js.Date): Self = StObject.set(x, "statisticDate", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
