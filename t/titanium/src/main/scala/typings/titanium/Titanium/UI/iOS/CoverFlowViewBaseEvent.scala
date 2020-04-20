package typings.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Base event for class Titanium.UI.iOS.CoverFlowView
			 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait CoverFlowViewBaseEvent extends js.Object {
  /**
  				 * Source object that fired the event.
  				 */
  var source: CoverFlowView
}

object CoverFlowViewBaseEvent {
  @scala.inline
  def apply(source: CoverFlowView): CoverFlowViewBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverFlowViewBaseEvent]
  }
}

