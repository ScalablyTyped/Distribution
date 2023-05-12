package typings.xummSdk

import typings.xummSdk.distSrcMetaMod.Meta
import typings.xummSdk.distSrcTypesXAppXAppOttDataMod.xAppOttData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcXAppMod {
  
  @JSImport("xumm-sdk/dist/src/xApp", "xApp")
  @js.native
  open class xApp protected () extends StObject {
    def this(MetaObject: Meta) = this()
    
    /* private */ var Meta: Any = js.native
    
    def get(ott: String): js.Promise[xAppOttData | Null] = js.native
    
    /* private */ var userdata: Any = js.native
  }
}
