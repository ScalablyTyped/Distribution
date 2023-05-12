package typings.workboxBuild.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FallbackURL extends StObject {
  
  var fallbackURL: String
}
object FallbackURL {
  
  inline def apply(fallbackURL: String): FallbackURL = {
    val __obj = js.Dynamic.literal(fallbackURL = fallbackURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[FallbackURL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FallbackURL] (val x: Self) extends AnyVal {
    
    inline def setFallbackURL(value: String): Self = StObject.set(x, "fallbackURL", value.asInstanceOf[js.Any])
  }
}
