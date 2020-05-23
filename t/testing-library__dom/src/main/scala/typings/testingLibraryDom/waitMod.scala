package typings.testingLibraryDom

import typings.testingLibraryDom.anon.Interval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/dom/wait", JSImport.Namespace)
@js.native
object waitMod extends js.Object {
  def wait(callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def wait(callback: js.Function0[Unit], options: Interval): js.Promise[Unit] = js.native
}

