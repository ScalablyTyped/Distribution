package typings.winrt.Windows.ApplicationModel.Core

import typings.winrt.Windows.Foundation.Collections.IPropertySet
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IGetActivationFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Core.CoreApplication")
@js.native
class CoreApplication () extends js.Object

/* static members */
@JSGlobal("Windows.ApplicationModel.Core.CoreApplication")
@js.native
object CoreApplication extends js.Object {
  var id: String = js.native
  var mainView: CoreApplicationView = js.native
  var onexiting: js.Any = js.native
  var onresuming: js.Any = js.native
  var onsuspending: js.Any = js.native
  var properties: IPropertySet = js.native
  var views: IVectorView[CoreApplicationView] = js.native
  def createNewView(runtimeType: String, entryPoint: String): CoreApplicationView = js.native
  def decrementApplicationUseCount(): Unit = js.native
  def exit(): Unit = js.native
  def getCurrentView(): CoreApplicationView = js.native
  def incrementApplicationUseCount(): Unit = js.native
  def run(viewSource: IFrameworkViewSource): Unit = js.native
  def runWithActivationFactories(activationFactoryCallback: IGetActivationFactory): Unit = js.native
}

