package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentifierTransform
  extends StObject
     with Transforms {
  
  var as: String | SignalRef
  
  var `type`: identifier
}
object IdentifierTransform {
  
  inline def apply(as: String | SignalRef): IdentifierTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("identifier")
    __obj.asInstanceOf[IdentifierTransform]
  }
  
  extension [Self <: IdentifierTransform](x: Self) {
    
    inline def setAs(value: String | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setType(value: identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
