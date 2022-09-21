package typings.vhtml.mod.JSX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
}
object DataHTMLAttributes {
  
  inline def apply(): DataHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataHTMLAttributes]
  }
  
  extension [Self <: DataHTMLAttributes](x: Self) {
    
    inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
