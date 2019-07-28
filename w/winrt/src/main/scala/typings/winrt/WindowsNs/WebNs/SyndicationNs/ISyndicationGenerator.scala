package typings.winrt.WindowsNs.WebNs.SyndicationNs

import typings.winrt.WindowsNs.FoundationNs.Uri
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

