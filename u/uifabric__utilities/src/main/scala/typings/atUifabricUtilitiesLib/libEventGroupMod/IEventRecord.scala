package typings
package atUifabricUtilitiesLib.libEventGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventRecord extends js.Object {
  var elementCallback: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.native
  var eventName: java.lang.String = js.native
  var objectCallback: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], scala.Unit]] = js.native
  var options: js.UndefOr[scala.Boolean | stdLib.AddEventListenerOptions] = js.native
  var parent: js.Any = js.native
  var target: js.Any = js.native
  def callback(): scala.Unit = js.native
  def callback(args: js.Any): scala.Unit = js.native
}

