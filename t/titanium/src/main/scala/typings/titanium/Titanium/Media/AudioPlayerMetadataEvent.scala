package typings.titanium.Titanium.Media

import typings.titanium.TiMetadataItemType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the timed metadata was encountered most recently within the media as it plays.
  */
trait AudioPlayerMetadataEvent extends AudioPlayerBaseEvent {
  /**
    * An array of metadata items containing relevant information about the current media item.
    */
  var items: js.Array[TiMetadataItemType]
}

object AudioPlayerMetadataEvent {
  @scala.inline
  def apply(items: js.Array[TiMetadataItemType], source: AudioPlayer): AudioPlayerMetadataEvent = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPlayerMetadataEvent]
  }
}

