package typings.winrt.Windows.ApplicationModel.Resources.Core

import typings.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContext")
@js.native
class ResourceContext () extends IResourceContext

/* static members */
@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContext")
@js.native
object ResourceContext extends js.Object {
  def createMatchingContext(result: IIterable[ResourceQualifier]): ResourceContext = js.native
}

