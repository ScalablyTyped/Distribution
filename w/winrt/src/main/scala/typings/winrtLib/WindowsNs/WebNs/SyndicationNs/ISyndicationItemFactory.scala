package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationItemFactory extends js.Object {
  def createSyndicationItem(title: java.lang.String, content: SyndicationContent, uri: winrtLib.WindowsNs.FoundationNs.Uri): SyndicationItem
}

object ISyndicationItemFactory {
  @scala.inline
  def apply(
    createSyndicationItem: js.Function3[
      java.lang.String, 
      SyndicationContent, 
      winrtLib.WindowsNs.FoundationNs.Uri, 
      SyndicationItem
    ]
  ): ISyndicationItemFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createSyndicationItem")(createSyndicationItem)
    __obj.asInstanceOf[ISyndicationItemFactory]
  }
}

