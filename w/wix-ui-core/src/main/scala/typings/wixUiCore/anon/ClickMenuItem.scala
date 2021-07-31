package typings.wixUiCore.anon

import typings.unidriverCore.mod.UniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickMenuItem extends StObject {
  
  def click(): js.Promise[Unit]
  
  def clickMenuItem(menuItemLabel: String): js.Promise[Unit]
  
  def element(): js.Promise[js.Any]
  
  def exists(): js.Promise[Boolean]
  
  def getElementByDataHook(dataHook: String): js.Promise[UniDriver[js.Any]]
  
  def getMenuContainer(): js.Promise[UniDriver[js.Any]]
  
  def getMenuItem(menuItemLabel: String): js.Promise[UniDriver[js.Any]]
  
  def getMenuItemColumnsLayout(menuItemLabel: String): js.Promise[UniDriver[js.Any]]
  
  def getMenuItemGridLayout(menuItemLabel: String): js.Promise[UniDriver[js.Any]]
  
  def getMenuNavigation(): js.Promise[UniDriver[js.Any]]
  
  def hoverMenuItem(menuItemLabel: String): js.Promise[Unit]
}
object ClickMenuItem {
  
  @scala.inline
  def apply(
    click: () => js.Promise[Unit],
    clickMenuItem: String => js.Promise[Unit],
    element: () => js.Promise[js.Any],
    exists: () => js.Promise[Boolean],
    getElementByDataHook: String => js.Promise[UniDriver[js.Any]],
    getMenuContainer: () => js.Promise[UniDriver[js.Any]],
    getMenuItem: String => js.Promise[UniDriver[js.Any]],
    getMenuItemColumnsLayout: String => js.Promise[UniDriver[js.Any]],
    getMenuItemGridLayout: String => js.Promise[UniDriver[js.Any]],
    getMenuNavigation: () => js.Promise[UniDriver[js.Any]],
    hoverMenuItem: String => js.Promise[Unit]
  ): ClickMenuItem = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickMenuItem = js.Any.fromFunction1(clickMenuItem), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getElementByDataHook = js.Any.fromFunction1(getElementByDataHook), getMenuContainer = js.Any.fromFunction0(getMenuContainer), getMenuItem = js.Any.fromFunction1(getMenuItem), getMenuItemColumnsLayout = js.Any.fromFunction1(getMenuItemColumnsLayout), getMenuItemGridLayout = js.Any.fromFunction1(getMenuItemGridLayout), getMenuNavigation = js.Any.fromFunction0(getMenuNavigation), hoverMenuItem = js.Any.fromFunction1(hoverMenuItem))
    __obj.asInstanceOf[ClickMenuItem]
  }
  
  @scala.inline
  implicit class ClickMenuItemMutableBuilder[Self <: ClickMenuItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClickMenuItem(value: String => js.Promise[Unit]): Self = StObject.set(x, "clickMenuItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElement(value: () => js.Promise[js.Any]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElementByDataHook(value: String => js.Promise[UniDriver[js.Any]]): Self = StObject.set(x, "getElementByDataHook", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMenuContainer(value: () => js.Promise[UniDriver[js.Any]]): Self = StObject.set(x, "getMenuContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMenuItem(value: String => js.Promise[UniDriver[js.Any]]): Self = StObject.set(x, "getMenuItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMenuItemColumnsLayout(value: String => js.Promise[UniDriver[js.Any]]): Self = StObject.set(x, "getMenuItemColumnsLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMenuItemGridLayout(value: String => js.Promise[UniDriver[js.Any]]): Self = StObject.set(x, "getMenuItemGridLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMenuNavigation(value: () => js.Promise[UniDriver[js.Any]]): Self = StObject.set(x, "getMenuNavigation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHoverMenuItem(value: String => js.Promise[Unit]): Self = StObject.set(x, "hoverMenuItem", js.Any.fromFunction1(value))
  }
}
