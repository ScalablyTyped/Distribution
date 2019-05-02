package typings
package vueDashTelDashInputLib.vueDashTelDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueTelInputMethods extends js.Object {
  def choose(country: js.Any): scala.Unit
  def clickedOutside(): scala.Unit
  def findCountry(iso: java.lang.String): js.Array[_]
  def getCountries(list: js.Array[_]): js.Array[_]
  def getItemClass(index: scala.Double, iso2: java.lang.String): js.Any
  def initializeCountry(): scala.Unit
  def keyboardNav(e: stdLib.Event): scala.Unit
  def onBlur(): scala.Unit
  def onInput(): scala.Unit
  def reset(): scala.Unit
  def toggleDropdown(): scala.Unit
}

object VueTelInputMethods {
  @scala.inline
  def apply(
    choose: js.Any => scala.Unit,
    clickedOutside: () => scala.Unit,
    findCountry: java.lang.String => js.Array[_],
    getCountries: js.Array[_] => js.Array[_],
    getItemClass: (scala.Double, java.lang.String) => js.Any,
    initializeCountry: () => scala.Unit,
    keyboardNav: stdLib.Event => scala.Unit,
    onBlur: () => scala.Unit,
    onInput: () => scala.Unit,
    reset: () => scala.Unit,
    toggleDropdown: () => scala.Unit
  ): VueTelInputMethods = {
    val __obj = js.Dynamic.literal(choose = js.Any.fromFunction1(choose), clickedOutside = js.Any.fromFunction0(clickedOutside), findCountry = js.Any.fromFunction1(findCountry), getCountries = js.Any.fromFunction1(getCountries), getItemClass = js.Any.fromFunction2(getItemClass), initializeCountry = js.Any.fromFunction0(initializeCountry), keyboardNav = js.Any.fromFunction1(keyboardNav), onBlur = js.Any.fromFunction0(onBlur), onInput = js.Any.fromFunction0(onInput), reset = js.Any.fromFunction0(reset), toggleDropdown = js.Any.fromFunction0(toggleDropdown))
  
    __obj.asInstanceOf[VueTelInputMethods]
  }
}

