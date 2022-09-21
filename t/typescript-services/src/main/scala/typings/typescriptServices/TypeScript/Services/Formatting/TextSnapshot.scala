package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.TextSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextSnapshot
  extends StObject
     with ITextSnapshot {
  
  /* private */ def getLineFromLineNumberWorker(lineNumber: Any): Any
  
  /* private */ var lines: Any
  
  /* private */ var snapshot: Any
}
object TextSnapshot {
  
  inline def apply(
    getLineFromLineNumber: Double => ITextSnapshotLine,
    getLineFromLineNumberWorker: Any => Any,
    getLineFromPosition: Double => ITextSnapshotLine,
    getLineNumberFromPosition: Double => Double,
    getText: TextSpan => String,
    lines: Any,
    snapshot: Any
  ): TextSnapshot = {
    val __obj = js.Dynamic.literal(getLineFromLineNumber = js.Any.fromFunction1(getLineFromLineNumber), getLineFromLineNumberWorker = js.Any.fromFunction1(getLineFromLineNumberWorker), getLineFromPosition = js.Any.fromFunction1(getLineFromPosition), getLineNumberFromPosition = js.Any.fromFunction1(getLineNumberFromPosition), getText = js.Any.fromFunction1(getText), lines = lines.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSnapshot]
  }
  
  extension [Self <: TextSnapshot](x: Self) {
    
    inline def setGetLineFromLineNumberWorker(value: Any => Any): Self = StObject.set(x, "getLineFromLineNumberWorker", js.Any.fromFunction1(value))
    
    inline def setLines(value: Any): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setSnapshot(value: Any): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
  }
}
