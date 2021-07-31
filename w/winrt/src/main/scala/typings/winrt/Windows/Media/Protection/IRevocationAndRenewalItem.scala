package typings.winrt.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRevocationAndRenewalItem extends StObject {
  
  var headerHash: String
  
  var name: String
  
  var publicKeyHash: String
  
  var reasons: RevocationAndRenewalReasons
  
  var renewalId: String
}
object IRevocationAndRenewalItem {
  
  @scala.inline
  def apply(
    headerHash: String,
    name: String,
    publicKeyHash: String,
    reasons: RevocationAndRenewalReasons,
    renewalId: String
  ): IRevocationAndRenewalItem = {
    val __obj = js.Dynamic.literal(headerHash = headerHash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicKeyHash = publicKeyHash.asInstanceOf[js.Any], reasons = reasons.asInstanceOf[js.Any], renewalId = renewalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRevocationAndRenewalItem]
  }
  
  @scala.inline
  implicit class IRevocationAndRenewalItemMutableBuilder[Self <: IRevocationAndRenewalItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaderHash(value: String): Self = StObject.set(x, "headerHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyHash(value: String): Self = StObject.set(x, "publicKeyHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasons(value: RevocationAndRenewalReasons): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenewalId(value: String): Self = StObject.set(x, "renewalId", value.asInstanceOf[js.Any])
  }
}
