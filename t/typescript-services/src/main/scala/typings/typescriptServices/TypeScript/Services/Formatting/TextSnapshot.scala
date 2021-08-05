package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.TextSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextSnapshot
  extends StObject
     with ITextSnapshot {
  
  /* private */ def getLineFromLineNumberWorker(lineNumber: js.Any): js.Any
  
  /* private */ var lines: js.Any
  
  /* private */ var snapshot: js.Any
}
object TextSnapshot {
  
  inline def apply(
    getLineFromLineNumber: Double => ITextSnapshotLine,
    getLineFromLineNumberWorker: js.Any => js.Any,
    getLineFromPosition: Double => ITextSnapshotLine,
    getLineNumberFromPosition: Double => Double,
    getText: TextSpan => String,
    lines: js.Any,
    snapshot: js.Any
  ): TextSnapshot = {
    val __obj = js.Dynamic.literal(getLineFromLineNumber = js.Any.fromFunction1(getLineFromLineNumber), getLineFromLineNumberWorker = js.Any.fromFunction1(getLineFromLineNumberWorker), getLineFromPosition = js.Any.fromFunction1(getLineFromPosition), getLineNumberFromPosition = js.Any.fromFunction1(getLineNumberFromPosition), getText = js.Any.fromFunction1(getText), lines = lines.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSnapshot]
  }
  
  extension [Self <: TextSnapshot](x: Self) {
    
    inline def setGetLineFromLineNumberWorker(value: js.Any => js.Any): Self = StObject.set(x, "getLineFromLineNumberWorker", js.Any.fromFunction1(value))
    
    inline def setLines(value: js.Any): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setSnapshot(value: js.Any): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
  }
}
