package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var open: js.UndefOr[Booleanish] = js.undefined
}
object DialogHTMLAttributes {
  
  inline def apply(): DialogHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogHTMLAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogHTMLAttributes] (val x: Self) extends AnyVal {
    
    inline def setOpen(value: Booleanish): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
