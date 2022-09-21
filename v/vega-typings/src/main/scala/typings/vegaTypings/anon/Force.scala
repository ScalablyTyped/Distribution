package typings.vegaTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Force extends StObject {
  
  var force: js.UndefOr[Boolean] = js.undefined
}
object Force {
  
  inline def apply(): Force = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Force]
  }
  
  extension [Self <: Force](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
  }
}
