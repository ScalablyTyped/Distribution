package typings.webcryptoCore.mod

import typings.std.Algorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DesKeyGenParams
  extends StObject
     with Algorithm {
  
  var length: Double
}
object DesKeyGenParams {
  
  inline def apply(length: Double, name: String): DesKeyGenParams = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesKeyGenParams]
  }
  
  extension [Self <: DesKeyGenParams](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
