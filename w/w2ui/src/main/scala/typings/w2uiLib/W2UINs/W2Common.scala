package typings
package w2uiLib.W2UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait W2Common extends js.Object {
  var box: stdLib.HTMLElement = js.native
  var handlers: js.Array[js.Function] = js.native
  var name: java.lang.String = js.native
  var style: java.lang.String = js.native
  def destroy(): scala.Unit = js.native
  def off(`type`: java.lang.String): scala.Unit = js.native
  def off(`type`: java.lang.String, handler: js.Function): scala.Unit = js.native
  def off(`type`: js.Object): scala.Unit = js.native
  def off(`type`: js.Object, handler: js.Function): scala.Unit = js.native
  def on(`type`: java.lang.String): scala.Unit = js.native
  def on(`type`: java.lang.String, handler: js.Function): scala.Unit = js.native
  def on(`type`: js.Object): scala.Unit = js.native
  def on(`type`: js.Object, handler: js.Function): scala.Unit = js.native
  def refresh(): scala.Double = js.native
  def refresh(id: java.lang.String): scala.Double = js.native
  def render(): scala.Double = js.native
  def render(box: js.Object): scala.Double = js.native
  def resize(): scala.Double = js.native
  def trigger(eventData: js.Object): js.Object = js.native
}

