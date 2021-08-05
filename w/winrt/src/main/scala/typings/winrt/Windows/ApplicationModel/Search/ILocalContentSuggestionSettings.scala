package typings.winrt.Windows.ApplicationModel.Search

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILocalContentSuggestionSettings extends StObject {
  
  var aqsFilter: String
  
  var enabled: Boolean
  
  var locations: IVector[StorageFolder]
  
  var propertiesToMatch: IVector[String]
}
object ILocalContentSuggestionSettings {
  
  inline def apply(
    aqsFilter: String,
    enabled: Boolean,
    locations: IVector[StorageFolder],
    propertiesToMatch: IVector[String]
  ): ILocalContentSuggestionSettings = {
    val __obj = js.Dynamic.literal(aqsFilter = aqsFilter.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], propertiesToMatch = propertiesToMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocalContentSuggestionSettings]
  }
  
  extension [Self <: ILocalContentSuggestionSettings](x: Self) {
    
    inline def setAqsFilter(value: String): Self = StObject.set(x, "aqsFilter", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setLocations(value: IVector[StorageFolder]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setPropertiesToMatch(value: IVector[String]): Self = StObject.set(x, "propertiesToMatch", value.asInstanceOf[js.Any])
  }
}
