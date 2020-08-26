package typings.winrt.Windows.ApplicationModel.Core

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoreImmersiveApplication extends js.Object {
  var mainView: CoreApplicationView = js.native
  var views: IVectorView[CoreApplicationView] = js.native
  def createNewView(runtimeType: String, entryPoint: String): CoreApplicationView = js.native
}

object ICoreImmersiveApplication {
  @scala.inline
  def apply(
    createNewView: (String, String) => CoreApplicationView,
    mainView: CoreApplicationView,
    views: IVectorView[CoreApplicationView]
  ): ICoreImmersiveApplication = {
    val __obj = js.Dynamic.literal(createNewView = js.Any.fromFunction2(createNewView), mainView = mainView.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoreImmersiveApplication]
  }
  @scala.inline
  implicit class ICoreImmersiveApplicationOps[Self <: ICoreImmersiveApplication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateNewView(value: (String, String) => CoreApplicationView): Self = this.set("createNewView", js.Any.fromFunction2(value))
    @scala.inline
    def setMainView(value: CoreApplicationView): Self = this.set("mainView", value.asInstanceOf[js.Any])
    @scala.inline
    def setViews(value: IVectorView[CoreApplicationView]): Self = this.set("views", value.asInstanceOf[js.Any])
  }
  
}

