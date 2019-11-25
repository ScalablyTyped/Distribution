package typings.winrt.Windows.ApplicationModel.Core

import typings.winrt.Windows.Foundation.Collections.IPropertySet
import typings.winrt.Windows.Foundation.IGetActivationFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreApplication extends js.Object {
  var id: String
  var onresuming: js.Any
  var onsuspending: js.Any
  var properties: IPropertySet
  def getCurrentView(): CoreApplicationView
  def run(viewSource: IFrameworkViewSource): Unit
  def runWithActivationFactories(activationFactoryCallback: IGetActivationFactory): Unit
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
}

