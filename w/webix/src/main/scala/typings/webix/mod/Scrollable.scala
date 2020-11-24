package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scrollable extends js.Object {
  
  def getScrollState(): js.Any = js.native
  
  def scrollTo(x: Double, y: Double): Unit = js.native
}
@JSImport("webix", "Scrollable")
@js.native
object Scrollable extends TopLevel[Scrollable]
