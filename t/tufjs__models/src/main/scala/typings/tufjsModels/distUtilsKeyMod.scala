package typings.tufjsModels

import typings.node.cryptoMod.VerifyKeyObjectInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsKeyMod {
  
  @JSImport("@tufjs/models/dist/utils/key", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPublicKey(keyInfo: KeyInfo): VerifyKeyObjectInput = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKey")(keyInfo.asInstanceOf[js.Any]).asInstanceOf[VerifyKeyObjectInput]
  
  trait KeyInfo extends StObject {
    
    var keyType: String
    
    var keyVal: String
    
    var scheme: String
  }
  object KeyInfo {
    
    inline def apply(keyType: String, keyVal: String, scheme: String): KeyInfo = {
      val __obj = js.Dynamic.literal(keyType = keyType.asInstanceOf[js.Any], keyVal = keyVal.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyInfo] (val x: Self) extends AnyVal {
      
      inline def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
      
      inline def setKeyVal(value: String): Self = StObject.set(x, "keyVal", value.asInstanceOf[js.Any])
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    }
  }
}
