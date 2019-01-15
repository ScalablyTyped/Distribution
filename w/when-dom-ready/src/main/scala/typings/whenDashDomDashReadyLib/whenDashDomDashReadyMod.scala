package typings
package whenDashDomDashReadyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("when-dom-ready", JSImport.Namespace)
@js.native
object whenDashDomDashReadyMod extends js.Object {
  def apply(): js.Promise[scala.Unit] = js.native
  def apply(callback: js.Function0[scala.Unit]): js.Promise[scala.Unit] = js.native
  def apply(callback: js.Function0[scala.Unit], document: stdLib.EventTarget): js.Promise[scala.Unit] = js.native
  def apply(document: stdLib.EventTarget): js.Promise[scala.Unit] = js.native
  def resume[T](): js.Function1[/* value */ T, js.Promise[T]] = js.native
  def resume[T](document: stdLib.EventTarget): js.Function1[/* value */ T, js.Promise[T]] = js.native
}

