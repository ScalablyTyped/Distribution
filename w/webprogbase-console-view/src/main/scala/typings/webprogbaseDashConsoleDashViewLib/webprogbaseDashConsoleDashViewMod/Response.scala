package typings
package webprogbaseDashConsoleDashViewLib.webprogbaseDashConsoleDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webprogbase-console-view", "Response")
@js.native
class Response protected () extends js.Object {
  def redirect(toState: java.lang.String): scala.Unit = js.native
  def redirect(toState: java.lang.String, data: BasicObject[_]): scala.Unit = js.native
  def send(text: java.lang.String): scala.Unit = js.native
  def send(text: java.lang.String, statesOrForm: InputForm): scala.Unit = js.native
  def send(text: java.lang.String, statesOrForm: StateLinks): scala.Unit = js.native
}

