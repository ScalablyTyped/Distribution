package typings.winjs.WinJS.UI

import typings.std.HTMLElement
import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.executeAnimation")
@js.native
object executeAnimation extends js.Object {
  /**
    * Asynchronously executes a collection of CSS animations on a collection of elements. This is the underlying animation mechanism used by the Animations Library. Apps are encouraged to use the Animations Library to conform with the standard look and feel of the rest of the system, rather than calling this function directly.
    * @param element Element or elements to be animated. This parameter can be expressed in several ways: As the special value "undefined", which means that the animation has no target, As a single object, As a JavaScript array (possibly empty), in which each element of the array can be a single element or a JavaScript array of elements., As a NodeList (for example, the result of querySelectorAll), As an HTMLCollection.
    * @param animation The animation description or an array of animation descriptions to apply to element. An animation description is a JavaScript object with specific properties, listed below. There are two types of animation descriptions: one for keyframe-based animations and one for explicit animations. These types are distinguished by whether the keyframe property has a defined value. The following properties are required for both types of animation descriptions: property (string), delay (number), duration (number), timing (string). If an animation has a keyframe property with a defined, non-null value, then the animation is a keyframe-based animation. A keyframe-based animation description requires the following property in addition to those mentioned above: keyframe (string). If an animation does not have a keyframe property, or if the value of the property is null or undefined, then the animation is an explicit animation. An explicit animation description requires the following properties in addition to the common properties mentioned above: from, to. The values given in the from and to properties must be valid for the CSS property specified by the property property. For example, if the CSS property is "opacity", then the from and to properties must be numbers between 0 and 1 (inclusive).
    * @returns Returns a Promise object that completes when the CSS animation is complete.
    **/
  def apply(element: HTMLElement, animation: js.Any): Promise[_] = js.native
}

