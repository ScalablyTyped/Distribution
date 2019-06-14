package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HttpVersion extends js.Object

/** Represents the HTTP protocol version. */
@JSGlobal("Windows.Web.Http.HttpVersion")
@js.native
object HttpVersion extends js.Object {
  /** HTTP 1.0. */
  @js.native
  sealed trait http10
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpVersion
  
  /** HTTP 1.1. */
  @js.native
  sealed trait http11
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpVersion
  
  /** HTTP 2.0 */
  @js.native
  sealed trait http20
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpVersion
  
  /** This value may be returned by third party filters. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpVersion
  
  /* 1 */ val http10: http10 with scala.Double = js.native
  /* 2 */ val http11: http11 with scala.Double = js.native
  /* 3 */ val http20: http20 with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpVersion with scala.Double] = js.native
}

