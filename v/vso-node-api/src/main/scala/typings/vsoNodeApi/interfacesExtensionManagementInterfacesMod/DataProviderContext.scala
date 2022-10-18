package typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataProviderContext extends StObject {
  
  /**
    * Generic property bag that contains context-specific properties that data providers can use when populating their data dictionary
    */
  var properties: StringDictionary[Any]
}
object DataProviderContext {
  
  inline def apply(properties: StringDictionary[Any]): DataProviderContext = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProviderContext]
  }
  
  extension [Self <: DataProviderContext](x: Self) {
    
    inline def setProperties(value: StringDictionary[Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
