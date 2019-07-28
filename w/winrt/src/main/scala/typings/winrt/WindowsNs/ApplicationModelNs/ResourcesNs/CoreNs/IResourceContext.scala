package typings.winrt.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterable
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IObservableMap
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResourceContext extends js.Object {
  var languages: IVectorView[String] = js.native
  var qualifierValues: IObservableMap[String, String] = js.native
  def overrideToMatch(result: IIterable[ResourceQualifier]): Unit = js.native
  def reset(): Unit = js.native
  def reset(qualifierNames: IIterable[String]): Unit = js.native
}

