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

