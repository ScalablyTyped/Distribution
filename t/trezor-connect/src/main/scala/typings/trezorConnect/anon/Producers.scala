package typings.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Producers extends StObject {
  
  var producers: js.Array[String]
  
  var proxy: String
  
  var voter: String
}
object Producers {
  
  inline def apply(producers: js.Array[String], proxy: String, voter: String): Producers = {
    val __obj = js.Dynamic.literal(producers = producers.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any], voter = voter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Producers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Producers] (val x: Self) extends AnyVal {
    
    inline def setProducers(value: js.Array[String]): Self = StObject.set(x, "producers", value.asInstanceOf[js.Any])
    
    inline def setProducersVarargs(value: String*): Self = StObject.set(x, "producers", js.Array(value*))
    
    inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setVoter(value: String): Self = StObject.set(x, "voter", value.asInstanceOf[js.Any])
  }
}
