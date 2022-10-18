package typings.tslint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVerifyLintErrorMod {
  
  @JSImport("tslint/lib/verify/lintError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def errorComparator(err1: LintError, err2: LintError): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("errorComparator")(err1.asInstanceOf[js.Any], err2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def lintSyntaxError(message: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("lintSyntaxError")(message.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  trait LintError extends StObject {
    
    var endPos: PositionInFile
    
    var message: String
    
    var startPos: PositionInFile
  }
  object LintError {
    
    inline def apply(endPos: PositionInFile, message: String, startPos: PositionInFile): LintError = {
      val __obj = js.Dynamic.literal(endPos = endPos.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], startPos = startPos.asInstanceOf[js.Any])
      __obj.asInstanceOf[LintError]
    }
    
    extension [Self <: LintError](x: Self) {
      
      inline def setEndPos(value: PositionInFile): Self = StObject.set(x, "endPos", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStartPos(value: PositionInFile): Self = StObject.set(x, "startPos", value.asInstanceOf[js.Any])
    }
  }
  
  trait PositionInFile extends StObject {
    
    var col: Double
    
    var line: Double
  }
  object PositionInFile {
    
    inline def apply(col: Double, line: Double): PositionInFile = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositionInFile]
    }
    
    extension [Self <: PositionInFile](x: Self) {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
}
