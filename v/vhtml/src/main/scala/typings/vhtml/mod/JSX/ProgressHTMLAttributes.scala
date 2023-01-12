package typings.vhtml.mod.JSX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var max: js.UndefOr[Double | String] = js.undefined
  
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
}
object ProgressHTMLAttributes {
  
  inline def apply(): ProgressHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressHTMLAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProgressHTMLAttributes] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
