package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait clipbuffer extends js.Object {
  def destructor(): Unit = js.native
  def focus(): Unit = js.native
  def init(): Unit = js.native
  def set(text: String): Unit = js.native
}

@JSImport("webix", "clipbuffer")
@js.native
object clipbuffer
  extends TopLevel[typings.webix.webix.clipbuffer]

