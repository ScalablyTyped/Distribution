package typings.winrt.Windows.ApplicationModel.Resources.Core

import typings.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceContextStatics extends js.Object {
  def createMatchingContext(result: IIterable[ResourceQualifier]): ResourceContext
}

object IResourceContextStatics {
  @scala.inline
  def apply(createMatchingContext: IIterable[ResourceQualifier] => ResourceContext): IResourceContextStatics = {
    val __obj = js.Dynamic.literal(createMatchingContext = js.Any.fromFunction1(createMatchingContext))
    __obj.asInstanceOf[IResourceContextStatics]
  }
}

