package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerserMangleOptions extends StObject {
  
  var ie8: js.UndefOr[Boolean] = js.undefined
  
  var keep_class_names: js.UndefOr[Boolean] = js.undefined
  
  var keep_fn_names: js.UndefOr[Boolean] = js.undefined
  
  var keep_private_props: js.UndefOr[Boolean] = js.undefined
  
  var props: js.UndefOr[TerserManglePropertiesOptions] = js.undefined
  
  var reserved: js.UndefOr[js.Array[String]] = js.undefined
  
  var safari10: js.UndefOr[Boolean] = js.undefined
  
  var top_level: js.UndefOr[Boolean] = js.undefined
}
object TerserMangleOptions {
  
  inline def apply(): TerserMangleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerserMangleOptions]
  }
  
  extension [Self <: TerserMangleOptions](x: Self) {
    
    inline def setIe8(value: Boolean): Self = StObject.set(x, "ie8", value.asInstanceOf[js.Any])
    
    inline def setIe8Undefined: Self = StObject.set(x, "ie8", js.undefined)
    
    inline def setKeep_class_names(value: Boolean): Self = StObject.set(x, "keep_class_names", value.asInstanceOf[js.Any])
    
    inline def setKeep_class_namesUndefined: Self = StObject.set(x, "keep_class_names", js.undefined)
    
    inline def setKeep_fn_names(value: Boolean): Self = StObject.set(x, "keep_fn_names", value.asInstanceOf[js.Any])
    
    inline def setKeep_fn_namesUndefined: Self = StObject.set(x, "keep_fn_names", js.undefined)
    
    inline def setKeep_private_props(value: Boolean): Self = StObject.set(x, "keep_private_props", value.asInstanceOf[js.Any])
    
    inline def setKeep_private_propsUndefined: Self = StObject.set(x, "keep_private_props", js.undefined)
    
    inline def setProps(value: TerserManglePropertiesOptions): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    
    inline def setReserved(value: js.Array[String]): Self = StObject.set(x, "reserved", value.asInstanceOf[js.Any])
    
    inline def setReservedUndefined: Self = StObject.set(x, "reserved", js.undefined)
    
    inline def setReservedVarargs(value: String*): Self = StObject.set(x, "reserved", js.Array(value*))
    
    inline def setSafari10(value: Boolean): Self = StObject.set(x, "safari10", value.asInstanceOf[js.Any])
    
    inline def setSafari10Undefined: Self = StObject.set(x, "safari10", js.undefined)
    
    inline def setTop_level(value: Boolean): Self = StObject.set(x, "top_level", value.asInstanceOf[js.Any])
    
    inline def setTop_levelUndefined: Self = StObject.set(x, "top_level", js.undefined)
  }
}
