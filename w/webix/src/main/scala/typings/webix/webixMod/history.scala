package typings.webix.webixMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait history extends js.Object {
  def push(view: String, url: String, value: js.Any): Unit
  def track(view: String, url: String): Unit
}

@JSImport("webix", "history")
@js.native
object history
  extends TopLevel[typings.webix.webix.history]

