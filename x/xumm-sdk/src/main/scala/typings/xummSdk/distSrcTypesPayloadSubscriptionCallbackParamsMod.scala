package typings.xummSdk

import typings.xummSdk.distSrcTypesMetaAnyJsonMod.AnyJson
import typings.xummSdk.distSrcTypesXummApiMod.XummGetPayloadResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesPayloadSubscriptionCallbackParamsMod {
  
  @js.native
  trait SubscriptionCallbackParams extends StObject {
    
    var data: AnyJson = js.native
    
    var payload: XummGetPayloadResponse = js.native
    
    def resolve(): Unit = js.native
    def resolve(resolveData: Any): Unit = js.native
    
    var uuid: String = js.native
  }
}
