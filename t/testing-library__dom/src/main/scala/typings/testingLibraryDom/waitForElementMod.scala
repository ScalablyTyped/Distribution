package typings.testingLibraryDom

import typings.testingLibraryDom.waitForMod.waitForOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/dom/types/wait-for-element", JSImport.Namespace)
@js.native
object waitForElementMod extends js.Object {
  def waitForElement[T](callback: js.Function0[T]): js.Promise[T] = js.native
  def waitForElement[T](callback: js.Function0[T], options: waitForOptions): js.Promise[T] = js.native
}

