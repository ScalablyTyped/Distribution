package typings.tslint

import typings.tslint.libErrorMod.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/error", JSImport.Namespace)
@js.native
object libErrorMod extends js.Object {
  @js.native
  class Error () extends js.Object {
    def this(message: String) = this()
    var message: String = js.native
    var name: js.UndefOr[String] = js.native
    var stack: js.UndefOr[String] = js.native
  }
  
  @js.native
  class FatalError protected () extends Error {
    def this(message: String) = this()
    def this(message: String, innerError: Error) = this()
    var innerError: js.UndefOr[Error] = js.native
  }
  
  def isError(possibleError: js.Any): /* is tslint.tslint/lib/error.Error */ Boolean = js.native
  def showRuleCrashWarning(message: String, ruleName: String, fileName: String): Unit = js.native
  def showWarningOnce(message: String): Unit = js.native
  /* static members */
  @js.native
  object FatalError extends js.Object {
    var NAME: String = js.native
  }
  
}

