package typings.titanium.Titanium.Media

import typings.titanium.TiMetadataItemType
import org.scalablytyped.runtime.StObject
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
  implicit class AudioPlayerMetadataEventMutableBuilder[Self <: AudioPlayerMetadataEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[TiMetadataItemType]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: TiMetadataItemType*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
