package typings.winrtUwp.Windows.ApplicationModel.Search

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Stores settings that determine whether the app provides suggestions based on local files, and that define the criteria used to locate and filter these suggestions. */
trait LocalContentSuggestionSettings extends StObject {
  
  /** An Advanced Query Syntax (AQS) string that limits the types and kinds of files that are used to provide suggestions. If no AQS string is specified, suggestions are provided from all local files in locations specified by the locations property. */
  var aqsFilter: String
  
  /** Indicates whether suggestions based on local files are displayed in the search pane. */
  var enabled: Boolean
  
  /** A list of the storageFolder objects that contain files that are used to provide suggestions. If the list is empty, suggestions are provided from files in all of the local libraries for which the app declared capabilities. */
  var locations: IVector[StorageFolder]
  
  /** A list of the file properties whose values are used to provide suggestions from local files. If the list is empty, all of the file properties that are available for suggestions are used. */
  var propertiesToMatch: IVector[String]
}
object LocalContentSuggestionSettings {
  
  inline def apply(
    aqsFilter: String,
    enabled: Boolean,
    locations: IVector[StorageFolder],
    propertiesToMatch: IVector[String]
  ): LocalContentSuggestionSettings = {
    val __obj = js.Dynamic.literal(aqsFilter = aqsFilter.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], propertiesToMatch = propertiesToMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalContentSuggestionSettings]
  }
  
  extension [Self <: LocalContentSuggestionSettings](x: Self) {
    
    inline def setAqsFilter(value: String): Self = StObject.set(x, "aqsFilter", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setLocations(value: IVector[StorageFolder]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setPropertiesToMatch(value: IVector[String]): Self = StObject.set(x, "propertiesToMatch", value.asInstanceOf[js.Any])
  }
}
