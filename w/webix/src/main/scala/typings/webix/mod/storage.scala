package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait storage extends js.Object {
  var cookie: typings.webix.webix.cookie
  var local: typings.webix.webix.local
  var session: typings.webix.webix.session
}

@JSImport("webix", "storage")
@js.native
object storage
  extends TopLevel[typings.webix.webix.storage]

