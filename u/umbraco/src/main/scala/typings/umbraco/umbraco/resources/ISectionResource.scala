package typings.umbraco.umbraco.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.resources.sectionResource
  * @description Loads in data for section
  **/
trait ISectionResource extends StObject {
  
  /** Loads in the data to display the section list */
  def getSections(): Unit
}
object ISectionResource {
  
  @scala.inline
  def apply(getSections: () => Unit): ISectionResource = {
    val __obj = js.Dynamic.literal(getSections = js.Any.fromFunction0(getSections))
    __obj.asInstanceOf[ISectionResource]
  }
  
  @scala.inline
  implicit class ISectionResourceMutableBuilder[Self <: ISectionResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetSections(value: () => Unit): Self = StObject.set(x, "getSections", js.Any.fromFunction0(value))
  }
}
