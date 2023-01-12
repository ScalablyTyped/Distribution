package typings.vite.mod.Terser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MangleOptions extends StObject {
  
  var eval: js.UndefOr[Boolean] = js.undefined
  
  var keep_classnames: js.UndefOr[Boolean | js.RegExp] = js.undefined
  
  var keep_fnames: js.UndefOr[Boolean | js.RegExp] = js.undefined
  
  var module: js.UndefOr[Boolean] = js.undefined
  
  var nth_identifier: js.UndefOr[SimpleIdentifierMangler | WeightedIdentifierMangler] = js.undefined
  
  var properties: js.UndefOr[Boolean | ManglePropertiesOptions] = js.undefined
  
  var reserved: js.UndefOr[js.Array[String]] = js.undefined
  
  var safari10: js.UndefOr[Boolean] = js.undefined
  
  var toplevel: js.UndefOr[Boolean] = js.undefined
}
object MangleOptions {
  
  inline def apply(): MangleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MangleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MangleOptions] (val x: Self) extends AnyVal {
    
    inline def setEval(value: Boolean): Self = StObject.set(x, "eval", value.asInstanceOf[js.Any])
    
    inline def setEvalUndefined: Self = StObject.set(x, "eval", js.undefined)
    
    inline def setKeep_classnames(value: Boolean | js.RegExp): Self = StObject.set(x, "keep_classnames", value.asInstanceOf[js.Any])
    
    inline def setKeep_classnamesUndefined: Self = StObject.set(x, "keep_classnames", js.undefined)
    
    inline def setKeep_fnames(value: Boolean | js.RegExp): Self = StObject.set(x, "keep_fnames", value.asInstanceOf[js.Any])
    
    inline def setKeep_fnamesUndefined: Self = StObject.set(x, "keep_fnames", js.undefined)
    
    inline def setModule(value: Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setNth_identifier(value: SimpleIdentifierMangler | WeightedIdentifierMangler): Self = StObject.set(x, "nth_identifier", value.asInstanceOf[js.Any])
    
    inline def setNth_identifierUndefined: Self = StObject.set(x, "nth_identifier", js.undefined)
    
    inline def setProperties(value: Boolean | ManglePropertiesOptions): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setReserved(value: js.Array[String]): Self = StObject.set(x, "reserved", value.asInstanceOf[js.Any])
    
    inline def setReservedUndefined: Self = StObject.set(x, "reserved", js.undefined)
    
    inline def setReservedVarargs(value: String*): Self = StObject.set(x, "reserved", js.Array(value*))
    
    inline def setSafari10(value: Boolean): Self = StObject.set(x, "safari10", value.asInstanceOf[js.Any])
    
    inline def setSafari10Undefined: Self = StObject.set(x, "safari10", js.undefined)
    
    inline def setToplevel(value: Boolean): Self = StObject.set(x, "toplevel", value.asInstanceOf[js.Any])
    
    inline def setToplevelUndefined: Self = StObject.set(x, "toplevel", js.undefined)
  }
}
