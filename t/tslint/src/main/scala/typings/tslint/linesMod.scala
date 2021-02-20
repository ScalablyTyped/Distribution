package typings.tslint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linesMod {
  
  @JSImport("tslint/lib/verify/lines", "CodeLine")
  @js.native
  class CodeLine protected () extends Line {
    def this(contents: String) = this()
    
    var contents: String = js.native
  }
  
  @JSImport("tslint/lib/verify/lines", "EndErrorLine")
  @js.native
  class EndErrorLine protected () extends ErrorLine {
    def this(startCol: Double, endCol: Double, message: String) = this()
    
    var endCol: Double = js.native
    
    var message: String = js.native
  }
  
  @JSImport("tslint/lib/verify/lines", "ErrorLine")
  @js.native
  class ErrorLine protected () extends Line {
    def this(startCol: Double) = this()
    
    var startCol: Double = js.native
  }
  
  @JSImport("tslint/lib/verify/lines", "Line")
  @js.native
  class Line () extends StObject
  
  @JSImport("tslint/lib/verify/lines", "MessageSubstitutionLine")
  @js.native
  class MessageSubstitutionLine protected () extends Line {
    def this(key: String, message: String) = this()
    
    var key: String = js.native
    
    var message: String = js.native
  }
  
  @JSImport("tslint/lib/verify/lines", "MultilineErrorLine")
  @js.native
  class MultilineErrorLine protected () extends ErrorLine {
    def this(startCol: Double) = this()
  }
  
  @JSImport("tslint/lib/verify/lines", "ZERO_LENGTH_ERROR")
  @js.native
  val ZERO_LENGTH_ERROR: /* "~nil" */ String = js.native
  
  @JSImport("tslint/lib/verify/lines", "parseLine")
  @js.native
  def parseLine(text: String): Line = js.native
  
  @JSImport("tslint/lib/verify/lines", "printLine")
  @js.native
  def printLine(fileName: String, line: Line): js.UndefOr[String] = js.native
  @JSImport("tslint/lib/verify/lines", "printLine")
  @js.native
  def printLine(fileName: String, line: Line, code: String): js.UndefOr[String] = js.native
}
