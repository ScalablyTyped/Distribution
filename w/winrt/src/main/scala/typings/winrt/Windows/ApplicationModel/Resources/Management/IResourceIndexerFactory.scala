package typings.winrt.Windows.ApplicationModel.Resources.Management

import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResourceIndexerFactory extends js.Object {
  def createResourceIndexer(projectRoot: Uri): ResourceIndexer = js.native
}

object IResourceIndexerFactory {
  @scala.inline
  def apply(createResourceIndexer: Uri => ResourceIndexer): IResourceIndexerFactory = {
    val __obj = js.Dynamic.literal(createResourceIndexer = js.Any.fromFunction1(createResourceIndexer))
    __obj.asInstanceOf[IResourceIndexerFactory]
  }
  @scala.inline
  implicit class IResourceIndexerFactoryOps[Self <: IResourceIndexerFactory] (val x: Self) extends AnyVal {
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
    def setCreateResourceIndexer(value: Uri => ResourceIndexer): Self = this.set("createResourceIndexer", js.Any.fromFunction1(value))
  }
  
}

