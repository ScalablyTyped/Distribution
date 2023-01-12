package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents parameters for a query for certificates from the certificate store for an app. */
trait CertificateQuery extends StObject {
  
  /** Gets a collection of object identifiers (OIDs) for the enhanced key usage extension to search for. */
  var enhancedKeyUsages: IVector[String]
  
  /** Gets or sets the certificate friendly name to search for. */
  var friendlyName: String
  
  /** Gets or sets a value that indicates whether only hardware certificates (SC or TPM) are to be returned from the query. */
  var hardwareOnly: Boolean
  
  /** Gets or sets whether to include duplicates. */
  var includeDuplicates: Boolean
  
  /** Gets or sets whether to include expired certificates. */
  var includeExpiredCertificates: Boolean
  
  /** Gets or sets the name of the certificate issuer to search for. */
  var issuerName: String
  
  /** Gets or sets the store name. */
  var storeName: String
  
  /** Gets or sets a certificate thumbprint to search for. */
  var thumbprint: Double
}
object CertificateQuery {
  
  inline def apply(
    enhancedKeyUsages: IVector[String],
    friendlyName: String,
    hardwareOnly: Boolean,
    includeDuplicates: Boolean,
    includeExpiredCertificates: Boolean,
    issuerName: String,
    storeName: String,
    thumbprint: Double
  ): CertificateQuery = {
    val __obj = js.Dynamic.literal(enhancedKeyUsages = enhancedKeyUsages.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], hardwareOnly = hardwareOnly.asInstanceOf[js.Any], includeDuplicates = includeDuplicates.asInstanceOf[js.Any], includeExpiredCertificates = includeExpiredCertificates.asInstanceOf[js.Any], issuerName = issuerName.asInstanceOf[js.Any], storeName = storeName.asInstanceOf[js.Any], thumbprint = thumbprint.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificateQuery] (val x: Self) extends AnyVal {
    
    inline def setEnhancedKeyUsages(value: IVector[String]): Self = StObject.set(x, "enhancedKeyUsages", value.asInstanceOf[js.Any])
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setHardwareOnly(value: Boolean): Self = StObject.set(x, "hardwareOnly", value.asInstanceOf[js.Any])
    
    inline def setIncludeDuplicates(value: Boolean): Self = StObject.set(x, "includeDuplicates", value.asInstanceOf[js.Any])
    
    inline def setIncludeExpiredCertificates(value: Boolean): Self = StObject.set(x, "includeExpiredCertificates", value.asInstanceOf[js.Any])
    
    inline def setIssuerName(value: String): Self = StObject.set(x, "issuerName", value.asInstanceOf[js.Any])
    
    inline def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
    
    inline def setThumbprint(value: Double): Self = StObject.set(x, "thumbprint", value.asInstanceOf[js.Any])
  }
}
