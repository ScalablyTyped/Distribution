package typings.yaml.anon

import typings.yaml.distParseCstMod.SourceToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sep extends StObject {
  
  var key: js.UndefOr[scala.Nothing] = js.undefined
  
  var sep: js.UndefOr[scala.Nothing] = js.undefined
  
  var start: js.Array[SourceToken]
  
  var value: js.UndefOr[scala.Nothing] = js.undefined
}
object Sep {
  
  inline def apply(start: js.Array[SourceToken]): Sep = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sep] (val x: Self) extends AnyVal {
    
    inline def setStart(value: js.Array[SourceToken]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartVarargs(value: SourceToken*): Self = StObject.set(x, "start", js.Array(value*))
  }
}
