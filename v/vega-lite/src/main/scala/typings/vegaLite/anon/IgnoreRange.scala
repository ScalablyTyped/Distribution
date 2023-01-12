package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreRange extends StObject {
  
  var ignoreRange: js.UndefOr[Boolean] = js.undefined
}
object IgnoreRange {
  
  inline def apply(): IgnoreRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgnoreRange] (val x: Self) extends AnyVal {
    
    inline def setIgnoreRange(value: Boolean): Self = StObject.set(x, "ignoreRange", value.asInstanceOf[js.Any])
    
    inline def setIgnoreRangeUndefined: Self = StObject.set(x, "ignoreRange", js.undefined)
  }
}
