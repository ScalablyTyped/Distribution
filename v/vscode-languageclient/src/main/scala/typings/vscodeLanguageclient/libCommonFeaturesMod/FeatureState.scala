package typings.vscodeLanguageclient.libCommonFeaturesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageclient.anon.Id
  - typings.vscodeLanguageclient.anon.Kind
  - typings.vscodeLanguageclient.anon.Registrations
  - typings.vscodeLanguageclient.anon.`0`
*/
trait FeatureState extends StObject
object FeatureState {
  
  inline def `0`(): typings.vscodeLanguageclient.anon.`0` = {
    val __obj = js.Dynamic.literal(kind = "static")
    __obj.asInstanceOf[typings.vscodeLanguageclient.anon.`0`]
  }
  
  inline def Id(id: String, matches: Boolean, registrations: Boolean): typings.vscodeLanguageclient.anon.Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = "document", matches = matches.asInstanceOf[js.Any], registrations = registrations.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageclient.anon.Id]
  }
  
  inline def Kind(id: String, registrations: Boolean): typings.vscodeLanguageclient.anon.Kind = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = "workspace", registrations = registrations.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageclient.anon.Kind]
  }
  
  inline def Registrations(id: String, registrations: Boolean): typings.vscodeLanguageclient.anon.Registrations = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = "window", registrations = registrations.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageclient.anon.Registrations]
  }
}
