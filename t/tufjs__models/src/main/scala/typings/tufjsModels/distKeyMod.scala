package typings.tufjsModels

import typings.std.Record
import typings.tufjsModels.distBaseMod.Signable
import typings.tufjsModels.distUtilsTypesMod.JSONObject
import typings.tufjsModels.distUtilsTypesMod.JSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKeyMod {
  
  @JSImport("@tufjs/models/dist/key", "Key")
  @js.native
  open class Key protected () extends StObject {
    def this(options: KeyOptions) = this()
    
    def equals(other: Key): Boolean = js.native
    
    val keyID: String = js.native
    
    val keyType: String = js.native
    
    val keyVal: Record[String, String] = js.native
    
    val scheme: String = js.native
    
    def toJSON(): JSONObject = js.native
    
    val unrecognizedFields: js.UndefOr[Record[String, JSONValue]] = js.native
    
    def verifySignature(metadata: Signable): Unit = js.native
  }
  /* static members */
  object Key {
    
    @JSImport("@tufjs/models/dist/key", "Key")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(keyID: String, data: JSONObject): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(keyID.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Key]
  }
  
  trait KeyOptions extends StObject {
    
    var keyID: String
    
    var keyType: String
    
    var keyVal: Record[String, String]
    
    var scheme: String
    
    var unrecognizedFields: js.UndefOr[Record[String, JSONValue]] = js.undefined
  }
  object KeyOptions {
    
    inline def apply(keyID: String, keyType: String, keyVal: Record[String, String], scheme: String): KeyOptions = {
      val __obj = js.Dynamic.literal(keyID = keyID.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any], keyVal = keyVal.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyOptions] (val x: Self) extends AnyVal {
      
      inline def setKeyID(value: String): Self = StObject.set(x, "keyID", value.asInstanceOf[js.Any])
      
      inline def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
      
      inline def setKeyVal(value: Record[String, String]): Self = StObject.set(x, "keyVal", value.asInstanceOf[js.Any])
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setUnrecognizedFields(value: Record[String, JSONValue]): Self = StObject.set(x, "unrecognizedFields", value.asInstanceOf[js.Any])
      
      inline def setUnrecognizedFieldsUndefined: Self = StObject.set(x, "unrecognizedFields", js.undefined)
    }
  }
}
