package typings.textBuffer.mod.global.TextBuffer.Events

import typings.textBuffer.mod.global.TextBuffer.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayMarkerChanged extends js.Object {
  
  /** Boolean indicating whether the marker had a tail before the change. */
  var hadTail: Boolean = js.native
  
  /** Boolean indicating whether the marker now has a tail */
  var hasTail: Boolean = js.native
  
  /** Boolean indicating whether the marker is now valid. */
  var isValid: Boolean = js.native
  
  /** Point representing the new head buffer position. */
  var newHeadBufferPosition: Point = js.native
  
  /** Point representing the new head screen position. */
  var newHeadScreenPosition: Point = js.native
  
  /**
    *  Object containing the marker's custom properties after the change.
    *  @deprecated
    */
  var newProperties: js.Object = js.native
  
  /** Point representing the new tail buffer position. */
  var newTailBufferPosition: Point = js.native
  
  /** Point representing the new tail screen position. */
  var newTailScreenPosition: Point = js.native
  
  /** Point representing the former head buffer position. */
  var oldHeadBufferPosition: Point = js.native
  
  /** Point representing the former head screen position. */
  var oldHeadScreenPosition: Point = js.native
  
  /**
    *  Object containing the marker's custom properties before the change.
    *  @deprecated
    */
  var oldProperties: js.Object = js.native
  
  // Point representing the former tail buffer position. */
  var oldTailBufferPosition: Point = js.native
  
  /** Point representing the former tail screen position. */
  var oldTailScreenPosition: Point = js.native
  
  /**
    *  Boolean indicating whether this change was caused by a textual change to the
    *  buffer or whether the marker was manipulated directly via its public API.
    */
  var textChanged: Boolean = js.native
  
  /** Boolean indicating whether the marker was valid before the change. */
  var wasValid: Boolean = js.native
}
object DisplayMarkerChanged {
  
  @scala.inline
  def apply(
    hadTail: Boolean,
    hasTail: Boolean,
    isValid: Boolean,
    newHeadBufferPosition: Point,
    newHeadScreenPosition: Point,
    newProperties: js.Object,
    newTailBufferPosition: Point,
    newTailScreenPosition: Point,
    oldHeadBufferPosition: Point,
    oldHeadScreenPosition: Point,
    oldProperties: js.Object,
    oldTailBufferPosition: Point,
    oldTailScreenPosition: Point,
    textChanged: Boolean,
    wasValid: Boolean
  ): DisplayMarkerChanged = {
    val __obj = js.Dynamic.literal(hadTail = hadTail.asInstanceOf[js.Any], hasTail = hasTail.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], newHeadBufferPosition = newHeadBufferPosition.asInstanceOf[js.Any], newHeadScreenPosition = newHeadScreenPosition.asInstanceOf[js.Any], newProperties = newProperties.asInstanceOf[js.Any], newTailBufferPosition = newTailBufferPosition.asInstanceOf[js.Any], newTailScreenPosition = newTailScreenPosition.asInstanceOf[js.Any], oldHeadBufferPosition = oldHeadBufferPosition.asInstanceOf[js.Any], oldHeadScreenPosition = oldHeadScreenPosition.asInstanceOf[js.Any], oldProperties = oldProperties.asInstanceOf[js.Any], oldTailBufferPosition = oldTailBufferPosition.asInstanceOf[js.Any], oldTailScreenPosition = oldTailScreenPosition.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any], wasValid = wasValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayMarkerChanged]
  }
  
  @scala.inline
  implicit class DisplayMarkerChangedOps[Self <: DisplayMarkerChanged] (val x: Self) extends AnyVal {
    
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
    def setHadTail(value: Boolean): Self = this.set("hadTail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasTail(value: Boolean): Self = this.set("hasTail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewHeadBufferPosition(value: Point): Self = this.set("newHeadBufferPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewHeadScreenPosition(value: Point): Self = this.set("newHeadScreenPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewProperties(value: js.Object): Self = this.set("newProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewTailBufferPosition(value: Point): Self = this.set("newTailBufferPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewTailScreenPosition(value: Point): Self = this.set("newTailScreenPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldHeadBufferPosition(value: Point): Self = this.set("oldHeadBufferPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldHeadScreenPosition(value: Point): Self = this.set("oldHeadScreenPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldProperties(value: js.Object): Self = this.set("oldProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldTailBufferPosition(value: Point): Self = this.set("oldTailBufferPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldTailScreenPosition(value: Point): Self = this.set("oldTailScreenPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextChanged(value: Boolean): Self = this.set("textChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasValid(value: Boolean): Self = this.set("wasValid", value.asInstanceOf[js.Any])
  }
}
