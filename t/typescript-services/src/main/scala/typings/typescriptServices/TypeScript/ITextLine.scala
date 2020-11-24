package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextLine extends js.Object {
  
  def end(): Double = js.native
  
  def endIncludingLineBreak(): Double = js.native
  
  def extent(): TextSpan = js.native
  
  def extentIncludingLineBreak(): TextSpan = js.native
  
  def lineNumber(): Double = js.native
  
  def start(): Double = js.native
}
object ITextLine {
  
  @scala.inline
  def apply(
    end: () => Double,
    endIncludingLineBreak: () => Double,
    extent: () => TextSpan,
    extentIncludingLineBreak: () => TextSpan,
    lineNumber: () => Double,
    start: () => Double
  ): ITextLine = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), endIncludingLineBreak = js.Any.fromFunction0(endIncludingLineBreak), extent = js.Any.fromFunction0(extent), extentIncludingLineBreak = js.Any.fromFunction0(extentIncludingLineBreak), lineNumber = js.Any.fromFunction0(lineNumber), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[ITextLine]
  }
  
  @scala.inline
  implicit class ITextLineOps[Self <: ITextLine] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: () => Double): Self = this.set("end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndIncludingLineBreak(value: () => Double): Self = this.set("endIncludingLineBreak", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExtent(value: () => TextSpan): Self = this.set("extent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExtentIncludingLineBreak(value: () => TextSpan): Self = this.set("extentIncludingLineBreak", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLineNumber(value: () => Double): Self = this.set("lineNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: () => Double): Self = this.set("start", js.Any.fromFunction0(value))
  }
}
