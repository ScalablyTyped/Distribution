package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines properties for web account provider operations. */
@js.native
trait IWebAccountProviderOperation extends StObject {
  
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind = js.native
}
object IWebAccountProviderOperation {
  
  @scala.inline
  def apply(kind: WebAccountProviderOperationKind): IWebAccountProviderOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebAccountProviderOperation]
  }
  
  @scala.inline
  implicit class IWebAccountProviderOperationMutableBuilder[Self <: IWebAccountProviderOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: WebAccountProviderOperationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
