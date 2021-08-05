package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowProps extends StObject {
  
  val row: js.UndefOr[ResponsiveValue[String | Double | Boolean]] = js.undefined
}
object RowProps {
  
  inline def apply(): RowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowProps]
  }
  
  extension [Self <: RowProps](x: Self) {
    
    inline def setRow(value: ResponsiveValue[String | Double | Boolean]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    inline def setRowVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "row", js.Array(value :_*))
  }
}
