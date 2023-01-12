package typings.webcryptoCore.mod

import typings.std.Algorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DesDerivedKeyParams
  extends StObject
     with Algorithm {
  
  var length: Double
}
object DesDerivedKeyParams {
  
  inline def apply(length: Double, name: String): DesDerivedKeyParams = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesDerivedKeyParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DesDerivedKeyParams] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
