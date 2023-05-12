package typings.uswdsUswds

import org.scalablytyped.runtime.Shortcut
import typings.std.Document
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLLIElement
import typings.std.HTMLSelectElement
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsUsaComboBoxMod extends Shortcut {
  
  @JSImport("@uswds/uswds/js/usa-combo-box", JSImport.Default)
  @js.native
  val default: ComboBox = js.native
  
  @js.native
  trait ComboBox extends StObject {
    
    var COMBO_BOX_CLASS: String = js.native
    
    /**
      * Disable the combo-box component
      */
    def disable(el: HTMLElement): Unit = js.native
    
    /**
      * Display the option list of a combo box component.
      */
    def displayList(el: HTMLElement): Unit = js.native
    
    /**
      * Enable the combo-box component
      */
    def enable(el: HTMLElement): Unit = js.native
    
    /**
      * Enhance a select element into a combo box component.
      */
    def enhanceComboBox(_comboBoxEl: HTMLElement): Unit = js.native
    
    /**
      * Generate a dynamic regular expression based off of a replaceable and possibly filtered value.
      */
    def generateDynamicRegExp(filter: String): js.RegExp = js.native
    def generateDynamicRegExp(filter: String, query: String): js.RegExp = js.native
    def generateDynamicRegExp(filter: String, query: String, extras: js.Object): js.RegExp = js.native
    def generateDynamicRegExp(filter: String, query: Unit, extras: js.Object): js.RegExp = js.native
    
    /**
      * Get an object of elements belonging directly to the given
      * combo box component.
      */
    def getComboBoxContext(el: HTMLElement): ComboBoxContext = js.native
    
    /**
      * Hide the option list of a combo box component.
      */
    def hideList(el: HTMLElement): Unit = js.native
    
    def init(root: Document): Unit = js.native
    def init(root: HTMLElement): Unit = js.native
    
    def off(el: HTMLElement): Unit = js.native
    
    def on(el: HTMLElement): Unit = js.native
  }
  
  trait ComboBoxContext extends StObject {
    
    var clearInputBtnEl: HTMLButtonElement
    
    var comboBoxEl: HTMLElement
    
    var disableFiltering: Boolean
    
    var focusedOptionEl: HTMLLIElement
    
    var inputEl: HTMLInputElement
    
    var isPristine: Boolean
    
    var listEl: HTMLUListElement
    
    var selectEl: HTMLSelectElement
    
    var selectedOptionEl: HTMLLIElement
    
    var statusEl: HTMLDivElement
    
    var toggleListBtnEl: HTMLButtonElement
  }
  object ComboBoxContext {
    
    inline def apply(
      clearInputBtnEl: HTMLButtonElement,
      comboBoxEl: HTMLElement,
      disableFiltering: Boolean,
      focusedOptionEl: HTMLLIElement,
      inputEl: HTMLInputElement,
      isPristine: Boolean,
      listEl: HTMLUListElement,
      selectEl: HTMLSelectElement,
      selectedOptionEl: HTMLLIElement,
      statusEl: HTMLDivElement,
      toggleListBtnEl: HTMLButtonElement
    ): ComboBoxContext = {
      val __obj = js.Dynamic.literal(clearInputBtnEl = clearInputBtnEl.asInstanceOf[js.Any], comboBoxEl = comboBoxEl.asInstanceOf[js.Any], disableFiltering = disableFiltering.asInstanceOf[js.Any], focusedOptionEl = focusedOptionEl.asInstanceOf[js.Any], inputEl = inputEl.asInstanceOf[js.Any], isPristine = isPristine.asInstanceOf[js.Any], listEl = listEl.asInstanceOf[js.Any], selectEl = selectEl.asInstanceOf[js.Any], selectedOptionEl = selectedOptionEl.asInstanceOf[js.Any], statusEl = statusEl.asInstanceOf[js.Any], toggleListBtnEl = toggleListBtnEl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComboBoxContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComboBoxContext] (val x: Self) extends AnyVal {
      
      inline def setClearInputBtnEl(value: HTMLButtonElement): Self = StObject.set(x, "clearInputBtnEl", value.asInstanceOf[js.Any])
      
      inline def setComboBoxEl(value: HTMLElement): Self = StObject.set(x, "comboBoxEl", value.asInstanceOf[js.Any])
      
      inline def setDisableFiltering(value: Boolean): Self = StObject.set(x, "disableFiltering", value.asInstanceOf[js.Any])
      
      inline def setFocusedOptionEl(value: HTMLLIElement): Self = StObject.set(x, "focusedOptionEl", value.asInstanceOf[js.Any])
      
      inline def setInputEl(value: HTMLInputElement): Self = StObject.set(x, "inputEl", value.asInstanceOf[js.Any])
      
      inline def setIsPristine(value: Boolean): Self = StObject.set(x, "isPristine", value.asInstanceOf[js.Any])
      
      inline def setListEl(value: HTMLUListElement): Self = StObject.set(x, "listEl", value.asInstanceOf[js.Any])
      
      inline def setSelectEl(value: HTMLSelectElement): Self = StObject.set(x, "selectEl", value.asInstanceOf[js.Any])
      
      inline def setSelectedOptionEl(value: HTMLLIElement): Self = StObject.set(x, "selectedOptionEl", value.asInstanceOf[js.Any])
      
      inline def setStatusEl(value: HTMLDivElement): Self = StObject.set(x, "statusEl", value.asInstanceOf[js.Any])
      
      inline def setToggleListBtnEl(value: HTMLButtonElement): Self = StObject.set(x, "toggleListBtnEl", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComboBox
  
  /* This means you don't have to write `default`, but can instead just say `jsUsaComboBoxMod.foo` */
  override def _to: ComboBox = default
}
