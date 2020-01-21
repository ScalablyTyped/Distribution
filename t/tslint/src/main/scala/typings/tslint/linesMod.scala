package typings.tslint

import typings.tslint.tslintStrings.Tildenil
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/verify/lines", JSImport.Namespace)
@js.native
object linesMod extends js.Object {
  @js.native
  class CodeLine protected () extends Line {
    def this(contents: String) = this()
    var contents: String = js.native
  }
  
  @js.native
  class EndErrorLine protected () extends ErrorLine {
    def this(startCol: Double, endCol: Double, message: String) = this()
    var endCol: Double = js.native
    var message: String = js.native
  }
  
  @js.native
  class ErrorLine protected () extends Line {
    def this(startCol: Double) = this()
    var startCol: Double = js.native
  }
  
  @js.native
  class Line () extends js.Object
  
  @js.native
  class MessageSubstitutionLine protected () extends Line {
    def this(key: String, message: String) = this()
    var key: String = js.native
    var message: String = js.native
  }
  
  @js.native
  class MultilineErrorLine protected () extends ErrorLine {
    def this(startCol: Double) = this()
  }
  
  val ZERO_LENGTH_ERROR: Tildenil = js.native
  def parseLine(text: String): Line = js.native
  def printLine(fileName: String, line: Line): js.UndefOr[String] = js.native
  def printLine(fileName: String, line: Line, code: String): js.UndefOr[String] = js.native
}

