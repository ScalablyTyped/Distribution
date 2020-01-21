package typings.videoJs.mod.default.Component

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typings.videoJs.AnonGetTagSettings
import typings.videoJs.AnonOptions
import typings.videoJs.AnonOptionsPlayer
import typings.videoJs.AnonOptionsPlayerComponentOptions
import typings.videoJs.AnonOptionsPlayerComponentOptionsTimeToolTip
import typings.videoJs.AnonOptionsPlayerMenu
import typings.videoJs.AnonOptionsPlayerMenuButton
import typings.videoJs.AnonOptionsPlayerMenuItem
import typings.videoJs.AnonOptionsPlayerModalDialog
import typings.videoJs.AnonOptionsPlayerReady
import typings.videoJs.TypeofComponent
import typings.videoJs.mod.videojs.Component.ReadyCallback
import typings.videoJs.mod.videojs.ComponentOptions
import typings.videoJs.mod.videojs.Player
import typings.videoJs.videoJsStrings.Button
import typings.videoJs.videoJsStrings.ClickableComponent
import typings.videoJs.videoJsStrings.Menu
import typings.videoJs.videoJsStrings.MenuButton
import typings.videoJs.videoJsStrings.MenuItem
import typings.videoJs.videoJsStrings.ModalDialog
import typings.videoJs.videoJsStrings.MouseTimeDisplay
import typings.videoJs.videoJsStrings.Spacer
import typings.videoJs.videoJsStrings.TimeTooltip
import typings.videoJs.videoJsStrings.button_
import typings.videoJs.videoJsStrings.clickablecomponent_
import typings.videoJs.videoJsStrings.component_
import typings.videoJs.videoJsStrings.menu_
import typings.videoJs.videoJsStrings.menubutton_
import typings.videoJs.videoJsStrings.menuitem_
import typings.videoJs.videoJsStrings.modaldialog_
import typings.videoJs.videoJsStrings.mouseTimeDisplay_
import typings.videoJs.videoJsStrings.player_
import typings.videoJs.videoJsStrings.spacer_
import typings.videoJs.videoJsStrings.timeTooltip_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "Component")
@js.native
class ^ protected ()
  extends typings.videoJs.mod.videojs.Component {
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
  def this(player: Player) = this()
  def this(player: Player, options: ComponentOptions) = this()
  def this(player: Player, options: ComponentOptions, ready: ReadyCallback) = this()
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
Instantiable1[/* player */ Player, typings.videoJs.mod.videojs.Component]) with (Instantiable2[
        /* player */ Player, 
        /* options */ ComponentOptions, 
        typings.videoJs.mod.videojs.Component
      ]) with (Instantiable3[
        /* player */ Player, 
        /* options */ ComponentOptions, 
        /* ready */ ReadyCallback, 
        typings.videoJs.mod.videojs.Component
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
  def getComponent_Button(name: Button): AnonOptions = js.native
  @JSName("getComponent")
  def getComponent_ClickableComponent(name: ClickableComponent): AnonOptionsPlayer = js.native
  @JSName("getComponent")
  def getComponent_Component(name: typings.videoJs.videoJsStrings.Component): TypeofComponent = js.native
  @JSName("getComponent")
  def getComponent_Menu(name: Menu): AnonOptionsPlayerMenu = js.native
  @JSName("getComponent")
  def getComponent_MenuButton(name: MenuButton): AnonOptionsPlayerMenuButton = js.native
  @JSName("getComponent")
  def getComponent_MenuItem(name: MenuItem): AnonOptionsPlayerMenuItem = js.native
  @JSName("getComponent")
  def getComponent_ModalDialog(name: ModalDialog): AnonOptionsPlayerModalDialog = js.native
  @JSName("getComponent")
  def getComponent_MouseTimeDisplay(name: MouseTimeDisplay): AnonOptionsPlayerComponentOptions = js.native
  @JSName("getComponent")
  def getComponent_Player(name: typings.videoJs.videoJsStrings.Player): AnonGetTagSettings = js.native
  @JSName("getComponent")
  def getComponent_Spacer(name: Spacer): AnonOptionsPlayerReady = js.native
  @JSName("getComponent")
  def getComponent_TimeTooltip(name: TimeTooltip): AnonOptionsPlayerComponentOptionsTimeToolTip = js.native
  @JSName("getComponent")
  def getComponent_button(name: button_): AnonOptions = js.native
  @JSName("getComponent")
  def getComponent_clickablecomponent(name: clickablecomponent_): AnonOptionsPlayer = js.native
  @JSName("getComponent")
  def getComponent_component(name: component_): TypeofComponent = js.native
  @JSName("getComponent")
  def getComponent_menu(name: menu_): AnonOptionsPlayerMenu = js.native
  @JSName("getComponent")
  def getComponent_menubutton(name: menubutton_): AnonOptionsPlayerMenuButton = js.native
  @JSName("getComponent")
  def getComponent_menuitem(name: menuitem_): AnonOptionsPlayerMenuItem = js.native
  @JSName("getComponent")
  def getComponent_modaldialog(name: modaldialog_): AnonOptionsPlayerModalDialog = js.native
  @JSName("getComponent")
  def getComponent_mouseTimeDisplay(name: mouseTimeDisplay_): AnonOptionsPlayerComponentOptions = js.native
  @JSName("getComponent")
  def getComponent_player(name: player_): AnonGetTagSettings = js.native
  @JSName("getComponent")
  def getComponent_spacer(name: spacer_): AnonOptionsPlayerReady = js.native
  @JSName("getComponent")
  def getComponent_timeTooltip(name: timeTooltip_): AnonOptionsPlayerComponentOptionsTimeToolTip = js.native
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

