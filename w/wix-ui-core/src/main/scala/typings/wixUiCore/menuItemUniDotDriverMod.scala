package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemUniDotDriverMod {
  
  @JSImport("wix-ui-core/src/components/menu-item/menu-item.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def menuItemDriverFactory(base: UniDriver[js.Any]): MenuItemDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("menuItemDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[MenuItemDriver]
  
  trait MenuItemDriver
    extends StObject
       with BaseUniDriver {
    
    /** return children for inspection */
    def getText(): js.Promise[String]
    
    /** checks if the item is disabled */
    def isDisabled(): js.Promise[Boolean]
    
    /** checks if the item is highlighted */
    def isHighlighted(): js.Promise[Boolean]
    
    /** checks if the item is selected */
    def isSelected(): js.Promise[Boolean]
  }
  object MenuItemDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getText: () => js.Promise[String],
      isDisabled: () => js.Promise[Boolean],
      isHighlighted: () => js.Promise[Boolean],
      isSelected: () => js.Promise[Boolean]
    ): MenuItemDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getText = js.Any.fromFunction0(getText), isDisabled = js.Any.fromFunction0(isDisabled), isHighlighted = js.Any.fromFunction0(isHighlighted), isSelected = js.Any.fromFunction0(isSelected))
      __obj.asInstanceOf[MenuItemDriver]
    }
    
    @scala.inline
    implicit class MenuItemDriverMutableBuilder[Self <: MenuItemDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetText(value: () => js.Promise[String]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsHighlighted(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isHighlighted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSelected(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSelected", js.Any.fromFunction0(value))
    }
  }
}
