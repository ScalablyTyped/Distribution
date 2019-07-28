package typings.umbraco.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Section State
  */
trait ISectionState extends js.Object {
  //The currently active section
  var currentSection: js.Any
  var showSearchResults: Boolean
}

object ISectionState {
  @scala.inline
  def apply(currentSection: js.Any, showSearchResults: Boolean): ISectionState = {
    val __obj = js.Dynamic.literal(currentSection = currentSection, showSearchResults = showSearchResults)
  
    __obj.asInstanceOf[ISectionState]
  }
}

