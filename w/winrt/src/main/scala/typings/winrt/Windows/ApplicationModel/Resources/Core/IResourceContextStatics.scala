package typings.winrt.Windows.ApplicationModel.Resources.Core

import typings.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResourceContextStatics extends js.Object {
  def createMatchingContext(result: IIterable[ResourceQualifier]): ResourceContext = js.native
}

object IResourceContextStatics {
  @scala.inline
  def apply(createMatchingContext: IIterable[ResourceQualifier] => ResourceContext): IResourceContextStatics = {
    val __obj = js.Dynamic.literal(createMatchingContext = js.Any.fromFunction1(createMatchingContext))
    __obj.asInstanceOf[IResourceContextStatics]
  }
  @scala.inline
  implicit class IResourceContextStaticsOps[Self <: IResourceContextStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateMatchingContext(value: IIterable[ResourceQualifier] => ResourceContext): Self = this.set("createMatchingContext", js.Any.fromFunction1(value))
  }
  
}

