package typings.vueTelInput.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueTelInputMethods extends js.Object {
  
  def choose(country: js.Any): Unit = js.native
  
  def clickedOutside(): Unit = js.native
  
  def findCountry(iso: String): js.Array[_] = js.native
  
  def getCountries(list: js.Array[_]): js.Array[_] = js.native
  
  def getItemClass(index: Double, iso2: String): js.Any = js.native
  
  def initializeCountry(): Unit = js.native
  
  def keyboardNav(e: Event): Unit = js.native
  
  def onBlur(): Unit = js.native
  
  def onInput(): Unit = js.native
  
  def reset(): Unit = js.native
  
  def toggleDropdown(): Unit = js.native
}
object VueTelInputMethods {
  
  @scala.inline
  def apply(
    choose: js.Any => Unit,
    clickedOutside: () => Unit,
    findCountry: String => js.Array[_],
    getCountries: js.Array[_] => js.Array[_],
    getItemClass: (Double, String) => js.Any,
    initializeCountry: () => Unit,
    keyboardNav: Event => Unit,
    onBlur: () => Unit,
    onInput: () => Unit,
    reset: () => Unit,
    toggleDropdown: () => Unit
  ): VueTelInputMethods = {
    val __obj = js.Dynamic.literal(choose = js.Any.fromFunction1(choose), clickedOutside = js.Any.fromFunction0(clickedOutside), findCountry = js.Any.fromFunction1(findCountry), getCountries = js.Any.fromFunction1(getCountries), getItemClass = js.Any.fromFunction2(getItemClass), initializeCountry = js.Any.fromFunction0(initializeCountry), keyboardNav = js.Any.fromFunction1(keyboardNav), onBlur = js.Any.fromFunction0(onBlur), onInput = js.Any.fromFunction0(onInput), reset = js.Any.fromFunction0(reset), toggleDropdown = js.Any.fromFunction0(toggleDropdown))
    __obj.asInstanceOf[VueTelInputMethods]
  }
  
  @scala.inline
  implicit class VueTelInputMethodsOps[Self <: VueTelInputMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChoose(value: js.Any => Unit): Self = this.set("choose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClickedOutside(value: () => Unit): Self = this.set("clickedOutside", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFindCountry(value: String => js.Array[_]): Self = this.set("findCountry", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCountries(value: js.Array[_] => js.Array[_]): Self = this.set("getCountries", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemClass(value: (Double, String) => js.Any): Self = this.set("getItemClass", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInitializeCountry(value: () => Unit): Self = this.set("initializeCountry", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeyboardNav(value: Event => Unit): Self = this.set("keyboardNav", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlur(value: () => Unit): Self = this.set("onBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnInput(value: () => Unit): Self = this.set("onInput", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggleDropdown(value: () => Unit): Self = this.set("toggleDropdown", js.Any.fromFunction0(value))
  }
}
