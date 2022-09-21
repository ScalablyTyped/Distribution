package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColProps extends StObject {
  
  val col: js.UndefOr[ResponsiveValue[String | Double | Boolean]] = js.undefined
}
object ColProps {
  
  inline def apply(): ColProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColProps]
  }
  
  extension [Self <: ColProps](x: Self) {
    
    inline def setCol(value: ResponsiveValue[String | Double | Boolean]): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    inline def setColUndefined: Self = StObject.set(x, "col", js.undefined)
    
    inline def setColVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "col", js.Array(value*))
  }
}
