package typings.winrt.WindowsNs.WebNs.SyndicationNs

import typings.winrt.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISyndicationLinkFactory extends js.Object {
  def createSyndicationLink(uri: Uri): SyndicationLink = js.native
  def createSyndicationLink(uri: Uri, relationship: String, title: String, mediaType: String, length: Double): SyndicationLink = js.native
}

