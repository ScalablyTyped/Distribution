package typings.webix.webixMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseBind extends js.Object {
  def bind(target: js.Any): Unit = js.native
  def bind(target: js.Any, rule: WebixCallback): Unit = js.native
  def bind(target: js.Any, rule: WebixCallback, format: String): Unit = js.native
  def unbind(): Unit = js.native
}

@JSImport("webix", "BaseBind")
@js.native
object BaseBind extends TopLevel[BaseBind]

