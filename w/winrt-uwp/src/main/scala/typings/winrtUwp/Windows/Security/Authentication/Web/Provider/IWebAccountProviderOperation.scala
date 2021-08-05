package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines properties for web account provider operations. */
trait IWebAccountProviderOperation extends StObject {
  
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind
}
object IWebAccountProviderOperation {
  
  inline def apply(kind: WebAccountProviderOperationKind): IWebAccountProviderOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebAccountProviderOperation]
  }
  
  extension [Self <: IWebAccountProviderOperation](x: Self) {
    
    inline def setKind(value: WebAccountProviderOperationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
