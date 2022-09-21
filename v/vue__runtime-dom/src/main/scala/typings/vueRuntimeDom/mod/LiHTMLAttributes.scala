package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
}
object LiHTMLAttributes {
  
  inline def apply(): LiHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiHTMLAttributes]
  }
  
  extension [Self <: LiHTMLAttributes](x: Self) {
    
    inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
