package typings.webix.webix

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait history extends js.Object {
  def push(view: String, url: String, value: js.Any): Unit
  def track(view: String, url: String): Unit
}

@JSGlobal("webix.history")
@js.native
object history extends TopLevel[history]

