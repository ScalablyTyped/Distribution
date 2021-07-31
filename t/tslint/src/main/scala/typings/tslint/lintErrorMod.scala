package typings.tslint

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lintErrorMod {
  
  @JSImport("tslint/lib/verify/lintError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def errorComparator(err1: LintError, err2: LintError): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("errorComparator")(err1.asInstanceOf[js.Any], err2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def lintSyntaxError(message: String): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("lintSyntaxError")(message.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  trait LintError extends StObject {
    
    var endPos: PositionInFile
    
    var message: String
    
    var startPos: PositionInFile
  }
  object LintError {
    
    @scala.inline
    def apply(endPos: PositionInFile, message: String, startPos: PositionInFile): LintError = {
      val __obj = js.Dynamic.literal(endPos = endPos.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], startPos = startPos.asInstanceOf[js.Any])
      __obj.asInstanceOf[LintError]
    }
    
    @scala.inline
    implicit class LintErrorMutableBuilder[Self <: LintError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndPos(value: PositionInFile): Self = StObject.set(x, "endPos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPos(value: PositionInFile): Self = StObject.set(x, "startPos", value.asInstanceOf[js.Any])
    }
  }
  
  trait PositionInFile extends StObject {
    
    var col: Double
    
    var line: Double
  }
  object PositionInFile {
    
    @scala.inline
    def apply(col: Double, line: Double): PositionInFile = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositionInFile]
    }
    
    @scala.inline
    implicit class PositionInFileMutableBuilder[Self <: PositionInFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
}
