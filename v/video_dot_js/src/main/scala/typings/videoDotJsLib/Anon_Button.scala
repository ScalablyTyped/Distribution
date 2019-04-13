package typings
package videoDotJsLib

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
  def getComponent(name: java.lang.String): /* import warning: ImportType.apply Failed type conversion: typeof Component */ js.Any = js.native
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
  def getComponent_Button(name: videoDotJsLib.videoDotJsLibStrings.Button): /* import warning: ImportType.apply Failed type conversion: typeof Button */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_ClickableComponent(name: videoDotJsLib.videoDotJsLibStrings.ClickableComponent): /* import warning: ImportType.apply Failed type conversion: typeof ClickableComponent */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_Component(name: videoDotJsLib.videoDotJsLibStrings.Component): /* import warning: ImportType.apply Failed type conversion: typeof Component */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_Menu(name: videoDotJsLib.videoDotJsLibStrings.Menu): /* import warning: ImportType.apply Failed type conversion: typeof Menu */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_MenuButton(name: videoDotJsLib.videoDotJsLibStrings.MenuButton): /* import warning: ImportType.apply Failed type conversion: typeof MenuButton */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_MenuItem(name: videoDotJsLib.videoDotJsLibStrings.MenuItem): /* import warning: ImportType.apply Failed type conversion: typeof MenuItem */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_ModalDialog(name: videoDotJsLib.videoDotJsLibStrings.ModalDialog): /* import warning: ImportType.apply Failed type conversion: typeof ModalDialog */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_MouseTimeDisplay(name: videoDotJsLib.videoDotJsLibStrings.MouseTimeDisplay): /* import warning: ImportType.apply Failed type conversion: typeof MouseTimeDisplay */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_Player(name: videoDotJsLib.videoDotJsLibStrings.Player): /* import warning: ImportType.apply Failed type conversion: typeof Player */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_Spacer(name: videoDotJsLib.videoDotJsLibStrings.Spacer): /* import warning: ImportType.apply Failed type conversion: typeof Spacer */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_TimeTooltip(name: videoDotJsLib.videoDotJsLibStrings.TimeTooltip): /* import warning: ImportType.apply Failed type conversion: typeof TimeToolTip */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_button(name: videoDotJsLib.videoDotJsLibStrings.button): /* import warning: ImportType.apply Failed type conversion: typeof Button */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_clickablecomponent(name: videoDotJsLib.videoDotJsLibStrings.clickablecomponent): /* import warning: ImportType.apply Failed type conversion: typeof ClickableComponent */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_component(name: videoDotJsLib.videoDotJsLibStrings.component): /* import warning: ImportType.apply Failed type conversion: typeof Component */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_menu(name: videoDotJsLib.videoDotJsLibStrings.menu): /* import warning: ImportType.apply Failed type conversion: typeof Menu */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_menubutton(name: videoDotJsLib.videoDotJsLibStrings.menubutton): /* import warning: ImportType.apply Failed type conversion: typeof MenuButton */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_menuitem(name: videoDotJsLib.videoDotJsLibStrings.menuitem): /* import warning: ImportType.apply Failed type conversion: typeof MenuItem */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_modaldialog(name: videoDotJsLib.videoDotJsLibStrings.modaldialog): /* import warning: ImportType.apply Failed type conversion: typeof ModalDialog */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_mouseTimeDisplay(name: videoDotJsLib.videoDotJsLibStrings.mouseTimeDisplay): /* import warning: ImportType.apply Failed type conversion: typeof MouseTimeDisplay */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_player(name: videoDotJsLib.videoDotJsLibStrings.player): /* import warning: ImportType.apply Failed type conversion: typeof Player */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_spacer(name: videoDotJsLib.videoDotJsLibStrings.spacer): /* import warning: ImportType.apply Failed type conversion: typeof Spacer */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_timeTooltip(name: videoDotJsLib.videoDotJsLibStrings.timeTooltip): /* import warning: ImportType.apply Failed type conversion: typeof TimeToolTip */ js.Any = js.native
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

