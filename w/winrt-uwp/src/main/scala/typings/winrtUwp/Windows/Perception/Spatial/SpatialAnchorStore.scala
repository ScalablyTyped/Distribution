package typings.winrtUwp.Windows.Perception.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialAnchorStore extends StObject {
  
  var clear: js.Any = js.native
  
  /* unmapped type */
  var getAllSavedAnchors: js.Any = js.native
  
  /* unmapped type */
  var remove: js.Any = js.native
  
  /* unmapped type */
  var trySave: js.Any = js.native
}
object SpatialAnchorStore {
  
  @scala.inline
  def apply(clear: js.Any, getAllSavedAnchors: js.Any, remove: js.Any, trySave: js.Any): SpatialAnchorStore = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], getAllSavedAnchors = getAllSavedAnchors.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], trySave = trySave.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialAnchorStore]
  }
  
  @scala.inline
  implicit class SpatialAnchorStoreMutableBuilder[Self <: SpatialAnchorStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: js.Any): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAllSavedAnchors(value: js.Any): Self = StObject.set(x, "getAllSavedAnchors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: js.Any): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrySave(value: js.Any): Self = StObject.set(x, "trySave", value.asInstanceOf[js.Any])
  }
}
