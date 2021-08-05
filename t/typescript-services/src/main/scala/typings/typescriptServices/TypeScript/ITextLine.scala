package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextLine extends StObject {
  
  def end(): Double
  
  def endIncludingLineBreak(): Double
  
  def extent(): TextSpan
  
  def extentIncludingLineBreak(): TextSpan
  
  def lineNumber(): Double
  
  def start(): Double
}
object ITextLine {
  
  inline def apply(
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
  
  extension [Self <: ITextLine](x: Self) {
    
    inline def setEnd(value: () => Double): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    inline def setEndIncludingLineBreak(value: () => Double): Self = StObject.set(x, "endIncludingLineBreak", js.Any.fromFunction0(value))
    
    inline def setExtent(value: () => TextSpan): Self = StObject.set(x, "extent", js.Any.fromFunction0(value))
    
    inline def setExtentIncludingLineBreak(value: () => TextSpan): Self = StObject.set(x, "extentIncludingLineBreak", js.Any.fromFunction0(value))
    
    inline def setLineNumber(value: () => Double): Self = StObject.set(x, "lineNumber", js.Any.fromFunction0(value))
    
    inline def setStart(value: () => Double): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
  }
}
