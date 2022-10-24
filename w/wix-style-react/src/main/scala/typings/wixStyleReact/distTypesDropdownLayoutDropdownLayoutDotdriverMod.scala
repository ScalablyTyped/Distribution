package typings.wixStyleReact

import typings.std.HTMLElement
import typings.std.Node
import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDropdownLayoutDropdownLayoutDotdriverMod {
  
  @js.native
  trait DropdownLayoutDriver
    extends StObject
       with BaseDriver {
    
    def classes(): String = js.native
    
    def clickAtOption(position: Double): Unit = js.native
    
    def clickAtOptionWithValue(value: String): Unit = js.native
    
    def getListItemAttribute(position: Double, attribute: String): String = js.native
    
    def getListType(dataHook: String): String = js.native
    
    def getOptionsContainerRole(): String = js.native
    
    def getSelectedOptionId(): String | Null = js.native
    
    def hasTopArrow(): Boolean = js.native
    
    def isDown(): Boolean = js.native
    
    def isLinkOption(position: Double): Boolean = js.native
    
    def isListItemFocused(position: Double): Boolean = js.native
    
    def isOptionADivider(position: Double): Boolean = js.native
    
    def isOptionExists(optionText: String): Boolean = js.native
    
    def isOptionHeightBig(position: Double): Boolean = js.native
    
    def isOptionHeightSmall(position: Double): Boolean = js.native
    
    def isOptionHovered(position: Double): Boolean = js.native
    
    def isOptionSelected(position: Double): Boolean = js.native
    
    def isShown(): Boolean = js.native
    
    def isUp(): Boolean = js.native
    
    def keyDownListItem(position: Double, key: String): Unit = js.native
    
    def markedOption(): String | Null = js.native
    
    def mouseClickOutside(): Unit = js.native
    
    def mouseEnter(): Unit = js.native
    
    def mouseEnterAtOption(position: Double): Unit = js.native
    
    def mouseLeave(): Unit = js.native
    
    def mouseLeaveAtOption(position: Double): Unit = js.native
    
    /** @deprecated Use optionDriver*/
    def optionAt(position: Double): Node = js.native
    
    /** @deprecated This should be a private method since the hook include internal parts ('dropdown-divider-{id}, dropdown-item-{id})') */
    def optionByHook(hook: String): DropdownLayoutOptionDriver = js.native
    
    def optionById(optionId: String): DropdownLayoutOptionDriver = js.native
    def optionById(optionId: Double): DropdownLayoutOptionDriver = js.native
    
    def optionContentAt(position: Double): String = js.native
    
    def optionDriver(option: HTMLElement): DropdownLayoutOptionDriver = js.native
    
    def options(): js.Array[DropdownLayoutOptionDriver] = js.native
    
    def optionsContent(): js.Array[String] = js.native
    
    def optionsLength(): Double = js.native
    
    /** @deprecated should be private */
    def optionsScrollTop(): Double = js.native
    
    def pressDownKey(): Unit = js.native
    
    def pressEnterKey(): Unit = js.native
    
    def pressEscKey(): Unit = js.native
    
    def pressSpaceKey(): Unit = js.native
    
    def pressTabKey(): Unit = js.native
    
    def pressUpKey(): Unit = js.native
    
    def tabIndex(): Double = js.native
  }
  
  trait DropdownLayoutOptionDriver extends StObject {
    
    def click(): Unit
    
    def content(): String
    
    def element(): HTMLElement
    
    def isDisabled(): Boolean
    
    def isDivider(): Boolean
    
    def isHovered(): Boolean
    
    def isLink(): Boolean
    
    def isSelected(): Boolean
    
    def mouseEnter(): Unit
    
    def mouseLeave(): Unit
  }
  object DropdownLayoutOptionDriver {
    
    inline def apply(
      click: () => Unit,
      content: () => String,
      element: () => HTMLElement,
      isDisabled: () => Boolean,
      isDivider: () => Boolean,
      isHovered: () => Boolean,
      isLink: () => Boolean,
      isSelected: () => Boolean,
      mouseEnter: () => Unit,
      mouseLeave: () => Unit
    ): DropdownLayoutOptionDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), content = js.Any.fromFunction0(content), element = js.Any.fromFunction0(element), isDisabled = js.Any.fromFunction0(isDisabled), isDivider = js.Any.fromFunction0(isDivider), isHovered = js.Any.fromFunction0(isHovered), isLink = js.Any.fromFunction0(isLink), isSelected = js.Any.fromFunction0(isSelected), mouseEnter = js.Any.fromFunction0(mouseEnter), mouseLeave = js.Any.fromFunction0(mouseLeave))
      __obj.asInstanceOf[DropdownLayoutOptionDriver]
    }
    
    extension [Self <: DropdownLayoutOptionDriver](x: Self) {
      
      inline def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      inline def setContent(value: () => String): Self = StObject.set(x, "content", js.Any.fromFunction0(value))
      
      inline def setElement(value: () => HTMLElement): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setIsDivider(value: () => Boolean): Self = StObject.set(x, "isDivider", js.Any.fromFunction0(value))
      
      inline def setIsHovered(value: () => Boolean): Self = StObject.set(x, "isHovered", js.Any.fromFunction0(value))
      
      inline def setIsLink(value: () => Boolean): Self = StObject.set(x, "isLink", js.Any.fromFunction0(value))
      
      inline def setIsSelected(value: () => Boolean): Self = StObject.set(x, "isSelected", js.Any.fromFunction0(value))
      
      inline def setMouseEnter(value: () => Unit): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction0(value))
      
      inline def setMouseLeave(value: () => Unit): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction0(value))
    }
  }
}
