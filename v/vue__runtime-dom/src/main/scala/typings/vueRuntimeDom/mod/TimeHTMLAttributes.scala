package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var datetime: js.UndefOr[String] = js.undefined
}
object TimeHTMLAttributes {
  
  inline def apply(): TimeHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeHTMLAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeHTMLAttributes] (val x: Self) extends AnyVal {
    
    inline def setDatetime(value: String): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
  }
}
