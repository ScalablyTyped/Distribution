package typings.vueTelInput.mod

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueTelInputMethods extends js.Object {
  def choose(country: js.Any): Unit
  def clickedOutside(): Unit
  def findCountry(iso: String): js.Array[_]
  def getCountries(list: js.Array[_]): js.Array[_]
  def getItemClass(index: Double, iso2: String): js.Any
  def initializeCountry(): Unit
  def keyboardNav(e: Event_): Unit
  def onBlur(): Unit
  def onInput(): Unit
  def reset(): Unit
  def toggleDropdown(): Unit
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
    keyboardNav: Event_ => Unit,
    onBlur: () => Unit,
    onInput: () => Unit,
    reset: () => Unit,
    toggleDropdown: () => Unit
  ): VueTelInputMethods = {
    val __obj = js.Dynamic.literal(choose = js.Any.fromFunction1(choose), clickedOutside = js.Any.fromFunction0(clickedOutside), findCountry = js.Any.fromFunction1(findCountry), getCountries = js.Any.fromFunction1(getCountries), getItemClass = js.Any.fromFunction2(getItemClass), initializeCountry = js.Any.fromFunction0(initializeCountry), keyboardNav = js.Any.fromFunction1(keyboardNav), onBlur = js.Any.fromFunction0(onBlur), onInput = js.Any.fromFunction0(onInput), reset = js.Any.fromFunction0(reset), toggleDropdown = js.Any.fromFunction0(toggleDropdown))
  
    __obj.asInstanceOf[VueTelInputMethods]
  }
}

