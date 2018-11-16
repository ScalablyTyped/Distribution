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

