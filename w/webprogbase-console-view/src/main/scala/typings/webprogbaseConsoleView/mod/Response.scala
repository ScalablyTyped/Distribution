package typings.webprogbaseConsoleView.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webprogbase-console-view", "Response")
@js.native
class Response protected () extends js.Object {
  
  def redirect(toState: String): Unit = js.native
  def redirect(toState: String, data: BasicObject[_]): Unit = js.native
  
  def send(text: String): Unit = js.native
  def send(text: String, statesOrForm: InputForm): Unit = js.native
  def send(text: String, statesOrForm: StateLinks): Unit = js.native
}
