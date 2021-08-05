package typings.vegaLite.anon

import typings.vegaLite.vegaLiteStrings.color
import typings.vegaLite.vegaLiteStrings.fill
import typings.vegaLite.vegaLiteStrings.fillOpacity
import typings.vegaLite.vegaLiteStrings.opacity
import typings.vegaLite.vegaLiteStrings.shape
import typings.vegaLite.vegaLiteStrings.size
import typings.vegaLite.vegaLiteStrings.stroke
import typings.vegaLite.vegaLiteStrings.strokeOpacity
import typings.vegaLite.vegaLiteStrings.strokeWidth
import typings.vegaLite.vegaLiteStrings.text
import typings.vegaLite.vegaLiteStrings.x
import typings.vegaLite.vegaLiteStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Order extends StObject {
  
  var encoding: text | fill | stroke | color | shape | x | y | opacity | fillOpacity | strokeOpacity | strokeWidth | size
  
  var order: String
}
object Order {
  
  inline def apply(
    encoding: text | fill | stroke | color | shape | x | y | opacity | fillOpacity | strokeOpacity | strokeWidth | size,
    order: String
  ): Order = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
  
  extension [Self <: Order](x: Self) {
    
    inline def setEncoding(
      value: text | fill | stroke | color | shape | typings.vegaLite.vegaLiteStrings.x | y | opacity | fillOpacity | strokeOpacity | strokeWidth | size
    ): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
