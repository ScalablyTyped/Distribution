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
trait Encoding extends StObject {
  
  var encoding: text | fill | stroke | color | shape | x | y | opacity | fillOpacity | strokeOpacity | strokeWidth | size = js.native
  
  var order: js.UndefOr[scala.Nothing] = js.native
}
object Encoding {
  
  @scala.inline
  def apply(
    encoding: text | fill | stroke | color | shape | x | y | opacity | fillOpacity | strokeOpacity | strokeWidth | size
  ): Encoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
  
  @scala.inline
  implicit class EncodingMutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(
      value: text | fill | stroke | color | shape | typings.vegaLite.vegaLiteStrings.x | y | opacity | fillOpacity | strokeOpacity | strokeWidth | size
    ): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
