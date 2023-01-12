package typings.vueDevtoolsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Abstract extends StObject {
  
  var `abstract`: js.UndefOr[Boolean] = js.undefined
}
object Abstract {
  
  inline def apply(): Abstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Abstract]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Abstract] (val x: Self) extends AnyVal {
    
    inline def setAbstract(value: Boolean): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    inline def setAbstractUndefined: Self = StObject.set(x, "abstract", js.undefined)
  }
}
