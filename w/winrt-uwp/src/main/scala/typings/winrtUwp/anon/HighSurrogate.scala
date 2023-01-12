package typings.winrtUwp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighSurrogate extends StObject {
  
  /** The high surrogate value returned. */ var highSurrogate: String
  
  /** The low surrogate value returned. */ var lowSurrogate: String
}
object HighSurrogate {
  
  inline def apply(highSurrogate: String, lowSurrogate: String): HighSurrogate = {
    val __obj = js.Dynamic.literal(highSurrogate = highSurrogate.asInstanceOf[js.Any], lowSurrogate = lowSurrogate.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighSurrogate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HighSurrogate] (val x: Self) extends AnyVal {
    
    inline def setHighSurrogate(value: String): Self = StObject.set(x, "highSurrogate", value.asInstanceOf[js.Any])
    
    inline def setLowSurrogate(value: String): Self = StObject.set(x, "lowSurrogate", value.asInstanceOf[js.Any])
  }
}
