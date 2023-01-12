package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignString extends StObject {
  
  var align: String
}
object AlignString {
  
  inline def apply(align: String): AlignString = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlignString] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
  }
}
