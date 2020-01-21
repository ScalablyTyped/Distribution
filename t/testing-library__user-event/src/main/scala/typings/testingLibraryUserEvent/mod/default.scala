package typings.testingLibraryUserEvent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/user-event", JSImport.Default)
@js.native
object default extends js.Object {
  def click(element: TargetElement): Unit = js.native
  def dblClick(element: TargetElement): Unit = js.native
  def selectOptions(element: TargetElement, values: String): Unit = js.native
  def selectOptions(element: TargetElement, values: js.Array[String]): Unit = js.native
  def `type`(element: TargetElement, text: String): js.Promise[Unit] = js.native
  def `type`(element: TargetElement, text: String, userOpts: UserOptions): js.Promise[Unit] = js.native
}

