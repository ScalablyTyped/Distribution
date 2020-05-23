package typings.testingLibraryReact.mod

import typings.testingLibraryDom.anon.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/react", "waitFor")
@js.native
object waitFor extends js.Object {
  def apply[T](callback: js.Function0[T]): js.Promise[T] = js.native
  def apply[T](callback: js.Function0[T], options: Container): js.Promise[T] = js.native
}

