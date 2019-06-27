package typings
package atTestingDashLibraryUserDashEventLib.atTestingDashLibraryUserDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/user-event", JSImport.Default)
@js.native
object default extends js.Object {
  def click(element: stdLib.Element): scala.Unit = js.native
  def click(element: stdLib.Window): scala.Unit = js.native
  def dblClick(element: stdLib.Element): scala.Unit = js.native
  def dblClick(element: stdLib.Window): scala.Unit = js.native
  def selectOptions(element: stdLib.Element, values: java.lang.String): scala.Unit = js.native
  def selectOptions(element: stdLib.Element, values: js.Array[java.lang.String]): scala.Unit = js.native
  def selectOptions(element: stdLib.Window, values: java.lang.String): scala.Unit = js.native
  def selectOptions(element: stdLib.Window, values: js.Array[java.lang.String]): scala.Unit = js.native
  def `type`(element: stdLib.Element, text: java.lang.String): js.Promise[scala.Unit] = js.native
  def `type`(
    element: stdLib.Element,
    text: java.lang.String,
    userOpts: atTestingDashLibraryUserDashEventLib.atTestingDashLibraryUserDashEventMod.UserOpts
  ): js.Promise[scala.Unit] = js.native
  def `type`(element: stdLib.Window, text: java.lang.String): js.Promise[scala.Unit] = js.native
  def `type`(
    element: stdLib.Window,
    text: java.lang.String,
    userOpts: atTestingDashLibraryUserDashEventLib.atTestingDashLibraryUserDashEventMod.UserOpts
  ): js.Promise[scala.Unit] = js.native
}

