package typings.webix.webix

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextHelper extends js.Object {
  def attachTo(view: js.Any): Unit
  def getContext(): js.Any
  def setContext(context: js.Any): Unit
}

@JSGlobal("webix.ContextHelper")
@js.native
object ContextHelper extends TopLevel[ContextHelper]

