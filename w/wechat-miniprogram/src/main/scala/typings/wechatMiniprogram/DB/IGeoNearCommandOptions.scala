package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeoNearCommandOptions extends StObject {
  
  var geometry: GeoPoint
  
  var maxDistance: js.UndefOr[Double] = js.undefined
  
  var minDistance: js.UndefOr[Double] = js.undefined
}
object IGeoNearCommandOptions {
  
  @scala.inline
  def apply(geometry: GeoPoint): IGeoNearCommandOptions = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoNearCommandOptions]
  }
  
  @scala.inline
  implicit class IGeoNearCommandOptionsMutableBuilder[Self <: IGeoNearCommandOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeometry(value: GeoPoint): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDistanceUndefined: Self = StObject.set(x, "maxDistance", js.undefined)
    
    @scala.inline
    def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDistanceUndefined: Self = StObject.set(x, "minDistance", js.undefined)
  }
}
