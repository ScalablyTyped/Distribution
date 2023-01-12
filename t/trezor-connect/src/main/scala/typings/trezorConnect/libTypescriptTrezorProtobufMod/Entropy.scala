package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entropy extends StObject {
  
  var entropy: String
}
object Entropy {
  
  inline def apply(entropy: String): Entropy = {
    val __obj = js.Dynamic.literal(entropy = entropy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entropy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Entropy] (val x: Self) extends AnyVal {
    
    inline def setEntropy(value: String): Self = StObject.set(x, "entropy", value.asInstanceOf[js.Any])
  }
}
