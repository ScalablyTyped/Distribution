package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewWindowOptions extends StObject {
  
  var windowFeatures: js.UndefOr[String] = js.undefined
  
  var windowName: js.UndefOr[String] = js.undefined
}
object NewWindowOptions {
  
  @scala.inline
  def apply(): NewWindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewWindowOptions]
  }
  
  @scala.inline
  implicit class NewWindowOptionsMutableBuilder[Self <: NewWindowOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowFeatures(value: String): Self = StObject.set(x, "windowFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowFeaturesUndefined: Self = StObject.set(x, "windowFeatures", js.undefined)
    
    @scala.inline
    def setWindowName(value: String): Self = StObject.set(x, "windowName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowNameUndefined: Self = StObject.set(x, "windowName", js.undefined)
  }
}
