package typings.xummSdk.anon

import typings.std.Record
import typings.xummSdk.distSrcTypesXummApiMod.XrplTransactionType
import typings.xummSdk.distSrcTypesXummApiMod.XummJsonTransaction
import typings.xummSdk.distSrcTypesXummApiMod.XummTransactionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Computed extends StObject {
  
  var computed: js.UndefOr[Record[String, Any]] = js.undefined
  
  var created_at: String
  
  var expires_at: String
  
  var expires_in_seconds: Double
  
  var origintype: String | Null
  
  var request_json: XummJsonTransaction
  
  var signmethod: String | Null
  
  var tx_destination: String
  
  var tx_destination_tag: Double | Null
  
  var tx_type: XummTransactionType | XrplTransactionType
}
object Computed {
  
  inline def apply(
    created_at: String,
    expires_at: String,
    expires_in_seconds: Double,
    request_json: XummJsonTransaction,
    tx_destination: String,
    tx_type: XummTransactionType | XrplTransactionType
  ): Computed = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], expires_in_seconds = expires_in_seconds.asInstanceOf[js.Any], request_json = request_json.asInstanceOf[js.Any], tx_destination = tx_destination.asInstanceOf[js.Any], tx_type = tx_type.asInstanceOf[js.Any], origintype = null, signmethod = null, tx_destination_tag = null)
    __obj.asInstanceOf[Computed]
  }
  
  extension [Self <: Computed](x: Self) {
    
    inline def setComputed(value: Record[String, Any]): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setComputedUndefined: Self = StObject.set(x, "computed", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setExpires_at(value: String): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setExpires_in_seconds(value: Double): Self = StObject.set(x, "expires_in_seconds", value.asInstanceOf[js.Any])
    
    inline def setOrigintype(value: String): Self = StObject.set(x, "origintype", value.asInstanceOf[js.Any])
    
    inline def setOrigintypeNull: Self = StObject.set(x, "origintype", null)
    
    inline def setRequest_json(value: XummJsonTransaction): Self = StObject.set(x, "request_json", value.asInstanceOf[js.Any])
    
    inline def setSignmethod(value: String): Self = StObject.set(x, "signmethod", value.asInstanceOf[js.Any])
    
    inline def setSignmethodNull: Self = StObject.set(x, "signmethod", null)
    
    inline def setTx_destination(value: String): Self = StObject.set(x, "tx_destination", value.asInstanceOf[js.Any])
    
    inline def setTx_destination_tag(value: Double): Self = StObject.set(x, "tx_destination_tag", value.asInstanceOf[js.Any])
    
    inline def setTx_destination_tagNull: Self = StObject.set(x, "tx_destination_tag", null)
    
    inline def setTx_type(value: XummTransactionType | XrplTransactionType): Self = StObject.set(x, "tx_type", value.asInstanceOf[js.Any])
  }
}
