package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisallowNonLinearStack extends StObject {
  
  var disallowNonLinearStack: js.UndefOr[Boolean] = js.undefined
}
object DisallowNonLinearStack {
  
  inline def apply(): DisallowNonLinearStack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisallowNonLinearStack]
  }
  
  extension [Self <: DisallowNonLinearStack](x: Self) {
    
    inline def setDisallowNonLinearStack(value: Boolean): Self = StObject.set(x, "disallowNonLinearStack", value.asInstanceOf[js.Any])
    
    inline def setDisallowNonLinearStackUndefined: Self = StObject.set(x, "disallowNonLinearStack", js.undefined)
  }
}
