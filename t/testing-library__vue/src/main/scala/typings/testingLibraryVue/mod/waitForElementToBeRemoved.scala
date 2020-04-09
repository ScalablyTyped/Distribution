package typings.testingLibraryVue.mod

import typings.testingLibraryDom.AnonMutationObserverOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/vue", "waitForElementToBeRemoved")
@js.native
object waitForElementToBeRemoved extends js.Object {
  def apply[T](callback: T): js.Promise[T] = js.native
  def apply[T](callback: T, options: AnonMutationObserverOptions): js.Promise[T] = js.native
  def apply[T](callback: js.Function0[T]): js.Promise[T] = js.native
  def apply[T](callback: js.Function0[T], options: AnonMutationObserverOptions): js.Promise[T] = js.native
}

