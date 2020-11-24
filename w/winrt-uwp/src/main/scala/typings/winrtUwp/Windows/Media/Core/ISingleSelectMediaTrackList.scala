package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a media track list that allows a single item to be selected at a time. */
@js.native
trait ISingleSelectMediaTrackList extends js.Object {
  
  /** Gets or set the currently selected media track in the list. */
  var selectedIndex: Double = js.native
}
object ISingleSelectMediaTrackList {
  
  @scala.inline
  def apply(selectedIndex: Double): ISingleSelectMediaTrackList = {
    val __obj = js.Dynamic.literal(selectedIndex = selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISingleSelectMediaTrackList]
  }
  
  @scala.inline
  implicit class ISingleSelectMediaTrackListOps[Self <: ISingleSelectMediaTrackList] (val x: Self) extends AnyVal {
    
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
    def setSelectedIndex(value: Double): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
  }
}
