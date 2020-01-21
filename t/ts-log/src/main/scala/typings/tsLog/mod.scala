package typings.tsLog

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-log", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Logger
    extends /* x */ StringDictionary[js.Any] {
    def debug(): Unit = js.native
    def debug(message: js.Any, optionalParams: js.Any*): Unit = js.native
    def error(): Unit = js.native
    def error(message: js.Any, optionalParams: js.Any*): Unit = js.native
    def info(): Unit = js.native
    def info(message: js.Any, optionalParams: js.Any*): Unit = js.native
    def trace(): Unit = js.native
    def trace(message: js.Any, optionalParams: js.Any*): Unit = js.native
    def warn(): Unit = js.native
    def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
  }
  
  val dummyLogger: Logger = js.native
}

