package typings.webcryptoCore.mod

import typings.std.Algorithm
import typings.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DesParams
  extends StObject
     with Algorithm {
  
  var iv: BufferSource
}
object DesParams {
  
  inline def apply(iv: BufferSource, name: String): DesParams = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesParams]
  }
  
  extension [Self <: DesParams](x: Self) {
    
    inline def setIv(value: BufferSource): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
  }
}
