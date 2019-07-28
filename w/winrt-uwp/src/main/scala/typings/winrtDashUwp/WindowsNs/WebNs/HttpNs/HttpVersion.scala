package typings.winrtDashUwp.WindowsNs.WebNs.HttpNs

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
  sealed trait http10 extends HttpVersion
  
  /** HTTP 1.1. */
  @js.native
  sealed trait http11 extends HttpVersion
  
  /** HTTP 2.0 */
  @js.native
  sealed trait http20 extends HttpVersion
  
  /** This value may be returned by third party filters. */
  @js.native
  sealed trait none extends HttpVersion
  
  /* 1 */ val http10: typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HttpVersion.http10 with Double = js.native
  /* 2 */ val http11: typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HttpVersion.http11 with Double = js.native
  /* 3 */ val http20: typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HttpVersion.http20 with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HttpVersion.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpVersion with Double] = js.native
}

