package typings.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tracer extends Remote {
  /**
    * Log the given data to the trace Log
    */
  def log(message: String): Unit = js.native
  def log(message: String, verbose: String): Unit = js.native
}

