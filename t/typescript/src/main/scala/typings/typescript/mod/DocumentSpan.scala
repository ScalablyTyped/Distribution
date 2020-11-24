package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentSpan extends js.Object {
  
  /**
    * If DocumentSpan.textSpan is the span for name of the declaration,
    * then this is the span for relevant declaration
    */
  var contextSpan: js.UndefOr[TextSpan] = js.native
  
  var fileName: java.lang.String = js.native
  
  var originalContextSpan: js.UndefOr[TextSpan] = js.native
  
  var originalFileName: js.UndefOr[java.lang.String] = js.native
  
  /**
    * If the span represents a location that was remapped (e.g. via a .d.ts.map file),
    * then the original filename and span will be specified here
    */
  var originalTextSpan: js.UndefOr[TextSpan] = js.native
  
  var textSpan: TextSpan = js.native
}
object DocumentSpan {
  
  @scala.inline
  def apply(fileName: java.lang.String, textSpan: TextSpan): DocumentSpan = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSpan]
  }
  
  @scala.inline
  implicit class DocumentSpanOps[Self <: DocumentSpan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFileName(value: java.lang.String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextSpan(value: TextSpan): Self = this.set("textSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextSpan(value: TextSpan): Self = this.set("contextSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextSpan: Self = this.set("contextSpan", js.undefined)
    
    @scala.inline
    def setOriginalContextSpan(value: TextSpan): Self = this.set("originalContextSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalContextSpan: Self = this.set("originalContextSpan", js.undefined)
    
    @scala.inline
    def setOriginalFileName(value: java.lang.String): Self = this.set("originalFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalFileName: Self = this.set("originalFileName", js.undefined)
    
    @scala.inline
    def setOriginalTextSpan(value: TextSpan): Self = this.set("originalTextSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalTextSpan: Self = this.set("originalTextSpan", js.undefined)
  }
}
