package typings.tsInvariant

import typings.node.processMod.global.NodeJS.Process
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-invariant", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class InvariantError () extends Error {
    def this(message: String) = this()
    def this(message: Double) = this()
    var framesToPop: Double = js.native
  }
  
  var process: Process = js.native
  @js.native
  object default extends js.Object {
    def apply(condition: js.Any): Unit = js.native
    def apply(condition: js.Any, message: String): Unit = js.native
    def apply(condition: js.Any, message: Double): Unit = js.native
    def error(args: js.Any*): Unit = js.native
    def warn(args: js.Any*): Unit = js.native
  }
  
  @js.native
  object invariant extends js.Object {
    def apply(condition: js.Any): Unit = js.native
    def apply(condition: js.Any, message: String): Unit = js.native
    def apply(condition: js.Any, message: Double): Unit = js.native
    def error(args: js.Any*): Unit = js.native
    def warn(args: js.Any*): Unit = js.native
  }
  
}

