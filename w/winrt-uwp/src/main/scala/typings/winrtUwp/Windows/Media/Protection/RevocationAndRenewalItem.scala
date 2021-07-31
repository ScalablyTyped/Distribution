package typings.winrtUwp.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a component that is being revoked and renewed with a trusted component. */
trait RevocationAndRenewalItem extends StObject {
  
  /** Returns the header hash for the component being revoked. */
  var headerHash: String
  
  /** Returns the name for the component being revoked. */
  var name: String
  
  /** Returns the public key hash for the component. */
  var publicKeyHash: String
  
  /** Returns the reason for revocation of component. */
  var reasons: RevocationAndRenewalReasons
  
  /** Returns the GUID for the renewal object. */
  var renewalId: String
}
object RevocationAndRenewalItem {
  
  @scala.inline
  def apply(
    headerHash: String,
    name: String,
    publicKeyHash: String,
    reasons: RevocationAndRenewalReasons,
    renewalId: String
  ): RevocationAndRenewalItem = {
    val __obj = js.Dynamic.literal(headerHash = headerHash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicKeyHash = publicKeyHash.asInstanceOf[js.Any], reasons = reasons.asInstanceOf[js.Any], renewalId = renewalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevocationAndRenewalItem]
  }
  
  @scala.inline
  implicit class RevocationAndRenewalItemMutableBuilder[Self <: RevocationAndRenewalItem] (val x: Self) extends AnyVal {
    
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
