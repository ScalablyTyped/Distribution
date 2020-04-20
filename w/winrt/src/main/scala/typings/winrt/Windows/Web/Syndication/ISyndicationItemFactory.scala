package typings.winrt.Windows.Web.Syndication

import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationItemFactory extends js.Object {
  def createSyndicationItem(title: String, content: SyndicationContent, uri: Uri): SyndicationItem
}

object ISyndicationItemFactory {
  @scala.inline
  def apply(createSyndicationItem: (String, SyndicationContent, Uri) => SyndicationItem): ISyndicationItemFactory = {
    val __obj = js.Dynamic.literal(createSyndicationItem = js.Any.fromFunction3(createSyndicationItem))
    __obj.asInstanceOf[ISyndicationItemFactory]
  }
}

