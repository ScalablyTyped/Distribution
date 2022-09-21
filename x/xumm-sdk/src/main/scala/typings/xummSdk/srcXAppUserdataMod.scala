package typings.xummSdk

import typings.xummSdk.anyJsonMod.AnyJson
import typings.xummSdk.metaMod.Meta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcXAppUserdataMod {
  
  @JSImport("xumm-sdk/dist/src/xAppUserdata", "xAppUserdata")
  @js.native
  open class xAppUserdata protected () extends StObject {
    def this(MetaObject: Meta) = this()
    
    /* private */ var Meta: Any = js.native
    
    def delete(key: String): js.Promise[Boolean] = js.native
    
    def get(key: String): js.Promise[AnyJson] = js.native
    def get(key: js.Array[String]): js.Promise[AnyJson] = js.native
    
    def list(): js.Promise[js.Array[String]] = js.native
    
    def set(key: String, data: AnyJson): js.Promise[Boolean] = js.native
  }
}
