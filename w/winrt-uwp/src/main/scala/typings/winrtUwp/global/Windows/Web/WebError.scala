package typings.winrtUwp.global.Windows.Web

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides error status resulting from a web service operation. */
@JSGlobal("Windows.Web.WebError")
@js.native
abstract class WebError ()
  extends StObject
     with typings.winrtUwp.Windows.Web.WebError
object WebError {
  
  @JSGlobal("Windows.Web.WebError")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets a WebErrorStatus value based on an error encountered by a web service operation.
    * @param hresult The error encountered by a web service operation represented as an hResult.
    * @return The error status value for a web service operation.
    */
  /* static member */
  @scala.inline
  def getStatus(hresult: Double): typings.winrtUwp.Windows.Web.WebErrorStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatus")(hresult.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Web.WebErrorStatus]
}
