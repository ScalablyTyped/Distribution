package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.nest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NestTransform
  extends StObject
     with Transforms {
  
  var generate: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var keys: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.undefined
  
  var `type`: nest
}
object NestTransform {
  
  inline def apply(): NestTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nest")
    __obj.asInstanceOf[NestTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NestTransform] (val x: Self) extends AnyVal {
    
    inline def setGenerate(value: Boolean | SignalRef): Self = StObject.set(x, "generate", value.asInstanceOf[js.Any])
    
    inline def setGenerateUndefined: Self = StObject.set(x, "generate", js.undefined)
    
    inline def setKeys(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: FieldRef*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setType(value: nest): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
