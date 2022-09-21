package typings.webpack.mod

import typings.std.Map
import typings.std.Set
import typings.webpack.webpackStrings.ignore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherInfo extends StObject {
  
  /**
  	 * get current aggregated changes that have not yet send to callback
  	 */
  var changes: Set[String]
  
  /**
  	 * get info about directories
  	 */
  var contextTimeInfoEntries: Map[String, FileSystemInfoEntry | ignore]
  
  /**
  	 * get info about files
  	 */
  var fileTimeInfoEntries: Map[String, FileSystemInfoEntry | ignore]
  
  /**
  	 * get current aggregated removals that have not yet send to callback
  	 */
  var removals: Set[String]
}
object WatcherInfo {
  
  inline def apply(
    changes: Set[String],
    contextTimeInfoEntries: Map[String, FileSystemInfoEntry | ignore],
    fileTimeInfoEntries: Map[String, FileSystemInfoEntry | ignore],
    removals: Set[String]
  ): WatcherInfo = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], contextTimeInfoEntries = contextTimeInfoEntries.asInstanceOf[js.Any], fileTimeInfoEntries = fileTimeInfoEntries.asInstanceOf[js.Any], removals = removals.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherInfo]
  }
  
  extension [Self <: WatcherInfo](x: Self) {
    
    inline def setChanges(value: Set[String]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setContextTimeInfoEntries(value: Map[String, FileSystemInfoEntry | ignore]): Self = StObject.set(x, "contextTimeInfoEntries", value.asInstanceOf[js.Any])
    
    inline def setFileTimeInfoEntries(value: Map[String, FileSystemInfoEntry | ignore]): Self = StObject.set(x, "fileTimeInfoEntries", value.asInstanceOf[js.Any])
    
    inline def setRemovals(value: Set[String]): Self = StObject.set(x, "removals", value.asInstanceOf[js.Any])
  }
}
