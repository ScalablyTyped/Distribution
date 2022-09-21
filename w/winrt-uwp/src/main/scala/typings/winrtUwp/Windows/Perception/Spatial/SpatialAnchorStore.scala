package typings.winrtUwp.Windows.Perception.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialAnchorStore extends StObject {
  
  var clear: Any
  
  /* unmapped type */
  var getAllSavedAnchors: Any
  
  /* unmapped type */
  var remove: Any
  
  /* unmapped type */
  var trySave: Any
}
object SpatialAnchorStore {
  
  inline def apply(clear: Any, getAllSavedAnchors: Any, remove: Any, trySave: Any): SpatialAnchorStore = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], getAllSavedAnchors = getAllSavedAnchors.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], trySave = trySave.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialAnchorStore]
  }
  
  extension [Self <: SpatialAnchorStore](x: Self) {
    
    inline def setClear(value: Any): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setGetAllSavedAnchors(value: Any): Self = StObject.set(x, "getAllSavedAnchors", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: Any): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setTrySave(value: Any): Self = StObject.set(x, "trySave", value.asInstanceOf[js.Any])
  }
}
