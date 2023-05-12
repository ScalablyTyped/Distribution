package typings.vegaLite.anon

import typings.vegaLite.buildSrcCompileSelectionProjectMod.TupleStoreType
import typings.vegaLite.vegaLiteStrings.angle
import typings.vegaLite.vegaLiteStrings.color
import typings.vegaLite.vegaLiteStrings.description
import typings.vegaLite.vegaLiteStrings.fill
import typings.vegaLite.vegaLiteStrings.fillOpacity
import typings.vegaLite.vegaLiteStrings.href
import typings.vegaLite.vegaLiteStrings.key
import typings.vegaLite.vegaLiteStrings.latitude
import typings.vegaLite.vegaLiteStrings.latitude2
import typings.vegaLite.vegaLiteStrings.longitude
import typings.vegaLite.vegaLiteStrings.longitude2
import typings.vegaLite.vegaLiteStrings.opacity
import typings.vegaLite.vegaLiteStrings.radius
import typings.vegaLite.vegaLiteStrings.radius2
import typings.vegaLite.vegaLiteStrings.shape
import typings.vegaLite.vegaLiteStrings.size
import typings.vegaLite.vegaLiteStrings.stroke
import typings.vegaLite.vegaLiteStrings.strokeDash
import typings.vegaLite.vegaLiteStrings.strokeOpacity
import typings.vegaLite.vegaLiteStrings.strokeWidth
import typings.vegaLite.vegaLiteStrings.text
import typings.vegaLite.vegaLiteStrings.theta
import typings.vegaLite.vegaLiteStrings.theta2
import typings.vegaLite.vegaLiteStrings.url
import typings.vegaLite.vegaLiteStrings.x
import typings.vegaLite.vegaLiteStrings.x2
import typings.vegaLite.vegaLiteStrings.xOffset
import typings.vegaLite.vegaLiteStrings.y
import typings.vegaLite.vegaLiteStrings.y2
import typings.vegaLite.vegaLiteStrings.yOffset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoChannel extends StObject {
  
  var channel: js.UndefOr[
    fill | key | url | color | fillOpacity | opacity | stroke | strokeOpacity | strokeWidth | text | size | description | x | x2 | y | y2 | strokeDash | angle | shape | radius | theta | href | theta2 | radius2 | xOffset | yOffset | longitude | latitude | longitude2 | latitude2
  ] = js.undefined
  
  var field: String
  
  var geoChannel: js.UndefOr[longitude | latitude | longitude2 | latitude2] = js.undefined
  
  var `type`: TupleStoreType
}
object GeoChannel {
  
  inline def apply(field: String, `type`: TupleStoreType): GeoChannel = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoChannel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoChannel] (val x: Self) extends AnyVal {
    
    inline def setChannel(
      value: fill | key | url | color | fillOpacity | opacity | stroke | strokeOpacity | strokeWidth | text | size | description | typings.vegaLite.vegaLiteStrings.x | x2 | y | y2 | strokeDash | angle | shape | radius | theta | href | theta2 | radius2 | xOffset | yOffset | longitude | latitude | longitude2 | latitude2
    ): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setGeoChannel(value: longitude | latitude | longitude2 | latitude2): Self = StObject.set(x, "geoChannel", value.asInstanceOf[js.Any])
    
    inline def setGeoChannelUndefined: Self = StObject.set(x, "geoChannel", js.undefined)
    
    inline def setType(value: TupleStoreType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
