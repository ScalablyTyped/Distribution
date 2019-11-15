package typings.videoDotJs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.videoDotJs.videoDotJsMod.videojs.Component
import typings.videoDotJs.videoDotJsMod.videojs.Component.ReadyCallback
import typings.videoDotJs.videoDotJsMod.videojs.ComponentOptions
import typings.videoDotJs.videoDotJsMod.videojs.Player
import typings.videoDotJs.videoDotJsStrings.Button
import typings.videoDotJs.videoDotJsStrings.ClickableComponent
import typings.videoDotJs.videoDotJsStrings.Menu
import typings.videoDotJs.videoDotJsStrings.MenuButton
import typings.videoDotJs.videoDotJsStrings.MenuItem
import typings.videoDotJs.videoDotJsStrings.ModalDialog
import typings.videoDotJs.videoDotJsStrings.MouseTimeDisplay
import typings.videoDotJs.videoDotJsStrings.Spacer
import typings.videoDotJs.videoDotJsStrings.TimeTooltip
import typings.videoDotJs.videoDotJsStrings.button
import typings.videoDotJs.videoDotJsStrings.clickablecomponent
import typings.videoDotJs.videoDotJsStrings.component
import typings.videoDotJs.videoDotJsStrings.menu
import typings.videoDotJs.videoDotJsStrings.menubutton
import typings.videoDotJs.videoDotJsStrings.menuitem
import typings.videoDotJs.videoDotJsStrings.modaldialog
import typings.videoDotJs.videoDotJsStrings.mouseTimeDisplay
import typings.videoDotJs.videoDotJsStrings.player
import typings.videoDotJs.videoDotJsStrings.spacer
import typings.videoDotJs.videoDotJsStrings.timeTooltip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Button
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
Instantiable1[/* player */ Player, Component]
     with Instantiable2[/* player */ Player, /* options */ ComponentOptions, Component]
     with Instantiable3[
      /* player */ Player, 
      /* options */ ComponentOptions, 
      /* ready */ ReadyCallback, 
      Component
    ] {
  def getComponent(name: String): /* import warning: ImportType.apply Failed type conversion: typeof Component */ js.Any = js.native
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
  def getComponent_Button(name: Button): /* import warning: ImportType.apply Failed type conversion: typeof Button */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_ClickableComponent(name: ClickableComponent): /* import warning: ImportType.apply Failed type conversion: typeof ClickableComponent */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_Component(name: typings.videoDotJs.videoDotJsStrings.Component): /* import warning: ImportType.apply Failed type conversion: typeof Component */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_Menu(name: Menu): /* import warning: ImportType.apply Failed type conversion: typeof Menu */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_MenuButton(name: MenuButton): /* import warning: ImportType.apply Failed type conversion: typeof MenuButton */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_MenuItem(name: MenuItem): /* import warning: ImportType.apply Failed type conversion: typeof MenuItem */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_ModalDialog(name: ModalDialog): /* import warning: ImportType.apply Failed type conversion: typeof ModalDialog */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_MouseTimeDisplay(name: MouseTimeDisplay): /* import warning: ImportType.apply Failed type conversion: typeof MouseTimeDisplay */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_Player(name: typings.videoDotJs.videoDotJsStrings.Player): /* import warning: ImportType.apply Failed type conversion: typeof Player */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_Spacer(name: Spacer): /* import warning: ImportType.apply Failed type conversion: typeof Spacer */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_TimeTooltip(name: TimeTooltip): /* import warning: ImportType.apply Failed type conversion: typeof TimeToolTip */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_button(name: button): /* import warning: ImportType.apply Failed type conversion: typeof Button */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_clickablecomponent(name: clickablecomponent): /* import warning: ImportType.apply Failed type conversion: typeof ClickableComponent */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_component(name: component): /* import warning: ImportType.apply Failed type conversion: typeof Component */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_menu(name: menu): /* import warning: ImportType.apply Failed type conversion: typeof Menu */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_menubutton(name: menubutton): /* import warning: ImportType.apply Failed type conversion: typeof MenuButton */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_menuitem(name: menuitem): /* import warning: ImportType.apply Failed type conversion: typeof MenuItem */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_modaldialog(name: modaldialog): /* import warning: ImportType.apply Failed type conversion: typeof ModalDialog */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_mouseTimeDisplay(name: mouseTimeDisplay): /* import warning: ImportType.apply Failed type conversion: typeof MouseTimeDisplay */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_player(name: player): /* import warning: ImportType.apply Failed type conversion: typeof Player */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_spacer(name: spacer): /* import warning: ImportType.apply Failed type conversion: typeof Spacer */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_timeTooltip(name: timeTooltip): /* import warning: ImportType.apply Failed type conversion: typeof TimeToolTip */ js.Any = js.native
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

