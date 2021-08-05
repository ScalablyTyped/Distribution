package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.anon.ClickMenuItem
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object horizontalMenuDotUniDriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/horizontal-menu/HorizontalMenu.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def horizontalMenuUniDriverFactory(base: UniDriver[js.Any]): ClickMenuItem = ^.asInstanceOf[js.Dynamic].applyDynamic("horizontalMenuUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ClickMenuItem]
  
  trait HorizontalMenuDriver
    extends StObject
       with BaseUniDriver {
    
    /** Click on menu item by label */
    def clickMenuItem(menuItemLabel: String): js.Promise[Unit]
    
    def getElementByDataHook(dataHook: String): UniDriver[js.Any]
    
    /** Get main <ul> */
    def getMenuContainer(): UniDriver[js.Any]
    
    /** Get a menu item by label */
    def getMenuItem(menuItemLabel: String): UniDriver[js.Any]
    
    /** Get column layout by menu label */
    def getMenuItemColumnsLayout(menuItemLabel: String): UniDriver[js.Any]
    
    /** Get grid layout by menu label */
    def getMenuItemGridLayout(menuItemLabel: String): UniDriver[js.Any]
    
    /** Get main <nav> */
    def getMenuNavigation(): UniDriver[js.Any]
    
    /** Hover a menu item by label */
    def hoverMenuItem(menuItemLabel: String): js.Promise[Unit]
  }
  object HorizontalMenuDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickMenuItem: String => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getElementByDataHook: String => UniDriver[js.Any],
      getMenuContainer: () => UniDriver[js.Any],
      getMenuItem: String => UniDriver[js.Any],
      getMenuItemColumnsLayout: String => UniDriver[js.Any],
      getMenuItemGridLayout: String => UniDriver[js.Any],
      getMenuNavigation: () => UniDriver[js.Any],
      hoverMenuItem: String => js.Promise[Unit]
    ): HorizontalMenuDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickMenuItem = js.Any.fromFunction1(clickMenuItem), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getElementByDataHook = js.Any.fromFunction1(getElementByDataHook), getMenuContainer = js.Any.fromFunction0(getMenuContainer), getMenuItem = js.Any.fromFunction1(getMenuItem), getMenuItemColumnsLayout = js.Any.fromFunction1(getMenuItemColumnsLayout), getMenuItemGridLayout = js.Any.fromFunction1(getMenuItemGridLayout), getMenuNavigation = js.Any.fromFunction0(getMenuNavigation), hoverMenuItem = js.Any.fromFunction1(hoverMenuItem))
      __obj.asInstanceOf[HorizontalMenuDriver]
    }
    
    extension [Self <: HorizontalMenuDriver](x: Self) {
      
      inline def setClickMenuItem(value: String => js.Promise[Unit]): Self = StObject.set(x, "clickMenuItem", js.Any.fromFunction1(value))
      
      inline def setGetElementByDataHook(value: String => UniDriver[js.Any]): Self = StObject.set(x, "getElementByDataHook", js.Any.fromFunction1(value))
      
      inline def setGetMenuContainer(value: () => UniDriver[js.Any]): Self = StObject.set(x, "getMenuContainer", js.Any.fromFunction0(value))
      
      inline def setGetMenuItem(value: String => UniDriver[js.Any]): Self = StObject.set(x, "getMenuItem", js.Any.fromFunction1(value))
      
      inline def setGetMenuItemColumnsLayout(value: String => UniDriver[js.Any]): Self = StObject.set(x, "getMenuItemColumnsLayout", js.Any.fromFunction1(value))
      
      inline def setGetMenuItemGridLayout(value: String => UniDriver[js.Any]): Self = StObject.set(x, "getMenuItemGridLayout", js.Any.fromFunction1(value))
      
      inline def setGetMenuNavigation(value: () => UniDriver[js.Any]): Self = StObject.set(x, "getMenuNavigation", js.Any.fromFunction0(value))
      
      inline def setHoverMenuItem(value: String => js.Promise[Unit]): Self = StObject.set(x, "hoverMenuItem", js.Any.fromFunction1(value))
    }
  }
}
