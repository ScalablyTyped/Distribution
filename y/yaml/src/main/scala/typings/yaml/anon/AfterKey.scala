package typings.yaml.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterKey extends StObject {
  
  var afterKey: js.UndefOr[Boolean] = js.undefined
  
  var implicitKey: js.UndefOr[Boolean] = js.undefined
  
  var inFlow: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[typings.yaml.distNodesScalarMod.Scalar.Type] = js.undefined
}
object AfterKey {
  
  inline def apply(): AfterKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AfterKey]
  }
  
  extension [Self <: AfterKey](x: Self) {
    
    inline def setAfterKey(value: Boolean): Self = StObject.set(x, "afterKey", value.asInstanceOf[js.Any])
    
    inline def setAfterKeyUndefined: Self = StObject.set(x, "afterKey", js.undefined)
    
    inline def setImplicitKey(value: Boolean): Self = StObject.set(x, "implicitKey", value.asInstanceOf[js.Any])
    
    inline def setImplicitKeyUndefined: Self = StObject.set(x, "implicitKey", js.undefined)
    
    inline def setInFlow(value: Boolean): Self = StObject.set(x, "inFlow", value.asInstanceOf[js.Any])
    
    inline def setInFlowUndefined: Self = StObject.set(x, "inFlow", js.undefined)
    
    inline def setType(value: typings.yaml.distNodesScalarMod.Scalar.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
