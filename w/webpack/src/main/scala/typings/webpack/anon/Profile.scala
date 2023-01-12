package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Profile extends StObject {
  
  var profile: Any
}
object Profile {
  
  inline def apply(profile: Any): Profile = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
    
    inline def setProfile(value: Any): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
  }
}
