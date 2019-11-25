package typings.videoDotJs.videoDotJsMod.default.Component

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
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
import typings.videoDotJs.TypeofComponent
import typings.videoDotJs.videoDotJsMod.videojs.Component.ReadyCallback
import typings.videoDotJs.videoDotJsMod.videojs.ComponentOptions
import typings.videoDotJs.videoDotJsStrings.TimeTooltip
import typings.videoDotJs.videoDotJsStrings.button_
import typings.videoDotJs.videoDotJsStrings.clickablecomponent_
import typings.videoDotJs.videoDotJsStrings.component_
import typings.videoDotJs.videoDotJsStrings.menu_
import typings.videoDotJs.videoDotJsStrings.menubutton_
import typings.videoDotJs.videoDotJsStrings.menuitem_
import typings.videoDotJs.videoDotJsStrings.modaldialog_
import typings.videoDotJs.videoDotJsStrings.mouseTimeDisplay_
import typings.videoDotJs.videoDotJsStrings.player_
import typings.videoDotJs.videoDotJsStrings.spacer_
import typings.videoDotJs.videoDotJsStrings.timeTooltip_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "Component")
@js.native
class ^ protected ()
  extends typings.videoDotJs.videoDotJsMod.videojs.Component {
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
  def this(player: typings.videoDotJs.videoDotJsMod.videojs.Player) = this()
  def this(player: typings.videoDotJs.videoDotJsMod.videojs.Player, options: ComponentOptions) = this()
  def this(
    player: typings.videoDotJs.videoDotJsMod.videojs.Player,
    options: ComponentOptions,
    ready: ReadyCallback
  ) = this()
}

@JSImport("video.js", "Component")
@js.native
object ^
  extends TopLevel[
      (/**
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
        /* player */ typings.videoDotJs.videoDotJsMod.videojs.Player, 
        typings.videoDotJs.videoDotJsMod.videojs.Component
      ]) with (Instantiable2[
        /* player */ typings.videoDotJs.videoDotJsMod.videojs.Player, 
        /* options */ ComponentOptions, 
        typings.videoDotJs.videoDotJsMod.videojs.Component
      ]) with (Instantiable3[
        /* player */ typings.videoDotJs.videoDotJsMod.videojs.Player, 
        /* options */ ComponentOptions, 
        /* ready */ ReadyCallback, 
        typings.videoDotJs.videoDotJsMod.videojs.Component
      ])
    ] {
  def getComponent(name: String): TypeofComponent = js.native
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
  def getComponent_Component(name: typings.videoDotJs.videoDotJsStrings.Component): TypeofComponent = js.native
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
  def getComponent_button(name: button_): Anon_Options = js.native
  @JSName("getComponent")
  def getComponent_clickablecomponent(name: clickablecomponent_): Anon_OptionsPlayer = js.native
  @JSName("getComponent")
  def getComponent_component(name: component_): TypeofComponent = js.native
  @JSName("getComponent")
  def getComponent_menu(name: menu_): Anon_OptionsPlayerMenu = js.native
  @JSName("getComponent")
  def getComponent_menubutton(name: menubutton_): Anon_OptionsPlayerMenuButton = js.native
  @JSName("getComponent")
  def getComponent_menuitem(name: menuitem_): Anon_OptionsPlayerMenuItem = js.native
  @JSName("getComponent")
  def getComponent_modaldialog(name: modaldialog_): Anon_OptionsPlayerModalDialog = js.native
  @JSName("getComponent")
  def getComponent_mouseTimeDisplay(name: mouseTimeDisplay_): Anon_OptionsPlayerComponentOptions = js.native
  @JSName("getComponent")
  def getComponent_player(name: player_): Anon_GetTagSettings = js.native
  @JSName("getComponent")
  def getComponent_spacer(name: spacer_): Anon_OptionsPlayerReady = js.native
  @JSName("getComponent")
  def getComponent_timeTooltip(name: timeTooltip_): Anon_OptionsPlayerComponentOptionsTimeToolTip = js.native
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

