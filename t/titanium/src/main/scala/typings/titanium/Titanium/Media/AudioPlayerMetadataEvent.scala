package typings.titanium.Titanium.Media

import typings.titanium.TiMetadataItemType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the timed metadata was encountered most recently within the media as it plays.
  */
@js.native
trait AudioPlayerMetadataEvent extends AudioPlayerBaseEvent {
  
  /**
    * An array of metadata items containing relevant information about the current media item.
    */
  var items: js.Array[TiMetadataItemType] = js.native
}
object AudioPlayerMetadataEvent {
  
  @scala.inline
  def apply(items: js.Array[TiMetadataItemType], source: AudioPlayer): AudioPlayerMetadataEvent = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPlayerMetadataEvent]
  }
  
  @scala.inline
  implicit class AudioPlayerMetadataEventOps[Self <: AudioPlayerMetadataEvent] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: TiMetadataItemType*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[TiMetadataItemType]): Self = this.set("items", value.asInstanceOf[js.Any])
  }
}
