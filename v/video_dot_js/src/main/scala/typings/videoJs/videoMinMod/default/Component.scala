package typings.videoJs.videoMinMod.default

import typings.videoJs.anon.Instantiable
import typings.videoJs.anon.InstantiableClickableComponent
import typings.videoJs.anon.InstantiableMenu
import typings.videoJs.anon.InstantiableMenuButton
import typings.videoJs.anon.InstantiableMenuItem
import typings.videoJs.anon.InstantiableModalDialog
import typings.videoJs.anon.InstantiableMouseTimeDisplay
import typings.videoJs.anon.InstantiableSpacer
import typings.videoJs.anon.InstantiableTimeToolTip
import typings.videoJs.anon.TypeofComponent
import typings.videoJs.anon.TypeofPlayer
import typings.videoJs.mod.videojs.Component.ReadyCallback
import typings.videoJs.mod.videojs.ComponentOptions
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Component {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("video.js/dist/video.min", "default.Component")
  @js.native
  open class ^ protected ()
    extends StObject
       with typings.videoJs.mod.videojs.Component {
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
    def this(player: typings.videoJs.mod.videojs.Player) = this()
    def this(player: typings.videoJs.mod.videojs.Player, options: ComponentOptions) = this()
    def this(player: typings.videoJs.mod.videojs.Player, options: Unit, ready: ReadyCallback) = this()
    def this(player: typings.videoJs.mod.videojs.Player, options: ComponentOptions, ready: ReadyCallback) = this()
  }
  
  @JSImport("video.js/dist/video.min", "default.Component")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getComponent(name: timeTooltip_ | TimeTooltip): InstantiableTimeToolTip = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(name.asInstanceOf[js.Any]).asInstanceOf[InstantiableTimeToolTip]
  inline def getComponent(name: String): TypeofComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(name.asInstanceOf[js.Any]).asInstanceOf[TypeofComponent]
  
  /**
    * Get a `Component` based on the name it was registered with.
    *
    * @param name
    *        The Name of the component to get.
    *
    * @return The `Component` that got registered under the given name.
    */
  inline def getComponent_Instantiable(name: Button | button_): Instantiable = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(name.asInstanceOf[js.Any]).asInstanceOf[Instantiable]
  
  inline def getComponent_InstantiableClickableComponent(name: ClickableComponent | clickablecomponent_): InstantiableClickableComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(name.asInstanceOf[js.Any]).asInstanceOf[InstantiableClickableComponent]
  
  inline def getComponent_InstantiableMenu(name: Menu | menu_): InstantiableMenu = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(name.asInstanceOf[js.Any]).asInstanceOf[InstantiableMenu]
  
  inline def getComponent_InstantiableMenuButton(name: MenuButton | menubutton_): InstantiableMenuButton = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(name.asInstanceOf[js.Any]).asInstanceOf[InstantiableMenuButton]
  
  inline def getComponent_InstantiableMenuItem(name: MenuItem | menuitem_): InstantiableMenuItem = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(name.asInstanceOf[js.Any]).asInstanceOf[InstantiableMenuItem]
  
  inline def getComponent_InstantiableModalDialog(name: ModalDialog | modaldialog_): InstantiableModalDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(name.asInstanceOf[js.Any]).asInstanceOf[InstantiableModalDialog]
  
  inline def getComponent_InstantiableMouseTimeDisplay(name: MouseTimeDisplay | mouseTimeDisplay_): InstantiableMouseTimeDisplay = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(name.asInstanceOf[js.Any]).asInstanceOf[InstantiableMouseTimeDisplay]
  
  inline def getComponent_InstantiableSpacer(name: Spacer | spacer_): InstantiableSpacer = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(name.asInstanceOf[js.Any]).asInstanceOf[InstantiableSpacer]
  
  inline def getComponent_TypeofComponent(name: typings.videoJs.videoJsStrings.Component | component_): TypeofComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(name.asInstanceOf[js.Any]).asInstanceOf[TypeofComponent]
  
  inline def getComponent_TypeofPlayer(name: typings.videoJs.videoJsStrings.Player | player_): TypeofPlayer = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(name.asInstanceOf[js.Any]).asInstanceOf[TypeofPlayer]
  
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
  inline def registerComponent(name: String, ComponentToRegister: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("registerComponent")(name.asInstanceOf[js.Any], ComponentToRegister.asInstanceOf[js.Any])).asInstanceOf[Any]
}
