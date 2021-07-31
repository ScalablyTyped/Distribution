package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutocompleteService extends StObject {
  
  def AutocompleteService(): js.Any
  
  var AutocompleteServiceStatus: ERROR
  
  def PlacesService(): js.Any
  
  var PlacesServiceStatus: OK
}
object AutocompleteService {
  
  @scala.inline
  def apply(
    AutocompleteService: () => js.Any,
    AutocompleteServiceStatus: ERROR,
    PlacesService: () => js.Any,
    PlacesServiceStatus: OK
  ): AutocompleteService = {
    val __obj = js.Dynamic.literal(AutocompleteService = js.Any.fromFunction0(AutocompleteService), AutocompleteServiceStatus = AutocompleteServiceStatus.asInstanceOf[js.Any], PlacesService = js.Any.fromFunction0(PlacesService), PlacesServiceStatus = PlacesServiceStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteService]
  }
  
  @scala.inline
  implicit class AutocompleteServiceMutableBuilder[Self <: AutocompleteService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutocompleteService(value: () => js.Any): Self = StObject.set(x, "AutocompleteService", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAutocompleteServiceStatus(value: ERROR): Self = StObject.set(x, "AutocompleteServiceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacesService(value: () => js.Any): Self = StObject.set(x, "PlacesService", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlacesServiceStatus(value: OK): Self = StObject.set(x, "PlacesServiceStatus", value.asInstanceOf[js.Any])
  }
}
