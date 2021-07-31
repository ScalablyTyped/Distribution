package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Section State
  */
trait ISectionState extends StObject {
  
  //The currently active section
  var currentSection: js.Any
  
  var showSearchResults: Boolean
}
object ISectionState {
  
  @scala.inline
  def apply(currentSection: js.Any, showSearchResults: Boolean): ISectionState = {
    val __obj = js.Dynamic.literal(currentSection = currentSection.asInstanceOf[js.Any], showSearchResults = showSearchResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISectionState]
  }
  
  @scala.inline
  implicit class ISectionStateMutableBuilder[Self <: ISectionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentSection(value: js.Any): Self = StObject.set(x, "currentSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSearchResults(value: Boolean): Self = StObject.set(x, "showSearchResults", value.asInstanceOf[js.Any])
  }
}
