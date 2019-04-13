package typings
package videoDotJsLib.videoDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  @js.native
  /**
  		 * Create an instance of this class.
  		 *
  		 * @param [options={}]
  		 *        Object of option names and values
  		 *
  		 * @param [options.kind='']
  		 *        A valid audio track kind
  		 *
  		 * @param [options.id='vjs_track_' + Guid.newGUID()]
  		 *        A unique id for this AudioTrack.
  		 *
  		 * @param [options.label='']
  		 *        The menu label for this track.
  		 *
  		 * @param [options.language='']
  		 *        A valid two character language code.
  		 *
  		 * @param [options.enabled]
  		 *        If this track is the one that is currently playing. If this track is part of
  		 *        an {@link AudioTrackList}, only one {@link AudioTrack} will be enabled.
  		 */
  class AudioTrack ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.Track {
    def this(options: videoDotJsLib.videoDotJsMod.videojsNs.AudioTrackOptions) = this()
  }
  
  @js.native
  class AudioTrackButtonCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.AudioTrackButton {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options={}]
    		 *        The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.TrackButtonOptions) = this()
  }
  
  @js.native
  class AudioTrackMenuItemCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.AudioTrackMenuItem {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.AudioTrackMenuItemOptions) = this()
  }
  
  @js.native
  class BigPlayButtonCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.BigPlayButton {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *         The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *         The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions) = this()
  }
  
  @js.native
  class ButtonCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.Button {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *         The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *         The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions) = this()
  }
  
  @js.native
  class CaptionsButtonCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.CaptionsButton {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 *
    		 * @param [ready]
    		 *        The function to call when this function is ready.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.TrackButtonOptions) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.TrackButtonOptions, ready: videoDotJsLib.videoDotJsMod.videojsNs.ComponentNs.ReadyCallback) = this()
  }
  
  @js.native
  class CaptionsSettingsMenuItem protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.CaptionSettingsMenuItem {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.CaptionSettingsMenuItemOptions) = this()
  }
  
  @js.native
  class ChaptersButtonCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.ChaptersButton {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 *
    		 * @param [ready]
    		 *        The function to call when this function is ready.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.TrackButtonOptions) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.TrackButtonOptions, ready: videoDotJsLib.videoDotJsMod.videojsNs.ComponentNs.ReadyCallback) = this()
  }
  
  @js.native
  class ChaptersTrackMenuItemCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.ChaptersTrackMenuItem {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.ChaptersTrackMenuItemOptions) = this()
  }
  
  @js.native
  class ClickableComponentCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.ClickableComponent {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *         The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *         The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions) = this()
  }
  
  @js.native
  class CloseButtonCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.CloseButton {
    /**
    		 * Creates an instance of the this class.
    		 *
    		 * @param player
    		 *         The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *         The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.CloseButtonOptions) = this()
  }
  
  @js.native
  class ComponentCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.Component {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 *
    		 * @param [options.children]
    		 *        An array of children objects to intialize this component with. Children objects have
    		 *        a name property that will be used if more than one component of the same type needs to be
    		 *        added.
    		 *
    		 * @param [ready]
    		 *        Function that gets called when the `Component` is ready.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions, ready: videoDotJsLib.videoDotJsMod.videojsNs.ComponentNs.ReadyCallback) = this()
  }
  
  @js.native
  class ControlBarCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.ControlBar {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.ControlBarOptions) = this()
  }
  
  @js.native
  class CurrentTimeDisplayCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.CurrentTimeDisplay {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions) = this()
  }
  
  @js.native
  class CustomControlSpacerCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.CustomControlSpacer {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 *
    		 * @param [ready]
    		 *        Function that gets called when the `Component` is ready.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions, ready: videoDotJsLib.videoDotJsMod.videojsNs.ComponentNs.ReadyCallback) = this()
  }
  
  @js.native
  class DescriptionsButtonCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.DescriptionsButton {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 *
    		 * @param [ready]
    		 *        The function to call when this component is ready.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.TrackButtonOptions) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.TrackButtonOptions, ready: videoDotJsLib.videoDotJsMod.videojsNs.ComponentNs.ReadyCallback) = this()
  }
  
  @js.native
  class DurationDisplayCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.DurationDisplay {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions) = this()
  }
  
  @js.native
  class ErrorDisplayCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.ErrorDisplay {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *         The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *         The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.ModalDialogOptions) = this()
  }
  
  @js.native
  class EventTargetCls ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.EventTarget
  
  @js.native
  class FullscreenToggleCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.FullscreenToggle {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions) = this()
  }
  
  @js.native
  /**
  		 * Create an instance of this class.
  		 *
  		 * @param [tracks=[]]
  		 *        A list of `HtmlTrackElement` to instantiate the list with.
  		 */
  class HTMLTrackElementListCls ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.HTMLTrackElementList {
    def this(tracks: js.Array[stdLib.HTMLTrackElement]) = this()
    /**
    		 * The current number of `Track`s in the this Trackist.
    		 */
    /* CompleteClass */
    override var length: scala.Double = js.native
  }
  
  @js.native
  class MediaErrorCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.MediaError {
    def this(value: java.lang.String) = this()
    def this(value: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
    /**
    		 * Create an instance of this class.
    		 *
    		 * @param value
    		 *        This can be of multiple types:
    		 *        - number: should be a standard error code
    		 *        - string: an error message (the code will be 0)
    		 *        - Object: arbitrary properties
    		 *        - `MediaError` (native): used to populate a video.js `MediaError` object
    		 *        - `MediaError` (video.js): will return itself if it's already a
    		 *          video.js `MediaError` object.
    		 */
    def this(value: scala.Double) = this()
    def this(value: videoDotJsLib.videoDotJsMod.videojsNs.MediaError) = this()
    /**
    		 * W3C error code for media error aborted.
    		 * @default 1
    		 */
    /* CompleteClass */
    override var MEDIA_ERR_ABORTED: videoDotJsLib.videoDotJsLibNumbers.`1` = js.native
    /**
    		 * W3C error code for any custom error.
    		 * @default 0
    		 */
    /* CompleteClass */
    override var MEDIA_ERR_CUSTOM: videoDotJsLib.videoDotJsLibNumbers.`0` = js.native
    /**
    		 * W3C error code for any decoding error.
    		 * @default 3
    		 */
    /* CompleteClass */
    override var MEDIA_ERR_DECODE: videoDotJsLib.videoDotJsLibNumbers.`3` = js.native
    /**
    		 * W3C error code for any time that a source is encrypted.
    		 * @default 5
    		 */
    /* CompleteClass */
    override var MEDIA_ERR_ENCRYPTED: videoDotJsLib.videoDotJsLibNumbers.`5` = js.native
    /**
    		 * W3C error code for any network error.
    		 * @default 2
    		 */
    /* CompleteClass */
    override var MEDIA_ERR_NETWORK: videoDotJsLib.videoDotJsLibNumbers.`2` = js.native
    /**
    		 * W3C error code for any time that a source is not supported.
    		 * @default 4
    		 */
    /* CompleteClass */
    override var MEDIA_ERR_SRC_NOT_SUPPORTED: videoDotJsLib.videoDotJsLibNumbers.`4` = js.native
    /**
    		 * The error code that refers two one of the defined `MediaError` types
    		 *
    		 */
    /* CompleteClass */
    override var code: scala.Double = js.native
    /**
    		 * An optional message that to show with the error. Message is not part of the HTML5
    		 * video spec but allows for more informative custom errors.
    		 *
    		 */
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /**
    		 * An optional status code that can be set by plugins to allow even more detail about
    		 * the error. For example a plugin might provide a specific HTTP status code and an
    		 * error message for that code. Then when the plugin gets that error this class will
    		 * know how to display an error message for it. This allows a custom message to show
    		 * up on the `Player` error overlay.
    		 *
    		 */
    /* CompleteClass */
    override var status: js.Array[_] = js.native
  }
  
  @js.native
  class MenuButtonCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.MenuButton {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options={}]
    		 *        The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.MenuButtonOptions) = this()
  }
  
  @js.native
  class MenuCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.Menu {
    /**
    		 * Create an instance of this class.
    		 *
    		 * @param player
    		 *        the player that this component should attach to
    		 *
    		 * @param [options]
    		 *        Object of option names and values
    		 *
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.MenuOptions) = this()
  }
  
  @js.native
  class MenuItemCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.MenuItem {
    /**
    		 * Creates an instance of the this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options={}]
    		 *        The key/value store of player options.
    		 *
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.MenuItemOptions) = this()
  }
  
  @js.native
  class ModalDialogCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.ModalDialog {
    /**
    		 * Create an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.ModalDialogOptions) = this()
  }
  
  @js.native
  class MouseTimeDisplayCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.MouseTimeDisplay {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The {@link Player} that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions) = this()
  }
  
  @js.native
  class PlayerCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.Player {
    /**
    		 * An instance of the `Player` class is created when any of the Video.js setup methods
    		 * are used to initialize a video.
    		 *
    		 * After an instance has been created it can be accessed globally in two ways:
    		 * 1. By calling `videojs('example_video_1');`
    		 * 2. By using it directly via  `videojs.players.example_video_1;`
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.PlayerOptions) = this()
  }
  
  @js.native
  class PluginCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.Plugin {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * Sub-classes should call `super` to ensure plugins are properly initialized.
    		 *
    		 * @param player
    		 *        A Video.js player instance.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
  }
  
  @js.native
  class ProgressControlCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.ProgressControl {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions) = this()
  }
  
  @js.native
  class SeekBarCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.SeekBar {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.SliderOptions) = this()
  }
  
  @js.native
  class SliderCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.Slider {
    /**
    		 * Create an instance of this class
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.SliderOptions) = this()
  }
  
  @js.native
  class SpacerCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.Spacer {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 *
    		 * @param [ready]
    		 *        Function that gets called when the `Component` is ready.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions, ready: videoDotJsLib.videoDotJsMod.videojsNs.ComponentNs.ReadyCallback) = this()
  }
  
  @js.native
  /**
  		 * Create an instance of this Tech.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 *
  		 * @param ready
  		 *        Callback function to call when the `HTML5` Tech is ready.
  		 */
  class TechCls ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.Tech {
    def this(options: js.Any) = this()
    def this(options: js.Any, ready: videoDotJsLib.videoDotJsMod.videojsNs.ComponentNs.ReadyCallback) = this()
  }
  
  @js.native
  class TextTrackButtonCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.TextTrackButton {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options={}]
    		 *        The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.TrackButtonOptions) = this()
  }
  
  @js.native
  class TextTrackCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.TextTrack {
    /**
    		 * Create an instance of this class.
    		 *
    		 * @param options={}
    		 *        Object of option names and values
    		 *
    		 * @param options.tech
    		 *        A reference to the tech that owns this TextTrack.
    		 *
    		 * @param [options.kind='subtitles']
    		 *        A valid text track kind.
    		 *
    		 * @param [options.mode='disabled']
    		 *        A valid text track mode.
    		 *
    		 * @param [options.id='vjs_track_' + Guid.newGUID()]
    		 *        A unique id for this TextTrack.
    		 *
    		 * @param [options.label='']
    		 *        The menu label for this track.
    		 *
    		 * @param [options.language='']
    		 *        A valid two character language code.
    		 *
    		 * @param [options.srclang='']
    		 *        A valid two character language code. An alternative, but deprioritized
    		 *        version of `options.language`
    		 *
    		 * @param [options.src]
    		 *        A url to TextTrack cues.
    		 *
    		 * @param [options.default]
    		 *        If this track should default to on or off.
    		 */
    def this(options: videoDotJsLib.videoDotJsMod.videojsNs.TextTrackOptions) = this()
  }
  
  @js.native
  class TextTrackCueListCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.TextTrackCueList {
    /**
    		 * Create an instance of this class..
    		 *
    		 * @param cues
    		 *        A list of cues to be initialized with
    		 */
    def this(cues: js.Array[videoDotJsLib.videoDotJsMod.videojsNs.TextTrackCueListNs.TextTrackCue]) = this()
    /**
    		 * The current number of `TextTrackCue`s in the TextTrackCueList.
    		 */
    /* CompleteClass */
    override var length: scala.Double = js.native
    /**
    		 * Get a `TextTrackCue` that is currently in the `TextTrackCueList` by id.
    		 *
    		 * @param id
    		 *        The id of the cue that should be searched for.
    		 *
    		 * @return A single cue or null if none was found.
    		 */
    /* CompleteClass */
    override def getCueById(id: java.lang.String): videoDotJsLib.videoDotJsMod.videojsNs.TextTrackCueListNs.TextTrackCue = js.native
  }
  
  @js.native
  /**
  		 * Create an instance of this class
  		 *
  		 * @param tracks
  		 *        A list of tracks to initialize the list with.
  		 */
  class TextTrackListCls ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.TextTrackList {
    def this(tracks: js.Array[videoDotJsLib.videoDotJsMod.videojsNs.TextTrack]) = this()
  }
  
  @js.native
  class TextTrackMenuItemCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.TextTrackMenuItem {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.TextTrackMenuItemOptions) = this()
  }
  
  @js.native
  class TextTrackSettingsCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.TextTrackSettings {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *         The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *         The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.TextTrackSettingsOptions) = this()
  }
  
  @js.native
  class TimeDisplayCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.TimeDisplay {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions) = this()
  }
  
  @js.native
  class TimeToolTipCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.TimeToolTip {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *         The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *         The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions) = this()
  }
  
  @js.native
  class TrackButton protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.MenuButton {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *         The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *         The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.TrackButtonOptions) = this()
  }
  
  @js.native
  /**
  		 * Create an instance of this class.
  		 *
  		 * @param [options={}]
  		 *        Object of option names and values
  		 *
  		 * @param [options.kind='']
  		 *        A valid kind for the track type you are creating.
  		 *
  		 * @param [options.id='vjs_track_' + Guid.newGUID()]
  		 *        A unique id for this AudioTrack.
  		 *
  		 * @param [options.label='']
  		 *        The menu label for this track.
  		 *
  		 * @param [options.language='']
  		 *        A valid two character language code.
  		 */
  class TrackCls ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.Track {
    def this(options: videoDotJsLib.videoDotJsMod.videojsNs.TrackOptions) = this()
  }
  
  @js.native
  /**
  		 * Create an instance of this class
  		 *
  		 * @param tracks
  		 *        A list of tracks to initialize the list with.
  		 */
  class TrackListCls ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.TrackList {
    def this(tracks: js.Array[videoDotJsLib.videoDotJsMod.videojsNs.Track]) = this()
  }
  
  @js.native
  class VolumeBarCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.VolumeBar {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.SliderOptions) = this()
  }
  
  @js.native
  class VolumeControlCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.VolumeControl {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options={}]
    		 *        The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.VolumeControlOptions) = this()
  }
  
  @js.native
  class VolumeLevelCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.VolumeLevel {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 *
    		 * @param [options.children]
    		 *        An array of children objects to intialize this component with. Children objects have
    		 *        a name property that will be used if more than one component of the same type needs to be
    		 *        added.
    		 *
    		 * @param [ready]
    		 *        Function that gets called when the `Component` is ready.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions, ready: videoDotJsLib.videoDotJsMod.videojsNs.ComponentNs.ReadyCallback) = this()
  }
  
  @js.native
  class VolumePanelCls protected ()
    extends videoDotJsLib.videoDotJsMod.videojsNs.VolumePanel {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options={}]
    		 *        The key/value store of player options.
    		 */
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player) = this()
    def this(player: videoDotJsLib.videoDotJsMod.videojsNs.Player, options: videoDotJsLib.videoDotJsMod.videojsNs.VolumePanel) = this()
  }
  
  /**
  	 * Whether or not the browser supports touch events. Included for backward
  	 * compatibility with 4.x, but deprecated. Use `browser.TOUCH_ENABLED`
  	 * instead going forward.
  	 *
  	 * @deprecated since version 5.0
  	 */
  val TOUCH_ENABLED: scala.Boolean = js.native
  /**
  	 * Current software version. Follows semver.
  	 *
  	 */
  val VERSION: java.lang.String = js.native
  /**
  	 * A suite of browser and device tests from {@link browser}.
  	 *
  	 */
  val browser: videoDotJsLib.videoDotJsMod.videojsNs.Browser = js.native
  val dom: videoDotJsLib.videoDotJsMod.videojsNs.Dom = js.native
  /**
  	 * Log messages
  	 *
  	 * @borrows log:log as log
  	 */
  val log: videoDotJsLib.videoDotJsMod.videojsNs.Log = js.native
  /**
  	 * The global options object. These are the settings that take effect
  	 * if no overrides are specified when the player is created.
  	 *
  	 */
  val options: videoDotJsLib.videoDotJsMod.videojsNs.PlayerOptions = js.native
  /**
  	 * A cross-browser XMLHttpRequest wrapper. Here's a simple example:
  	 *
  	 * @param options
  	 *        settings for the request.
  	 *
  	 * @return The request object.
  	 *
  	 * @see https://github.com/Raynos/xhr
  	 */
  val xhr: videoDotJsLib.videoDotJsMod.videojsNs.XhrObject = js.native
  /**
  	 * Adding languages so that they're available to all players.
  	 * Example: `addLanguage('es', { 'Hello': 'Hola' });`
  	 *
  	 * @param code
  	 *        The language code or dictionary property
  	 *
  	 * @param data
  	 *        The data values to be translated
  	 *
  	 * @return The resulting language dictionary object
  	 */
  def addLanguage(code: java.lang.String, data: videoDotJsLib.videoDotJsMod.videojsNs.LanguageTranslations): videoDotJsLib.videoDotJsMod.videojsNs.LanguageTranslations = js.native
  /**
  	 * Bind (a.k.a proxy or Context). A simple method for changing the context of a function
  	 * It also stores a unique id on the function so it can be easily removed from events.
  	 *
  	 * @param context
  	 *        The object to bind as scope.
  	 *
  	 * @param fn
  	 *        The function to be bound to a scope.
  	 *
  	 * @param [uid]
  	 *        An optional unique ID for the function to be set
  	 *
  	 * @return The new function that will be bound into the context given
  	 */
  def bind[F /* <: js.Function0[_] */](context: js.Any, fn: F): F = js.native
  def bind[F /* <: js.Function0[_] */](context: js.Any, fn: F, uid: scala.Double): F = js.native
  /**
  	 * Should create a fake `TimeRange` object which mimics an HTML5 time range instance.
  	 *
  	 * @param start
  	 *        The start of a single range or an array of ranges
  	 *
  	 * @param end
  	 *        The end of a single range.
  	 */
  def createTimeRanges(): videoDotJsLib.videoDotJsMod.videojsNs.TimeRange = js.native
  def createTimeRanges(start: js.Array[videoDotJsLib.videoDotJsMod.videojsNs.TimeRange]): videoDotJsLib.videoDotJsMod.videojsNs.TimeRange = js.native
  def createTimeRanges(start: js.Array[videoDotJsLib.videoDotJsMod.videojsNs.TimeRange], end: scala.Double): videoDotJsLib.videoDotJsMod.videojsNs.TimeRange = js.native
  def createTimeRanges(start: scala.Double): videoDotJsLib.videoDotJsMod.videojsNs.TimeRange = js.native
  def createTimeRanges(start: scala.Double, end: scala.Double): videoDotJsLib.videoDotJsMod.videojsNs.TimeRange = js.native
  /**
  	 * Format seconds as a time string, H:MM:SS or M:SS. Supplying a guide (in seconds)
  	 * will force a number of leading zeros to cover the length of the guide.
  	 *
  	 * @param seconds
  	 *        Number of seconds to be turned into a string
  	 *
  	 * @param guide
  	 *        Number (in seconds) to model the string after
  	 *
  	 * @return Time formatted as H:MM:SS or M:SS
  	 */
  def formatTime(seconds: scala.Double, guide: scala.Double): java.lang.String = js.native
  /**
  	 * Returns an array of all current players.
  	 *
  	 * @return An array of all players. The array will be in the order that
  	 *         `Object.keys` provides, which could potentially vary between
  	 *         JavaScript engines.
  	 *
  	 */
  def getAllPlayers(): js.Array[videoDotJsLib.videoDotJsMod.videojsNs.Player] = js.native
  /**
  	 * Get a single player based on an ID or DOM element.
  	 *
  	 * This is useful if you want to check if an element or ID has an associated
  	 * Video.js player, but not create one if it doesn't.
  	 *
  	 * @param id
  	 *          An HTML element - `<video>`, `<audio>`, or `<video-js>` -
  	 *          or a string matching the `id` of such an element.
  	 *
  	 * @return	A player instance or `undefined` if there is no player instance
  	 *          matching the argument.
  	 */
  def getPlayer(id: java.lang.String): videoDotJsLib.videoDotJsMod.videojsNs.Player = js.native
  /**
  	 * Get an object with the currently created players, keyed by player ID
  	 *
  	 * @return	The created players
  	 */
  def getPlayers(): org.scalablytyped.runtime.StringDictionary[videoDotJsLib.videoDotJsMod.videojsNs.Player] = js.native
  /**
  	 * Add a function hook that will only run once to a specific videojs lifecycle.
  	 *
  	 * @param type
  	 *        the lifecycle to hook the function to.
  	 *
  	 * @param fn
  	 *        The function or array of functions to attach.
  	 */
  def hookOnce(`type`: java.lang.String): scala.Unit = js.native
  def hookOnce(`type`: java.lang.String, fn: js.Array[js.Function0[_]]): scala.Unit = js.native
  def hookOnce(`type`: java.lang.String, fn: js.Function0[_]): scala.Unit = js.native
  @JSName("hook")
  def hook_beforesetup(
    `type`: videoDotJsLib.videoDotJsLibStrings.beforesetup,
    fn: js.Array[videoDotJsLib.videoDotJsMod.videojsNs.HookNs.BeforeSetup]
  ): scala.Unit = js.native
  @JSName("hook")
  def hook_beforesetup(
    `type`: videoDotJsLib.videoDotJsLibStrings.beforesetup,
    fn: videoDotJsLib.videoDotJsMod.videojsNs.HookNs.BeforeSetup
  ): scala.Unit = js.native
  @JSName("hook")
  def hook_setup(
    `type`: videoDotJsLib.videoDotJsLibStrings.setup,
    fn: js.Array[videoDotJsLib.videoDotJsMod.videojsNs.HookNs.Setup]
  ): scala.Unit = js.native
  /**
  	 * Add a function hook to a specific videojs lifecycle.
  	 *
  	 * @param type
  	 *        the lifecycle to hook the function to.
  	 *
  	 * @param fn
  	 *        The function or array of functions to attach.
  	 */
  @JSName("hook")
  def hook_setup(
    `type`: videoDotJsLib.videoDotJsLibStrings.setup,
    fn: videoDotJsLib.videoDotJsMod.videojsNs.HookNs.Setup
  ): scala.Unit = js.native
  /**
  	 * Get a list of hooks for a specific lifecycle
  	 *
  	 * @param type
  	 *        the lifecycle to get hooks from
  	 *
  	 * @param [fn]
  	 *        Optionally add a hook (or hooks) to the lifecycle that your are getting.
  	 *
  	 * @return	an array of hooks, or an empty array if there are none.
  	 */
  def hooks(`type`: java.lang.String): scala.Unit = js.native
  def hooks(`type`: java.lang.String, fn: js.Array[js.Function0[_]]): scala.Unit = js.native
  def hooks(`type`: java.lang.String, fn: js.Function0[_]): scala.Unit = js.native
  /**
  	 * Returns whether the url passed is a cross domain request or not.
  	 *
  	 * @param url
  	 *        The url to check.
  	 *
  	 * @return	Whether it is a cross domain request or not.
  	 */
  def isCrossOrigin(url: java.lang.String): scala.Boolean = js.native
  /**
  	 * Deep-merge one or more options objects, recursively merging **only** plain
  	 * object properties.
  	 *
  	 * @param sources
  	 *          One or more objects to merge into a new object.
  	 *
  	 * @return	A new object that is the merged result of all sources.
  	 */
  def mergeOptions[A, B, C, D, E, F](option: A): A with B with C with D with E with F = js.native
  def mergeOptions[A, B, C, D, E, F](option: A, option2: B): A with B with C with D with E with F = js.native
  def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: C): A with B with C with D with E with F = js.native
  def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: C, option4: D): A with B with C with D with E with F = js.native
  def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: C, option4: D, option5: E): A with B with C with D with E with F = js.native
  def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: C, option4: D, option5: E, option6: F): A with B with C with D with E with F = js.native
  /**
  	 * Removes event listeners from an element
  	 *
  	 * @param elem
  	 *        Object to remove listeners from.
  	 *
  	 * @param [type]
  	 *        Type of listener to remove. Don't include to remove all events from element.
  	 *
  	 * @param [fn]
  	 *        Specific listener to remove. Don't include to remove listeners for an event
  	 *        type.
  	 */
  def off(
    elem: stdLib.Element,
    `type`: java.lang.String,
    fn: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.EventListener
  ): scala.Unit = js.native
  /**
  	 * Add an event listener to element
  	 * It stores the handler function in a separate cache object
  	 * and adds a generic handler to the element's event,
  	 * along with a unique id (guid) to the element.
  	 *
  	 * @param elem
  	 *        Element or object to bind listeners to
  	 *
  	 * @param type
  	 *        Type of event to bind to.
  	 *
  	 * @param fn
  	 *        Event listener.
  	 */
  def on(
    elem: stdLib.Element,
    `type`: java.lang.String,
    fn: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.EventListener
  ): scala.Unit = js.native
  def on(
    elem: stdLib.Element,
    `type`: js.Array[java.lang.String],
    fn: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.EventListener
  ): scala.Unit = js.native
  /**
  	 * Trigger a listener only once for an event
  	 *
  	 * @param elem
  	 *        Element or object to bind to.
  	 *
  	 * @param type
  	 *        Name/type of event
  	 *
  	 * @param fn
  	 *        Event Listener function
  	 */
  def one(
    elem: stdLib.Element,
    `type`: java.lang.String,
    fn: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.EventListener
  ): scala.Unit = js.native
  def one(
    elem: stdLib.Element,
    `type`: js.Array[java.lang.String],
    fn: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.EventListener
  ): scala.Unit = js.native
  /**
  	 * Resolve and parse the elements of a URL.
  	 *
  	 * @param url
  	 *         The url to parse
  	 *
  	 * @return	An object of url details
  	 */
  def parseUrl(url: java.lang.String): videoDotJsLib.videoDotJsMod.videojsNs.urlNs.URLObject = js.native
  /**
  	 * Remove a hook from a specific videojs lifecycle.
  	 *
  	 * @param type
  	 *        the lifecycle that the function hooked to
  	 *
  	 * @param fn
  	 *        The hooked function to remove
  	 *
  	 * @return	The function that was removed or undef
  	 */
  def removeHook(`type`: java.lang.String, fn: js.Function0[_]): scala.Boolean = js.native
  /**
  	 * Resets formatTime to the default implementation.
  	 */
  def resetFormatTime(): scala.Unit = js.native
  /**
  	 * Replaces the default formatTime implementation with a custom implementation.
  	 *
  	 * @param customImplementation
  	 *        A function which will be used in place of the default formatTime implementation.
  	 *        Will receive the current time in seconds and the guide (in seconds) as arguments.
  	 */
  def setFormatTime(
    customImplementation: js.Function2[/* seconds */ scala.Double, /* guide */ scala.Double, java.lang.String]
  ): scala.Unit = js.native
  def trigger(elem: stdLib.Element, event: java.lang.String): js.UndefOr[scala.Boolean] = js.native
  def trigger(elem: stdLib.Element, event: java.lang.String, hash: js.Any): js.UndefOr[scala.Boolean] = js.native
  /**
  	 * Trigger an event for an element
  	 *
  	 * @param elem
  	 *        Element to trigger an event on
  	 *
  	 * @param event
  	 *        A string (the type) or an event object with a type attribute
  	 *
  	 * @param [hash]
  	 *        data hash to pass along with the event
  	 *
  	 * @return	- Returns the opposite of `defaultPrevented` if default was prevented
  	 *         - Otherwise returns undefined
  	 */
  def trigger(elem: stdLib.Element, event: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.Event): js.UndefOr[scala.Boolean] = js.native
  def trigger(
    elem: stdLib.Element,
    event: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.Event,
    hash: js.Any
  ): js.UndefOr[scala.Boolean] = js.native
  /**
  	 * Register a middleware to a source type.
  	 *
  	 * @param type A string representing a MIME type.
  	 * @param middleware A middleware factory that takes a player.
  	 */
  def use(
    `type`: java.lang.String,
    middleware: js.Function1[
      /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
      videoDotJsLib.videoDotJsMod.videojsNs.Middleware
    ]
  ): scala.Unit = js.native
  /**
  	 * A representation of a single `AudioTrack`. If it is part of an {@link AudioTrackList}
  	 * only one `AudioTrack` in the list will be enabled at a time.
  	 *
  	 * @see [Spec]{@link https://html.spec.whatwg.org/multipage/embedded-content.html#audiotrack}
  	 */
  @js.native
  object AudioTrack
    extends /**
  		 * Create an instance of this class.
  		 *
  		 * @param [options={}]
  		 *        Object of option names and values
  		 *
  		 * @param [options.kind='']
  		 *        A valid audio track kind
  		 *
  		 * @param [options.id='vjs_track_' + Guid.newGUID()]
  		 *        A unique id for this AudioTrack.
  		 *
  		 * @param [options.label='']
  		 *        The menu label for this track.
  		 *
  		 * @param [options.language='']
  		 *        A valid two character language code.
  		 *
  		 * @param [options.enabled]
  		 *        If this track is the one that is currently playing. If this track is part of
  		 *        an {@link AudioTrackList}, only one {@link AudioTrack} will be enabled.
  		 */
  org.scalablytyped.runtime.Instantiable0[videoDotJsLib.videoDotJsMod.videojsNs.Track]
       with org.scalablytyped.runtime.Instantiable1[
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.AudioTrackOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.Track
        ]
  
  @js.native
  object AudioTrackButton
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options={}]
  		 *        The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.AudioTrackButton
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.TrackButtonOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.AudioTrackButton
        ]
  
  @js.native
  object AudioTrackMenuItem
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.AudioTrackMenuItem
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.AudioTrackMenuItemOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.AudioTrackMenuItem
        ]
  
  @js.native
  object BigPlayButton
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *         The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *         The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.BigPlayButton
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.BigPlayButton
        ]
  
  @js.native
  object Button
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *         The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *         The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.Button
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.Button
        ]
  
  @js.native
  object CaptionsButton
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 *
  		 * @param [ready]
  		 *        The function to call when this function is ready.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.CaptionsButton
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.TrackButtonOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.CaptionsButton
        ]
       with org.scalablytyped.runtime.Instantiable3[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.TrackButtonOptions, 
          /* ready */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentNs.ReadyCallback, 
          videoDotJsLib.videoDotJsMod.videojsNs.CaptionsButton
        ]
  
  @js.native
  object CaptionsSettingsMenuItem
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.CaptionSettingsMenuItem
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.CaptionSettingsMenuItemOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.CaptionSettingsMenuItem
        ]
  
  @js.native
  object ChaptersButton
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 *
  		 * @param [ready]
  		 *        The function to call when this function is ready.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.ChaptersButton
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.TrackButtonOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.ChaptersButton
        ]
       with org.scalablytyped.runtime.Instantiable3[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.TrackButtonOptions, 
          /* ready */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentNs.ReadyCallback, 
          videoDotJsLib.videoDotJsMod.videojsNs.ChaptersButton
        ]
  
  @js.native
  object ChaptersTrackMenuItem
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.ChaptersTrackMenuItem
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.ChaptersTrackMenuItemOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.ChaptersTrackMenuItem
        ]
  
  @js.native
  object ClickableComponent
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *         The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *         The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.ClickableComponent
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.ClickableComponent
        ]
  
  @js.native
  object CloseButton
    extends /**
  		 * Creates an instance of the this class.
  		 *
  		 * @param player
  		 *         The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *         The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.CloseButton
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.CloseButtonOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.CloseButton
        ]
  
  @js.native
  object Component
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 *
  		 * @param [options.children]
  		 *        An array of children objects to intialize this component with. Children objects have
  		 *        a name property that will be used if more than one component of the same type needs to be
  		 *        added.
  		 *
  		 * @param [ready]
  		 *        Function that gets called when the `Component` is ready.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.Component
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.Component
        ]
       with org.scalablytyped.runtime.Instantiable3[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions, 
          /* ready */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentNs.ReadyCallback, 
          videoDotJsLib.videoDotJsMod.videojsNs.Component
        ] {
    def getComponent(name: java.lang.String): videoDotJsLib.Anon_Button = js.native
    /**
    		 * Get a `Component` based on the name it was registered with.
    		 *
    		 * @param name
    		 *        The Name of the component to get.
    		 *
    		 * @return The `Component` that got registered under the given name.
    		 *
    		 * @deprecated In `videojs` 6 this will not return `Component`s that were not
    		 *             registered using {@link Component.registerComponent}. Currently we
    		 *             check the global `videojs` object for a `Component` name and
    		 *             return that if it exists.
    		 */
    @JSName("getComponent")
    def getComponent_Button(name: videoDotJsLib.videoDotJsLibStrings.Button): videoDotJsLib.Anon_Options = js.native
    @JSName("getComponent")
    def getComponent_ClickableComponent(name: videoDotJsLib.videoDotJsLibStrings.ClickableComponent): videoDotJsLib.Anon_OptionsPlayer = js.native
    @JSName("getComponent")
    def getComponent_Component(name: videoDotJsLib.videoDotJsLibStrings.Component): videoDotJsLib.Anon_Button = js.native
    @JSName("getComponent")
    def getComponent_Menu(name: videoDotJsLib.videoDotJsLibStrings.Menu): videoDotJsLib.Anon_OptionsPlayerMenu = js.native
    @JSName("getComponent")
    def getComponent_MenuButton(name: videoDotJsLib.videoDotJsLibStrings.MenuButton): videoDotJsLib.Anon_OptionsPlayerMenuButton = js.native
    @JSName("getComponent")
    def getComponent_MenuItem(name: videoDotJsLib.videoDotJsLibStrings.MenuItem): videoDotJsLib.Anon_OptionsPlayerMenuItem = js.native
    @JSName("getComponent")
    def getComponent_ModalDialog(name: videoDotJsLib.videoDotJsLibStrings.ModalDialog): videoDotJsLib.Anon_OptionsPlayerModalDialog = js.native
    @JSName("getComponent")
    def getComponent_MouseTimeDisplay(name: videoDotJsLib.videoDotJsLibStrings.MouseTimeDisplay): videoDotJsLib.Anon_OptionsPlayerComponentOptions = js.native
    @JSName("getComponent")
    def getComponent_Player(name: videoDotJsLib.videoDotJsLibStrings.Player): videoDotJsLib.Anon_GetTagSettings = js.native
    @JSName("getComponent")
    def getComponent_Spacer(name: videoDotJsLib.videoDotJsLibStrings.Spacer): videoDotJsLib.Anon_OptionsPlayerReady = js.native
    @JSName("getComponent")
    def getComponent_TimeTooltip(name: videoDotJsLib.videoDotJsLibStrings.TimeTooltip): videoDotJsLib.Anon_OptionsPlayerComponentOptionsTimeToolTip = js.native
    @JSName("getComponent")
    def getComponent_button(name: videoDotJsLib.videoDotJsLibStrings.button): videoDotJsLib.Anon_Options = js.native
    @JSName("getComponent")
    def getComponent_clickablecomponent(name: videoDotJsLib.videoDotJsLibStrings.clickablecomponent): videoDotJsLib.Anon_OptionsPlayer = js.native
    @JSName("getComponent")
    def getComponent_component(name: videoDotJsLib.videoDotJsLibStrings.component): videoDotJsLib.Anon_Button = js.native
    @JSName("getComponent")
    def getComponent_menu(name: videoDotJsLib.videoDotJsLibStrings.menu): videoDotJsLib.Anon_OptionsPlayerMenu = js.native
    @JSName("getComponent")
    def getComponent_menubutton(name: videoDotJsLib.videoDotJsLibStrings.menubutton): videoDotJsLib.Anon_OptionsPlayerMenuButton = js.native
    @JSName("getComponent")
    def getComponent_menuitem(name: videoDotJsLib.videoDotJsLibStrings.menuitem): videoDotJsLib.Anon_OptionsPlayerMenuItem = js.native
    @JSName("getComponent")
    def getComponent_modaldialog(name: videoDotJsLib.videoDotJsLibStrings.modaldialog): videoDotJsLib.Anon_OptionsPlayerModalDialog = js.native
    @JSName("getComponent")
    def getComponent_mouseTimeDisplay(name: videoDotJsLib.videoDotJsLibStrings.mouseTimeDisplay): videoDotJsLib.Anon_OptionsPlayerComponentOptions = js.native
    @JSName("getComponent")
    def getComponent_player(name: videoDotJsLib.videoDotJsLibStrings.player): videoDotJsLib.Anon_GetTagSettings = js.native
    @JSName("getComponent")
    def getComponent_spacer(name: videoDotJsLib.videoDotJsLibStrings.spacer): videoDotJsLib.Anon_OptionsPlayerReady = js.native
    @JSName("getComponent")
    def getComponent_timeTooltip(name: videoDotJsLib.videoDotJsLibStrings.timeTooltip): videoDotJsLib.Anon_OptionsPlayerComponentOptionsTimeToolTip = js.native
    /**
    		 * Register a `Component` with `videojs` given the name and the component.
    		 *
    		 * > NOTE: {@link Tech}s should not be registered as a `Component`. {@link Tech}s
    		 *         should be registered using {@link Tech.registerTech} or
    		 *         {@link videojs:videojs.registerTech}.
    		 *
    		 * > NOTE: This function can also be seen on videojs as
    		 *         {@link videojs:videojs.registerComponent}.
    		 *
    		 * @param name
    		 *        The name of the `Component` to register.
    		 *
    		 * @param ComponentToRegister
    		 *        The `Component` class to register.
    		 *
    		 * @return The `Component` that was registered.
    		 */
    def registerComponent(name: java.lang.String, ComponentToRegister: js.Any): js.Any = js.native
  }
  
  @js.native
  object ControlBar
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.ControlBar
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.ControlBarOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.ControlBar
        ]
  
  @js.native
  object CurrentTimeDisplay
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.CurrentTimeDisplay
        ]
  
  @js.native
  object CustomControlSpacer
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 *
  		 * @param [ready]
  		 *        Function that gets called when the `Component` is ready.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.CustomControlSpacer
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.CustomControlSpacer
        ]
       with org.scalablytyped.runtime.Instantiable3[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions, 
          /* ready */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentNs.ReadyCallback, 
          videoDotJsLib.videoDotJsMod.videojsNs.CustomControlSpacer
        ]
  
  @js.native
  object DescriptionsButton
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 *
  		 * @param [ready]
  		 *        The function to call when this component is ready.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.DescriptionsButton
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.TrackButtonOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.DescriptionsButton
        ]
       with org.scalablytyped.runtime.Instantiable3[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.TrackButtonOptions, 
          /* ready */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentNs.ReadyCallback, 
          videoDotJsLib.videoDotJsMod.videojsNs.DescriptionsButton
        ]
  
  @js.native
  object DurationDisplay
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.DurationDisplay
        ]
  
  @js.native
  object ErrorDisplay
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *         The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *         The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.ErrorDisplay
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.ModalDialogOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.ErrorDisplay
        ]
  
  @js.native
  object EventTarget
    extends org.scalablytyped.runtime.Instantiable0[videoDotJsLib.videoDotJsMod.videojsNs.EventTarget]
  
  @js.native
  object FullscreenToggle
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.FullscreenToggle
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.FullscreenToggle
        ]
  
  @js.native
  object HTMLTrackElementList
    extends /**
  		 * Create an instance of this class.
  		 *
  		 * @param [tracks=[]]
  		 *        A list of `HtmlTrackElement` to instantiate the list with.
  		 */
  org.scalablytyped.runtime.Instantiable0[videoDotJsLib.videoDotJsMod.videojsNs.HTMLTrackElementList]
       with org.scalablytyped.runtime.Instantiable1[
          /* tracks */ js.Array[stdLib.HTMLTrackElement], 
          videoDotJsLib.videoDotJsMod.videojsNs.HTMLTrackElementList
        ]
  
  @js.native
  object MediaError
    extends /**
  		 * Create an instance of this class.
  		 *
  		 * @param value
  		 *        This can be of multiple types:
  		 *        - number: should be a standard error code
  		 *        - string: an error message (the code will be 0)
  		 *        - Object: arbitrary properties
  		 *        - `MediaError` (native): used to populate a video.js `MediaError` object
  		 *        - `MediaError` (video.js): will return itself if it's already a
  		 *          video.js `MediaError` object.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          (/* value */ scala.Double) | (/* value */ videoDotJsLib.videoDotJsMod.videojsNs.MediaError) | (/* value */ java.lang.String) | (/* value */ org.scalablytyped.runtime.StringDictionary[js.Any]), 
          videoDotJsLib.videoDotJsMod.videojsNs.MediaError
        ] {
    /**
    		 * W3C error code for media error aborted.
    		 * @default 1
    		 */
    var MEDIA_ERR_ABORTED: videoDotJsLib.videoDotJsLibNumbers.`1` = js.native
    /**
    		 * W3C error code for any custom error.
    		 * @default 0
    		 */
    var MEDIA_ERR_CUSTOM: videoDotJsLib.videoDotJsLibNumbers.`0` = js.native
    /**
    		 * W3C error code for any decoding error.
    		 * @default 3
    		 */
    var MEDIA_ERR_DECODE: videoDotJsLib.videoDotJsLibNumbers.`3` = js.native
    /**
    		 * W3C error code for any time that a source is encrypted.
    		 * @default 5
    		 */
    var MEDIA_ERR_ENCRYPTED: videoDotJsLib.videoDotJsLibNumbers.`5` = js.native
    /**
    		 * W3C error code for any network error.
    		 * @default 2
    		 */
    var MEDIA_ERR_NETWORK: videoDotJsLib.videoDotJsLibNumbers.`2` = js.native
    /**
    		 * W3C error code for any time that a source is not supported.
    		 * @default 4
    		 */
    var MEDIA_ERR_SRC_NOT_SUPPORTED: videoDotJsLib.videoDotJsLibNumbers.`4` = js.native
    /**
    		 * The default `MediaError` messages based on the {@link MediaError.errorTypes}.
    		 */
    var defaultMessages: js.Array[java.lang.String] = js.native
    /**
    		 * Errors indexed by the W3C standard. The order **CANNOT CHANGE**! See the
    		 * specification listed under {@link MediaError} for more information.
    		 *
    		 * 0 - MEDIA_ERR_CUSTOM
    		 * 1 - MEDIA_ERR_CUSTOM
    		 * 2 - MEDIA_ERR_ABORTED
    		 * 3 - MEDIA_ERR_NETWORK
    		 * 4 - MEDIA_ERR_SRC_NOT_SUPPORTED
    		 * 5 - MEDIA_ERR_ENCRYPTED
    		 */
    val errorTypes: js.Array[java.lang.String] = js.native
  }
  
  @js.native
  object Menu
    extends /**
  		 * Create an instance of this class.
  		 *
  		 * @param player
  		 *        the player that this component should attach to
  		 *
  		 * @param [options]
  		 *        Object of option names and values
  		 *
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.Menu
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.MenuOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.Menu
        ]
  
  @js.native
  object MenuButton
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options={}]
  		 *        The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.MenuButton
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.MenuButtonOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.MenuButton
        ]
  
  @js.native
  object MenuItem
    extends /**
  		 * Creates an instance of the this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options={}]
  		 *        The key/value store of player options.
  		 *
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.MenuItem
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.MenuItemOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.MenuItem
        ]
  
  @js.native
  object ModalDialog
    extends /**
  		 * Create an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.ModalDialog
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.ModalDialogOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.ModalDialog
        ]
  
  @js.native
  object MouseTimeDisplay
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The {@link Player} that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.MouseTimeDisplay
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.MouseTimeDisplay
        ]
  
  @js.native
  object NetworkState extends js.Object {
    /* 0 */ val Empty: videoDotJsLib.videoDotJsMod.videojsNs.NetworkState.Empty with scala.Double = js.native
    /* 1 */ val Idle: videoDotJsLib.videoDotJsMod.videojsNs.NetworkState.Idle with scala.Double = js.native
    /* 2 */ val Loading: videoDotJsLib.videoDotJsMod.videojsNs.NetworkState.Loading with scala.Double = js.native
    /* 3 */ val NoSource: videoDotJsLib.videoDotJsMod.videojsNs.NetworkState.NoSource with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[videoDotJsLib.videoDotJsMod.videojsNs.NetworkState with scala.Double] = js.native
  }
  
  @js.native
  object Player
    extends /**
  		 * An instance of the `Player` class is created when any of the Video.js setup methods
  		 * are used to initialize a video.
  		 *
  		 * After an instance has been created it can be accessed globally in two ways:
  		 * 1. By calling `videojs('example_video_1');`
  		 * 2. By using it directly via  `videojs.players.example_video_1;`
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.Player
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.PlayerOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.Player
        ] {
    /**
    		 * Gets tag settings
    		 *
    		 * @param tag
    		 *        The player tag
    		 * @check
    		 * @return An object containing all of the settings
    		 *         for a player tag
    		 */
    def getTagSettings(tag: stdLib.Element): js.Any = js.native
  }
  
  @js.native
  object Plugin
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * Sub-classes should call `super` to ensure plugins are properly initialized.
  		 *
  		 * @param player
  		 *        A Video.js player instance.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.Plugin
        ] {
    /**
    		 * The name of the base plugin class as it is registered.
    		 *
    		 */
    var BASE_PLUGIN_NAME: java.lang.String = js.native
    /**
    		 * De-register a Video.js plugin.
    		 *
    		 * @param name
    		 *        The name of the plugin to be deregistered.
    		 */
    def deregisterPlugin(name: java.lang.String): scala.Unit = js.native
    /**
    		 * Gets a plugin by name if it exists.
    		 *
    		 * @param name
    		 *           The name of a plugin.
    		 *
    		 * @return The plugin (or `undefined`).
    		 */
    def getPlugin(name: java.lang.String): videoDotJsLib.Anon_BASEPLUGINNAME = js.native
    /**
    		 * Gets a plugin's version, if available
    		 *
    		 * @param name
    		 *          The name of a plugin.
    		 *
    		 * @return The plugin's version or an empty string.
    		 */
    def getPluginVersion(name: java.lang.String): java.lang.String = js.native
    /**
    		 * Gets an object containing multiple Video.js plugins.
    		 *
    		 * @param [names]
    		 *          If provided, should be an array of plugin names. Defaults to _all_
    		 *          plugin names.
    		 *
    		 * @return An object containing plugin(s) associated with their name(s) or
    		 *          `undefined` if no matching plugins exist).
    		 *
    		 * @check returning type
    		 */
    def getPlugins(): org.scalablytyped.runtime.StringDictionary[videoDotJsLib.videoDotJsMod.videojsNs.Plugin] = js.native
    def getPlugins(names: js.Array[java.lang.String]): org.scalablytyped.runtime.StringDictionary[videoDotJsLib.videoDotJsMod.videojsNs.Plugin] = js.native
    /**
    		 * Determines if a plugin is a basic plugin (i.e. not a sub-class of `Plugin`).
    		 *
    		 * @param plugin
    		 *          If a string, matches the name of a plugin. If a function, will be
    		 *          tested directly.
    		 *
    		 * @return Whether or not a plugin is a basic plugin.
    		 */
    def isBasic(plugin: java.lang.String): scala.Boolean = js.native
    def isBasic(plugin: js.Function0[_]): scala.Boolean = js.native
    def registerPlugin[T /* <: videoDotJsLib.Anon_BASEPLUGINNAME */](name: java.lang.String, plugin: T): js.Function0[T] = js.native
    /**
    		 * Register a Video.js plugin.
    		 *
    		 * @param name
    		 *          The name of the plugin to be registered. Must be a string and
    		 *          must not match an existing plugin or a method on the `Player`
    		 *          prototype.
    		 *
    		 * @param plugin
    		 *          A sub-class of `Plugin` or a function for basic plugins.
    		 *
    		 * @return For advanced plugins, a factory function for that plugin. For
    		 *          basic plugins, a wrapper function that initializes the plugin.
    		 */
    def registerPlugin[T, K](
      name: java.lang.String,
      plugin: js.ThisFunction1[/* this */ videoDotJsLib.videoDotJsMod.videojsNs.Player, /* repeated */ K, T]
    ): js.Function1[/* repeated */ K, T] = js.native
  }
  
  @js.native
  object ProgressControl
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.ProgressControl
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.ProgressControl
        ]
  
  @js.native
  object ReadyState extends js.Object {
    /* 2 */ val HaveCurrentData: videoDotJsLib.videoDotJsMod.videojsNs.ReadyState.HaveCurrentData with scala.Double = js.native
    /* 4 */ val HaveEnoughData: videoDotJsLib.videoDotJsMod.videojsNs.ReadyState.HaveEnoughData with scala.Double = js.native
    /* 3 */ val HaveFutureData: videoDotJsLib.videoDotJsMod.videojsNs.ReadyState.HaveFutureData with scala.Double = js.native
    /* 1 */ val HaveMetadata: videoDotJsLib.videoDotJsMod.videojsNs.ReadyState.HaveMetadata with scala.Double = js.native
    /* 0 */ val HaveNothing: videoDotJsLib.videoDotJsMod.videojsNs.ReadyState.HaveNothing with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[videoDotJsLib.videoDotJsMod.videojsNs.ReadyState with scala.Double] = js.native
  }
  
  @js.native
  object SeekBar
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.SeekBar
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.SliderOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.SeekBar
        ]
  
  @js.native
  object Slider
    extends /**
  		 * Create an instance of this class
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.Slider
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.SliderOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.Slider
        ]
  
  @js.native
  object Spacer
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 *
  		 * @param [ready]
  		 *        Function that gets called when the `Component` is ready.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.Spacer
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.Spacer
        ]
       with org.scalablytyped.runtime.Instantiable3[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions, 
          /* ready */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentNs.ReadyCallback, 
          videoDotJsLib.videoDotJsMod.videojsNs.Spacer
        ]
  
  @js.native
  object Tech
    extends /**
  		 * Create an instance of this Tech.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 *
  		 * @param ready
  		 *        Callback function to call when the `HTML5` Tech is ready.
  		 */
  org.scalablytyped.runtime.Instantiable0[videoDotJsLib.videoDotJsMod.videojsNs.Tech]
       with org.scalablytyped.runtime.Instantiable1[/* options */ js.Any, videoDotJsLib.videoDotJsMod.videojsNs.Tech]
       with org.scalablytyped.runtime.Instantiable2[
          /* options */ js.Any, 
          /* ready */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentNs.ReadyCallback, 
          videoDotJsLib.videoDotJsMod.videojsNs.Tech
        ] {
    /**
    		 * Check if the tech can support the given source
    		 * @param srcObj
    		 *        The source object
    		 * @param options
    		 *        The options passed to the tech
    		 * @return 'probably', 'maybe', or '' (empty string)
    		 */
    def canPlaySource(srcObj: js.Any, options: js.Any): videoDotJsLib.videoDotJsLibStrings.problably | videoDotJsLib.videoDotJsLibStrings.maybe | videoDotJsLib.videoDotJsLibStrings.Empty = js.native
    /**
    		 * Check if the type is supported by this tech.
    		 *
    		 * The base tech does not support any type, but source handlers might
    		 * overwrite this.
    		 *
    		 * @param type
    		 *        The media type to check
    		 * @return Returns the native video element's response
    		 */
    def canPlayType(`type`: java.lang.String): java.lang.String = js.native
    /**
    		 * Get a `Tech` from the shared list by name.
    		 *
    		 * @param name
    		 *        `camelCase` or `TitleCase` name of the Tech to get
    		 *
    		 * @return The `Tech` or undefined if there was no tech with the name requested.
    		 */
    def getTech(name: java.lang.String): js.UndefOr[videoDotJsLib.videoDotJsMod.videojsNs.Tech] = js.native
    /**
    		 * Return whether the argument is a Tech or not.
    		 * Can be passed either a Class like `Html5` or a instance like `player.tech_`
    		 *
    		 * @param component
    		 *        The item to check
    		 *
    		 * @return Whether it is a tech or not
    		 *         - True if it is a tech
    		 *         - False if it is not
    		 */
    def isTech(component: js.Any): scala.Boolean = js.native
    /**
    		 * Registers a `Tech` into a shared list for videojs.
    		 *
    		 * @param name
    		 *        Name of the `Tech` to register.
    		 *
    		 * @param tech
    		 *        The `Tech` class to register.
    		 */
    def registerTech(name: java.lang.String, tech: js.Any): scala.Unit = js.native
    /**
    		 * A functional mixin for techs that want to use the Source Handler pattern.
    		 * Source handlers are scripts for handling specific formats.
    		 * The source handler pattern is used for adaptive formats (HLS, DASH) that
    		 * manually load video data and feed it into a Source Buffer (Media Source Extensions)
    		 * Example: `Tech.withSourceHandlers.call(MyTech);`
    		 *
    		 * @param tech
    		 *        The tech to add source handler functions to.
    		 *
    		 */
    def withSourceHandlers(tech: videoDotJsLib.Anon_): scala.Unit = js.native
  }
  
  @js.native
  object TextTrack
    extends /**
  		 * Create an instance of this class.
  		 *
  		 * @param options={}
  		 *        Object of option names and values
  		 *
  		 * @param options.tech
  		 *        A reference to the tech that owns this TextTrack.
  		 *
  		 * @param [options.kind='subtitles']
  		 *        A valid text track kind.
  		 *
  		 * @param [options.mode='disabled']
  		 *        A valid text track mode.
  		 *
  		 * @param [options.id='vjs_track_' + Guid.newGUID()]
  		 *        A unique id for this TextTrack.
  		 *
  		 * @param [options.label='']
  		 *        The menu label for this track.
  		 *
  		 * @param [options.language='']
  		 *        A valid two character language code.
  		 *
  		 * @param [options.srclang='']
  		 *        A valid two character language code. An alternative, but deprioritized
  		 *        version of `options.language`
  		 *
  		 * @param [options.src]
  		 *        A url to TextTrack cues.
  		 *
  		 * @param [options.default]
  		 *        If this track should default to on or off.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.TextTrackOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.TextTrack
        ]
  
  @js.native
  object TextTrackButton
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options={}]
  		 *        The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.TextTrackButton
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.TrackButtonOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.TextTrackButton
        ]
  
  @js.native
  object TextTrackCueList
    extends /**
  		 * Create an instance of this class..
  		 *
  		 * @param cues
  		 *        A list of cues to be initialized with
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* cues */ js.Array[videoDotJsLib.videoDotJsMod.videojsNs.TextTrackCueListNs.TextTrackCue], 
          videoDotJsLib.videoDotJsMod.videojsNs.TextTrackCueList
        ]
  
  @js.native
  object TextTrackList
    extends /**
  		 * Create an instance of this class
  		 *
  		 * @param tracks
  		 *        A list of tracks to initialize the list with.
  		 */
  org.scalablytyped.runtime.Instantiable0[videoDotJsLib.videoDotJsMod.videojsNs.TextTrackList]
       with org.scalablytyped.runtime.Instantiable1[
          /* tracks */ js.Array[videoDotJsLib.videoDotJsMod.videojsNs.TextTrack], 
          videoDotJsLib.videoDotJsMod.videojsNs.TextTrackList
        ]
  
  @js.native
  object TextTrackMenuItem
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.TextTrackMenuItem
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.TextTrackMenuItemOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.TextTrackMenuItem
        ]
  
  @js.native
  object TextTrackSettings
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *         The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *         The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.TextTrackSettingsOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.TextTrackSettings
        ]
  
  @js.native
  object TimeDisplay
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.TimeDisplay
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.TimeDisplay
        ]
  
  @js.native
  object TimeToolTip
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *         The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *         The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.TimeToolTip
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.TimeToolTip
        ]
  
  @js.native
  object Track
    extends /**
  		 * Create an instance of this class.
  		 *
  		 * @param [options={}]
  		 *        Object of option names and values
  		 *
  		 * @param [options.kind='']
  		 *        A valid kind for the track type you are creating.
  		 *
  		 * @param [options.id='vjs_track_' + Guid.newGUID()]
  		 *        A unique id for this AudioTrack.
  		 *
  		 * @param [options.label='']
  		 *        The menu label for this track.
  		 *
  		 * @param [options.language='']
  		 *        A valid two character language code.
  		 */
  org.scalablytyped.runtime.Instantiable0[videoDotJsLib.videoDotJsMod.videojsNs.Track]
       with org.scalablytyped.runtime.Instantiable1[
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.TrackOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.Track
        ]
  
  /**
  	 * The base class for buttons that toggle specific  track types (e.g. subtitles).
  	 */
  @js.native
  object TrackButton
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *         The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *         The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.MenuButton
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.TrackButtonOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.MenuButton
        ]
  
  @js.native
  object TrackList
    extends /**
  		 * Create an instance of this class
  		 *
  		 * @param tracks
  		 *        A list of tracks to initialize the list with.
  		 */
  org.scalablytyped.runtime.Instantiable0[videoDotJsLib.videoDotJsMod.videojsNs.TrackList]
       with org.scalablytyped.runtime.Instantiable1[
          /* tracks */ js.Array[videoDotJsLib.videoDotJsMod.videojsNs.Track], 
          videoDotJsLib.videoDotJsMod.videojsNs.TrackList
        ]
  
  @js.native
  object VolumeBar
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.VolumeBar
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.SliderOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.VolumeBar
        ]
  
  @js.native
  object VolumeControl
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options={}]
  		 *        The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.VolumeControl
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.VolumeControlOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.VolumeControl
        ]
  
  @js.native
  object VolumeLevel
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 *
  		 * @param [options.children]
  		 *        An array of children objects to intialize this component with. Children objects have
  		 *        a name property that will be used if more than one component of the same type needs to be
  		 *        added.
  		 *
  		 * @param [ready]
  		 *        Function that gets called when the `Component` is ready.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.VolumeLevel
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions, 
          videoDotJsLib.videoDotJsMod.videojsNs.VolumeLevel
        ]
       with org.scalablytyped.runtime.Instantiable3[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentOptions, 
          /* ready */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentNs.ReadyCallback, 
          videoDotJsLib.videoDotJsMod.videojsNs.VolumeLevel
        ]
  
  @js.native
  object VolumePanel
    extends /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options={}]
  		 *        The key/value store of player options.
  		 */
  org.scalablytyped.runtime.Instantiable1[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          videoDotJsLib.videoDotJsMod.videojsNs.VolumePanel
        ]
       with org.scalablytyped.runtime.Instantiable2[
          /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
          /* options */ videoDotJsLib.videoDotJsMod.videojsNs.VolumePanel, 
          videoDotJsLib.videoDotJsMod.videojsNs.VolumePanel
        ]
  
  /**
  	 * Get a component class object by name
  	 *
  	 * @borrows Component.getComponent as getComponent
  	 */
  @js.native
  object getComponent extends js.Object {
    def apply(name: java.lang.String): /* import warning: ImportType.apply Failed type conversion: typeof Component */ js.Any = js.native
    def apply(name: videoDotJsLib.videoDotJsLibStrings.Button): /* import warning: ImportType.apply Failed type conversion: typeof Button */ js.Any = js.native
    def apply(name: videoDotJsLib.videoDotJsLibStrings.ClickableComponent): /* import warning: ImportType.apply Failed type conversion: typeof ClickableComponent */ js.Any = js.native
    def apply(name: videoDotJsLib.videoDotJsLibStrings.Component): /* import warning: ImportType.apply Failed type conversion: typeof Component */ js.Any = js.native
    def apply(name: videoDotJsLib.videoDotJsLibStrings.Menu): /* import warning: ImportType.apply Failed type conversion: typeof Menu */ js.Any = js.native
    def apply(name: videoDotJsLib.videoDotJsLibStrings.MenuButton): /* import warning: ImportType.apply Failed type conversion: typeof MenuButton */ js.Any = js.native
    def apply(name: videoDotJsLib.videoDotJsLibStrings.MenuItem): /* import warning: ImportType.apply Failed type conversion: typeof MenuItem */ js.Any = js.native
    def apply(name: videoDotJsLib.videoDotJsLibStrings.ModalDialog): /* import warning: ImportType.apply Failed type conversion: typeof ModalDialog */ js.Any = js.native
    def apply(name: videoDotJsLib.videoDotJsLibStrings.MouseTimeDisplay): /* import warning: ImportType.apply Failed type conversion: typeof MouseTimeDisplay */ js.Any = js.native
    def apply(name: videoDotJsLib.videoDotJsLibStrings.Player): /* import warning: ImportType.apply Failed type conversion: typeof Player */ js.Any = js.native
    def apply(name: videoDotJsLib.videoDotJsLibStrings.Spacer): /* import warning: ImportType.apply Failed type conversion: typeof Spacer */ js.Any = js.native
    def apply(name: videoDotJsLib.videoDotJsLibStrings.TimeTooltip): /* import warning: ImportType.apply Failed type conversion: typeof TimeToolTip */ js.Any = js.native
    def apply(name: videoDotJsLib.videoDotJsLibStrings.button): /* import warning: ImportType.apply Failed type conversion: typeof Button */ js.Any = js.native
    def apply(name: videoDotJsLib.videoDotJsLibStrings.clickablecomponent): /* import warning: ImportType.apply Failed type conversion: typeof ClickableComponent */ js.Any = js.native
    def apply(name: videoDotJsLib.videoDotJsLibStrings.component): /* import warning: ImportType.apply Failed type conversion: typeof Component */ js.Any = js.native
    def apply(name: videoDotJsLib.videoDotJsLibStrings.menu): /* import warning: ImportType.apply Failed type conversion: typeof Menu */ js.Any = js.native
    def apply(name: videoDotJsLib.videoDotJsLibStrings.menubutton): /* import warning: ImportType.apply Failed type conversion: typeof MenuButton */ js.Any = js.native
    def apply(name: videoDotJsLib.videoDotJsLibStrings.menuitem): /* import warning: ImportType.apply Failed type conversion: typeof MenuItem */ js.Any = js.native
    def apply(name: videoDotJsLib.videoDotJsLibStrings.modaldialog): /* import warning: ImportType.apply Failed type conversion: typeof ModalDialog */ js.Any = js.native
    def apply(name: videoDotJsLib.videoDotJsLibStrings.mouseTimeDisplay): /* import warning: ImportType.apply Failed type conversion: typeof MouseTimeDisplay */ js.Any = js.native
    def apply(name: videoDotJsLib.videoDotJsLibStrings.player): /* import warning: ImportType.apply Failed type conversion: typeof Player */ js.Any = js.native
    def apply(name: videoDotJsLib.videoDotJsLibStrings.spacer): /* import warning: ImportType.apply Failed type conversion: typeof Spacer */ js.Any = js.native
    def apply(name: videoDotJsLib.videoDotJsLibStrings.timeTooltip): /* import warning: ImportType.apply Failed type conversion: typeof TimeToolTip */ js.Any = js.native
  }
  
  /**
  	 * Gets a plugin by name if it exists.
  	 *
  	 * @param name
  	 *         The name of a plugin.
  	 *
  	 * @return	The plugin (or `undefined`).
  	 */
  @js.native
  object getPlugin extends js.Object {
    def apply(name: java.lang.String): /* import warning: ImportType.apply Failed type conversion: typeof Plugin */ js.Any = js.native
  }
  
  /**
  	 * Gets a plugin's version, if available
  	 *
  	 * @param name
  	 *         The name of a plugin.
  	 *
  	 * @return	The plugin's version or an empty string.
  	 */
  @js.native
  object getPluginVersion extends js.Object {
    def apply(name: java.lang.String): java.lang.String = js.native
  }
  
  /**
  	 * Gets an object containing multiple Video.js plugins.
  	 *
  	 * @param [names]
  	 *         If provided, should be an array of plugin names. Defaults to _all_
  	 *         plugin names.
  	 *
  	 * @return	An object containing plugin(s) associated with their name(s) or
  	 *         `undefined` if no matching plugins exist).
  	 */
  @js.native
  object getPlugins extends js.Object {
    def apply(): org.scalablytyped.runtime.StringDictionary[videoDotJsLib.videoDotJsMod.videojsNs.Plugin] = js.native
    def apply(names: js.Array[java.lang.String]): org.scalablytyped.runtime.StringDictionary[videoDotJsLib.videoDotJsMod.videojsNs.Plugin] = js.native
  }
  
  /**
  	 * Get a Tech class object by name
  	 *
  	 * @borrows Tech.getTech as getTech
  	 */
  @js.native
  object getTech extends js.Object {
    def apply(name: java.lang.String): js.UndefOr[videoDotJsLib.videoDotJsMod.videojsNs.Tech] = js.native
  }
  
  /**
  	 * An Object that contains lifecycle hooks as keys which point to an array
  	 * of functions that are run when a lifecycle is triggered
  	 */
  @js.native
  object hooks_
    extends /* type */ org.scalablytyped.runtime.StringDictionary[js.Function0[_]]
  
  /**
  	 * An object that can be returned by a middleware to signify
  	 * that the middleware is being terminated.
  	 */
  @js.native
  object middleware extends js.Object
  
  /**
  	 * Deprecated method to register a plugin with Video.js
  	 *
  	 * @deprecated
  	 *        plugin() is deprecated; use registerPlugin() instead
  	 *
  	 * @param name
  	 *        The plugin name
  	 *
  	 * @param plugin
  	 *         The plugin sub-class or function
  	 */
  @js.native
  object plugin extends js.Object {
    def apply[T /* <: /* import warning: ImportType.apply Failed type conversion: typeof Plugin */ js.Any */](name: java.lang.String, plugin: T): js.Function0[T] = js.native
    def apply[T, K](
      name: java.lang.String,
      plugin: js.ThisFunction1[/* this */ videoDotJsLib.videoDotJsMod.videojsNs.Player, /* repeated */ K, T]
    ): js.Function1[/* repeated */ K, T] = js.native
  }
  
  /**
  	 * Register a component so it can referred to by name. Used when adding to other
  	 * components, either through addChild `component.addChild('myComponent')` or through
  	 * @default children options  `{ children: ['myComponent'] }`.
  	 *
  	 * > NOTE: You could also just initialize the component before adding.
  	 * `component.addChild(new MyComponent());`
  	 *
  	 * @param name
  	 *        The class name of the component
  	 *
  	 * @param comp
  	 *        The component class
  	 *
  	 * @return	The newly registered component
  	 */
  @js.native
  object registerComponent extends js.Object {
    def apply(name: java.lang.String, ComponentToRegister: js.Any): js.Any = js.native
  }
  
  /**
  	 * Register a Video.js plugin.
  	 *
  	 * @borrows plugin:registerPlugin as registerPlugin
  	 *
  	 * @param name
  	 *         The name of the plugin to be registered. Must be a string and
  	 *         must not match an existing plugin or a method on the `Player`
  	 *         prototype.
  	 *
  	 * @param plugin
  	 *         A sub-class of `Plugin` or a function for basic plugins.
  	 *
  	 * @return	For advanced plugins, a factory function for that plugin. For
  	 *         basic plugins, a wrapper function that initializes the plugin.
  	 */
  @js.native
  object registerPlugin extends js.Object {
    def apply[T /* <: /* import warning: ImportType.apply Failed type conversion: typeof Plugin */ js.Any */](name: java.lang.String, plugin: T): js.Function0[T] = js.native
    def apply[T, K](
      name: java.lang.String,
      plugin: js.ThisFunction1[/* this */ videoDotJsLib.videoDotJsMod.videojsNs.Player, /* repeated */ K, T]
    ): js.Function1[/* repeated */ K, T] = js.native
  }
  
  /**
  	 * Register a Tech so it can referred to by name.
  	 * This is used in the tech order for the player.
  	 *
  	 * @borrows Tech.registerTech as registerTech
  	 */
  @js.native
  object registerTech extends js.Object {
    def apply(name: java.lang.String, tech: js.Any): scala.Unit = js.native
  }
  
}

