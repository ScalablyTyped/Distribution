package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Font extends js.Object {
  
  var duration: String = js.native
  
  var font: js.UndefOr[Family] = js.native
  
  var glyph: js.UndefOr[String] = js.native
  
  var ignore_ticks: js.UndefOr[Boolean] = js.native
  
  var line: js.UndefOr[Double] = js.native
  
  var smooth: js.UndefOr[Boolean] = js.native
  
  var subscript: js.UndefOr[Boolean] = js.native
  
  var superscript: js.UndefOr[Boolean] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object Font {
  
  @scala.inline
  def apply(duration: String): Font = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  
  @scala.inline
  implicit class FontOps[Self <: Font] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: Family): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setGlyph(value: String): Self = this.set("glyph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyph: Self = this.set("glyph", js.undefined)
    
    @scala.inline
    def setIgnore_ticks(value: Boolean): Self = this.set("ignore_ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore_ticks: Self = this.set("ignore_ticks", js.undefined)
    
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setSmooth(value: Boolean): Self = this.set("smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmooth: Self = this.set("smooth", js.undefined)
    
    @scala.inline
    def setSubscript(value: Boolean): Self = this.set("subscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscript: Self = this.set("subscript", js.undefined)
    
    @scala.inline
    def setSuperscript(value: Boolean): Self = this.set("superscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuperscript: Self = this.set("superscript", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
