package typings.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base event for class Titanium.UI.iOS.PreviewContext
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait PreviewContextBaseEvent extends js.Object {
  /**
    * Source object that fired the event.
    */
  var source: PreviewContext = js.native
}

object PreviewContextBaseEvent {
  @scala.inline
  def apply(source: PreviewContext): PreviewContextBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewContextBaseEvent]
  }
  @scala.inline
  implicit class PreviewContextBaseEventOps[Self <: PreviewContextBaseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSource(value: PreviewContext): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

