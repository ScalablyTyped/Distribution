package typings.winrtUwp.Windows.Perception.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialAnchorStore extends js.Object {
  var clear: js.Any = js.native
   /* unmapped type */ var getAllSavedAnchors: js.Any = js.native
   /* unmapped type */ var remove: js.Any = js.native
   /* unmapped type */ var trySave: js.Any = js.native
}

object SpatialAnchorStore {
  @scala.inline
  def apply(clear: js.Any, getAllSavedAnchors: js.Any, remove: js.Any, trySave: js.Any): SpatialAnchorStore = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], getAllSavedAnchors = getAllSavedAnchors.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], trySave = trySave.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialAnchorStore]
  }
  @scala.inline
  implicit class SpatialAnchorStoreOps[Self <: SpatialAnchorStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClear(value: js.Any): Self = this.set("clear", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAllSavedAnchors(value: js.Any): Self = this.set("getAllSavedAnchors", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: js.Any): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrySave(value: js.Any): Self = this.set("trySave", value.asInstanceOf[js.Any])
  }
  
}

