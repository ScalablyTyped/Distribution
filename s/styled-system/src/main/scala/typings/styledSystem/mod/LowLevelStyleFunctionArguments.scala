package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LowLevelStyleFunctionArguments[N, S] extends StObject {
  
  var alias: js.UndefOr[String] = js.undefined
  
  var cssProperty: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var prop: String
  
  // new v5 api
  var properties: js.UndefOr[js.Array[String]] = js.undefined
  
  var scale: js.UndefOr[S] = js.undefined
  
  var transformValue: js.UndefOr[js.Function2[/* n */ N, /* scale */ js.UndefOr[S], Any]] = js.undefined
}
object LowLevelStyleFunctionArguments {
  
  inline def apply[N, S](prop: String): LowLevelStyleFunctionArguments[N, S] = {
    val __obj = js.Dynamic.literal(prop = prop.asInstanceOf[js.Any])
    __obj.asInstanceOf[LowLevelStyleFunctionArguments[N, S]]
  }
  
  extension [Self <: LowLevelStyleFunctionArguments[?, ?], N, S](x: Self & (LowLevelStyleFunctionArguments[N, S])) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setCssProperty(value: String): Self = StObject.set(x, "cssProperty", value.asInstanceOf[js.Any])
    
    inline def setCssPropertyUndefined: Self = StObject.set(x, "cssProperty", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setScale(value: S): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setTransformValue(value: (/* n */ N, /* scale */ js.UndefOr[S]) => Any): Self = StObject.set(x, "transformValue", js.Any.fromFunction2(value))
    
    inline def setTransformValueUndefined: Self = StObject.set(x, "transformValue", js.undefined)
  }
}
