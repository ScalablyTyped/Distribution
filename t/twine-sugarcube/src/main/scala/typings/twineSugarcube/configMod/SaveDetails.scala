package typings.twineSugarcube.configMod

import typings.twineSugarcube.twineSugarcubeStrings.autosave
import typings.twineSugarcube.twineSugarcubeStrings.disk
import typings.twineSugarcube.twineSugarcubeStrings.serialize
import typings.twineSugarcube.twineSugarcubeStrings.slot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveDetails extends js.Object {
  
  /**
    * A string representing how the save operation came about—i.e., what caused it.
    */
  var `type`: autosave | disk | serialize | slot = js.native
}
object SaveDetails {
  
  @scala.inline
  def apply(`type`: autosave | disk | serialize | slot): SaveDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveDetails]
  }
  
  @scala.inline
  implicit class SaveDetailsOps[Self <: SaveDetails] (val x: Self) extends AnyVal {
    
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
    def setType(value: autosave | disk | serialize | slot): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
