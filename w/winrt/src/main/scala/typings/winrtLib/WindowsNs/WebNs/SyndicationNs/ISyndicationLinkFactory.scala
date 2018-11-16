package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISyndicationLinkFactory extends js.Object {
  def createSyndicationLink(uri: winrtLib.WindowsNs.FoundationNs.Uri): SyndicationLink = js.native
  def createSyndicationLink(
    uri: winrtLib.WindowsNs.FoundationNs.Uri,
    relationship: java.lang.String,
    title: java.lang.String,
    mediaType: java.lang.String,
    length: scala.Double
  ): SyndicationLink = js.native
}

