package typings.testingLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/dom/wait-for-element-to-be-removed", JSImport.Namespace)
@js.native
object waitForElementToBeRemovedMod extends js.Object {
  def waitForElementToBeRemoved[T](callback: T): js.Promise[T] = js.native
  def waitForElementToBeRemoved[T](callback: T, options: AnonMutationObserverOptions): js.Promise[T] = js.native
  def waitForElementToBeRemoved[T](callback: js.Function0[T]): js.Promise[T] = js.native
  def waitForElementToBeRemoved[T](callback: js.Function0[T], options: AnonMutationObserverOptions): js.Promise[T] = js.native
}

