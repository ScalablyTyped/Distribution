package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignUndefined extends StObject {
  
  var align: Unit
}
object AlignUndefined {
  
  inline def apply(align: Unit): AlignUndefined = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignUndefined]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlignUndefined] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: Unit): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
  }
}
