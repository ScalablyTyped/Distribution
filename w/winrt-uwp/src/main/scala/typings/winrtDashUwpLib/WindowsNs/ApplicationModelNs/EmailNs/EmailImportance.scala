package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailImportance extends js.Object

/** Defines the importance of an email message. */
@JSGlobal("Windows.ApplicationModel.Email.EmailImportance")
@js.native
object EmailImportance extends js.Object {
  /** The email message is of high importance. */
  @js.native
  sealed trait high
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailImportance
  
  /** The email message is of low importance. */
  @js.native
  sealed trait low
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailImportance
  
  /** The email message is of normal importance. */
  @js.native
  sealed trait normal
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailImportance
  
  val high: high with java.lang.String = js.native
  val low: low with java.lang.String = js.native
  val normal: normal with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailImportance with java.lang.String
  ] = js.native
}

