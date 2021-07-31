package typings.xadesjs

import typings.xadesjs.anyMod.Any
import typings.xadesjs.encapsulatedPkiDataMod.EncapsulatedPKIData
import typings.xadesjs.xmlBaseMod.XadesCollection
import typings.xadesjs.xmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certificateValuesMod {
  
  @JSImport("xadesjs/build/types/xml/certificate_values", "CertificateValues")
  @js.native
  class CertificateValues () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var EncapsulatedX509Certificates: EncapsulatedX509CertificateCollection = js.native
    
    var Id: String = js.native
    
    var OtherCertificates: OtherCertificateCollection = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/certificate_values", "EncapsulatedX509Certificate")
  @js.native
  class EncapsulatedX509Certificate () extends EncapsulatedPKIData {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/certificate_values", "EncapsulatedX509CertificateCollection")
  @js.native
  class EncapsulatedX509CertificateCollection () extends XadesCollection[EncapsulatedX509Certificate] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/certificate_values", "OtherCertificate")
  @js.native
  class OtherCertificate () extends Any {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/certificate_values", "OtherCertificateCollection")
  @js.native
  class OtherCertificateCollection () extends XadesCollection[OtherCertificate] {
    def this(properties: js.Object) = this()
  }
}
