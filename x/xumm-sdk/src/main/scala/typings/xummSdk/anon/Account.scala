package typings.xummSdk.anon

import typings.xummSdk.distSrcTypesXummApiMod.XummTransactionApprovalType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  var account: String | Null
  
  var approved_with: js.UndefOr[XummTransactionApprovalType] = js.undefined
  
  var dispatched_nodetype: String | Null
  
  var dispatched_result: String | Null
  
  var dispatched_to: String | Null
  
  var dispatched_to_node: Boolean | Null
  
  var environment_nodetype: String | Null
  
  var environment_nodeuri: String | Null
  
  var hex: String | Null
  
  var multisign_account: String | Null
  
  var resolved_at: String | Null
  
  var signer: String | Null
  
  var signer_pubkey: js.UndefOr[String] = js.undefined
  
  var txid: String | Null
  
  var user: String | Null
}
object Account {
  
  inline def apply(): Account = {
    val __obj = js.Dynamic.literal(account = null, dispatched_nodetype = null, dispatched_result = null, dispatched_to = null, dispatched_to_node = null, environment_nodetype = null, environment_nodeuri = null, hex = null, multisign_account = null, resolved_at = null, signer = null, txid = null, user = null)
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountNull: Self = StObject.set(x, "account", null)
    
    inline def setApproved_with(value: XummTransactionApprovalType): Self = StObject.set(x, "approved_with", value.asInstanceOf[js.Any])
    
    inline def setApproved_withUndefined: Self = StObject.set(x, "approved_with", js.undefined)
    
    inline def setDispatched_nodetype(value: String): Self = StObject.set(x, "dispatched_nodetype", value.asInstanceOf[js.Any])
    
    inline def setDispatched_nodetypeNull: Self = StObject.set(x, "dispatched_nodetype", null)
    
    inline def setDispatched_result(value: String): Self = StObject.set(x, "dispatched_result", value.asInstanceOf[js.Any])
    
    inline def setDispatched_resultNull: Self = StObject.set(x, "dispatched_result", null)
    
    inline def setDispatched_to(value: String): Self = StObject.set(x, "dispatched_to", value.asInstanceOf[js.Any])
    
    inline def setDispatched_toNull: Self = StObject.set(x, "dispatched_to", null)
    
    inline def setDispatched_to_node(value: Boolean): Self = StObject.set(x, "dispatched_to_node", value.asInstanceOf[js.Any])
    
    inline def setDispatched_to_nodeNull: Self = StObject.set(x, "dispatched_to_node", null)
    
    inline def setEnvironment_nodetype(value: String): Self = StObject.set(x, "environment_nodetype", value.asInstanceOf[js.Any])
    
    inline def setEnvironment_nodetypeNull: Self = StObject.set(x, "environment_nodetype", null)
    
    inline def setEnvironment_nodeuri(value: String): Self = StObject.set(x, "environment_nodeuri", value.asInstanceOf[js.Any])
    
    inline def setEnvironment_nodeuriNull: Self = StObject.set(x, "environment_nodeuri", null)
    
    inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
    
    inline def setHexNull: Self = StObject.set(x, "hex", null)
    
    inline def setMultisign_account(value: String): Self = StObject.set(x, "multisign_account", value.asInstanceOf[js.Any])
    
    inline def setMultisign_accountNull: Self = StObject.set(x, "multisign_account", null)
    
    inline def setResolved_at(value: String): Self = StObject.set(x, "resolved_at", value.asInstanceOf[js.Any])
    
    inline def setResolved_atNull: Self = StObject.set(x, "resolved_at", null)
    
    inline def setSigner(value: String): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
    
    inline def setSignerNull: Self = StObject.set(x, "signer", null)
    
    inline def setSigner_pubkey(value: String): Self = StObject.set(x, "signer_pubkey", value.asInstanceOf[js.Any])
    
    inline def setSigner_pubkeyUndefined: Self = StObject.set(x, "signer_pubkey", js.undefined)
    
    inline def setTxid(value: String): Self = StObject.set(x, "txid", value.asInstanceOf[js.Any])
    
    inline def setTxidNull: Self = StObject.set(x, "txid", null)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
  }
}
