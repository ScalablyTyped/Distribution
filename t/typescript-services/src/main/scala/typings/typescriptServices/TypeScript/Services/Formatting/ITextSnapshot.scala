package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.TextSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextSnapshot extends StObject {
  
  def getLineFromLineNumber(lineNumber: Double): ITextSnapshotLine = js.native
  
  def getLineFromPosition(position: Double): ITextSnapshotLine = js.native
  
  def getLineNumberFromPosition(position: Double): Double = js.native
  
  def getText(span: TextSpan): String = js.native
}
object ITextSnapshot {
  
  @scala.inline
  def apply(
    getLineFromLineNumber: Double => ITextSnapshotLine,
    getLineFromPosition: Double => ITextSnapshotLine,
    getLineNumberFromPosition: Double => Double,
    getText: TextSpan => String
  ): ITextSnapshot = {
    val __obj = js.Dynamic.literal(getLineFromLineNumber = js.Any.fromFunction1(getLineFromLineNumber), getLineFromPosition = js.Any.fromFunction1(getLineFromPosition), getLineNumberFromPosition = js.Any.fromFunction1(getLineNumberFromPosition), getText = js.Any.fromFunction1(getText))
    __obj.asInstanceOf[ITextSnapshot]
  }
  
  @scala.inline
  implicit class ITextSnapshotMutableBuilder[Self <: ITextSnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetLineFromLineNumber(value: Double => ITextSnapshotLine): Self = StObject.set(x, "getLineFromLineNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLineFromPosition(value: Double => ITextSnapshotLine): Self = StObject.set(x, "getLineFromPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLineNumberFromPosition(value: Double => Double): Self = StObject.set(x, "getLineNumberFromPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetText(value: TextSpan => String): Self = StObject.set(x, "getText", js.Any.fromFunction1(value))
  }
}
