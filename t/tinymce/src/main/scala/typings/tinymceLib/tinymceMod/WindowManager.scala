package typings
package tinymceLib.tinymceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowManager extends js.Object {
  def alert(message: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def alert(message: java.lang.String, callback: js.Function0[scala.Unit], scope: js.Object): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def confirm(message: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def confirm(message: java.lang.String, callback: js.Function0[scala.Unit], scope: js.Object): scala.Unit = js.native
  def getParams(): js.Object = js.native
  def getWindows(): js.Array[stdLib.Window] = js.native
  def open(args: js.Object, params: js.Object): scala.Unit = js.native
  def setParams(params: js.Object): scala.Unit = js.native
}

