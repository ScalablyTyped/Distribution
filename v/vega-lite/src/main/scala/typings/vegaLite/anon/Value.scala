package typings.vegaLite.anon

import typings.vegaLite.buildSrcChanneldefMod.FieldDefBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var explicit: Boolean
  
  var value: js.Array[FieldDefBase[String, typings.vegaLite.buildSrcBinMod.Bin]]
}
object Value {
  
  inline def apply(explicit: Boolean, value: js.Array[FieldDefBase[String, typings.vegaLite.buildSrcBinMod.Bin]]): Value = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[FieldDefBase[String, typings.vegaLite.buildSrcBinMod.Bin]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: (FieldDefBase[String, typings.vegaLite.buildSrcBinMod.Bin])*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
