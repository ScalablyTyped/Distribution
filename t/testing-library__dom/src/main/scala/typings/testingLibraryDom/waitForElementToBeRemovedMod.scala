package typings.testingLibraryDom

import typings.testingLibraryDom.waitForMod.waitForOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/dom/types/wait-for-element-to-be-removed", JSImport.Namespace)
@js.native
object waitForElementToBeRemovedMod extends js.Object {
  def waitForElementToBeRemoved[T](callback: T): js.Promise[Unit] = js.native
  def waitForElementToBeRemoved[T](callback: T, options: waitForOptions): js.Promise[Unit] = js.native
  def waitForElementToBeRemoved[T](callback: js.Function0[T]): js.Promise[Unit] = js.native
  def waitForElementToBeRemoved[T](callback: js.Function0[T], options: waitForOptions): js.Promise[Unit] = js.native
}

