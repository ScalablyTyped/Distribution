package typings.webix.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var config: StringDictionary[js.Any] = js.native
  var name: String = js.native
  def define(property: String, value: js.Any): Unit = js.native
}

@JSImport("webix", "Settings")
@js.native
object Settings extends TopLevel[Settings]

