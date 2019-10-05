package typings.winrt.Windows.ApplicationModel.Activation

import typings.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISplashScreen extends js.Object {
  var imageLocation: Rect
  var ondismissed: js.Any
}

object ISplashScreen {
  @scala.inline
  def apply(imageLocation: Rect, ondismissed: js.Any): ISplashScreen = {
    val __obj = js.Dynamic.literal(imageLocation = imageLocation, ondismissed = ondismissed)
  
    __obj.asInstanceOf[ISplashScreen]
  }
}

