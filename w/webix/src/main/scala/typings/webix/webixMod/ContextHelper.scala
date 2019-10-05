package typings.webix.webixMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextHelper extends js.Object {
  def attachTo(view: js.Any): Unit
  def getContext(): js.Any
  def setContext(context: js.Any): Unit
}

@JSImport("webix", "ContextHelper")
@js.native
object ContextHelper extends TopLevel[ContextHelper]

