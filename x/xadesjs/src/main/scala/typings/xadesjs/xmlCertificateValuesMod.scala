package typings.xadesjs

import typings.xadesjs.xmlAnyMod.Any
import typings.xadesjs.xmlEncapsulatedPkiDataMod.EncapsulatedPKIData
import typings.xadesjs.xmlXmlBaseMod.XadesCollection
import typings.xadesjs.xmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlCertificateValuesMod {
  
  @JSImport("xadesjs/build/types/xml/certificate_values", "CertificateValues")
  @js.native
  open class CertificateValues () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var EncapsulatedX509Certificates: EncapsulatedX509CertificateCollection = js.native
    
    var Id: String = js.native
    
    var OtherCertificates: OtherCertificateCollection = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/certificate_values", "EncapsulatedX509Certificate")
  @js.native
  open class EncapsulatedX509Certificate () extends EncapsulatedPKIData {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/certificate_values", "EncapsulatedX509CertificateCollection")
  @js.native
  open class EncapsulatedX509CertificateCollection () extends XadesCollection[EncapsulatedX509Certificate] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/certificate_values", "OtherCertificate")
  @js.native
  open class OtherCertificate () extends Any {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/certificate_values", "OtherCertificateCollection")
  @js.native
  open class OtherCertificateCollection () extends XadesCollection[OtherCertificate] {
    def this(properties: js.Object) = this()
  }
}
