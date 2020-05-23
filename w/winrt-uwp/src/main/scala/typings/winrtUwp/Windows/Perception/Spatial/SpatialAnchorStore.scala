package typings.winrtUwp.Windows.Perception.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialAnchorStore extends js.Object {
  var clear: js.Any
   /* unmapped type */ var getAllSavedAnchors: js.Any
   /* unmapped type */ var remove: js.Any
   /* unmapped type */ var trySave: js.Any
}

object SpatialAnchorStore {
  @scala.inline
  def apply(clear: js.Any, getAllSavedAnchors: js.Any, remove: js.Any, trySave: js.Any): SpatialAnchorStore = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], getAllSavedAnchors = getAllSavedAnchors.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], trySave = trySave.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialAnchorStore]
  }
}

