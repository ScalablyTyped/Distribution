package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapContextGetScaleResult extends StObject {
  
  /**
    * 地图缩放级别
    */
  var scale: js.UndefOr[Double] = js.native
}
object MapContextGetScaleResult {
  
  @scala.inline
  def apply(): MapContextGetScaleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapContextGetScaleResult]
  }
  
  @scala.inline
  implicit class MapContextGetScaleResultMutableBuilder[Self <: MapContextGetScaleResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
