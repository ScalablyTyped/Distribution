package typings.twig.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompiledGenericTokenWithMatch[TType, TValue]
  extends StObject
     with CompiledGenericToken[TType, TValue] {
  
  var `match`: js.Array[js.UndefOr[String | Any]]
}
object CompiledGenericTokenWithMatch {
  
  inline def apply[TType, TValue](`match`: js.Array[js.UndefOr[String | Any]], `type`: TType, value: TValue): CompiledGenericTokenWithMatch[TType, TValue] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledGenericTokenWithMatch[TType, TValue]]
  }
  
  extension [Self <: CompiledGenericTokenWithMatch[?, ?], TType, TValue](x: Self & (CompiledGenericTokenWithMatch[TType, TValue])) {
    
    inline def setMatch(value: js.Array[js.UndefOr[String | Any]]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchVarargs(value: (js.UndefOr[String | Any])*): Self = StObject.set(x, "match", js.Array(value*))
  }
}
