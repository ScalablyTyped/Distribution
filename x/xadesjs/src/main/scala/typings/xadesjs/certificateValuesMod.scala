package typings.xadesjs

import typings.xadesjs.anyMod.Any
import typings.xadesjs.encapsulatedPkiDataMod.EncapsulatedPKIData
import typings.xmlCore.mod.XmlCollection
import typings.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xadesjs/build/types/xml/certificate_values", JSImport.Namespace)
@js.native
object certificateValuesMod extends js.Object {
  
  @js.native
  class CertificateValues () extends XmlObject {
    
    var EncapsulatedX509Certificates: EncapsulatedX509CertificateCollection = js.native
    
    var Id: String = js.native
    
    var OtherCertificates: OtherCertificateCollection = js.native
  }
  
  @js.native
  class EncapsulatedX509Certificate () extends EncapsulatedPKIData
  
  @js.native
  class EncapsulatedX509CertificateCollection () extends XmlCollection[EncapsulatedX509Certificate]
  
  @js.native
  class OtherCertificate () extends Any
  
  @js.native
  class OtherCertificateCollection () extends XmlCollection[OtherCertificate]
}
