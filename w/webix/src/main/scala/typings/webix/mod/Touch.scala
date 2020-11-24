package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Touch extends js.Object {
  
  var config: js.Any = js.native
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  def limit(mode: Boolean): Unit = js.native
  
  def scrollTo(node: HTMLElement, x: Double, y: Double, speed: String): Unit = js.native
}
@JSImport("webix", "Touch")
@js.native
object Touch extends TopLevel[Touch]
