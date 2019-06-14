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
  
  /* 1 */ val high: high with scala.Double = js.native
  /* 2 */ val low: low with scala.Double = js.native
  /* 0 */ val normal: normal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailImportance with scala.Double
  ] = js.native
}

