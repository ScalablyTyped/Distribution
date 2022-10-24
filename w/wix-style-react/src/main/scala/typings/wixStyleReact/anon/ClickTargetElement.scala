package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import typings.wixStyleReact.distTypesDropdownLayoutDropdownLayoutDotuniDotdriverMod.DropdownLayoutUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClickTargetElement extends StObject {
  
  def click(): js.Promise[Unit] = js.native
  
  def clickOutside(): Boolean = js.native
  
  def clickTargetElement(dataHook: String): js.Promise[Unit] = js.native
  
  def element(): js.Promise[Any] = js.native
  
  def exists(): js.Promise[Boolean] = js.native
  
  /** Returns the native DropdownLayout element */
  def getDropdownElement(): Any = js.native
  
  def getDropdownLayoutDriver(): DropdownLayoutUniDriver = js.native
  
  def getListType(dataHook: String): js.Promise[String] = js.native
  
  def getMarkedOption(): js.Promise[String | Null] = js.native
  
  def getSelectedOptionId(): js.Promise[String | Null] = js.native
  
  /** Returns the native target element */
  def getTargetElement(): Any = js.native
  
  def hoverTargetElement(dataHook: String): js.Promise[Unit] = js.native
  
  def isDropdownShown(): js.Promise[Boolean] = js.native
  
  def isListItemFocused(position: Any): js.Promise[Boolean] = js.native
  
  /** Return `true` if the option is hovered by the mouse */
  def isOptionHovered(index: Any): js.Promise[Boolean] = js.native
  
  /** Return `true` if the option is selected */
  def isOptionSelected(index: Any): js.Promise[Boolean] = js.native
  
  /** Trigger a keyDown event on the target element */
  def keyDown(key: Any): js.Promise[Unit] = js.native
  
  def keyDownListItem(position: Any, key: Any): js.Promise[Unit] = js.native
  
  def mouseEnter(): js.Promise[Unit] = js.native
  
  /** Perform a mouseEnter on the target element */
  def mouseEnterTarget(): js.Promise[Unit] = js.native
  
  def mouseLeave(): js.Promise[Unit] = js.native
  
  /** Perform a mouseEnter on the target element */
  def mouseLeaveTarget(): js.Promise[Unit] = js.native
  
  def optionContentAt(id: Double): js.Promise[ReactNode] = js.native
  
  def optionsCount(): js.Promise[Double] = js.native
  
  def selectOption(index: String): js.Promise[Unit] = js.native
  def selectOption(index: Double): js.Promise[Unit] = js.native
  
  def selectOptionByDataHook(dataHook: String): js.Promise[Unit] = js.native
}
