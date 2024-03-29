package typings.webdriverio.anon

import typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession
import typings.std.Record
import typings.webdriverio.buildUtilsInterceptionTypesMod.Matches
import typings.webdriverio.buildUtilsInterceptionTypesMod.MockOverwrite
import typings.webdriverio.buildUtilsInterceptionTypesMod.MockResponseParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorReason extends StObject {
  
  var errorReason: js.UndefOr[typings.devtoolsProtocol.mod.Protocol.Network.ErrorReason] = js.undefined
  
  var overwrite: js.UndefOr[MockOverwrite] = js.undefined
  
  var params: js.UndefOr[MockResponseParams] = js.undefined
  
  var sticky: js.UndefOr[Boolean] = js.undefined
}
object ErrorReason {
  
  inline def apply(): ErrorReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorReason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorReason] (val x: Self) extends AnyVal {
    
    inline def setErrorReason(value: typings.devtoolsProtocol.mod.Protocol.Network.ErrorReason): Self = StObject.set(x, "errorReason", value.asInstanceOf[js.Any])
    
    inline def setErrorReasonUndefined: Self = StObject.set(x, "errorReason", js.undefined)
    
    inline def setOverwrite(value: MockOverwrite): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteFunction2(
      value: (/* request */ Matches, /* client */ CDPSession) => js.Promise[String | (Record[String, Any])]
    ): Self = StObject.set(x, "overwrite", js.Any.fromFunction2(value))
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    inline def setParams(value: MockResponseParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    
    inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
  }
}
