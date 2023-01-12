package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositeMark extends StObject {
  
  var compositeMark: js.UndefOr[Boolean] = js.undefined
}
object CompositeMark {
  
  inline def apply(): CompositeMark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositeMark]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompositeMark] (val x: Self) extends AnyVal {
    
    inline def setCompositeMark(value: Boolean): Self = StObject.set(x, "compositeMark", value.asInstanceOf[js.Any])
    
    inline def setCompositeMarkUndefined: Self = StObject.set(x, "compositeMark", js.undefined)
  }
}
