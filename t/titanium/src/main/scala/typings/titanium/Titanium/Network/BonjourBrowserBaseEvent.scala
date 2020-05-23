package typings.titanium.Titanium.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base event for class Titanium.Network.BonjourBrowser
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait BonjourBrowserBaseEvent extends js.Object {
  /**
    * Source object that fired the event.
    */
  var source: BonjourBrowser
}

object BonjourBrowserBaseEvent {
  @scala.inline
  def apply(source: BonjourBrowser): BonjourBrowserBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[BonjourBrowserBaseEvent]
  }
}

