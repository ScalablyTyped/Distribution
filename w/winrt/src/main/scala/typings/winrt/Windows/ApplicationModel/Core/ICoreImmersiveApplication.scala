package typings.winrt.Windows.ApplicationModel.Core

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreImmersiveApplication extends js.Object {
  var mainView: CoreApplicationView
  var views: IVectorView[CoreApplicationView]
  def createNewView(runtimeType: String, entryPoint: String): CoreApplicationView
}

object ICoreImmersiveApplication {
  @scala.inline
  def apply(
    createNewView: (String, String) => CoreApplicationView,
    mainView: CoreApplicationView,
    views: IVectorView[CoreApplicationView]
  ): ICoreImmersiveApplication = {
    val __obj = js.Dynamic.literal(createNewView = js.Any.fromFunction2(createNewView), mainView = mainView, views = views)
  
    __obj.asInstanceOf[ICoreImmersiveApplication]
  }
}

