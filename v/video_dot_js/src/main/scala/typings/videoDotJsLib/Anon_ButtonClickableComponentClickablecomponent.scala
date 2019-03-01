package typings
package videoDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ButtonClickableComponentClickablecomponent
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
  def getComponent(name: java.lang.String): Anon_ButtonClickableComponent = js.native
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
  def getComponent_Button(name: videoDotJsLib.videoDotJsLibStrings.Button): Anon_OptionsPlayerButton = js.native
  @JSName("getComponent")
  def getComponent_ClickableComponent(name: videoDotJsLib.videoDotJsLibStrings.ClickableComponent): Anon_OptionsPlayerClickableComponent = js.native
  @JSName("getComponent")
  def getComponent_Component(name: videoDotJsLib.videoDotJsLibStrings.Component): Anon_ButtonClickableComponent = js.native
  @JSName("getComponent")
  def getComponent_Menu(name: videoDotJsLib.videoDotJsLibStrings.Menu): Anon_OptionsPlayerMenu = js.native
  @JSName("getComponent")
  def getComponent_MenuButton(name: videoDotJsLib.videoDotJsLibStrings.MenuButton): Anon_OptionsPlayerMenuButton = js.native
  @JSName("getComponent")
  def getComponent_MenuItem(name: videoDotJsLib.videoDotJsLibStrings.MenuItem): Anon_OptionsPlayerMenuItem = js.native
  @JSName("getComponent")
  def getComponent_ModalDialog(name: videoDotJsLib.videoDotJsLibStrings.ModalDialog): Anon_OptionsPlayerModalDialog = js.native
  @JSName("getComponent")
  def getComponent_MouseTimeDisplay(name: videoDotJsLib.videoDotJsLibStrings.MouseTimeDisplay): Anon_OptionsPlayerComponentOptions = js.native
  @JSName("getComponent")
  def getComponent_Player(name: videoDotJsLib.videoDotJsLibStrings.Player): Anon_GetTagSettings = js.native
  @JSName("getComponent")
  def getComponent_Spacer(name: videoDotJsLib.videoDotJsLibStrings.Spacer): Anon_OptionsPlayerReadyComponentOptions = js.native
  @JSName("getComponent")
  def getComponent_TimeTooltip(name: videoDotJsLib.videoDotJsLibStrings.TimeTooltip): Anon_OptionsPlayerComponentOptionsTimeToolTip = js.native
  @JSName("getComponent")
  def getComponent_button(name: videoDotJsLib.videoDotJsLibStrings.button): Anon_OptionsPlayerButton = js.native
  @JSName("getComponent")
  def getComponent_clickablecomponent(name: videoDotJsLib.videoDotJsLibStrings.clickablecomponent): Anon_OptionsPlayerClickableComponent = js.native
  @JSName("getComponent")
  def getComponent_component(name: videoDotJsLib.videoDotJsLibStrings.component): Anon_ButtonClickableComponent = js.native
  @JSName("getComponent")
  def getComponent_menu(name: videoDotJsLib.videoDotJsLibStrings.menu): Anon_OptionsPlayerMenu = js.native
  @JSName("getComponent")
  def getComponent_menubutton(name: videoDotJsLib.videoDotJsLibStrings.menubutton): Anon_OptionsPlayerMenuButton = js.native
  @JSName("getComponent")
  def getComponent_menuitem(name: videoDotJsLib.videoDotJsLibStrings.menuitem): Anon_OptionsPlayerMenuItem = js.native
  @JSName("getComponent")
  def getComponent_modaldialog(name: videoDotJsLib.videoDotJsLibStrings.modaldialog): Anon_OptionsPlayerModalDialog = js.native
  @JSName("getComponent")
  def getComponent_mouseTimeDisplay(name: videoDotJsLib.videoDotJsLibStrings.mouseTimeDisplay): Anon_OptionsPlayerComponentOptions = js.native
  @JSName("getComponent")
  def getComponent_player(name: videoDotJsLib.videoDotJsLibStrings.player): Anon_GetTagSettings = js.native
  @JSName("getComponent")
  def getComponent_spacer(name: videoDotJsLib.videoDotJsLibStrings.spacer): Anon_OptionsPlayerReadyComponentOptions = js.native
  @JSName("getComponent")
  def getComponent_timeTooltip(name: videoDotJsLib.videoDotJsLibStrings.timeTooltip): Anon_OptionsPlayerComponentOptionsTimeToolTip = js.native
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

