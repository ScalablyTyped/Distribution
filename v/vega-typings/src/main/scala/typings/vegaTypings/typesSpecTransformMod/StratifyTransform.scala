package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.vegaTypingsStrings.stratify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StratifyTransform
  extends StObject
     with Transforms {
  
  var key: FieldRef
  
  var parentKey: FieldRef
  
  var `type`: stratify
}
object StratifyTransform {
  
  inline def apply(key: FieldRef, parentKey: FieldRef): StratifyTransform = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parentKey = parentKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("stratify")
    __obj.asInstanceOf[StratifyTransform]
  }
  
  extension [Self <: StratifyTransform](x: Self) {
    
    inline def setKey(value: FieldRef): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setParentKey(value: FieldRef): Self = StObject.set(x, "parentKey", value.asInstanceOf[js.Any])
    
    inline def setType(value: stratify): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
