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
  
  inline def apply(
    AutocompleteService: () => js.Any,
    AutocompleteServiceStatus: ERROR,
    PlacesService: () => js.Any,
    PlacesServiceStatus: OK
  ): AutocompleteService = {
    val __obj = js.Dynamic.literal(AutocompleteService = js.Any.fromFunction0(AutocompleteService), AutocompleteServiceStatus = AutocompleteServiceStatus.asInstanceOf[js.Any], PlacesService = js.Any.fromFunction0(PlacesService), PlacesServiceStatus = PlacesServiceStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteService]
  }
  
  extension [Self <: AutocompleteService](x: Self) {
    
    inline def setAutocompleteService(value: () => js.Any): Self = StObject.set(x, "AutocompleteService", js.Any.fromFunction0(value))
    
    inline def setAutocompleteServiceStatus(value: ERROR): Self = StObject.set(x, "AutocompleteServiceStatus", value.asInstanceOf[js.Any])
    
    inline def setPlacesService(value: () => js.Any): Self = StObject.set(x, "PlacesService", js.Any.fromFunction0(value))
    
    inline def setPlacesServiceStatus(value: OK): Self = StObject.set(x, "PlacesServiceStatus", value.asInstanceOf[js.Any])
  }
}
