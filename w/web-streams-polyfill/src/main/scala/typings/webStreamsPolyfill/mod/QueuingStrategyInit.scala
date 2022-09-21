package typings.webStreamsPolyfill.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueuingStrategyInit extends StObject {
  
  /**
    * {@inheritDoc QueuingStrategy.highWaterMark}
    */
  var highWaterMark: Double
}
object QueuingStrategyInit {
  
  inline def apply(highWaterMark: Double): QueuingStrategyInit = {
    val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueuingStrategyInit]
  }
  
  extension [Self <: QueuingStrategyInit](x: Self) {
    
    inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
  }
}
