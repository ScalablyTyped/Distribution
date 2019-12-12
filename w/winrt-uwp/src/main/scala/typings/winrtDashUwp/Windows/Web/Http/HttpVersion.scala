package typings.winrtDashUwp.Windows.Web.Http

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Web.Http.HttpVersion.http10
import typings.winrtDashUwp.Windows.Web.Http.HttpVersion.http11
import typings.winrtDashUwp.Windows.Web.Http.HttpVersion.http20
import typings.winrtDashUwp.Windows.Web.Http.HttpVersion.none
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpVersion with Double] = js.native
  /* 1 */ @js.native
  object http10 extends TopLevel[http10 with Double]
  
  /* 2 */ @js.native
  object http11 extends TopLevel[http11 with Double]
  
  /* 3 */ @js.native
  object http20 extends TopLevel[http20 with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

