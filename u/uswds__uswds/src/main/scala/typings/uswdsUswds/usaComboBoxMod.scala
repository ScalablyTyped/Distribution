package typings.uswdsUswds

import org.scalablytyped.runtime.Shortcut
import typings.std.Document
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.uswdsUswds.anon.ClearInputBtnEl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usaComboBoxMod extends Shortcut {
  
  @JSImport("@uswds/uswds/js/usa-combo-box", JSImport.Default)
  @js.native
  val default: ComboBox = js.native
  
  @js.native
  trait ComboBox extends StObject {
    
    var COMBO_BOX_CLASS: String = js.native
    
    /**
      * Disable the combo-box component
      *
      * @param el An element within the combo box component
      */
    def disable(el: HTMLInputElement): Unit = js.native
    
    /**
      * Display the option list of a combo box component.
      *
      * @param el An element within the combo box component
      */
    def displayList(el: HTMLInputElement): Unit = js.native
    
    /**
      * Enable the combo-box component
      *
      * @param el An element within the combo box component
      */
    def enable(el: HTMLInputElement): Unit = js.native
    
    /**
      * Enhance a select element into a combo box component.
      *
      * @param _comboBoxEl The initial element of the combo box component
      */
    def enhanceComboBox(_comboBoxEl: HTMLElement): Unit = js.native
    
    /**
      * Generate a dynamic regular expression based off of a replaceable and possibly filtered value.
      *
      * @param filter An element within the combo box component
      * @param query The value to use in the regular expression
      * @param extras An object of regular expressions to replace and filter the query
      */
    def generateDynamicRegExp(filter: String): js.RegExp = js.native
    def generateDynamicRegExp(filter: String, query: String): js.RegExp = js.native
    def generateDynamicRegExp(filter: String, query: String, extras: js.Object): js.RegExp = js.native
    def generateDynamicRegExp(filter: String, query: Unit, extras: js.Object): js.RegExp = js.native
    
    /**
      * Get an object of elements belonging directly to the given
      * combo box component.
      *
      * @param el the element within the combo box
      * @returns elements
      */
    def getComboBoxContext(el: HTMLElement): ClearInputBtnEl = js.native
    
    /**
      * Hide the option list of a combo box component.
      *
      * @param el An element within the combo box component
      */
    def hideList(el: HTMLInputElement): Unit = js.native
    
    def init(root: Document): Unit = js.native
    def init(root: HTMLElement): Unit = js.native
    
    def off(el: HTMLElement): Unit = js.native
    
    def on(el: HTMLElement): Unit = js.native
  }
  
  type _To = ComboBox
  
  /* This means you don't have to write `default`, but can instead just say `usaComboBoxMod.foo` */
  override def _to: ComboBox = default
}
