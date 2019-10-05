package typings.webix.webixMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AtomRender extends js.Object {
  def render(id: String, data: js.Any, `type`: String): Unit = js.native
  def render(id: Double, data: js.Any, `type`: String): Unit = js.native
  def sync(source: js.Any, filter: WebixCallback, silent: Boolean): Unit = js.native
}

@JSImport("webix", "AtomRender")
@js.native
object AtomRender extends TopLevel[AtomRender]

