package typings
package winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResourceContext extends js.Object {
  var languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  var qualifierValues: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IObservableMap[java.lang.String, java.lang.String] = js.native
  def overrideToMatch(result: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[ResourceQualifier]): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def reset(qualifierNames: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]): scala.Unit = js.native
}

