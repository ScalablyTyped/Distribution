package typings.webix.webix

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait clipbuffer extends js.Object {
  def destructor(): Unit
  def focus(): Unit
  def init(): Unit
  def set(text: String): Unit
}

@JSGlobal("webix.clipbuffer")
@js.native
object clipbuffer extends TopLevel[clipbuffer]

