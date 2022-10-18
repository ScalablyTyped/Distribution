package typings.xadesjs

import typings.xadesjs.buildTypesXmlSigningCertificateMod.CertIDList
import typings.xadesjs.buildTypesXmlUnsignedSignaturePropertiesMod.UnsignedSignatureProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlCompleteCertificateRefsMod {
  
  @JSImport("xadesjs/build/types/xml/complete_certificate_refs", "CompleteCertificateRefs")
  @js.native
  open class CompleteCertificateRefs () extends UnsignedSignatureProperty {
    def this(properties: js.Object) = this()
    
    var CertRefs: CertIDList = js.native
    
    var Id: String = js.native
  }
}
