package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Media {
  /**
  		 * Fired when the currently playing media item changes.
  		 */
  type MusicPlayerPlayingchangeEvent = typings.titanium.Titanium.Media.MusicPlayerBaseEvent
  /**
  		 * Fired when the music player's playback state changes.
  		 */
  type MusicPlayerStatechangeEvent = typings.titanium.Titanium.Media.MusicPlayerBaseEvent
  /**
  		 * Fired  when audio playback is interrupted by the device.
  		 */
  type SoundInterruptedEvent = typings.titanium.Titanium.Media.SoundBaseEvent
  /**
  		 * Fired when the view element gains focus.
  		 */
  type VideoPlayerFocusEvent = typings.titanium.Titanium.Media.VideoPlayerBaseEvent
  /**
  		 * Fired when the movie play loads.
  		 */
  type VideoPlayerLoadEvent = typings.titanium.Titanium.Media.VideoPlayerBaseEvent
  /**
  		 * Fired when the device detects a long click.
  		 */
  type VideoPlayerLongclickEvent = typings.titanium.Titanium.Media.VideoPlayerBaseEvent
  /**
  		 * Fired when a layout cycle is finished.
  		 */
  type VideoPlayerPostlayoutEvent = typings.titanium.Titanium.Media.VideoPlayerBaseEvent
  /**
  		 * Fired when the movie has preloaded and is ready to play.
  		 */
  type VideoPlayerPreloadEvent = typings.titanium.Titanium.Media.VideoPlayerBaseEvent
  /**
  		 * Fired when the movie player is resized.
  		 */
  type VideoPlayerResizeEvent = typings.titanium.Titanium.Media.VideoPlayerBaseEvent
}
