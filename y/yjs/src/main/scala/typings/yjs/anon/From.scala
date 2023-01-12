package typings.yjs.anon

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  var from: Map[Double, Double]
  
  var to: Map[Double, Double]
}
object From {
  
  inline def apply(from: Map[Double, Double], to: Map[Double, Double]): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: Map[Double, Double]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Map[Double, Double]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
