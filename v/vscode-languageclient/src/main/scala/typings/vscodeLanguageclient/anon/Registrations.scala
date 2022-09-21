package typings.vscodeLanguageclient.anon

import typings.vscodeLanguageclient.featuresMod.FeatureState
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Registrations
  extends StObject
     with FeatureState {
  
  /**
    * The features's id. This is usually the method names used during
    * registration.
    */
  var id: String
  
  var kind: window
  
  /**
    * Has active registrations.
    */
  var registrations: Boolean
}
object Registrations {
  
  inline def apply(id: String, registrations: Boolean): Registrations = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = "window", registrations = registrations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Registrations]
  }
  
  extension [Self <: Registrations](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: window): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setRegistrations(value: Boolean): Self = StObject.set(x, "registrations", value.asInstanceOf[js.Any])
  }
}
