package typings.tcomb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructOptions extends StObject {
  
  var defaultProps: js.UndefOr[js.Object] = js.undefined
  
  var name: js.UndefOr[java.lang.String] = js.undefined
  
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}
object StructOptions {
  
  inline def apply(): StructOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StructOptions] (val x: Self) extends AnyVal {
    
    inline def setDefaultProps(value: js.Object): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStrict(value: scala.Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
