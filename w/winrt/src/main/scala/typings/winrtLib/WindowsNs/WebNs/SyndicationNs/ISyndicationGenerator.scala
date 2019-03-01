package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationGenerator extends js.Object {
  var text: java.lang.String
  var uri: winrtLib.WindowsNs.FoundationNs.Uri
  var version: java.lang.String
}

object ISyndicationGenerator {
  @scala.inline
  def apply(text: java.lang.String, uri: winrtLib.WindowsNs.FoundationNs.Uri, version: java.lang.String): ISyndicationGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("uri")(uri)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ISyndicationGenerator]
  }
}

