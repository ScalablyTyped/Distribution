package typings
package winrtLib.WindowsNs.ApplicationModelNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreApplication extends js.Object {
  var id: java.lang.String
  var onresuming: js.Any
  var onsuspending: js.Any
  var properties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  def getCurrentView(): CoreApplicationView
  def run(viewSource: IFrameworkViewSource): scala.Unit
  def runWithActivationFactories(activationFactoryCallback: winrtLib.WindowsNs.FoundationNs.IGetActivationFactory): scala.Unit
}

object ICoreApplication {
  @scala.inline
  def apply(
    getCurrentView: js.Function0[CoreApplicationView],
    id: java.lang.String,
    onresuming: js.Any,
    onsuspending: js.Any,
    properties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet,
    run: js.Function1[IFrameworkViewSource, scala.Unit],
    runWithActivationFactories: js.Function1[winrtLib.WindowsNs.FoundationNs.IGetActivationFactory, scala.Unit]
  ): ICoreApplication = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCurrentView")(getCurrentView)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("onresuming")(onresuming)
    __obj.updateDynamic("onsuspending")(onsuspending)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("run")(run)
    __obj.updateDynamic("runWithActivationFactories")(runWithActivationFactories)
    __obj.asInstanceOf[ICoreApplication]
  }
}

