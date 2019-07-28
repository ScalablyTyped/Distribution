package typings.videoDotJs.videoDotJsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.HTMLTrackElement
import typings.videoDotJs.Anon_
import typings.videoDotJs.Anon_BASEPLUGINNAME
import typings.videoDotJs.Anon_Button
import typings.videoDotJs.Anon_GetTagSettings
import typings.videoDotJs.Anon_Options
import typings.videoDotJs.Anon_OptionsPlayer
import typings.videoDotJs.Anon_OptionsPlayerComponentOptions
import typings.videoDotJs.Anon_OptionsPlayerComponentOptionsTimeToolTip
import typings.videoDotJs.Anon_OptionsPlayerMenu
import typings.videoDotJs.Anon_OptionsPlayerMenuButton
import typings.videoDotJs.Anon_OptionsPlayerMenuItem
import typings.videoDotJs.Anon_OptionsPlayerModalDialog
import typings.videoDotJs.Anon_OptionsPlayerReady
import typings.videoDotJs.videoDotJsMod.videojsNs.AudioTrackMenuItemOptions
import typings.videoDotJs.videoDotJsMod.videojsNs.AudioTrackOptions
import typings.videoDotJs.videoDotJsMod.videojsNs.Browser
import typings.videoDotJs.videoDotJsMod.videojsNs.CaptionSettingsMenuItem
import typings.videoDotJs.videoDotJsMod.videojsNs.CaptionSettingsMenuItemOptions
import typings.videoDotJs.videoDotJsMod.videojsNs.ChaptersTrackMenuItemOptions
import typings.videoDotJs.videoDotJsMod.videojsNs.CloseButtonOptions
import typings.videoDotJs.videoDotJsMod.videojsNs.ComponentNs.ReadyCallback
import typings.videoDotJs.videoDotJsMod.videojsNs.ComponentOptions
import typings.videoDotJs.videoDotJsMod.videojsNs.ControlBarOptions
import typings.videoDotJs.videoDotJsMod.videojsNs.Dom
import typings.videoDotJs.videoDotJsMod.videojsNs.EventTargetNs.Event
import typings.videoDotJs.videoDotJsMod.videojsNs.EventTargetNs.EventListener
import typings.videoDotJs.videoDotJsMod.videojsNs.HookNs.BeforeSetup
import typings.videoDotJs.videoDotJsMod.videojsNs.HookNs.Setup
import typings.videoDotJs.videoDotJsMod.videojsNs.LanguageTranslations
import typings.videoDotJs.videoDotJsMod.videojsNs.Log
import typings.videoDotJs.videoDotJsMod.videojsNs.MenuButtonOptions
import typings.videoDotJs.videoDotJsMod.videojsNs.MenuItemOptions
import typings.videoDotJs.videoDotJsMod.videojsNs.MenuOptions
import typings.videoDotJs.videoDotJsMod.videojsNs.Middleware
import typings.videoDotJs.videoDotJsMod.videojsNs.ModalDialogOptions
import typings.videoDotJs.videoDotJsMod.videojsNs.PlayerOptions
import typings.videoDotJs.videoDotJsMod.videojsNs.SliderOptions
import typings.videoDotJs.videoDotJsMod.videojsNs.TextTrackCueListNs.TextTrackCue
import typings.videoDotJs.videoDotJsMod.videojsNs.TextTrackMenuItemOptions
import typings.videoDotJs.videoDotJsMod.videojsNs.TextTrackOptions
import typings.videoDotJs.videoDotJsMod.videojsNs.TextTrackSettingsOptions
import typings.videoDotJs.videoDotJsMod.videojsNs.TimeRange
import typings.videoDotJs.videoDotJsMod.videojsNs.TrackButtonOptions
import typings.videoDotJs.videoDotJsMod.videojsNs.TrackOptions
import typings.videoDotJs.videoDotJsMod.videojsNs.VolumeControlOptions
import typings.videoDotJs.videoDotJsMod.videojsNs.XhrObject
import typings.videoDotJs.videoDotJsMod.videojsNs.urlNs.URLObject
import typings.videoDotJs.videoDotJsNumbers.`0`
import typings.videoDotJs.videoDotJsNumbers.`1`
import typings.videoDotJs.videoDotJsNumbers.`2`
import typings.videoDotJs.videoDotJsNumbers.`3`
import typings.videoDotJs.videoDotJsNumbers.`4`
import typings.videoDotJs.videoDotJsNumbers.`5`
import typings.videoDotJs.videoDotJsStrings.Empty
import typings.videoDotJs.videoDotJsStrings.TimeTooltip
import typings.videoDotJs.videoDotJsStrings.beforesetup
import typings.videoDotJs.videoDotJsStrings.button
import typings.videoDotJs.videoDotJsStrings.clickablecomponent
import typings.videoDotJs.videoDotJsStrings.component
import typings.videoDotJs.videoDotJsStrings.maybe
import typings.videoDotJs.videoDotJsStrings.menu
import typings.videoDotJs.videoDotJsStrings.menubutton
import typings.videoDotJs.videoDotJsStrings.menuitem
import typings.videoDotJs.videoDotJsStrings.modaldialog
import typings.videoDotJs.videoDotJsStrings.mouseTimeDisplay
import typings.videoDotJs.videoDotJsStrings.player
import typings.videoDotJs.videoDotJsStrings.problably
import typings.videoDotJs.videoDotJsStrings.setup
import typings.videoDotJs.videoDotJsStrings.spacer
import typings.videoDotJs.videoDotJsStrings.timeTooltip
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
    extends typings.videoDotJs.videoDotJsMod.videojsNs.Track {
    def this(options: AudioTrackOptions) = this()
  }
  
  @js.native
  class AudioTrackButtonCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.AudioTrackButton {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options={}]
    		 *        The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: TrackButtonOptions) = this()
  }
  
  @js.native
  class AudioTrackMenuItemCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.AudioTrackMenuItem {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: AudioTrackMenuItemOptions) = this()
  }
  
  @js.native
  class BigPlayButtonCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.BigPlayButton {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *         The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *         The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: ComponentOptions) = this()
  }
  
  @js.native
  class ButtonCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.Button {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *         The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *         The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: ComponentOptions) = this()
  }
  
  @js.native
  class CaptionsButtonCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.CaptionsButton {
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
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: TrackButtonOptions) = this()
    def this(
      player: typings.videoDotJs.videoDotJsMod.videojsNs.Player,
      options: TrackButtonOptions,
      ready: ReadyCallback
    ) = this()
  }
  
  @js.native
  class CaptionsSettingsMenuItem protected () extends CaptionSettingsMenuItem {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: CaptionSettingsMenuItemOptions) = this()
  }
  
  @js.native
  class ChaptersButtonCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.ChaptersButton {
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
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: TrackButtonOptions) = this()
    def this(
      player: typings.videoDotJs.videoDotJsMod.videojsNs.Player,
      options: TrackButtonOptions,
      ready: ReadyCallback
    ) = this()
  }
  
  @js.native
  class ChaptersTrackMenuItemCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.ChaptersTrackMenuItem {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: ChaptersTrackMenuItemOptions) = this()
  }
  
  @js.native
  class ClickableComponentCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.ClickableComponent {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *         The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *         The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: ComponentOptions) = this()
  }
  
  @js.native
  class CloseButtonCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.CloseButton {
    /**
    		 * Creates an instance of the this class.
    		 *
    		 * @param player
    		 *         The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *         The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: CloseButtonOptions) = this()
  }
  
  @js.native
  class ComponentCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.Component {
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
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: ComponentOptions) = this()
    def this(
      player: typings.videoDotJs.videoDotJsMod.videojsNs.Player,
      options: ComponentOptions,
      ready: ReadyCallback
    ) = this()
  }
  
  @js.native
  class ControlBarCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.ControlBar {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: ControlBarOptions) = this()
  }
  
  @js.native
  class CurrentTimeDisplayCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.CurrentTimeDisplay {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: ComponentOptions) = this()
  }
  
  @js.native
  class CustomControlSpacerCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.CustomControlSpacer {
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
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: ComponentOptions) = this()
    def this(
      player: typings.videoDotJs.videoDotJsMod.videojsNs.Player,
      options: ComponentOptions,
      ready: ReadyCallback
    ) = this()
  }
  
  @js.native
  class DescriptionsButtonCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.DescriptionsButton {
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
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: TrackButtonOptions) = this()
    def this(
      player: typings.videoDotJs.videoDotJsMod.videojsNs.Player,
      options: TrackButtonOptions,
      ready: ReadyCallback
    ) = this()
  }
  
  @js.native
  class DurationDisplayCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.DurationDisplay {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: ComponentOptions) = this()
  }
  
  @js.native
  class ErrorDisplayCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.ErrorDisplay {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *         The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *         The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: ModalDialogOptions) = this()
  }
  
  @js.native
  class EventTargetCls ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.EventTarget
  
  @js.native
  class FullscreenToggleCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.FullscreenToggle {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: ComponentOptions) = this()
  }
  
  @js.native
  /**
  		 * Create an instance of this class.
  		 *
  		 * @param [tracks=[]]
  		 *        A list of `HtmlTrackElement` to instantiate the list with.
  		 */
  class HTMLTrackElementListCls ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.HTMLTrackElementList {
    def this(tracks: js.Array[HTMLTrackElement]) = this()
    /**
    		 * The current number of `Track`s in the this Trackist.
    		 */
    /* CompleteClass */
    override var length: Double = js.native
  }
  
  @js.native
  class MediaErrorCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.MediaError {
    def this(value: String) = this()
    def this(value: StringDictionary[js.Any]) = this()
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
    def this(value: Double) = this()
    def this(value: typings.videoDotJs.videoDotJsMod.videojsNs.MediaError) = this()
    /**
    		 * W3C error code for media error aborted.
    		 * @default 1
    		 */
    /* CompleteClass */
    override var MEDIA_ERR_ABORTED: `1` = js.native
    /**
    		 * W3C error code for any custom error.
    		 * @default 0
    		 */
    /* CompleteClass */
    override var MEDIA_ERR_CUSTOM: `0` = js.native
    /**
    		 * W3C error code for any decoding error.
    		 * @default 3
    		 */
    /* CompleteClass */
    override var MEDIA_ERR_DECODE: `3` = js.native
    /**
    		 * W3C error code for any time that a source is encrypted.
    		 * @default 5
    		 */
    /* CompleteClass */
    override var MEDIA_ERR_ENCRYPTED: `5` = js.native
    /**
    		 * W3C error code for any network error.
    		 * @default 2
    		 */
    /* CompleteClass */
    override var MEDIA_ERR_NETWORK: `2` = js.native
    /**
    		 * W3C error code for any time that a source is not supported.
    		 * @default 4
    		 */
    /* CompleteClass */
    override var MEDIA_ERR_SRC_NOT_SUPPORTED: `4` = js.native
    /**
    		 * The error code that refers two one of the defined `MediaError` types
    		 *
    		 */
    /* CompleteClass */
    override var code: Double = js.native
    /**
    		 * An optional message that to show with the error. Message is not part of the HTML5
    		 * video spec but allows for more informative custom errors.
    		 *
    		 */
    /* CompleteClass */
    override var message: String = js.native
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
    extends typings.videoDotJs.videoDotJsMod.videojsNs.MenuButton {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options={}]
    		 *        The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: MenuButtonOptions) = this()
  }
  
  @js.native
  class MenuCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.Menu {
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
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: MenuOptions) = this()
  }
  
  @js.native
  class MenuItemCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.MenuItem {
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
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: MenuItemOptions) = this()
  }
  
  @js.native
  class ModalDialogCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.ModalDialog {
    /**
    		 * Create an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: ModalDialogOptions) = this()
  }
  
  @js.native
  class MouseTimeDisplayCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.MouseTimeDisplay {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The {@link Player} that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: ComponentOptions) = this()
  }
  
  @js.native
  class PlayerCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.Player {
    /**
    		 * An instance of the `Player` class is created when any of the Video.js setup methods
    		 * are used to initialize a video.
    		 *
    		 * After an instance has been created it can be accessed globally in two ways:
    		 * 1. By calling `videojs('example_video_1');`
    		 * 2. By using it directly via  `videojs.players.example_video_1;`
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: PlayerOptions) = this()
  }
  
  @js.native
  class PluginCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.Plugin {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * Sub-classes should call `super` to ensure plugins are properly initialized.
    		 *
    		 * @param player
    		 *        A Video.js player instance.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
  }
  
  @js.native
  class ProgressControlCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.ProgressControl {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: ComponentOptions) = this()
  }
  
  @js.native
  class SeekBarCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.SeekBar {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: SliderOptions) = this()
  }
  
  @js.native
  class SliderCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.Slider {
    /**
    		 * Create an instance of this class
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: SliderOptions) = this()
  }
  
  @js.native
  class SpacerCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.Spacer {
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
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: ComponentOptions) = this()
    def this(
      player: typings.videoDotJs.videoDotJsMod.videojsNs.Player,
      options: ComponentOptions,
      ready: ReadyCallback
    ) = this()
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
    extends typings.videoDotJs.videoDotJsMod.videojsNs.Tech {
    def this(options: js.Any) = this()
    def this(options: js.Any, ready: ReadyCallback) = this()
  }
  
  @js.native
  class TextTrackButtonCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.TextTrackButton {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options={}]
    		 *        The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: TrackButtonOptions) = this()
  }
  
  @js.native
  class TextTrackCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.TextTrack {
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
    def this(options: TextTrackOptions) = this()
  }
  
  @js.native
  class TextTrackCueListCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.TextTrackCueList {
    /**
    		 * Create an instance of this class..
    		 *
    		 * @param cues
    		 *        A list of cues to be initialized with
    		 */
    def this(cues: js.Array[TextTrackCue]) = this()
    /**
    		 * The current number of `TextTrackCue`s in the TextTrackCueList.
    		 */
    /* CompleteClass */
    override var length: Double = js.native
    /**
    		 * Get a `TextTrackCue` that is currently in the `TextTrackCueList` by id.
    		 *
    		 * @param id
    		 *        The id of the cue that should be searched for.
    		 *
    		 * @return A single cue or null if none was found.
    		 */
    /* CompleteClass */
    override def getCueById(id: String): TextTrackCue = js.native
  }
  
  @js.native
  /**
  		 * Create an instance of this class
  		 *
  		 * @param tracks
  		 *        A list of tracks to initialize the list with.
  		 */
  class TextTrackListCls ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.TextTrackList {
    def this(tracks: js.Array[typings.videoDotJs.videoDotJsMod.videojsNs.TextTrack]) = this()
  }
  
  @js.native
  class TextTrackMenuItemCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.TextTrackMenuItem {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: TextTrackMenuItemOptions) = this()
  }
  
  @js.native
  class TextTrackSettingsCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.TextTrackSettings {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *         The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *         The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: TextTrackSettingsOptions) = this()
  }
  
  @js.native
  class TimeDisplayCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.TimeDisplay {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: ComponentOptions) = this()
  }
  
  @js.native
  class TimeToolTipCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.TimeToolTip {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *         The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *         The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: ComponentOptions) = this()
  }
  
  @js.native
  class TrackButton protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.MenuButton {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *         The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *         The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: TrackButtonOptions) = this()
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
    extends typings.videoDotJs.videoDotJsMod.videojsNs.Track {
    def this(options: TrackOptions) = this()
  }
  
  @js.native
  /**
  		 * Create an instance of this class
  		 *
  		 * @param tracks
  		 *        A list of tracks to initialize the list with.
  		 */
  class TrackListCls ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.TrackList {
    def this(tracks: js.Array[typings.videoDotJs.videoDotJsMod.videojsNs.Track]) = this()
  }
  
  @js.native
  class VolumeBarCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.VolumeBar {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options]
    		 *        The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: SliderOptions) = this()
  }
  
  @js.native
  class VolumeControlCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.VolumeControl {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options={}]
    		 *        The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: VolumeControlOptions) = this()
  }
  
  @js.native
  class VolumeLevelCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.VolumeLevel {
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
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player, options: ComponentOptions) = this()
    def this(
      player: typings.videoDotJs.videoDotJsMod.videojsNs.Player,
      options: ComponentOptions,
      ready: ReadyCallback
    ) = this()
  }
  
  @js.native
  class VolumePanelCls protected ()
    extends typings.videoDotJs.videoDotJsMod.videojsNs.VolumePanel {
    /**
    		 * Creates an instance of this class.
    		 *
    		 * @param player
    		 *        The `Player` that this class should be attached to.
    		 *
    		 * @param [options={}]
    		 *        The key/value store of player options.
    		 */
    def this(player: typings.videoDotJs.videoDotJsMod.videojsNs.Player) = this()
    def this(
      player: typings.videoDotJs.videoDotJsMod.videojsNs.Player,
      options: typings.videoDotJs.videoDotJsMod.videojsNs.VolumePanel
    ) = this()
  }
  
  /**
  	 * Whether or not the browser supports touch events. Included for backward
  	 * compatibility with 4.x, but deprecated. Use `browser.TOUCH_ENABLED`
  	 * instead going forward.
  	 *
  	 * @deprecated since version 5.0
  	 */
  val TOUCH_ENABLED: Boolean = js.native
  /**
  	 * Current software version. Follows semver.
  	 *
  	 */
  val VERSION: String = js.native
  /**
  	 * A suite of browser and device tests from {@link browser}.
  	 *
  	 */
  val browser: Browser = js.native
  val dom: Dom = js.native
  /**
  	 * Log messages
  	 *
  	 * @borrows log:log as log
  	 */
  val log: Log = js.native
  /**
  	 * The global options object. These are the settings that take effect
  	 * if no overrides are specified when the player is created.
  	 *
  	 */
  val options: PlayerOptions = js.native
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
  val xhr: XhrObject = js.native
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
  def addLanguage(code: String, data: LanguageTranslations): LanguageTranslations = js.native
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
  def bind[F /* <: js.Function0[_] */](context: js.Any, fn: F, uid: Double): F = js.native
  /**
  	 * Should create a fake `TimeRange` object which mimics an HTML5 time range instance.
  	 *
  	 * @param start
  	 *        The start of a single range or an array of ranges
  	 *
  	 * @param end
  	 *        The end of a single range.
  	 */
  def createTimeRanges(): TimeRange = js.native
  def createTimeRanges(start: js.Array[TimeRange]): TimeRange = js.native
  def createTimeRanges(start: js.Array[TimeRange], end: Double): TimeRange = js.native
  def createTimeRanges(start: Double): TimeRange = js.native
  def createTimeRanges(start: Double, end: Double): TimeRange = js.native
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
  def formatTime(seconds: Double, guide: Double): String = js.native
  /**
  	 * Returns an array of all current players.
  	 *
  	 * @return An array of all players. The array will be in the order that
  	 *         `Object.keys` provides, which could potentially vary between
  	 *         JavaScript engines.
  	 *
  	 */
  def getAllPlayers(): js.Array[typings.videoDotJs.videoDotJsMod.videojsNs.Player] = js.native
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
  def getPlayer(id: String): typings.videoDotJs.videoDotJsMod.videojsNs.Player = js.native
  /**
  	 * Get an object with the currently created players, keyed by player ID
  	 *
  	 * @return	The created players
  	 */
  def getPlayers(): StringDictionary[typings.videoDotJs.videoDotJsMod.videojsNs.Player] = js.native
  /**
  	 * Add a function hook that will only run once to a specific videojs lifecycle.
  	 *
  	 * @param type
  	 *        the lifecycle to hook the function to.
  	 *
  	 * @param fn
  	 *        The function or array of functions to attach.
  	 */
  def hookOnce(`type`: String): Unit = js.native
  def hookOnce(`type`: String, fn: js.Array[js.Function0[_]]): Unit = js.native
  def hookOnce(`type`: String, fn: js.Function0[_]): Unit = js.native
  @JSName("hook")
  def hook_beforesetup(`type`: beforesetup, fn: js.Array[BeforeSetup]): Unit = js.native
  @JSName("hook")
  def hook_beforesetup(`type`: beforesetup, fn: BeforeSetup): Unit = js.native
  @JSName("hook")
  def hook_setup(`type`: setup, fn: js.Array[Setup]): Unit = js.native
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
  def hook_setup(`type`: setup, fn: Setup): Unit = js.native
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
  def hooks(`type`: String): Unit = js.native
  def hooks(`type`: String, fn: js.Array[js.Function0[_]]): Unit = js.native
  def hooks(`type`: String, fn: js.Function0[_]): Unit = js.native
  /**
  	 * Returns whether the url passed is a cross domain request or not.
  	 *
  	 * @param url
  	 *        The url to check.
  	 *
  	 * @return	Whether it is a cross domain request or not.
  	 */
  def isCrossOrigin(url: String): Boolean = js.native
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
  def off(elem: Element, `type`: String, fn: EventListener): Unit = js.native
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
  def on(elem: Element, `type`: String, fn: EventListener): Unit = js.native
  def on(elem: Element, `type`: js.Array[String], fn: EventListener): Unit = js.native
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
  def one(elem: Element, `type`: String, fn: EventListener): Unit = js.native
  def one(elem: Element, `type`: js.Array[String], fn: EventListener): Unit = js.native
  /**
  	 * Resolve and parse the elements of a URL.
  	 *
  	 * @param url
  	 *         The url to parse
  	 *
  	 * @return	An object of url details
  	 */
  def parseUrl(url: String): URLObject = js.native
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
  def removeHook(`type`: String, fn: js.Function0[_]): Boolean = js.native
  /**
  	 * Resets formatTime to the default implementation.
  	 */
  def resetFormatTime(): Unit = js.native
  /**
  	 * Replaces the default formatTime implementation with a custom implementation.
  	 *
  	 * @param customImplementation
  	 *        A function which will be used in place of the default formatTime implementation.
  	 *        Will receive the current time in seconds and the guide (in seconds) as arguments.
  	 */
  def setFormatTime(customImplementation: js.Function2[/* seconds */ Double, /* guide */ Double, String]): Unit = js.native
  def trigger(elem: Element, event: String): js.UndefOr[Boolean] = js.native
  def trigger(elem: Element, event: String, hash: js.Any): js.UndefOr[Boolean] = js.native
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
  def trigger(elem: Element, event: Event): js.UndefOr[Boolean] = js.native
  def trigger(elem: Element, event: Event, hash: js.Any): js.UndefOr[Boolean] = js.native
  /**
  	 * Register a middleware to a source type.
  	 *
  	 * @param type A string representing a MIME type.
  	 * @param middleware A middleware factory that takes a player.
  	 */
  def use(
    `type`: String,
    middleware: js.Function1[/* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, Middleware]
  ): Unit = js.native
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
  Instantiable0[typings.videoDotJs.videoDotJsMod.videojsNs.Track]
       with Instantiable1[/* options */ AudioTrackOptions, typings.videoDotJs.videoDotJsMod.videojsNs.Track]
  
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.AudioTrackButton
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ TrackButtonOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.AudioTrackButton
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.AudioTrackMenuItem
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ AudioTrackMenuItemOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.AudioTrackMenuItem
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.BigPlayButton
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ ComponentOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.BigPlayButton
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.Button
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ ComponentOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.Button
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.CaptionsButton
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ TrackButtonOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.CaptionsButton
        ]
       with Instantiable3[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ TrackButtonOptions, 
          /* ready */ ReadyCallback, 
          typings.videoDotJs.videoDotJsMod.videojsNs.CaptionsButton
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          CaptionSettingsMenuItem
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ CaptionSettingsMenuItemOptions, 
          CaptionSettingsMenuItem
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.ChaptersButton
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ TrackButtonOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.ChaptersButton
        ]
       with Instantiable3[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ TrackButtonOptions, 
          /* ready */ ReadyCallback, 
          typings.videoDotJs.videoDotJsMod.videojsNs.ChaptersButton
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.ChaptersTrackMenuItem
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ ChaptersTrackMenuItemOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.ChaptersTrackMenuItem
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.ClickableComponent
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ ComponentOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.ClickableComponent
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.CloseButton
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ CloseButtonOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.CloseButton
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.Component
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ ComponentOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.Component
        ]
       with Instantiable3[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ ComponentOptions, 
          /* ready */ ReadyCallback, 
          typings.videoDotJs.videoDotJsMod.videojsNs.Component
        ] {
    def getComponent(name: String): Anon_Button = js.native
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
    def getComponent_Button(name: typings.videoDotJs.videoDotJsStrings.Button): Anon_Options = js.native
    @JSName("getComponent")
    def getComponent_ClickableComponent(name: typings.videoDotJs.videoDotJsStrings.ClickableComponent): Anon_OptionsPlayer = js.native
    @JSName("getComponent")
    def getComponent_Component(name: typings.videoDotJs.videoDotJsStrings.Component): Anon_Button = js.native
    @JSName("getComponent")
    def getComponent_Menu(name: typings.videoDotJs.videoDotJsStrings.Menu): Anon_OptionsPlayerMenu = js.native
    @JSName("getComponent")
    def getComponent_MenuButton(name: typings.videoDotJs.videoDotJsStrings.MenuButton): Anon_OptionsPlayerMenuButton = js.native
    @JSName("getComponent")
    def getComponent_MenuItem(name: typings.videoDotJs.videoDotJsStrings.MenuItem): Anon_OptionsPlayerMenuItem = js.native
    @JSName("getComponent")
    def getComponent_ModalDialog(name: typings.videoDotJs.videoDotJsStrings.ModalDialog): Anon_OptionsPlayerModalDialog = js.native
    @JSName("getComponent")
    def getComponent_MouseTimeDisplay(name: typings.videoDotJs.videoDotJsStrings.MouseTimeDisplay): Anon_OptionsPlayerComponentOptions = js.native
    @JSName("getComponent")
    def getComponent_Player(name: typings.videoDotJs.videoDotJsStrings.Player): Anon_GetTagSettings = js.native
    @JSName("getComponent")
    def getComponent_Spacer(name: typings.videoDotJs.videoDotJsStrings.Spacer): Anon_OptionsPlayerReady = js.native
    @JSName("getComponent")
    def getComponent_TimeTooltip(name: TimeTooltip): Anon_OptionsPlayerComponentOptionsTimeToolTip = js.native
    @JSName("getComponent")
    def getComponent_button(name: button): Anon_Options = js.native
    @JSName("getComponent")
    def getComponent_clickablecomponent(name: clickablecomponent): Anon_OptionsPlayer = js.native
    @JSName("getComponent")
    def getComponent_component(name: component): Anon_Button = js.native
    @JSName("getComponent")
    def getComponent_menu(name: menu): Anon_OptionsPlayerMenu = js.native
    @JSName("getComponent")
    def getComponent_menubutton(name: menubutton): Anon_OptionsPlayerMenuButton = js.native
    @JSName("getComponent")
    def getComponent_menuitem(name: menuitem): Anon_OptionsPlayerMenuItem = js.native
    @JSName("getComponent")
    def getComponent_modaldialog(name: modaldialog): Anon_OptionsPlayerModalDialog = js.native
    @JSName("getComponent")
    def getComponent_mouseTimeDisplay(name: mouseTimeDisplay): Anon_OptionsPlayerComponentOptions = js.native
    @JSName("getComponent")
    def getComponent_player(name: player): Anon_GetTagSettings = js.native
    @JSName("getComponent")
    def getComponent_spacer(name: spacer): Anon_OptionsPlayerReady = js.native
    @JSName("getComponent")
    def getComponent_timeTooltip(name: timeTooltip): Anon_OptionsPlayerComponentOptionsTimeToolTip = js.native
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
    def registerComponent(name: String, ComponentToRegister: js.Any): js.Any = js.native
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.ControlBar
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ ControlBarOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.ControlBar
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
  Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ ComponentOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.CurrentTimeDisplay
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.CustomControlSpacer
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ ComponentOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.CustomControlSpacer
        ]
       with Instantiable3[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ ComponentOptions, 
          /* ready */ ReadyCallback, 
          typings.videoDotJs.videoDotJsMod.videojsNs.CustomControlSpacer
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.DescriptionsButton
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ TrackButtonOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.DescriptionsButton
        ]
       with Instantiable3[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ TrackButtonOptions, 
          /* ready */ ReadyCallback, 
          typings.videoDotJs.videoDotJsMod.videojsNs.DescriptionsButton
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
  Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ ComponentOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.DurationDisplay
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.ErrorDisplay
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ ModalDialogOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.ErrorDisplay
        ]
  
  @js.native
  object EventTarget
    extends Instantiable0[typings.videoDotJs.videoDotJsMod.videojsNs.EventTarget]
  
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.FullscreenToggle
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ ComponentOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.FullscreenToggle
        ]
  
  @js.native
  object HTMLTrackElementList
    extends /**
  		 * Create an instance of this class.
  		 *
  		 * @param [tracks=[]]
  		 *        A list of `HtmlTrackElement` to instantiate the list with.
  		 */
  Instantiable0[typings.videoDotJs.videoDotJsMod.videojsNs.HTMLTrackElementList]
       with Instantiable1[
          /* tracks */ js.Array[HTMLTrackElement], 
          typings.videoDotJs.videoDotJsMod.videojsNs.HTMLTrackElementList
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
  Instantiable1[
          (/* value */ Double) | (/* value */ typings.videoDotJs.videoDotJsMod.videojsNs.MediaError) | (/* value */ String) | (/* value */ StringDictionary[js.Any]), 
          typings.videoDotJs.videoDotJsMod.videojsNs.MediaError
        ] {
    /**
    		 * W3C error code for media error aborted.
    		 * @default 1
    		 */
    var MEDIA_ERR_ABORTED: `1` = js.native
    /**
    		 * W3C error code for any custom error.
    		 * @default 0
    		 */
    var MEDIA_ERR_CUSTOM: `0` = js.native
    /**
    		 * W3C error code for any decoding error.
    		 * @default 3
    		 */
    var MEDIA_ERR_DECODE: `3` = js.native
    /**
    		 * W3C error code for any time that a source is encrypted.
    		 * @default 5
    		 */
    var MEDIA_ERR_ENCRYPTED: `5` = js.native
    /**
    		 * W3C error code for any network error.
    		 * @default 2
    		 */
    var MEDIA_ERR_NETWORK: `2` = js.native
    /**
    		 * W3C error code for any time that a source is not supported.
    		 * @default 4
    		 */
    var MEDIA_ERR_SRC_NOT_SUPPORTED: `4` = js.native
    /**
    		 * The default `MediaError` messages based on the {@link MediaError.errorTypes}.
    		 */
    var defaultMessages: js.Array[String] = js.native
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
    val errorTypes: js.Array[String] = js.native
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.Menu
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ MenuOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.Menu
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.MenuButton
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ MenuButtonOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.MenuButton
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.MenuItem
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ MenuItemOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.MenuItem
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.ModalDialog
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ ModalDialogOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.ModalDialog
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.MouseTimeDisplay
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ ComponentOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.MouseTimeDisplay
        ]
  
  @js.native
  object NetworkState extends js.Object {
    /* 0 */ val Empty: typings.videoDotJs.videoDotJsMod.videojsNs.NetworkState.Empty with Double = js.native
    /* 1 */ val Idle: typings.videoDotJs.videoDotJsMod.videojsNs.NetworkState.Idle with Double = js.native
    /* 2 */ val Loading: typings.videoDotJs.videoDotJsMod.videojsNs.NetworkState.Loading with Double = js.native
    /* 3 */ val NoSource: typings.videoDotJs.videoDotJsMod.videojsNs.NetworkState.NoSource with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.videoDotJs.videoDotJsMod.videojsNs.NetworkState with Double] = js.native
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.Player
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ PlayerOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.Player
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
    def getTagSettings(tag: Element): js.Any = js.native
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.Plugin
        ] {
    /**
    		 * The name of the base plugin class as it is registered.
    		 *
    		 */
    var BASE_PLUGIN_NAME: String = js.native
    /**
    		 * De-register a Video.js plugin.
    		 *
    		 * @param name
    		 *        The name of the plugin to be deregistered.
    		 */
    def deregisterPlugin(name: String): Unit = js.native
    /**
    		 * Gets a plugin by name if it exists.
    		 *
    		 * @param name
    		 *           The name of a plugin.
    		 *
    		 * @return The plugin (or `undefined`).
    		 */
    def getPlugin(name: String): Anon_BASEPLUGINNAME = js.native
    /**
    		 * Gets a plugin's version, if available
    		 *
    		 * @param name
    		 *          The name of a plugin.
    		 *
    		 * @return The plugin's version or an empty string.
    		 */
    def getPluginVersion(name: String): String = js.native
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
    def getPlugins(): StringDictionary[typings.videoDotJs.videoDotJsMod.videojsNs.Plugin] = js.native
    def getPlugins(names: js.Array[String]): StringDictionary[typings.videoDotJs.videoDotJsMod.videojsNs.Plugin] = js.native
    /**
    		 * Determines if a plugin is a basic plugin (i.e. not a sub-class of `Plugin`).
    		 *
    		 * @param plugin
    		 *          If a string, matches the name of a plugin. If a function, will be
    		 *          tested directly.
    		 *
    		 * @return Whether or not a plugin is a basic plugin.
    		 */
    def isBasic(plugin: String): Boolean = js.native
    def isBasic(plugin: js.Function0[_]): Boolean = js.native
    def registerPlugin[T /* <: Anon_BASEPLUGINNAME */](name: String, plugin: T): js.Function0[T] = js.native
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
      name: String,
      plugin: js.ThisFunction1[/* this */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, /* repeated */ K, T]
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.ProgressControl
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ ComponentOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.ProgressControl
        ]
  
  @js.native
  object ReadyState extends js.Object {
    /* 2 */ val HaveCurrentData: typings.videoDotJs.videoDotJsMod.videojsNs.ReadyState.HaveCurrentData with Double = js.native
    /* 4 */ val HaveEnoughData: typings.videoDotJs.videoDotJsMod.videojsNs.ReadyState.HaveEnoughData with Double = js.native
    /* 3 */ val HaveFutureData: typings.videoDotJs.videoDotJsMod.videojsNs.ReadyState.HaveFutureData with Double = js.native
    /* 1 */ val HaveMetadata: typings.videoDotJs.videoDotJsMod.videojsNs.ReadyState.HaveMetadata with Double = js.native
    /* 0 */ val HaveNothing: typings.videoDotJs.videoDotJsMod.videojsNs.ReadyState.HaveNothing with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.videoDotJs.videoDotJsMod.videojsNs.ReadyState with Double] = js.native
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.SeekBar
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ SliderOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.SeekBar
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.Slider
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ SliderOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.Slider
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.Spacer
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ ComponentOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.Spacer
        ]
       with Instantiable3[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ ComponentOptions, 
          /* ready */ ReadyCallback, 
          typings.videoDotJs.videoDotJsMod.videojsNs.Spacer
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
  Instantiable0[typings.videoDotJs.videoDotJsMod.videojsNs.Tech]
       with Instantiable1[/* options */ js.Any, typings.videoDotJs.videoDotJsMod.videojsNs.Tech]
       with Instantiable2[
          /* options */ js.Any, 
          /* ready */ ReadyCallback, 
          typings.videoDotJs.videoDotJsMod.videojsNs.Tech
        ] {
    /**
    		 * Check if the tech can support the given source
    		 * @param srcObj
    		 *        The source object
    		 * @param options
    		 *        The options passed to the tech
    		 * @return 'probably', 'maybe', or '' (empty string)
    		 */
    def canPlaySource(srcObj: js.Any, options: js.Any): problably | maybe | Empty = js.native
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
    def canPlayType(`type`: String): String = js.native
    /**
    		 * Get a `Tech` from the shared list by name.
    		 *
    		 * @param name
    		 *        `camelCase` or `TitleCase` name of the Tech to get
    		 *
    		 * @return The `Tech` or undefined if there was no tech with the name requested.
    		 */
    def getTech(name: String): js.UndefOr[typings.videoDotJs.videoDotJsMod.videojsNs.Tech] = js.native
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
    def isTech(component: js.Any): Boolean = js.native
    /**
    		 * Registers a `Tech` into a shared list for videojs.
    		 *
    		 * @param name
    		 *        Name of the `Tech` to register.
    		 *
    		 * @param tech
    		 *        The `Tech` class to register.
    		 */
    def registerTech(name: String, tech: js.Any): Unit = js.native
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
    def withSourceHandlers(tech: Anon_): Unit = js.native
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
  Instantiable1[
          /* options */ TextTrackOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.TextTrack
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.TextTrackButton
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ TrackButtonOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.TextTrackButton
        ]
  
  @js.native
  object TextTrackCueList
    extends /**
  		 * Create an instance of this class..
  		 *
  		 * @param cues
  		 *        A list of cues to be initialized with
  		 */
  Instantiable1[
          /* cues */ js.Array[TextTrackCue], 
          typings.videoDotJs.videoDotJsMod.videojsNs.TextTrackCueList
        ]
  
  @js.native
  object TextTrackList
    extends /**
  		 * Create an instance of this class
  		 *
  		 * @param tracks
  		 *        A list of tracks to initialize the list with.
  		 */
  Instantiable0[typings.videoDotJs.videoDotJsMod.videojsNs.TextTrackList]
       with Instantiable1[
          /* tracks */ js.Array[typings.videoDotJs.videoDotJsMod.videojsNs.TextTrack], 
          typings.videoDotJs.videoDotJsMod.videojsNs.TextTrackList
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.TextTrackMenuItem
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ TextTrackMenuItemOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.TextTrackMenuItem
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
  Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ TextTrackSettingsOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.TextTrackSettings
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.TimeDisplay
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ ComponentOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.TimeDisplay
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.TimeToolTip
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ ComponentOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.TimeToolTip
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
  Instantiable0[typings.videoDotJs.videoDotJsMod.videojsNs.Track]
       with Instantiable1[/* options */ TrackOptions, typings.videoDotJs.videoDotJsMod.videojsNs.Track]
  
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.MenuButton
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ TrackButtonOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.MenuButton
        ]
  
  @js.native
  object TrackList
    extends /**
  		 * Create an instance of this class
  		 *
  		 * @param tracks
  		 *        A list of tracks to initialize the list with.
  		 */
  Instantiable0[typings.videoDotJs.videoDotJsMod.videojsNs.TrackList]
       with Instantiable1[
          /* tracks */ js.Array[typings.videoDotJs.videoDotJsMod.videojsNs.Track], 
          typings.videoDotJs.videoDotJsMod.videojsNs.TrackList
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.VolumeBar
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ SliderOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.VolumeBar
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.VolumeControl
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ VolumeControlOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.VolumeControl
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.VolumeLevel
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ ComponentOptions, 
          typings.videoDotJs.videoDotJsMod.videojsNs.VolumeLevel
        ]
       with Instantiable3[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ ComponentOptions, 
          /* ready */ ReadyCallback, 
          typings.videoDotJs.videoDotJsMod.videojsNs.VolumeLevel
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
  Instantiable1[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          typings.videoDotJs.videoDotJsMod.videojsNs.VolumePanel
        ]
       with Instantiable2[
          /* player */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, 
          /* options */ typings.videoDotJs.videoDotJsMod.videojsNs.VolumePanel, 
          typings.videoDotJs.videoDotJsMod.videojsNs.VolumePanel
        ]
  
  /**
  	 * Get a component class object by name
  	 *
  	 * @borrows Component.getComponent as getComponent
  	 */
  @js.native
  object getComponent extends js.Object {
    def apply(name: String): /* import warning: ImportType.apply Failed type conversion: typeof Component */ js.Any = js.native
    def apply(name: typings.videoDotJs.videoDotJsStrings.Button): /* import warning: ImportType.apply Failed type conversion: typeof Button */ js.Any = js.native
    def apply(name: typings.videoDotJs.videoDotJsStrings.ClickableComponent): /* import warning: ImportType.apply Failed type conversion: typeof ClickableComponent */ js.Any = js.native
    def apply(name: typings.videoDotJs.videoDotJsStrings.Component): /* import warning: ImportType.apply Failed type conversion: typeof Component */ js.Any = js.native
    def apply(name: typings.videoDotJs.videoDotJsStrings.Menu): /* import warning: ImportType.apply Failed type conversion: typeof Menu */ js.Any = js.native
    def apply(name: typings.videoDotJs.videoDotJsStrings.MenuButton): /* import warning: ImportType.apply Failed type conversion: typeof MenuButton */ js.Any = js.native
    def apply(name: typings.videoDotJs.videoDotJsStrings.MenuItem): /* import warning: ImportType.apply Failed type conversion: typeof MenuItem */ js.Any = js.native
    def apply(name: typings.videoDotJs.videoDotJsStrings.ModalDialog): /* import warning: ImportType.apply Failed type conversion: typeof ModalDialog */ js.Any = js.native
    def apply(name: typings.videoDotJs.videoDotJsStrings.MouseTimeDisplay): /* import warning: ImportType.apply Failed type conversion: typeof MouseTimeDisplay */ js.Any = js.native
    def apply(name: typings.videoDotJs.videoDotJsStrings.Player): /* import warning: ImportType.apply Failed type conversion: typeof Player */ js.Any = js.native
    def apply(name: typings.videoDotJs.videoDotJsStrings.Spacer): /* import warning: ImportType.apply Failed type conversion: typeof Spacer */ js.Any = js.native
    def apply(name: TimeTooltip): /* import warning: ImportType.apply Failed type conversion: typeof TimeToolTip */ js.Any = js.native
    def apply(name: button): /* import warning: ImportType.apply Failed type conversion: typeof Button */ js.Any = js.native
    def apply(name: clickablecomponent): /* import warning: ImportType.apply Failed type conversion: typeof ClickableComponent */ js.Any = js.native
    def apply(name: component): /* import warning: ImportType.apply Failed type conversion: typeof Component */ js.Any = js.native
    def apply(name: menu): /* import warning: ImportType.apply Failed type conversion: typeof Menu */ js.Any = js.native
    def apply(name: menubutton): /* import warning: ImportType.apply Failed type conversion: typeof MenuButton */ js.Any = js.native
    def apply(name: menuitem): /* import warning: ImportType.apply Failed type conversion: typeof MenuItem */ js.Any = js.native
    def apply(name: modaldialog): /* import warning: ImportType.apply Failed type conversion: typeof ModalDialog */ js.Any = js.native
    def apply(name: mouseTimeDisplay): /* import warning: ImportType.apply Failed type conversion: typeof MouseTimeDisplay */ js.Any = js.native
    def apply(name: player): /* import warning: ImportType.apply Failed type conversion: typeof Player */ js.Any = js.native
    def apply(name: spacer): /* import warning: ImportType.apply Failed type conversion: typeof Spacer */ js.Any = js.native
    def apply(name: timeTooltip): /* import warning: ImportType.apply Failed type conversion: typeof TimeToolTip */ js.Any = js.native
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
    def apply(name: String): /* import warning: ImportType.apply Failed type conversion: typeof Plugin */ js.Any = js.native
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
    def apply(name: String): String = js.native
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
    def apply(): StringDictionary[typings.videoDotJs.videoDotJsMod.videojsNs.Plugin] = js.native
    def apply(names: js.Array[String]): StringDictionary[typings.videoDotJs.videoDotJsMod.videojsNs.Plugin] = js.native
  }
  
  /**
  	 * Get a Tech class object by name
  	 *
  	 * @borrows Tech.getTech as getTech
  	 */
  @js.native
  object getTech extends js.Object {
    def apply(name: String): js.UndefOr[typings.videoDotJs.videoDotJsMod.videojsNs.Tech] = js.native
  }
  
  /**
  	 * An Object that contains lifecycle hooks as keys which point to an array
  	 * of functions that are run when a lifecycle is triggered
  	 */
  @js.native
  object hooks_
    extends /* type */ StringDictionary[js.Function0[_]]
  
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
    def apply[T /* <: /* import warning: ImportType.apply Failed type conversion: typeof Plugin */ js.Any */](name: String, plugin: T): js.Function0[T] = js.native
    def apply[T, K](
      name: String,
      plugin: js.ThisFunction1[/* this */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, /* repeated */ K, T]
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
    def apply(name: String, ComponentToRegister: js.Any): js.Any = js.native
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
    def apply[T /* <: /* import warning: ImportType.apply Failed type conversion: typeof Plugin */ js.Any */](name: String, plugin: T): js.Function0[T] = js.native
    def apply[T, K](
      name: String,
      plugin: js.ThisFunction1[/* this */ typings.videoDotJs.videoDotJsMod.videojsNs.Player, /* repeated */ K, T]
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
    def apply(name: String, tech: js.Any): Unit = js.native
  }
  
}

