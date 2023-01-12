package typings.webcryptoCore.mod

import typings.std.Algorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DesKeyAlgorithm
  extends StObject
     with Algorithm {
  
  var length: Double
}
object DesKeyAlgorithm {
  
  inline def apply(length: Double, name: String): DesKeyAlgorithm = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesKeyAlgorithm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DesKeyAlgorithm] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
