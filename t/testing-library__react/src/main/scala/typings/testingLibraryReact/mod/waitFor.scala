package typings.testingLibraryReact.mod

import typings.testingLibraryDom.waitForMod.waitForOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@testing-library/react", "waitFor")
@js.native
object waitFor extends js.Object {
  
  def apply[T](callback: js.Function0[T | js.Promise[T]]): js.Promise[T] = js.native
  def apply[T](callback: js.Function0[T | js.Promise[T]], options: waitForOptions): js.Promise[T] = js.native
}
