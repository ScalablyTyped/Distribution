package typings.winrt.Windows.ApplicationModel.Resources.Core

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IObservableMap
import typings.winrt.Windows.Foundation.Collections.IVectorView
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

