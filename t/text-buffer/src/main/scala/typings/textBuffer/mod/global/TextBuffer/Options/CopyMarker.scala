package typings.textBuffer.mod.global.TextBuffer.Options

import typings.textBuffer.textBufferStrings.inside
import typings.textBuffer.textBufferStrings.never
import typings.textBuffer.textBufferStrings.overlap
import typings.textBuffer.textBufferStrings.surround
import typings.textBuffer.textBufferStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyMarker extends js.Object {
  
  /**
    *  Indicates whether insertions at the start or end of the marked range should
    *  be interpreted as happening outside the marker.
    */
  var exclusive: js.UndefOr[Boolean] = js.native
  
  /** Determines the rules by which changes to the buffer invalidate the marker. */
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.native
  
  /**
    *  Custom properties to be associated with the marker.
    *  @deprecated
    */
  var properties: js.UndefOr[js.Object] = js.native
  
  /** Creates the marker in a reversed orientation. */
  var reversed: js.UndefOr[Boolean] = js.native
  
  /** Whether or not the marker should be tailed. */
  var tailed: js.UndefOr[Boolean] = js.native
}
object CopyMarker {
  
  @scala.inline
  def apply(): CopyMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyMarker]
  }
  
  @scala.inline
  implicit class CopyMarkerOps[Self <: CopyMarker] (val x: Self) extends AnyVal {
    
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
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusive: Self = this.set("exclusive", js.undefined)
    
    @scala.inline
    def setInvalidate(value: never | surround | overlap | inside | touch): Self = this.set("invalidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidate: Self = this.set("invalidate", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Object): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReversed: Self = this.set("reversed", js.undefined)
    
    @scala.inline
    def setTailed(value: Boolean): Self = this.set("tailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTailed: Self = this.set("tailed", js.undefined)
  }
}
