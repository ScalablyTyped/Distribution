package typings.winrt.Windows.ApplicationModel.Activation

import typings.winrt.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISplashScreen extends StObject {
  
  var imageLocation: Rect = js.native
  
  var ondismissed: js.Any = js.native
}
object ISplashScreen {
  
  @scala.inline
  def apply(imageLocation: Rect, ondismissed: js.Any): ISplashScreen = {
    val __obj = js.Dynamic.literal(imageLocation = imageLocation.asInstanceOf[js.Any], ondismissed = ondismissed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISplashScreen]
  }
  
  @scala.inline
  implicit class ISplashScreenMutableBuilder[Self <: ISplashScreen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageLocation(value: Rect): Self = StObject.set(x, "imageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndismissed(value: js.Any): Self = StObject.set(x, "ondismissed", value.asInstanceOf[js.Any])
  }
}
