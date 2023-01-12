package typings.yjs.anon

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Missing extends StObject {
  
  var missing: Map[Double, Double]
  
  var update: js.typedarray.Uint8Array
}
object Missing {
  
  inline def apply(missing: Map[Double, Double], update: js.typedarray.Uint8Array): Missing = {
    val __obj = js.Dynamic.literal(missing = missing.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Missing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Missing] (val x: Self) extends AnyVal {
    
    inline def setMissing(value: Map[Double, Double]): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: js.typedarray.Uint8Array): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
  }
}
