package typings.xummSdk

import typings.xummSdk.distSrcMetaMod.Meta
import typings.xummSdk.distSrcTypesMetaAnyJsonMod.AnyJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcJwtUserdataMod {
  
  @JSImport("xumm-sdk/dist/src/JwtUserdata", "JwtUserdata")
  @js.native
  open class JwtUserdata protected () extends StObject {
    def this(MetaObject: Meta) = this()
    
    /* private */ var Meta: Any = js.native
    
    def delete(key: String): js.Promise[Boolean] = js.native
    
    def get(key: String): js.Promise[AnyJson] = js.native
    def get(key: js.Array[String]): js.Promise[AnyJson] = js.native
    
    def list(): js.Promise[js.Array[String]] = js.native
    
    def set(key: String, data: AnyJson): js.Promise[Boolean] = js.native
  }
}
