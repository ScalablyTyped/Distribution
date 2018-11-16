package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISyndicationContentFactory extends js.Object {
  def createSyndicationContent(sourceUri: winrtLib.WindowsNs.FoundationNs.Uri): SyndicationContent = js.native
  def createSyndicationContent(text: java.lang.String, `type`: SyndicationTextType): SyndicationContent = js.native
}

