package typings.winrtUwp.Windows.Web.Http

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
