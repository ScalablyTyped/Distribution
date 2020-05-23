package typings.videoJs.mod.videojs.Player

import org.scalablytyped.runtime.StringDictionary
import typings.videoJs.mod.videojs.Tech.SourceObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that describes a single piece of media.
  * Properties that are not part of this type description will be retained; so, this can be viewed as a generic metadata storage mechanism as well.
  */
trait MediaObject
  extends /**
  * Properties that are not part of this type description will be retained; so, this can be viewed as a generic metadata storage mechanism as well.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * Unused, except if this object is passed to the MediaSession API.
    */
  var album: js.UndefOr[String] = js.undefined
  /**
    * Unused, except if this object is passed to the MediaSession API.
    */
  var artist: js.UndefOr[String] = js.undefined
  /**
    * Unused, except if this object is passed to the MediaSession API. If not specified, will be populated via the poster, if available.
    */
  var artwork: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * URL to an image that will display before playback.
    */
  var poster: js.UndefOr[String] = js.undefined
  /**
    * A single source object, an array of source objects, or a string referencing a URL to a media source.
    * It is highly recommended that an object or array of objects is used here, so that source selection algorithms can take the type into account.
    */
  var src: js.UndefOr[String | SourceObject | js.Array[SourceObject]] = js.undefined
  /**
    *  An array of objects to be used to create text tracks, following the native track element format.
    *  For ease of removal, these will be created as "remote" text tracks and set to automatically clean up on source changes.
    */
  var textTracks: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Unused, except if this object is passed to the MediaSession API.
    */
  var title: js.UndefOr[String] = js.undefined
}

object MediaObject {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    album: String = null,
    artist: String = null,
    artwork: js.Array[_] = null,
    poster: String = null,
    src: String | SourceObject | js.Array[SourceObject] = null,
    textTracks: js.Array[_] = null,
    title: String = null
  ): MediaObject = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (album != null) __obj.updateDynamic("album")(album.asInstanceOf[js.Any])
    if (artist != null) __obj.updateDynamic("artist")(artist.asInstanceOf[js.Any])
    if (artwork != null) __obj.updateDynamic("artwork")(artwork.asInstanceOf[js.Any])
    if (poster != null) __obj.updateDynamic("poster")(poster.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (textTracks != null) __obj.updateDynamic("textTracks")(textTracks.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaObject]
  }
}

