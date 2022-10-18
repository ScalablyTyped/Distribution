package typings.vegaTypings.anon

import typings.vegaTypings.typesSpecEncodeMod.ScaledValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scale
  extends StObject
     with ScaledValueRef[Any] {
  
  var scale: typings.vegaTypings.typesSpecEncodeMod.Field
  
  var value: Boolean | Double | String | Null
}
object Scale {
  
  inline def apply(scale: typings.vegaTypings.typesSpecEncodeMod.Field): Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[Scale]
  }
  
  extension [Self <: Scale](x: Self) {
    
    inline def setScale(value: typings.vegaTypings.typesSpecEncodeMod.Field): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Boolean | Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
