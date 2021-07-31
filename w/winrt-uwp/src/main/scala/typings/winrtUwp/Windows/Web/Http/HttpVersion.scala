package typings.winrtUwp.Windows.Web.Http

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HttpVersion extends StObject
/** Represents the HTTP protocol version. */
@JSGlobal("Windows.Web.Http.HttpVersion")
@js.native
object HttpVersion extends StObject {
  
  /** HTTP 1.0. */
  @js.native
  sealed trait http10
    extends StObject
       with HttpVersion
  
  /** HTTP 1.1. */
  @js.native
  sealed trait http11
    extends StObject
       with HttpVersion
  
  /** HTTP 2.0 */
  @js.native
  sealed trait http20
    extends StObject
       with HttpVersion
  
  /** This value may be returned by third party filters. */
  @js.native
  sealed trait none
    extends StObject
       with HttpVersion
}
