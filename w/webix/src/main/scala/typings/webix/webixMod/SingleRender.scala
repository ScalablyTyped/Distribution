package typings.webix.webixMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleRender extends js.Object {
  var `type`: StringDictionary[js.Any] = js.native
  def customize(obj: js.Any): Unit = js.native
  def render(id: String, data: js.Any, `type`: String): Unit = js.native
  def render(id: Double, data: js.Any, `type`: String): Unit = js.native
  def sync(source: js.Any, filter: WebixCallback, silent: Boolean): Unit = js.native
}

@JSImport("webix", "SingleRender")
@js.native
object SingleRender extends TopLevel[SingleRender]

