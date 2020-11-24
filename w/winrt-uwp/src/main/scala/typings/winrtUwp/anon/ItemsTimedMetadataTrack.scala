package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Media.Core.TimedMetadataTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsTimedMetadataTrack extends js.Object {
  
  /** The timed metadata tracks that start at startIndex in the list. */ var items: TimedMetadataTrack = js.native
  
  /** The number of timed metadata tracks retrieved. */ var returnValue: Double = js.native
}
object ItemsTimedMetadataTrack {
  
  @scala.inline
  def apply(items: TimedMetadataTrack, returnValue: Double): ItemsTimedMetadataTrack = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsTimedMetadataTrack]
  }
  
  @scala.inline
  implicit class ItemsTimedMetadataTrackOps[Self <: ItemsTimedMetadataTrack] (val x: Self) extends AnyVal {
    
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
    def setItems(value: TimedMetadataTrack): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
}
