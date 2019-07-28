package typings.whenDashDomDashReady

import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("when-dom-ready", JSImport.Namespace)
@js.native
object whenDashDomDashReadyMod extends js.Object {
  def apply(): js.Promise[Unit] = js.native
  def apply(callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def apply(callback: js.Function0[Unit], document: EventTarget): js.Promise[Unit] = js.native
  def apply(document: EventTarget): js.Promise[Unit] = js.native
  def resume[T](): js.Function1[/* value */ T, js.Promise[T]] = js.native
  def resume[T](document: EventTarget): js.Function1[/* value */ T, js.Promise[T]] = js.native
}

