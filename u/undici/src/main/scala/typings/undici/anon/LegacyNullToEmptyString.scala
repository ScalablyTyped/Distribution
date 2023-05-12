package typings.undici.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegacyNullToEmptyString extends StObject {
  
  var legacyNullToEmptyString: Boolean
}
object LegacyNullToEmptyString {
  
  inline def apply(legacyNullToEmptyString: Boolean): LegacyNullToEmptyString = {
    val __obj = js.Dynamic.literal(legacyNullToEmptyString = legacyNullToEmptyString.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacyNullToEmptyString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LegacyNullToEmptyString] (val x: Self) extends AnyVal {
    
    inline def setLegacyNullToEmptyString(value: Boolean): Self = StObject.set(x, "legacyNullToEmptyString", value.asInstanceOf[js.Any])
  }
}
