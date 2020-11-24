package typings.timeago

import typings.std.Date
import typings.std.Element
import typings.timeago.Timeago.TimeagoStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends js.Object {
  
  def timeago(timestamp: String): String = js.native
  def timeago(timestamp: Double): String = js.native
  def timeago(timestamp: Date): String = js.native
  def timeago(timestamp: Element): String = js.native
  @JSName("timeago")
  var timeago_Original: TimeagoStatic = js.native
}
