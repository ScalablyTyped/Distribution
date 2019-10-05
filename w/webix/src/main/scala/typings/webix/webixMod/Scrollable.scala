package typings.webix.webixMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scrollable extends js.Object {
  def getScrollState(): js.Any
  def scrollTo(x: Double, y: Double): Unit
}

@JSImport("webix", "Scrollable")
@js.native
object Scrollable extends TopLevel[Scrollable]

