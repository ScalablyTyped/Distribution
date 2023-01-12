package typings.systeminformation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Standard extends StObject {
  
  var standard: Errorcountoutdated
}
object Standard {
  
  inline def apply(standard: Errorcountoutdated): Standard = {
    val __obj = js.Dynamic.literal(standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Standard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Standard] (val x: Self) extends AnyVal {
    
    inline def setStandard(value: Errorcountoutdated): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
  }
}
