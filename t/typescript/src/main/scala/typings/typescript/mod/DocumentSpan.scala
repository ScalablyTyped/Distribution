package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentSpan extends StObject {
  
  /**
    * If DocumentSpan.textSpan is the span for name of the declaration,
    * then this is the span for relevant declaration
    */
  var contextSpan: js.UndefOr[TextSpan] = js.undefined
  
  var fileName: java.lang.String
  
  var originalContextSpan: js.UndefOr[TextSpan] = js.undefined
  
  var originalFileName: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * If the span represents a location that was remapped (e.g. via a .d.ts.map file),
    * then the original filename and span will be specified here
    */
  var originalTextSpan: js.UndefOr[TextSpan] = js.undefined
  
  var textSpan: TextSpan
}
object DocumentSpan {
  
  @scala.inline
  def apply(fileName: java.lang.String, textSpan: TextSpan): DocumentSpan = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSpan]
  }
  
  @scala.inline
  implicit class DocumentSpanMutableBuilder[Self <: DocumentSpan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextSpan(value: TextSpan): Self = StObject.set(x, "contextSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextSpanUndefined: Self = StObject.set(x, "contextSpan", js.undefined)
    
    @scala.inline
    def setFileName(value: java.lang.String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalContextSpan(value: TextSpan): Self = StObject.set(x, "originalContextSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalContextSpanUndefined: Self = StObject.set(x, "originalContextSpan", js.undefined)
    
    @scala.inline
    def setOriginalFileName(value: java.lang.String): Self = StObject.set(x, "originalFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalFileNameUndefined: Self = StObject.set(x, "originalFileName", js.undefined)
    
    @scala.inline
    def setOriginalTextSpan(value: TextSpan): Self = StObject.set(x, "originalTextSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalTextSpanUndefined: Self = StObject.set(x, "originalTextSpan", js.undefined)
    
    @scala.inline
    def setTextSpan(value: TextSpan): Self = StObject.set(x, "textSpan", value.asInstanceOf[js.Any])
  }
}
