package typings.wixStyleReact

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownLayoutUniDriverMod {
  
  trait DropdownLayoutOptionUniDriver extends StObject {
    
    def click(): js.Promise[Unit]
    
    def content(): js.Promise[String]
    
    def element(): UniDriver[js.Any]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isDivider(): js.Promise[Boolean]
    
    def isHovered(): js.Promise[Boolean]
    
    def isLink(): js.Promise[Boolean]
    
    def isSelected(): js.Promise[Boolean]
    
    def mouseEnter(): js.Promise[Unit]
    
    def mouseLeave(): js.Promise[Unit]
  }
  object DropdownLayoutOptionUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      content: () => js.Promise[String],
      element: () => UniDriver[js.Any],
      isDisabled: () => js.Promise[Boolean],
      isDivider: () => js.Promise[Boolean],
      isHovered: () => js.Promise[Boolean],
      isLink: () => js.Promise[Boolean],
      isSelected: () => js.Promise[Boolean],
      mouseEnter: () => js.Promise[Unit],
      mouseLeave: () => js.Promise[Unit]
    ): DropdownLayoutOptionUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), content = js.Any.fromFunction0(content), element = js.Any.fromFunction0(element), isDisabled = js.Any.fromFunction0(isDisabled), isDivider = js.Any.fromFunction0(isDivider), isHovered = js.Any.fromFunction0(isHovered), isLink = js.Any.fromFunction0(isLink), isSelected = js.Any.fromFunction0(isSelected), mouseEnter = js.Any.fromFunction0(mouseEnter), mouseLeave = js.Any.fromFunction0(mouseLeave))
      __obj.asInstanceOf[DropdownLayoutOptionUniDriver]
    }
    
    extension [Self <: DropdownLayoutOptionUniDriver](x: Self) {
      
      inline def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      inline def setContent(value: () => js.Promise[String]): Self = StObject.set(x, "content", js.Any.fromFunction0(value))
      
      inline def setElement(value: () => UniDriver[js.Any]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setIsDivider(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDivider", js.Any.fromFunction0(value))
      
      inline def setIsHovered(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isHovered", js.Any.fromFunction0(value))
      
      inline def setIsLink(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLink", js.Any.fromFunction0(value))
      
      inline def setIsSelected(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSelected", js.Any.fromFunction0(value))
      
      inline def setMouseEnter(value: () => js.Promise[Unit]): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction0(value))
      
      inline def setMouseLeave(value: () => js.Promise[Unit]): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait DropdownLayoutUniDriver
    extends StObject
       with BaseUniDriver {
    
    /** @deprecated should be private */
    def classes(name: String): js.Promise[js.Any] = js.native
    
    def clickAtOption(index: Double): js.Promise[Unit] = js.native
    
    def clickAtOptionByDataHook(dataHook: String): js.Promise[Unit] = js.native
    
    def clickAtOptionWithValue(value: String): js.Promise[Unit] = js.native
    
    def hasTopArrow(): js.Promise[Boolean] = js.native
    
    def isDown(): js.Promise[Boolean] = js.native
    
    def isLinkOption(position: Double): js.Promise[Boolean] = js.native
    
    def isOptionADivider(position: Double): js.Promise[Boolean] = js.native
    
    def isOptionExists(optionText: String): js.Promise[Boolean] = js.native
    
    def isOptionHeightBig(position: Double): js.Promise[Boolean] = js.native
    
    def isOptionHeightSmall(position: Double): js.Promise[Boolean] = js.native
    
    def isOptionHovered(index: Double): js.Promise[Boolean] = js.native
    
    def isOptionSelected(index: Double): js.Promise[Boolean] = js.native
    
    def isShown(): js.Promise[Boolean] = js.native
    
    def isUp(): js.Promise[Boolean] = js.native
    
    def markedOption(): js.Promise[String | Null] = js.native
    
    def mouseClickOutside(): Boolean = js.native
    
    def mouseEnter(): js.Promise[Unit] = js.native
    
    def mouseEnterAtOption(position: Double): js.Promise[Unit] = js.native
    
    def mouseLeave(): js.Promise[Unit] = js.native
    
    def mouseLeaveAtOption(position: Double): js.Promise[Unit] = js.native
    
    /** @deprecated Use optionDriver*/
    def optionAt(): js.Promise[js.Any] = js.native
    
    /** @deprecated This should be a private method since the hook include internal parts ('dropdown-divider-{id}, dropdown-item-{id})') */
    def optionByHook(hook: String): js.Promise[DropdownLayoutOptionUniDriver] = js.native
    
    def optionById(optionId: String): js.Promise[DropdownLayoutOptionUniDriver] = js.native
    def optionById(optionId: Double): js.Promise[DropdownLayoutOptionUniDriver] = js.native
    
    def optionContentAt(position: Double): js.Promise[String] = js.native
    
    def optionDriver(option: UniDriver[js.Any]): DropdownLayoutOptionUniDriver = js.native
    
    def options(): js.Promise[js.Array[DropdownLayoutOptionUniDriver]] = js.native
    
    def optionsContent(): js.Promise[js.Array[String]] = js.native
    
    def optionsLength(): js.Promise[Double] = js.native
    
    /** @deprecated should be private */
    def optionsScrollTop(): js.Promise[Double] = js.native
    
    def pressDownKey(): js.Promise[Unit] = js.native
    
    def pressEnterKey(): js.Promise[Unit] = js.native
    
    def pressEscKey(): js.Promise[Unit] = js.native
    
    def pressSpaceKey(): js.Promise[Unit] = js.native
    
    def pressTabKey(): js.Promise[Unit] = js.native
    
    def pressUpKey(): js.Promise[Unit] = js.native
    
    def tabIndex(): js.Promise[Double] = js.native
  }
}
