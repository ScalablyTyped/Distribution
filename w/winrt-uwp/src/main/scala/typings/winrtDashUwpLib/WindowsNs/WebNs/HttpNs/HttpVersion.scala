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
  
  val http10: http10 with java.lang.String = js.native
  val http11: http11 with java.lang.String = js.native
  val http20: http20 with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpVersion with java.lang.String] = js.native
}

