package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.nest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NestTransform
  extends StObject
     with _Transforms {
  
  var generate: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var keys: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.undefined
  
  var `type`: nest
}
object NestTransform {
  
  @scala.inline
  def apply(): NestTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nest")
    __obj.asInstanceOf[NestTransform]
  }
  
  @scala.inline
  implicit class NestTransformMutableBuilder[Self <: NestTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGenerate(value: Boolean | SignalRef): Self = StObject.set(x, "generate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateUndefined: Self = StObject.set(x, "generate", js.undefined)
    
    @scala.inline
    def setKeys(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: FieldRef*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    @scala.inline
    def setType(value: nest): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
