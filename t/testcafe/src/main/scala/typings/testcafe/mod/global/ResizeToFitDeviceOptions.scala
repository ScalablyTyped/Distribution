package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeToFitDeviceOptions extends StObject {
  
  /**
    * `true` for portrait screen orientation; `false` for landscape.
    */
  var portraitOrientation: js.UndefOr[Boolean] = js.undefined
}
object ResizeToFitDeviceOptions {
  
  inline def apply(): ResizeToFitDeviceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeToFitDeviceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResizeToFitDeviceOptions] (val x: Self) extends AnyVal {
    
    inline def setPortraitOrientation(value: Boolean): Self = StObject.set(x, "portraitOrientation", value.asInstanceOf[js.Any])
    
    inline def setPortraitOrientationUndefined: Self = StObject.set(x, "portraitOrientation", js.undefined)
  }
}
