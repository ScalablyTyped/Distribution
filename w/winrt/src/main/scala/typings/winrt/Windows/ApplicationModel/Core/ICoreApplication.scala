package typings.winrt.Windows.ApplicationModel.Core

import typings.winrt.Windows.Foundation.Collections.IPropertySet
import typings.winrt.Windows.Foundation.IGetActivationFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoreApplication extends js.Object {
  var id: String = js.native
  var onresuming: js.Any = js.native
  var onsuspending: js.Any = js.native
  var properties: IPropertySet = js.native
  def getCurrentView(): CoreApplicationView = js.native
  def run(viewSource: IFrameworkViewSource): Unit = js.native
  def runWithActivationFactories(activationFactoryCallback: IGetActivationFactory): Unit = js.native
}

object ICoreApplication {
  @scala.inline
  def apply(
    getCurrentView: () => CoreApplicationView,
    id: String,
    onresuming: js.Any,
    onsuspending: js.Any,
    properties: IPropertySet,
    run: IFrameworkViewSource => Unit,
    runWithActivationFactories: IGetActivationFactory => Unit
  ): ICoreApplication = {
    val __obj = js.Dynamic.literal(getCurrentView = js.Any.fromFunction0(getCurrentView), id = id.asInstanceOf[js.Any], onresuming = onresuming.asInstanceOf[js.Any], onsuspending = onsuspending.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], run = js.Any.fromFunction1(run), runWithActivationFactories = js.Any.fromFunction1(runWithActivationFactories))
    __obj.asInstanceOf[ICoreApplication]
  }
  @scala.inline
  implicit class ICoreApplicationOps[Self <: ICoreApplication] (val x: Self) extends AnyVal {
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
    def setGetCurrentView(value: () => CoreApplicationView): Self = this.set("getCurrentView", js.Any.fromFunction0(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnresuming(value: js.Any): Self = this.set("onresuming", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnsuspending(value: js.Any): Self = this.set("onsuspending", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: IPropertySet): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setRun(value: IFrameworkViewSource => Unit): Self = this.set("run", js.Any.fromFunction1(value))
    @scala.inline
    def setRunWithActivationFactories(value: IGetActivationFactory => Unit): Self = this.set("runWithActivationFactories", js.Any.fromFunction1(value))
  }
  
}

