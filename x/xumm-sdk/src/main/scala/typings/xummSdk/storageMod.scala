package typings.xummSdk

import typings.xummSdk.anyJsonMod.AnyJson
import typings.xummSdk.metaMod.Meta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageMod {
  
  @JSImport("xumm-sdk/dist/src/Storage", "Storage")
  @js.native
  open class Storage protected () extends StObject {
    def this(MetaObject: Meta) = this()
    
    /* private */ var Meta: Any = js.native
    
    def delete(): js.Promise[Boolean] = js.native
    
    def get(): js.Promise[AnyJson | Null] = js.native
    
    def set(): js.Promise[Boolean] = js.native
    def set(data: AnyJson): js.Promise[Boolean] = js.native
  }
}
