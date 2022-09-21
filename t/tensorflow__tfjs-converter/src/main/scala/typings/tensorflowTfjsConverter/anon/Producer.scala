package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Producer extends StObject {
  
  var producer: Double
}
object Producer {
  
  inline def apply(producer: Double): Producer = {
    val __obj = js.Dynamic.literal(producer = producer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Producer]
  }
  
  extension [Self <: Producer](x: Self) {
    
    inline def setProducer(value: Double): Self = StObject.set(x, "producer", value.asInstanceOf[js.Any])
  }
}
