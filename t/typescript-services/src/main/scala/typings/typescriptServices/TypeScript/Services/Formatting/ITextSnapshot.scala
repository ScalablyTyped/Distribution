package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.TextSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextSnapshot extends StObject {
  
  def getLineFromLineNumber(lineNumber: Double): ITextSnapshotLine
  
  def getLineFromPosition(position: Double): ITextSnapshotLine
  
  def getLineNumberFromPosition(position: Double): Double
  
  def getText(span: TextSpan): String
}
object ITextSnapshot {
  
  inline def apply(
    getLineFromLineNumber: Double => ITextSnapshotLine,
    getLineFromPosition: Double => ITextSnapshotLine,
    getLineNumberFromPosition: Double => Double,
    getText: TextSpan => String
  ): ITextSnapshot = {
    val __obj = js.Dynamic.literal(getLineFromLineNumber = js.Any.fromFunction1(getLineFromLineNumber), getLineFromPosition = js.Any.fromFunction1(getLineFromPosition), getLineNumberFromPosition = js.Any.fromFunction1(getLineNumberFromPosition), getText = js.Any.fromFunction1(getText))
    __obj.asInstanceOf[ITextSnapshot]
  }
  
  extension [Self <: ITextSnapshot](x: Self) {
    
    inline def setGetLineFromLineNumber(value: Double => ITextSnapshotLine): Self = StObject.set(x, "getLineFromLineNumber", js.Any.fromFunction1(value))
    
    inline def setGetLineFromPosition(value: Double => ITextSnapshotLine): Self = StObject.set(x, "getLineFromPosition", js.Any.fromFunction1(value))
    
    inline def setGetLineNumberFromPosition(value: Double => Double): Self = StObject.set(x, "getLineNumberFromPosition", js.Any.fromFunction1(value))
    
    inline def setGetText(value: TextSpan => String): Self = StObject.set(x, "getText", js.Any.fromFunction1(value))
  }
}
