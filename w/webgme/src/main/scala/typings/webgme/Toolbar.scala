package typings.webgme

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toolbar {
  
  type ClickFn = js.Function0[Unit]
  
  trait Toolbar extends StObject {
    
    def add(item: ToolbarItem): ToolbarButton
    
    def addButton(params: ToolbarParams): ToolbarButton
    
    def addCheckBox(): ToolbarCheckBox
    
    def addColorPicker(params: ToolbarParams): ToolbarColorPicker
    
    def addDropDownButton(params: ToolbarParams): ToolbarDropDownButton
    
    def addLabel(): ToolbarLabel
    
    def addRadioButtonGroup(clickFn: ClickFn): ToolbarRadioButtonGroup
    
    def addSeparator(): ToolbarSeparator
    
    def addTextBox(params: ToolbarParams): ToolbarTextBox
    
    def addToggleButton(params: ToolbarParams): ToolbarToggleButton
    
    def refresh(): Unit
  }
  object Toolbar {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: typings.webgme.Toolbar.Toolbar] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: ToolbarItem => ToolbarButton): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setAddButton(value: ToolbarParams => ToolbarButton): Self = StObject.set(x, "addButton", js.Any.fromFunction1(value))
      
      inline def setAddCheckBox(value: () => ToolbarCheckBox): Self = StObject.set(x, "addCheckBox", js.Any.fromFunction0(value))
      
      inline def setAddColorPicker(value: ToolbarParams => ToolbarColorPicker): Self = StObject.set(x, "addColorPicker", js.Any.fromFunction1(value))
      
      inline def setAddDropDownButton(value: ToolbarParams => ToolbarDropDownButton): Self = StObject.set(x, "addDropDownButton", js.Any.fromFunction1(value))
      
      inline def setAddLabel(value: () => ToolbarLabel): Self = StObject.set(x, "addLabel", js.Any.fromFunction0(value))
      
      inline def setAddRadioButtonGroup(value: ClickFn => ToolbarRadioButtonGroup): Self = StObject.set(x, "addRadioButtonGroup", js.Any.fromFunction1(value))
      
      inline def setAddSeparator(value: () => ToolbarSeparator): Self = StObject.set(x, "addSeparator", js.Any.fromFunction0(value))
      
      inline def setAddTextBox(value: ToolbarParams => ToolbarTextBox): Self = StObject.set(x, "addTextBox", js.Any.fromFunction1(value))
      
      inline def setAddToggleButton(value: ToolbarParams => ToolbarToggleButton): Self = StObject.set(x, "addToggleButton", js.Any.fromFunction1(value))
      
      inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    }
  }
  
  type ToolbarButton = ToolbarItem
  
  type ToolbarCheckBox = ToolbarItem
  
  type ToolbarColorPicker = ToolbarItem
  
  trait ToolbarDropDownButton
    extends StObject
       with ToolbarItem {
    
    def addButton(params: ToolbarParams): ToolbarButton
  }
  object ToolbarDropDownButton {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: ToolbarDropDownButton] (val x: Self) extends AnyVal {
      
      inline def setAddButton(value: ToolbarParams => ToolbarButton): Self = StObject.set(x, "addButton", js.Any.fromFunction1(value))
    }
  }
  
  trait ToolbarItem extends StObject {
    
    def destroy(): Unit
    
    def enabled(value: Boolean): Unit
    
    def hide(): Unit
    
    def show(): Unit
  }
  object ToolbarItem {
    
    inline def apply(destroy: () => Unit, enabled: Boolean => Unit, hide: () => Unit, show: () => Unit): ToolbarItem = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), enabled = js.Any.fromFunction1(enabled), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[ToolbarItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolbarItem] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setEnabled(value: Boolean => Unit): Self = StObject.set(x, "enabled", js.Any.fromFunction1(value))
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  type ToolbarLabel = ToolbarItem
  
  trait ToolbarParams extends StObject
  
  type ToolbarRadioButtonGroup = ToolbarButton
  
  type ToolbarSeparator = ToolbarItem
  
  type ToolbarTextBox = ToolbarItem
  
  type ToolbarToggleButton = ToolbarButton
}
