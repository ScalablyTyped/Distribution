package typings.webcryptoCore.mod

import typings.std.Algorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShakeParams
  extends StObject
     with Algorithm {
  
  /**
    * Output length in bytes
    */
  var length: js.UndefOr[Double] = js.undefined
}
object ShakeParams {
  
  inline def apply(name: String): ShakeParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShakeParams]
  }
  
  extension [Self <: ShakeParams](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
  }
}
