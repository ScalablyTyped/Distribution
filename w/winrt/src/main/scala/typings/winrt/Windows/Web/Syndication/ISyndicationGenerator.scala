package typings.winrt.Windows.Web.Syndication

import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationGenerator extends js.Object {
  var text: String
  var uri: Uri
  var version: String
}

object ISyndicationGenerator {
  @scala.inline
  def apply(text: String, uri: Uri, version: String): ISyndicationGenerator = {
    val __obj = js.Dynamic.literal(text = text, uri = uri, version = version)
  
    __obj.asInstanceOf[ISyndicationGenerator]
  }
}

