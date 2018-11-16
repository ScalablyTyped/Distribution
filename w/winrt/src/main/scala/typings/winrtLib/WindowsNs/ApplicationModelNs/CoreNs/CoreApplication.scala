package typings
package winrtLib.WindowsNs.ApplicationModelNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Core.CoreApplication")
@js.native
class CoreApplication () extends js.Object

@JSGlobal("Windows.ApplicationModel.Core.CoreApplication")
@js.native
object CoreApplication extends js.Object {
  var id: java.lang.String = js.native
  var mainView: winrtLib.WindowsNs.ApplicationModelNs.CoreNs.CoreApplicationView = js.native
  var onexiting: js.Any = js.native
  var onresuming: js.Any = js.native
  var onsuspending: js.Any = js.native
  var properties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet = js.native
  var views: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.ApplicationModelNs.CoreNs.CoreApplicationView] = js.native
  def createNewView(runtimeType: java.lang.String, entryPoint: java.lang.String): winrtLib.WindowsNs.ApplicationModelNs.CoreNs.CoreApplicationView = js.native
  def decrementApplicationUseCount(): scala.Unit = js.native
  def exit(): scala.Unit = js.native
  def getCurrentView(): winrtLib.WindowsNs.ApplicationModelNs.CoreNs.CoreApplicationView = js.native
  def incrementApplicationUseCount(): scala.Unit = js.native
  def run(viewSource: winrtLib.WindowsNs.ApplicationModelNs.CoreNs.IFrameworkViewSource): scala.Unit = js.native
  def runWithActivationFactories(activationFactoryCallback: winrtLib.WindowsNs.FoundationNs.IGetActivationFactory): scala.Unit = js.native
}

