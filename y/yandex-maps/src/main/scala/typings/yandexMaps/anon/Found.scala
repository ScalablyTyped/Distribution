package typings.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Found extends StObject {
  
  var cluster: js.UndefOr[typings.yandexMaps.mod.Cluster] = js.undefined
  
  var found: Boolean
  
  var isClustered: Boolean
  
  var isFilteredOut: Boolean
  
  var isShown: Boolean
}
object Found {
  
  inline def apply(found: Boolean, isClustered: Boolean, isFilteredOut: Boolean, isShown: Boolean): Found = {
    val __obj = js.Dynamic.literal(found = found.asInstanceOf[js.Any], isClustered = isClustered.asInstanceOf[js.Any], isFilteredOut = isFilteredOut.asInstanceOf[js.Any], isShown = isShown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Found]
  }
  
  extension [Self <: Found](x: Self) {
    
    inline def setCluster(value: typings.yandexMaps.mod.Cluster): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setFound(value: Boolean): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    inline def setIsClustered(value: Boolean): Self = StObject.set(x, "isClustered", value.asInstanceOf[js.Any])
    
    inline def setIsFilteredOut(value: Boolean): Self = StObject.set(x, "isFilteredOut", value.asInstanceOf[js.Any])
    
    inline def setIsShown(value: Boolean): Self = StObject.set(x, "isShown", value.asInstanceOf[js.Any])
  }
}
