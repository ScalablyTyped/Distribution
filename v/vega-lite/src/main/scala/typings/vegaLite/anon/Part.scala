package typings.vegaLite.anon

import typings.vegaLite.vegaLiteStrings.axis
import typings.vegaLite.vegaLiteStrings.domain
import typings.vegaLite.vegaLiteStrings.grid
import typings.vegaLite.vegaLiteStrings.labels
import typings.vegaLite.vegaLiteStrings.ticks
import typings.vegaLite.vegaLiteStrings.title
import typings.vegaLite.vegaSchemaMod.VgEncodeChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Part extends StObject {
  
  var part: /* keyof vega-typings.vega-typings/types/spec/axis.AxisEncode */ axis | ticks | labels | title | grid | domain
  
  var vgProp: VgEncodeChannel
}
object Part {
  
  inline def apply(
    part: /* keyof vega-typings.vega-typings/types/spec/axis.AxisEncode */ axis | ticks | labels | title | grid | domain,
    vgProp: VgEncodeChannel
  ): Part = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any], vgProp = vgProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Part]
  }
  
  extension [Self <: Part](x: Self) {
    
    inline def setPart(
      value: /* keyof vega-typings.vega-typings/types/spec/axis.AxisEncode */ axis | ticks | labels | title | grid | domain
    ): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setVgProp(value: VgEncodeChannel): Self = StObject.set(x, "vgProp", value.asInstanceOf[js.Any])
  }
}
