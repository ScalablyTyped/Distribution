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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Order extends StObject {
  
  var encoding: text | fill | stroke | color | shape | x | y | opacity | fillOpacity | strokeOpacity | strokeWidth | size = js.native
  
  var order: String = js.native
}
object Order {
  
  @scala.inline
  def apply(
    encoding: text | fill | stroke | color | shape | x | y | opacity | fillOpacity | strokeOpacity | strokeWidth | size,
    order: String
  ): Order = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
  
  @scala.inline
  implicit class OrderMutableBuilder[Self <: Order] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(
      value: text | fill | stroke | color | shape | typings.vegaLite.vegaLiteStrings.x | y | opacity | fillOpacity | strokeOpacity | strokeWidth | size
    ): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
