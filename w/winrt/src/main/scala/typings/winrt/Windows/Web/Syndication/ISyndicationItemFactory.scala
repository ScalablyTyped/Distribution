package typings.winrt.Windows.Web.Syndication

import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISyndicationItemFactory extends js.Object {
  def createSyndicationItem(title: String, content: SyndicationContent, uri: Uri): SyndicationItem = js.native
}

object ISyndicationItemFactory {
  @scala.inline
  def apply(createSyndicationItem: (String, SyndicationContent, Uri) => SyndicationItem): ISyndicationItemFactory = {
    val __obj = js.Dynamic.literal(createSyndicationItem = js.Any.fromFunction3(createSyndicationItem))
    __obj.asInstanceOf[ISyndicationItemFactory]
  }
  @scala.inline
  implicit class ISyndicationItemFactoryOps[Self <: ISyndicationItemFactory] (val x: Self) extends AnyVal {
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
    def setCreateSyndicationItem(value: (String, SyndicationContent, Uri) => SyndicationItem): Self = this.set("createSyndicationItem", js.Any.fromFunction3(value))
  }
  
}

