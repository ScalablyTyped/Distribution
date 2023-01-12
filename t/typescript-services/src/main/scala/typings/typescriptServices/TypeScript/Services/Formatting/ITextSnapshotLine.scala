package typings.typescriptServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextSnapshotLine extends StObject {
  
  def end(): SnapshotPoint
  
  def endIncludingLineBreak(): SnapshotPoint
  
  def endIncludingLineBreakPosition(): Double
  
  def endPosition(): Double
  
  def getText(): String
  
  def length(): Double
  
  def lineNumber(): Double
  
  def snapshot(): ITextSnapshot
  
  def start(): SnapshotPoint
  
  def startPosition(): Double
}
object ITextSnapshotLine {
  
  inline def apply(
    end: () => SnapshotPoint,
    endIncludingLineBreak: () => SnapshotPoint,
    endIncludingLineBreakPosition: () => Double,
    endPosition: () => Double,
    getText: () => String,
    length: () => Double,
    lineNumber: () => Double,
    snapshot: () => ITextSnapshot,
    start: () => SnapshotPoint,
    startPosition: () => Double
  ): ITextSnapshotLine = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), endIncludingLineBreak = js.Any.fromFunction0(endIncludingLineBreak), endIncludingLineBreakPosition = js.Any.fromFunction0(endIncludingLineBreakPosition), endPosition = js.Any.fromFunction0(endPosition), getText = js.Any.fromFunction0(getText), length = js.Any.fromFunction0(length), lineNumber = js.Any.fromFunction0(lineNumber), snapshot = js.Any.fromFunction0(snapshot), start = js.Any.fromFunction0(start), startPosition = js.Any.fromFunction0(startPosition))
    __obj.asInstanceOf[ITextSnapshotLine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITextSnapshotLine] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: () => SnapshotPoint): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    inline def setEndIncludingLineBreak(value: () => SnapshotPoint): Self = StObject.set(x, "endIncludingLineBreak", js.Any.fromFunction0(value))
    
    inline def setEndIncludingLineBreakPosition(value: () => Double): Self = StObject.set(x, "endIncludingLineBreakPosition", js.Any.fromFunction0(value))
    
    inline def setEndPosition(value: () => Double): Self = StObject.set(x, "endPosition", js.Any.fromFunction0(value))
    
    inline def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    inline def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
    
    inline def setLineNumber(value: () => Double): Self = StObject.set(x, "lineNumber", js.Any.fromFunction0(value))
    
    inline def setSnapshot(value: () => ITextSnapshot): Self = StObject.set(x, "snapshot", js.Any.fromFunction0(value))
    
    inline def setStart(value: () => SnapshotPoint): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def setStartPosition(value: () => Double): Self = StObject.set(x, "startPosition", js.Any.fromFunction0(value))
  }
}
