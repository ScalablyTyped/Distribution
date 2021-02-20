package typings.viewportMercatorProject.mod

import typings.viewportMercatorProject.viewportMercatorProjectBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseHighPrecisionDistanceScalesInput extends BaseDistanceScalesInput {
  
  var highPrecision: `true` = js.native
}
object BaseHighPrecisionDistanceScalesInput {
  
  @scala.inline
  def apply(highPrecision: `true`, latitude: Double, longitude: Double): BaseHighPrecisionDistanceScalesInput = {
    val __obj = js.Dynamic.literal(highPrecision = highPrecision.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseHighPrecisionDistanceScalesInput]
  }
  
  @scala.inline
  implicit class BaseHighPrecisionDistanceScalesInputMutableBuilder[Self <: BaseHighPrecisionDistanceScalesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighPrecision(value: `true`): Self = StObject.set(x, "highPrecision", value.asInstanceOf[js.Any])
  }
}
