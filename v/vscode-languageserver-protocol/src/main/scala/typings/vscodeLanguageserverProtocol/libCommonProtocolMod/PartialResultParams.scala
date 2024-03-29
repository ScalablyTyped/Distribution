package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeJsonrpc.libCommonConnectionMod.ProgressToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartialResultParams extends StObject {
  
  /**
    * An optional token that a server can use to report partial results (e.g. streaming) to
    * the client.
    */
  var partialResultToken: js.UndefOr[ProgressToken] = js.undefined
}
object PartialResultParams {
  
  inline def apply(): PartialResultParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialResultParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialResultParams] (val x: Self) extends AnyVal {
    
    inline def setPartialResultToken(value: ProgressToken): Self = StObject.set(x, "partialResultToken", value.asInstanceOf[js.Any])
    
    inline def setPartialResultTokenUndefined: Self = StObject.set(x, "partialResultToken", js.undefined)
  }
}
