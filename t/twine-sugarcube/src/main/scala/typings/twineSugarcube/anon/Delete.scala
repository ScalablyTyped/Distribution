package typings.twineSugarcube.anon

import typings.twineSugarcube.audioMod.AudioList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delete extends StObject {
  
  /**
    * Adds a playlist with the given list ID. Playlists are useful for playing tracks in a sequence—i.e., one after another.
    * @param listId The ID of the list, which will be used to reference it
    * @param sources The track IDs or descriptors of the tracks to make part of the list, which may be specified as a list or an array.
    * Descriptor objects:
    * * **Existing track form: `{ id, [own], [volume] }`**
    *   * **`id`:** (*string*) The ID of an existing track.
    *   * **`own`:** (optional, *boolean*) When `true`, signifies that the playlist should create its own independent copy
    *     of the track, rather than simply referencing the existing instance.  Owned copies are solely under the control of their
    *     playlist and cannot be selected with either the [`SimpleAudio.tracks.get()` method](#simpleaudio-api-method-tracks-get)
    *     or the [`SimpleAudio.select()` method](#simpleaudio-api-method-select).
    *   * **`volume`:** (optional, *number*) The base volume level of the track within the playlist.  If omitted, defaults to
    *     the track's current volume.  Valid values are floating-point numbers in the range `0` (silent) to `1` (loudest)—e.g.,
    *     `0` is 0%, `0.5` is 50%, `1` is 100%.
    * * **New track form: `{ sources, [volume] }`**
    *   * **`sources`:** (*string array*) The audio sources for the track.  Only one is required, though supplying additional
    *     sources in differing formats is recommended, as no single format is supported by all browsers.  A source must be either
    *     a URL (absolute or relative) to an audio resource, the name of an audio passage, or a data URI.  In rare cases where the
    *     audio format cannot be automatically detected from the source (URLs are parsed for a file extension, data URIs are parsed
    *     for the media type), a format specifier may be prepended to the front of each source to manually specify the format
    *     (syntax: `formatId|`, where `formatId` is the audio format—generally, whatever the file extension would normally be; e.g.,
    *     `mp3`, `mp4`, `ogg`, `weba`, `wav`).
    *   * **`volume`:** (optional, *number*) The base volume level of the track within the playlist.  If omitted, defaults to `1`
    *     (loudest).  Valid values are floating-point numbers in the range `0` (silent) to `1` (loudest)—e.g., `0` is 0%, `0.5`
    *     is 50%, `1` is 100%.
    *
    * @example
    * // Basic usage with track IDs
    * // Add existing tracks at their current volumes
    * SimpleAudio.lists.add("bgm_lacuna", "swamped", "heavens_a_lie", "closer", "to_the_edge");
    *
    * @example
    * // Using a mix of track IDs and descriptors
    * SimpleAudio.lists.add("bgm_lacuna",
    *         // Add existing track "swamped" at its current volume
    *         "swamped",
    *         // Add existing track "heavens_a_lie" at 50% volume
    *         {
    *             id     : "heavens_a_lie",
    *             volume : 0.5
    *         },
    *         // Add an owned copy of existing track "closer" at its current volume
    *         {
    *             id  : "closer",
    *             own : true
    *         },
    *         // Add an owned copy of existing track "to_the_edge" at 100% volume
    *         {
    *             id     : "to_the_edge",
    *             own    : true,
    *             volume : 1
    *         }
    * );
    *
    * @example
    * // Using descriptors with sources
    * SimpleAudio.lists.add("bgm_lacuna",
    *         // Add a track from the given sources at the default volume (100%)
    *         {
    *             sources : ["media/audio/Swamped.mp3"]
    *         },
    *         // Add a track from the given sources at 50% volume
    *         {
    *             sources : ["media/audio/Heaven's_A_Lie.mp3"],
    *             volume  : 0.5
    *         },
    *         // Add a track from the given sources at the default volume (100%)
    *         {
    *             sources : ["media/audio/Closer.mp3"]
    *         },
    *         // Add a track from the given sources at 100% volume
    *         {
    *             sources : ["media/audio/To_The_Edge.mp3"],
    *             volume  : 1
    *         }
    * );
    */
  def add(listId: String, sources: (String | Id)*): Unit
  
  /**
    * Deletes all playlists.
    * @since 2.28.0
    */
  def clear(): Unit
  
  /**
    * Deletes the playlist with the given list ID
    * @param listId The ID of the playlist.
    * @since 2.28.0
    */
  def delete(listId: String): Unit
  
  /**
    * Returns the AudioList instance with the given list ID, or null on failure.
    * @param listId The ID of the playlist.
    * @returns AudioList instance with the given list ID, or null on failure.
    */
  def get(listId: String): AudioList | Null
  
  /**
    * Returns whether a playlist with the given list ID exists.
    * @param listId The ID of the playlist.
    */
  def has(listId: String): Boolean
}
object Delete {
  
  inline def apply(
    add: (String, /* repeated */ String | Id) => Unit,
    clear: () => Unit,
    delete: String => Unit,
    get: String => AudioList | Null,
    has: String => Boolean
  ): Delete = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[Delete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Delete] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (String, /* repeated */ String | Id) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setDelete(value: String => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setGet(value: String => AudioList | Null): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
  }
}
