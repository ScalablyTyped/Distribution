package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.EventTarget.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Menu component is used to build popup menus, including subtitle and
  * captions selection menus.
  */
@js.native
trait Menu
  extends StObject
     with Component {
  
  /**
    * Add a {@link MenuItem} to the menu.
    *
    * @param component
    *        The name or instance of the `MenuItem` to add.
    *
    */
  def addItem(component: String): Unit = js.native
  def addItem(component: MenuItem): Unit = js.native
  
  def focus(item: js.Any): Unit = js.native
  
  /**
    * Handle a `keydown` event on this menu. This listener is added in the constructor.
    *
    * @param event
    *        A `keydown` event that happened on the menu.
    *
    * @listens keydown
    */
  def handleKeyPress(event: Event): Unit = js.native
  
  var menuButton_ : MenuButton = js.native
  
  @JSName("options_")
  var options__Menu: MenuOptions = js.native
  
  /**
    * Move to previous (higher) menu item for keyboard users.
    */
  def stepBack(): Unit = js.native
  
  /**
    * Move to next (lower) menu item for keyboard users.
    */
  def stepForward(): Unit = js.native
}
