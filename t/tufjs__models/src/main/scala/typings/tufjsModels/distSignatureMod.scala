package typings.tufjsModels

import typings.tufjsModels.distUtilsTypesMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSignatureMod {
  
  @JSImport("@tufjs/models/dist/signature", "Signature")
  @js.native
  open class Signature protected () extends StObject {
    def this(options: SignatureOptions) = this()
    
    val keyID: String = js.native
    
    val sig: String = js.native
    
    def toJSON(): JSONObject = js.native
  }
  /* static members */
  object Signature {
    
    @JSImport("@tufjs/models/dist/signature", "Signature")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: JSONObject): Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[Signature]
  }
  
  trait SignatureOptions extends StObject {
    
    var keyID: String
    
    var sig: String
  }
  object SignatureOptions {
    
    inline def apply(keyID: String, sig: String): SignatureOptions = {
      val __obj = js.Dynamic.literal(keyID = keyID.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignatureOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignatureOptions] (val x: Self) extends AnyVal {
      
      inline def setKeyID(value: String): Self = StObject.set(x, "keyID", value.asInstanceOf[js.Any])
      
      inline def setSig(value: String): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
    }
  }
}
