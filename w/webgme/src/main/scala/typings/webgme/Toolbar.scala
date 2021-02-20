package typings.webgme

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toolbar {
  
  type ClickFn = js.Function0[Unit]
  
  @js.native
  trait Toolbar extends StObject {
    
    def add(item: ToolbarItem): ToolbarButton = js.native
    
    def addButton(params: ToolbarParams): ToolbarButton = js.native
    
    def addCheckBox(): ToolbarCheckBox = js.native
    
    def addColorPicker(params: ToolbarParams): ToolbarColorPicker = js.native
    
    def addDropDownButton(params: ToolbarParams): ToolbarDropDownButton = js.native
    
    def addLabel(): ToolbarLabel = js.native
    
    def addRadioButtonGroup(clickFn: ClickFn): ToolbarRadioButtonGroup = js.native
    
    def addSeparator(): ToolbarSeparator = js.native
    
    def addTextBox(params: ToolbarParams): ToolbarTextBox = js.native
    
    def addToggleButton(params: ToolbarParams): ToolbarToggleButton = js.native
    
    def refresh(): Unit = js.native
  }
  object Toolbar {
    
    @scala.inline
    def apply(
      add: ToolbarItem => ToolbarButton,
      addButton: ToolbarParams => ToolbarButton,
      addCheckBox: () => ToolbarCheckBox,
      addColorPicker: ToolbarParams => ToolbarColorPicker,
      addDropDownButton: ToolbarParams => ToolbarDropDownButton,
      addLabel: () => ToolbarLabel,
      addRadioButtonGroup: ClickFn => ToolbarRadioButtonGroup,
      addSeparator: () => ToolbarSeparator,
      addTextBox: ToolbarParams => ToolbarTextBox,
      addToggleButton: ToolbarParams => ToolbarToggleButton,
      refresh: () => Unit
    ): typings.webgme.Toolbar.Toolbar = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addButton = js.Any.fromFunction1(addButton), addCheckBox = js.Any.fromFunction0(addCheckBox), addColorPicker = js.Any.fromFunction1(addColorPicker), addDropDownButton = js.Any.fromFunction1(addDropDownButton), addLabel = js.Any.fromFunction0(addLabel), addRadioButtonGroup = js.Any.fromFunction1(addRadioButtonGroup), addSeparator = js.Any.fromFunction0(addSeparator), addTextBox = js.Any.fromFunction1(addTextBox), addToggleButton = js.Any.fromFunction1(addToggleButton), refresh = js.Any.fromFunction0(refresh))
      __obj.asInstanceOf[typings.webgme.Toolbar.Toolbar]
    }
    
    @scala.inline
    implicit class ToolbarMutableBuilder[Self <: typings.webgme.Toolbar.Toolbar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: ToolbarItem => ToolbarButton): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddButton(value: ToolbarParams => ToolbarButton): Self = StObject.set(x, "addButton", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddCheckBox(value: () => ToolbarCheckBox): Self = StObject.set(x, "addCheckBox", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddColorPicker(value: ToolbarParams => ToolbarColorPicker): Self = StObject.set(x, "addColorPicker", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddDropDownButton(value: ToolbarParams => ToolbarDropDownButton): Self = StObject.set(x, "addDropDownButton", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddLabel(value: () => ToolbarLabel): Self = StObject.set(x, "addLabel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddRadioButtonGroup(value: ClickFn => ToolbarRadioButtonGroup): Self = StObject.set(x, "addRadioButtonGroup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddSeparator(value: () => ToolbarSeparator): Self = StObject.set(x, "addSeparator", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddTextBox(value: ToolbarParams => ToolbarTextBox): Self = StObject.set(x, "addTextBox", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddToggleButton(value: ToolbarParams => ToolbarToggleButton): Self = StObject.set(x, "addToggleButton", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    }
  }
  
  type ToolbarButton = ToolbarItem
  
  type ToolbarCheckBox = ToolbarItem
  
  type ToolbarColorPicker = ToolbarItem
  
  @js.native
  trait ToolbarDropDownButton extends ToolbarItem {
    
    def addButton(params: ToolbarParams): ToolbarButton = js.native
  }
  object ToolbarDropDownButton {
    
    @scala.inline
    def apply(
      addButton: ToolbarParams => ToolbarButton,
      destroy: () => Unit,
      enabled: Boolean => Unit,
      hide: () => Unit,
      show: () => Unit
    ): ToolbarDropDownButton = {
      val __obj = js.Dynamic.literal(addButton = js.Any.fromFunction1(addButton), destroy = js.Any.fromFunction0(destroy), enabled = js.Any.fromFunction1(enabled), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[ToolbarDropDownButton]
    }
    
    @scala.inline
    implicit class ToolbarDropDownButtonMutableBuilder[Self <: ToolbarDropDownButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddButton(value: ToolbarParams => ToolbarButton): Self = StObject.set(x, "addButton", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ToolbarItem extends StObject {
    
    def destroy(): Unit = js.native
    
    def enabled(value: Boolean): Unit = js.native
    
    def hide(): Unit = js.native
    
    def show(): Unit = js.native
  }
  object ToolbarItem {
    
    @scala.inline
    def apply(destroy: () => Unit, enabled: Boolean => Unit, hide: () => Unit, show: () => Unit): ToolbarItem = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), enabled = js.Any.fromFunction1(enabled), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[ToolbarItem]
    }
    
    @scala.inline
    implicit class ToolbarItemMutableBuilder[Self <: ToolbarItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnabled(value: Boolean => Unit): Self = StObject.set(x, "enabled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  type ToolbarLabel = ToolbarItem
  
  @js.native
  trait ToolbarParams extends StObject
  
  type ToolbarRadioButtonGroup = ToolbarButton
  
  type ToolbarSeparator = ToolbarItem
  
  type ToolbarTextBox = ToolbarItem
  
  type ToolbarToggleButton = ToolbarButton
}
