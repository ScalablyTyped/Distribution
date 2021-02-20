package typings.twineSugarcube.anon

import typings.twineSugarcube.audioMod.AudioTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Add extends StObject {
  
  /**
    * Adds an audio track with the given track ID.
    * @param trackId The ID of the track, which will be used to reference it.
    * @param sources The audio sources for the track, which may be a list of sources or an array. Only one is required,
    * though supplying additional sources in differing formats is recommended, as no single format is supported by all browsers.
    * A source must be either a URL (absolute or relative) to an audio resource, the name of an audio passage, or a data URI. In
    * rare cases where the audio format cannot be automatically detected from the source (URLs are parsed for a file extension,
    * data URIs are parsed for the media type), a format specifier may be prepended to the front of each source to manually
    * specify the format (syntax: formatId|, where formatId is the audio format—generally, whatever the file extension would
    * normally be; e.g., mp3, mp4, ogg, weba, wav).
    * @example
    * // Cache a track with the ID "boom" and one source via relative URL
    * SimpleAudio.tracks.add("boom", "media/audio/explosion.mp3");
    *
    * // Cache a track with the ID "boom" and one source via audio passage
    * SimpleAudio.tracks.add("boom", "explosion");
    *
    * // Cache a track with the ID "bgm_space" and two sources via relative URLs
    * SimpleAudio.tracks.add("bgm_space", "media/audio/space_quest.mp3", "media/audio/space_quest.ogg");
    *
    * // Cache a track with the ID "what" and one source via URL with a format specifier
    * SimpleAudio.tracks.add("what", "mp3|http://an-audio-service.com/a-user/a-track-id");
    *
    * @since 2.28.0
    */
  def add(trackId: String, sources: String*): Unit = js.native
  
  /**
    * Deletes all audio tracks.
    * NOTE: Cannot delete tracks solely under the control of a playlist.
    * @since 2.28.0
    */
  def clear(): Unit = js.native
  
  /**
    * Deletes the audio track with the given track ID.
    *
    * NOTE: Cannot delete tracks solely under the control of a playlist.
    * WARNING: Does not currently remove the track from either groups or playlists. Thus, any groups or playlists
    * containing the deleted track should be rebuilt.
    * @param trackId The ID of the track.
    * @since 2.28.0
    * @example
    * SimpleAudio.tracks.delete("bgm_space");
    */
  def delete(trackId: String): Unit = js.native
  
  /**
    * Returns the AudioTrack instance with the given track ID, or null on failure.
    * NOTE: To affect multiple tracks and/or groups at once, see the SimpleAudio.select() method.
    * Returns the AudioTrack instance with the given track ID, or null on failure.
    * @param trackId The ID of the track.
    * @since 2.28.0
    * @example
    * SimpleAudio.tracks.get("swamped")  → Returns the AudioTrack instance matching "swamped"
    * @example
    * // Return the AudioTrack instance matching "swamped" and do something with it
    * SimpleAudio.tracks.get("swamped").volume(1).play();
    */
  def get(trackId: String): AudioTrack | Null = js.native
  
  /**
    * Returns whether an audio track with the given track ID exists.
    * @param trackId The ID of the track.
    */
  def has(trackId: String): Boolean = js.native
}
object Add {
  
  @scala.inline
  def apply(
    add: (String, /* repeated */ String) => Unit,
    clear: () => Unit,
    delete: String => Unit,
    get: String => AudioTrack | Null,
    has: String => Boolean
  ): Add = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[Add]
  }
  
  @scala.inline
  implicit class AddMutableBuilder[Self <: Add] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (String, /* repeated */ String) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete(value: String => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: String => AudioTrack | Null): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
  }
}
