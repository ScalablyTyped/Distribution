package typings.vscodeLanguageclient.anon

import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureState
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id
  extends StObject
     with FeatureState {
  
  /**
    * The features's id. This is usually the method names used during
    * registration.
    */
  var id: String
  
  var kind: document
  
  /**
    * A registration matches an open document.
    */
  var matches: Boolean
  
  /**
    * Has active registrations.
    */
  var registrations: Boolean
}
object Id {
  
  inline def apply(id: String, matches: Boolean, registrations: Boolean): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = "document", matches = matches.asInstanceOf[js.Any], registrations = registrations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: document): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMatches(value: Boolean): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setRegistrations(value: Boolean): Self = StObject.set(x, "registrations", value.asInstanceOf[js.Any])
  }
}
