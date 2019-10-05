package typings.winjs.WinJS.UI.Animation

import typings.winjs.Anon_Entrance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Animation.createPageNavigationAnimations")
@js.native
object createPageNavigationAnimations extends js.Object {
  /**
    * Creates an exit and entrance animation to play for a page navigation given the current and incoming pages'
    * animation preferences and whether the pages are navigating forwards or backwards.
    * @param currentPreferredAnimation A value from WinJS.UI.PageNavigationAnimation describing the animation the current page prefers to use.
    * @param A value from nextPreferredAnimation WinJS.UI.PageNavigationAnimation describing the animation the incoming page prefers to use.
    * @param movingBackwards Boolean value for whether the navigation is moving backwards.
    * @returns an object containing the exit and entrance animations to play based on the parameters given.
    **/
  def apply(currentPreferredAnimation: String, nextPreferredAnimation: String, movingBackwards: Boolean): Anon_Entrance = js.native
}

