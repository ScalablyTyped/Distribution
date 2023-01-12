package typings.vscodeLanguageclient.anon

import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureState
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.workspace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kind
  extends StObject
     with FeatureState {
  
  /**
    * The features's id. This is usually the method names used during
    * registration.
    */
  var id: String
  
  var kind: workspace
  
  /**
    * Has active registrations.
    */
  var registrations: Boolean
}
object Kind {
  
  inline def apply(id: String, registrations: Boolean): Kind = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = "workspace", registrations = registrations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kind]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Kind] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: workspace): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setRegistrations(value: Boolean): Self = StObject.set(x, "registrations", value.asInstanceOf[js.Any])
  }
}
