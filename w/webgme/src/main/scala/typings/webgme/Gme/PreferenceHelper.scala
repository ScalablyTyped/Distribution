package typings.webgme.Gme

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreferenceHelper extends StObject {
  
  def getPreferences(): PreferenceHelper
}
object PreferenceHelper {
  
  inline def apply(getPreferences: () => PreferenceHelper): PreferenceHelper = {
    val __obj = js.Dynamic.literal(getPreferences = js.Any.fromFunction0(getPreferences))
    __obj.asInstanceOf[PreferenceHelper]
  }
  
  extension [Self <: PreferenceHelper](x: Self) {
    
    inline def setGetPreferences(value: () => PreferenceHelper): Self = StObject.set(x, "getPreferences", js.Any.fromFunction0(value))
  }
}
