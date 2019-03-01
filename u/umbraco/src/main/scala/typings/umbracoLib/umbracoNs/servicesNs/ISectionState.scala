package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Section State
  */
trait ISectionState extends js.Object {
  //The currently active section
  var currentSection: js.Any
  var showSearchResults: scala.Boolean
}

object ISectionState {
  @scala.inline
  def apply(currentSection: js.Any, showSearchResults: scala.Boolean): ISectionState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentSection")(currentSection)
    __obj.updateDynamic("showSearchResults")(showSearchResults)
    __obj.asInstanceOf[ISectionState]
  }
}

