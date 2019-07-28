package typings.winrt.WindowsNs.WebNs.SyndicationNs

import typings.winrt.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISyndicationPersonFactory extends js.Object {
  def createSyndicationPerson(name: String): SyndicationPerson = js.native
  def createSyndicationPerson(name: String, email: String, uri: Uri): SyndicationPerson = js.native
}

