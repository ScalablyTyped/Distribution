package typings.xmldsigjs

import typings.std.CryptoKey
import typings.std.EcKeyImportParams
import typings.std.RsaHashedImportParams
import typings.xmldsigjs.keyInfoClauseMod.KeyInfoClause
import typings.xmldsigjs.pkiMod.X509Certificate
import typings.xmldsigjs.xmlObjectMod.XmlSignatureObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object x509DataMod {
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/x509_data", "KeyInfoX509Data")
  @js.native
  open class KeyInfoX509Data () extends KeyInfoClause {
    def this(cert: X509Certificate) = this()
    def this(rgbCert: js.typedarray.Uint8Array) = this()
    def this(cert: X509Certificate, includeOptions: X509IncludeOption) = this()
    
    /**
      * Adds the specified X.509v3 certificate to the KeyInfoX509Data.
      * @param  {X509Certificate} certificate
      * @returns void
      */
    def AddCertificate(certificate: X509Certificate): Unit = js.native
    
    /* private */ var AddCertificatesChainFrom: Any = js.native
    
    /**
      * Adds the specified issuer name and serial number pair to the KeyInfoX509Data object.
      * @param  {string} issuerName
      * @param  {string} serialNumber
      * @returns void
      */
    def AddIssuerSerial(issuerName: String, serialNumber: String): Unit = js.native
    
    /**
      * Adds the specified subject key identifier (SKI) to the KeyInfoX509Data object.
      * @param  {string | Uint8Array} subjectKeyId
      * @returns void
      */
    def AddSubjectKeyId(subjectKeyId: String): Unit = js.native
    def AddSubjectKeyId(subjectKeyId: js.typedarray.Uint8Array): Unit = js.native
    
    /**
      * Adds the subject name of the entity that was issued an X.509v3 certificate to the KeyInfoX509Data object.
      * @param  {string} subjectName
      * @returns void
      */
    def AddSubjectName(subjectName: String): Unit = js.native
    
    /**
      * Gets or sets the Certificate Revocation List (CRL) contained within the KeyInfoX509Data object.
      */
    def CRL: js.typedarray.Uint8Array | Null = js.native
    def CRL_=(value: js.typedarray.Uint8Array | Null): Unit = js.native
    
    /**
      * Gets a list of the X.509v3 certificates contained in the KeyInfoX509Data object.
      */
    def Certificates: js.Array[X509Certificate] = js.native
    
    /* private */ var IssuerSerialList: Any = js.native
    
    /**
      * Gets a list of X509IssuerSerial structures that represent an issuer name and serial number pair.
      */
    def IssuerSerials: js.Array[IX509IssuerSerial] = js.native
    
    /**
      * Gets public key of the X509Data
      */
    @JSName("Key")
    def Key_MKeyInfoX509Data: CryptoKey | Null = js.native
    
    /* private */ var SubjectKeyIdList: Any = js.native
    
    /**
      * Gets a list of the subject key identifiers (SKIs) contained in the KeyInfoX509Data object.
      */
    def SubjectKeyIds: js.Array[js.typedarray.Uint8Array] = js.native
    
    /* private */ var SubjectNameList: Any = js.native
    
    /**
      * Gets a list of the subject names of the entities contained in the KeyInfoX509Data object.
      */
    def SubjectNames: js.Array[String] = js.native
    
    /* private */ var X509CertificateList: Any = js.native
    
    def exportKey(alg: EcKeyImportParams): js.Promise[Any] = js.native
    def exportKey(alg: RsaHashedImportParams): js.Promise[Any] = js.native
    
    /* private */ var key: Any = js.native
    
    /* private */ var x509crl: Any = js.native
  }
  
  @js.native
  sealed trait X509IncludeOption extends StObject
  @JSImport("xmldsigjs/build/types/xml/key_infos/x509_data", "X509IncludeOption")
  @js.native
  object X509IncludeOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[X509IncludeOption & Double] = js.native
    
    @js.native
    sealed trait EndCertOnly
      extends StObject
         with X509IncludeOption
    /* 1 */ val EndCertOnly: typings.xmldsigjs.x509DataMod.X509IncludeOption.EndCertOnly & Double = js.native
    
    @js.native
    sealed trait ExcludeRoot
      extends StObject
         with X509IncludeOption
    /* 2 */ val ExcludeRoot: typings.xmldsigjs.x509DataMod.X509IncludeOption.ExcludeRoot & Double = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with X509IncludeOption
    /* 0 */ val None: typings.xmldsigjs.x509DataMod.X509IncludeOption.None & Double = js.native
    
    @js.native
    sealed trait WholeChain
      extends StObject
         with X509IncludeOption
    /* 3 */ val WholeChain: typings.xmldsigjs.x509DataMod.X509IncludeOption.WholeChain & Double = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/x509_data", "X509IssuerSerial")
  @js.native
  open class X509IssuerSerial () extends XmlSignatureObject {
    def this(properties: js.Object) = this()
    
    var X509IssuerName: String = js.native
    
    var X509SerialNumber: String = js.native
  }
  
  trait IX509IssuerSerial extends StObject {
    
    var issuerName: String
    
    var serialNumber: String
  }
  object IX509IssuerSerial {
    
    inline def apply(issuerName: String, serialNumber: String): IX509IssuerSerial = {
      val __obj = js.Dynamic.literal(issuerName = issuerName.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[IX509IssuerSerial]
    }
    
    extension [Self <: IX509IssuerSerial](x: Self) {
      
      inline def setIssuerName(value: String): Self = StObject.set(x, "issuerName", value.asInstanceOf[js.Any])
      
      inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    }
  }
}
