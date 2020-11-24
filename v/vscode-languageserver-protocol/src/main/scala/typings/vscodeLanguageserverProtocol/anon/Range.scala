package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentContentChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Range extends TextDocumentContentChangeEvent {
  
  /**
    * The range of the document that changed.
    */
  var range: typings.vscodeLanguageserverTypes.mod.Range = js.native
  
  /**
    * The optional length of the range that got replaced.
    *
    * @deprecated use range instead.
    */
  var rangeLength: js.UndefOr[Double] = js.native
  
  /**
    * The new text for the provided range.
    */
  var text: String = js.native
}
object Range {
  
  @scala.inline
  def apply(range: typings.vscodeLanguageserverTypes.mod.Range, text: String): Range = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  @scala.inline
  implicit class RangeOps[Self <: Range] (val x: Self) extends AnyVal {
    
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
    def setRange(value: typings.vscodeLanguageserverTypes.mod.Range): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeLength(value: Double): Self = this.set("rangeLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeLength: Self = this.set("rangeLength", js.undefined)
  }
}
