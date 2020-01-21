package typings.winjs.mod.UI

import typings.std.HTMLElement
import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("winjs", "UI.executeTransition")
@js.native
object executeTransition extends js.Object {
  /**
    * Asynchronously executes a collection of CSS transitions on a collection of elements. This is the underlying animation mechanism used by the Animations Library. Apps are encouraged to use the Animations Library to conform with the standard look and feel of the rest of the system, rather than calling this function directly.
    * @param element Element or elements on which to perform the transition. This parameter can be expressed in several ways: As the special value "undefined", which means that the transition has no target, As a single object, As a JavaScript array (possibly empty), in which each element of the array can be a single element or a JavaScript array of elements., As a NodeList (for example, the result of querySelectorAll), As an HTMLCollection.
    * @param transition The transition description or an array of transition descriptions to apply to element. A transition description is a JavaScript object with these properties: property (string), delay (number), duration (number), timing (string), from (optional), to. The values given in the from and to properties must be valid for the CSS property specified by the property property. For example, if the CSS property is "opacity", then the from and to properties must be numbers between 0 and 1 (inclusive).
    * @returns Returns a Promise that completes when the transition is finished.
    **/
  def apply(element: HTMLElement, transition: js.Any): Promise[_] = js.native
}

