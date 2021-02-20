package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WebAccountClientViewType extends StObject
/** Represents the levels of information about a web account shown to the client. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountClientViewType")
@js.native
object WebAccountClientViewType extends StObject {
  
  /** Shows the Id and properties. */
  @js.native
  sealed trait idAndProperties extends WebAccountClientViewType
  
  /** Shows only the Id. */
  @js.native
  sealed trait idOnly extends WebAccountClientViewType
}
