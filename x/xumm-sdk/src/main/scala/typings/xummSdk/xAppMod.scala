package typings.xummSdk

import typings.xummSdk.metaMod.Meta
import typings.xummSdk.srcXAppUserdataMod.xAppUserdata
import typings.xummSdk.xAppEventPushPostBodyMod.xAppEventPushPostBody
import typings.xummSdk.xAppEventResponseMod.xAppEventResponse
import typings.xummSdk.xAppOttDataMod.xAppOttData
import typings.xummSdk.xAppPushResponseMod.xAppPushResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xAppMod {
  
  @JSImport("xumm-sdk/dist/src/xApp", "xApp")
  @js.native
  open class xApp protected () extends StObject {
    def this(MetaObject: Meta) = this()
    
    /* private */ var Meta: Any = js.native
    
    def event(data: xAppEventPushPostBody): js.Promise[xAppEventResponse] = js.native
    
    def get(ott: String): js.Promise[xAppOttData | Null] = js.native
    
    def push(data: xAppEventPushPostBody): js.Promise[xAppPushResponse] = js.native
    
    var userdata: xAppUserdata = js.native
  }
}
