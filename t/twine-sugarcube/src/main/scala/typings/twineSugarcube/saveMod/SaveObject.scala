package typings.twineSugarcube.saveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveObject extends js.Object {
  
  /** The date when the save was created(in milliseconds elapsed since epoch). */
  var date: Double = js.native
  
  /** The story's save ID. */
  var id: String = js.native
  
  /** Save metadata(end - user specified; must be JSON - serializable). */
  var metadata: js.UndefOr[js.Any] = js.native
  
  /** The marshaled story history(see below for details). */
  var state: SavedState = js.native
  
  /** The title of the save. */
  var title: String = js.native
  
  /** Save version(end - user specified via Config.saves.version). */
  var version: js.UndefOr[js.Any] = js.native
}
object SaveObject {
  
  @scala.inline
  def apply(date: Double, id: String, state: SavedState, title: String): SaveObject = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveObject]
  }
  
  @scala.inline
  implicit class SaveObjectOps[Self <: SaveObject] (val x: Self) extends AnyVal {
    
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
    def setDate(value: Double): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: SavedState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setVersion(value: js.Any): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
