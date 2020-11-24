package typings.vscodeJsonrpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tracer extends js.Object {
  
  def log(dataObject: js.Any): Unit = js.native
  def log(message: String): Unit = js.native
  def log(message: String, data: String): Unit = js.native
}
