package typings.testingLibraryDom.waitForElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/dom/wait-for-element", "waitForElement")
@js.native
object waitForElement extends js.Object {
  def apply[T](callback: js.Function0[T]): js.Promise[T] = js.native
  def apply[T](callback: js.Function0[T], options: WaitForElementOptions): js.Promise[T] = js.native
}

