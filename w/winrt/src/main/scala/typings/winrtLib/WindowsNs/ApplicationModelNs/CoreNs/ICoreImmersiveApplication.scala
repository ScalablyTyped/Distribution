package typings
package winrtLib.WindowsNs.ApplicationModelNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreImmersiveApplication extends js.Object {
  var mainView: CoreApplicationView
  var views: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[CoreApplicationView]
  def createNewView(runtimeType: java.lang.String, entryPoint: java.lang.String): CoreApplicationView
}

object ICoreImmersiveApplication {
  @scala.inline
  def apply(
    createNewView: js.Function2[java.lang.String, java.lang.String, CoreApplicationView],
    mainView: CoreApplicationView,
    views: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[CoreApplicationView]
  ): ICoreImmersiveApplication = {
    val __obj = js.Dynamic.literal(createNewView = createNewView, mainView = mainView, views = views)
  
    __obj.asInstanceOf[ICoreImmersiveApplication]
  }
}

