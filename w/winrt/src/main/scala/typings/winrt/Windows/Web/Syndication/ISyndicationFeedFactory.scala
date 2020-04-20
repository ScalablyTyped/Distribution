package typings.winrt.Windows.Web.Syndication

import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationFeedFactory extends js.Object {
  def createSyndicationFeed(title: String, subtitle: String, uri: Uri): SyndicationFeed
}

object ISyndicationFeedFactory {
  @scala.inline
  def apply(createSyndicationFeed: (String, String, Uri) => SyndicationFeed): ISyndicationFeedFactory = {
    val __obj = js.Dynamic.literal(createSyndicationFeed = js.Any.fromFunction3(createSyndicationFeed))
    __obj.asInstanceOf[ISyndicationFeedFactory]
  }
}

