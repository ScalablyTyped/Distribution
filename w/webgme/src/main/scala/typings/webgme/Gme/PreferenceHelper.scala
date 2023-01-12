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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreferenceHelper] (val x: Self) extends AnyVal {
    
    inline def setGetPreferences(value: () => PreferenceHelper): Self = StObject.set(x, "getPreferences", js.Any.fromFunction0(value))
  }
}
